package minestrapteam.minestrappolation.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class MCreativeTabTech extends CreativeTabs
{
	public MCreativeTabTech(String label)
	{
		super(label);
	}
	
	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(Blocks.piston);
	}
}