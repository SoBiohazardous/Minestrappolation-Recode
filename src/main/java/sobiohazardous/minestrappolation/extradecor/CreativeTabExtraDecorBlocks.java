package sobiohazardous.minestrappolation.extradecor;

import sobiohazardous.minestrappolation.extradecor.lib.EDItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class CreativeTabExtraDecorBlocks extends CreativeTabs
{
	public CreativeTabExtraDecorBlocks(int par1, String par2Str)
    {
		super(par1, par2Str);
    }
   
    public String getTranslatedTabLabel()
    {
    	return "Extrapolated Decor";
    }
        
    @Override
    public Item getTabIconItem() 
	{
		return EDItems.sandstoneBrickItem;
	}
}