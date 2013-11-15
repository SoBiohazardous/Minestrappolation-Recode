package sobiohazardous.minestrappolation.extradecor.block;

import java.util.List;

import sobiohazardous.minestrappolation.api.block.MBlock;
import sobiohazardous.minestrappolation.extradecor.lib.EDConfig;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

//flintBlock = (new MBlock(EDConfig.flintBlockId, Material.rock)).setHardness(3F).setResistance(10.0F).setStepSound(Block.soundMetalFootstep).setUnlocalizedName("block_FlintBlock").setCreativeTab(tabDecorBlocks);
//netherBrickPattern = (new MBlock(EDConfig.netherBrickPatternId, Material.rock)).setHardness(2.0F).setResistance(10.0F).setCreativeTab(tabDecorBlocks).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("block_PatternBrickNether");

public class BlockTiles extends Block {

	public static final String[] brickType = new String[] {"obsidian","flint","nether","checker","brick","fb","nb"};

	private Icon ob;
	private Icon flint;
	private Icon nether;
	private Icon checker;
	private Icon brick;
	private Icon fb;
	private Icon nb;
	
	public BlockTiles(int par1) {
		super(par1, Material.rock);

	}
	
	public float getBlockHardness(World par1World, int par2, int par3, int par4){
		int meta = par1World.getBlockMetadata(par2, par3, par4);
		
		switch(meta){
		case 0:
			return 60F;
		case 1:
			return 3F;
		case 2:
			return .8F;
		case 3:
			return 3F;
		case 4:
			return 2F; 
		case 5:
			return 3F; 
		case 6:
			return 2F; 
		}
		
		
		return 5F;
		
	}
	
	public float getExplosionResistance(Entity par1Entity, World world, int x, int y, int z, double explosionX, double explosionY, double explosionZ)
    {
     int meta = world.getBlockMetadata(x, y, z);
     switch (meta)
     {
     case 0:
                     return 2000F;
     case 1:
                    return 10F;
     case 2:
                    return 1F;
     case 3:
                    return 10F;
     case 4:
    	    return 10F;
     case 5:
			return 10F; 
     case 6:
			return 10F; 
     
     }
     return 1F;
    }
	
	
	public void registerIcons(IconRegister par1IconRegister) {
		this.ob = par1IconRegister
				.registerIcon("Minestrappolation:block_ObsidianTile");
		this.flint = par1IconRegister
				.registerIcon("Minestrappolation:block_FlintTile");
		this.nether = par1IconRegister
				.registerIcon("Minestrappolation:block_NetherTile");
		this.checker = par1IconRegister
				.registerIcon("Minestrappolation:block_CheckerTile");
		this.brick = par1IconRegister
				.registerIcon("Minestrappolation:block_PatternBrick");
		this.fb = par1IconRegister
				.registerIcon("Minestrappolation:block_FlintBlock");
		this.nb = par1IconRegister
				.registerIcon("Minestrappolation:block_PatternBrickNether");

	}
	
	public int damageDropped(int par1)
    {
        return par1;
    }
	
	 @SideOnly(Side.CLIENT)
		public Icon getIcon(int i, int j) {
			switch (j) {
			case 0:
					return ob;
			case 1:
				return flint;
			case 2:
				return nether;
			case 3:
				return checker;
			case 4:
				return brick;
			case 5:
				return fb;
			case 6:
				return nb;
			}
			return ob;

		}
	    @SideOnly(Side.CLIENT)

		/**
		 * returns a list of blocks with the same ID, but different meta (eg: wood
		 * returns 4 blocks)
		 */
		public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs,
				List par3List) {
			par3List.add(new ItemStack(par1, 1, 0));
			par3List.add(new ItemStack(par1, 1, 1));
			par3List.add(new ItemStack(par1, 1, 2));
			par3List.add(new ItemStack(par1, 1, 3));
			par3List.add(new ItemStack(par1, 1, 4));
			par3List.add(new ItemStack(par1, 1, 5));
			par3List.add(new ItemStack(par1, 1, 6));
		}

}