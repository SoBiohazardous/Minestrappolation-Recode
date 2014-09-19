package minestrapteam.minestrappolation.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGrease extends Item implements IItemAddon
{
	public ItemGrease()
	{
		addons.add(this);
	}
	
	@Override
	public boolean canApply(ItemStack platable)
	{
		Item item = platable.getItem();
		return item instanceof MItemFood && ((MItemFood) item).getType(platable).isFriable() && !this.isApplied(platable);
	}
	
	@Override
	public void apply(ItemStack platable)
	{
		MItemFood.setFried(platable, true);
	}
	
	@Override
	public void unapply(ItemStack platable)
	{
		MItemFood.setFried(platable, false);
	}
	
	@Override
	public boolean isApplied(ItemStack platable)
	{
		return MItemFood.isFried(platable);
	}
	
	@Override
	public int getCount(ItemStack platable)
	{
		return 1;
	}
}
