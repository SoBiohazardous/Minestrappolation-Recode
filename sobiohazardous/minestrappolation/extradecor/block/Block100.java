package sobiohazardous.minestrappolation.extradecor.block;

import java.util.List;

import sobiohazardous.minestrappolation.extradecor.lib.EDBlockManager;
import sobiohazardous.minestrappolation.extradecor.tileentity.TileEntity100;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block100 extends BlockContainer{
	TileEntity100 te = new TileEntity100();
	public static final String[] brickType = new String[] {"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"};

	
	private Icon tile;
	public Block100(int par1) {
		super(par1, Material.grass);
		this.setCreativeTab(EDBlockManager.tabDecorBlocks);
	}

	public int damageDropped(int par1)
    {
        return par1;
    
    }
	
	public void registerIcons(IconRegister par1IconRegister) {
		this.tile = par1IconRegister
				.registerIcon("Minestrappolation:block_StoneTile");

	}
	
	public Icon getIcon(int i, int j) {
		switch (j) {
		case 0:
				return tile;
		case 999:
			return tile;
		}
		return null;

	}
	
	    @SideOnly(Side.CLIENT)

		/**
		 * returns a list of blocks with the same ID, but different meta (eg: wood
		 * returns 4 blocks)
		 */
		public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs,
				List par3List) {
			
	    	for(int meta = 0; meta < te.getMetaData(); meta++){
	    		par3List.add(new ItemStack(par1, 1, meta));
	    	}
	    	
			
		}

		@Override
		public TileEntity createNewTileEntity(World world) {
			// TODO Auto-generated method stub
			return te;
		}

}
