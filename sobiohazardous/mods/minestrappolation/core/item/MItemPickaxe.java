package sobiohazardous.mods.minestrappolation.core.item;

import clashsoft.cslib.minecraft.item.datatools.ItemDataPickaxe;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class MItemPickaxe extends MItemTool
{
	private boolean	breakBedrock	= false;
	
	public MItemPickaxe(ToolMaterial material, ToolMaterial plateMaterial)
	{
		this(material, plateMaterial, false);
	}
	
	public MItemPickaxe(ToolMaterial material, ToolMaterial plateMaterial, boolean ignites)
	{
		super(ItemDataPickaxe.baseDamage, material, plateMaterial, ItemDataPickaxe.blocksEffectiveAgainst, "overlayToolPickBronze", ignites);
	}
	
	@Override
	public boolean canHarvestBlock(Block block, ItemStack stack)
	{
		if (this.breakBedrock && block == Blocks.bedrock)
		{
			return this.toolMaterial.getHarvestLevel() == 4;
		}
		return super.canHarvestBlock(block, stack);
	}
}
