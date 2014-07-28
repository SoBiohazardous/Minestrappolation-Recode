package minestrapteam.minestrappolation.crafting;

import clashsoft.cslib.minecraft.stack.CSStacks;
import minestrapteam.minestrappolation.item.IPlatable;
import minestrapteam.minestrappolation.item.IPlating;
import minestrapteam.minestrappolation.item.MItemTool;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraftforge.oredict.RecipeSorter;
import net.minecraftforge.oredict.RecipeSorter.Category;

public class RecipesPlatings implements IRecipe
{
	static
	{
		RecipeSorter.register("minestrappolation:plating", RecipesPlatings.class, Category.SHAPELESS, "after:minecraft:shapeless");
	}
	
	@Override
	public ItemStack getCraftingResult(InventoryCrafting inventory)
	{
		ItemStack platable = null;
		ItemStack plating = null;
		int count = 0;
		
		for (int i = 0; i < inventory.getSizeInventory(); i++)
		{
			ItemStack stack = inventory.getStackInSlot(i);
			
			if (stack == null)
			{
				continue;
			}
			
			if (stack.getItem() instanceof IPlatable)
			{
				if (platable != null)
				{
					return null;
				}
				else
				{
					platable = stack;
				}
			}
			else if (stack.getItem() instanceof IPlating)
			{
				if (plating != null)
				{
					if (CSStacks.itemEquals(plating, stack))
					{
						count++;
					}
					else
					{
						return null;
					}
				}
				else
				{
					count++;
					plating = stack;
				}
			}
		}
		
		if (platable != null && plating != null && count == ((IPlatable) platable.getItem()).getPlatingCount(platable))
		{
			ItemStack result = platable.copy();
			MItemTool.setPlating(result, (IPlating) plating.getItem());
			return result;
		}
		
		return null;
	}
	
	@Override
	public ItemStack getRecipeOutput()
	{
		return null;
	}
	
	@Override
	public int getRecipeSize()
	{
		return 2;
	}
	
	@Override
	public boolean matches(InventoryCrafting inventory, World world)
	{
		ItemStack platable = null;
		ItemStack plating = null;
		int count = 0;
		
		for (int i = 0; i < inventory.getSizeInventory(); i++)
		{
			ItemStack stack = inventory.getStackInSlot(i);
			
			if (stack == null)
			{
				continue;
			}
			
			if (stack.getItem() instanceof IPlatable)
			{
				if (platable != null)
				{
					return false;
				}
				else
				{
					platable = stack;
				}
			}
			else if (stack.getItem() instanceof IPlating)
			{
				if (plating != null)
				{
					if (CSStacks.itemEquals(plating, stack))
					{
						count++;
					}
					else
					{
						return false;
					}
				}
				else
				{
					count++;
					plating = stack;
				}
			}
		}
		
		return platable != null && plating != null && count == ((IPlatable) platable.getItem()).getPlatingCount(platable);
	}
}
