package minestrapteam.minestrappolation.creativetab;

import minestrapteam.minestrappolation.lib.MItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MCreativeTabMisc extends CreativeTabs
{
	public MCreativeTabMisc(String label)
	{
		super(label);
	}
	
	@Override
	public Item getTabIconItem()
	{
		return MItems.hangGlider;
	}
	
}
