package sobiohazardous.mods.minestrappolation.extradecor.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;

import sobiohazardous.mods.minestrappolation.core.lib.MReference;
import sobiohazardous.mods.minestrappolation.extradecor.lib.EDBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockWoodBoards extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon[]					iconArray;
	public static final String[]	boardTextures	= new String[] { MReference.MODID_ED + ":boardsOak", MReference.MODID_ED + ":boardsBirch", MReference.MODID_ED + ":boardsSpruce", MReference.MODID_ED + ":boardsJungle" };
	
	public BlockWoodBoards()
	{
		super(Material.wood);
		this.setCreativeTab(EDBlocks.tabDecor);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	public IIcon getIcon(int par1, int par2)
	{
		if (par2 < 0 || par2 >= this.iconArray.length)
		{
			par2 = 0;
		}
		
		return this.iconArray[par2];
	}
	
	/**
	 * Determines the damage on the item the block drops. Used in cloth and
	 * wood.
	 */
	@Override
	public int damageDropped(int par1)
	{
		return par1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	 */
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		par3List.add(new ItemStack(par1, 1, 0));
		par3List.add(new ItemStack(par1, 1, 1));
		par3List.add(new ItemStack(par1, 1, 2));
		par3List.add(new ItemStack(par1, 1, 3));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		this.iconArray = new IIcon[boardTextures.length];
		
		for (int i = 0; i < this.iconArray.length; ++i)
		{
			this.iconArray[i] = par1IconRegister.registerIcon(boardTextures[i]);
		}
	}
	
	@Override
	public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face)
	{
		if (world.getBlock(x, y, z) == EDBlocks.woodPanel || world.getBlock(x, y, z) == EDBlocks.woodBeveled || world.getBlock(x, y, z) == EDBlocks.woodBoards)
		{
			if (face == ForgeDirection.UP || face == ForgeDirection.DOWN || face == ForgeDirection.NORTH || face == ForgeDirection.SOUTH || face == ForgeDirection.EAST || face == ForgeDirection.WEST)
			{
				return 75;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 0;
		}
	}
}
