package com.minestrappolation.block;

import com.minestrappolation_core.util.MCAssetManager;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockRopeCoil extends Block
{
	private IIcon	top;
	
	public BlockRopeCoil()
	{
		super(Material.cloth);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(MCAssetManager.getTexture("rope_side"));
		this.top = iconRegister.registerIcon(MCAssetManager.getTexture("rope_top"));
	}
	
	@Override
	public IIcon getIcon(int side, int metadata)
	{
		if (side == 0 || side == 1)
		{
			return this.top;
		}
		
		return this.blockIcon;
	}
}
