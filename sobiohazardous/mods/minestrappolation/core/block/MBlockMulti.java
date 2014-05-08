package sobiohazardous.mods.minestrappolation.core.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;

import sobiohazardous.mods.minestrappolation.core.Minestrappolation;
import sobiohazardous.mods.minestrappolation.core.lib.MReference;
import sobiohazardous.mods.minestrappolation.core.util.MBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class MBlockMulti extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon[]		icons;
	private String[]	iconNames;
	
	public MBlockMulti(Material mat, String[] textures)
	{
		super(mat);
		this.iconNames = textures;
		this.setCreativeTab(Minestrappolation.creativeTabStone);
	}
	
	@Override
	public IIcon getIcon(int side, int metadata)
	{
		return this.icons[metadata];
	}
	
	@Override
	public int damageDropped(int metdata)
	{
		return metdata;
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list)
	{
		for (int i = 0; i < this.iconNames.length; i++)
		{
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.icons = new IIcon[this.iconNames.length];
		
		for (int i = 0; i < this.icons.length; ++i)
		{
			this.icons[i] = iconRegister.registerIcon(this.iconNames[i]);
		}
	}
	
	@Override
	public void harvestBlock(World world, EntityPlayer player, int x, int y, int z, int metadata)
	{
		if (this == MBlockHelper.get(MReference.MODID_ED, "bedrockBlocks"))
		{
			player.getHeldItem().damageItem(2000, player);
			this.dropBlockAsItem(world, x, y, z, new ItemStack(this));
		}
	}
}
