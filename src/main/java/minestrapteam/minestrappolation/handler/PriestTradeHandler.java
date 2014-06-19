package minestrapteam.minestrappolation.handler;

import java.util.Random;

import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import minestrapteam.minestrappolation.lib.MItems;

import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class PriestTradeHandler implements IVillageTradeHandler
{
	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipes, Random random)
	{
//		recipes.add(new MerchantRecipe(new ItemStack(MBlocks.sandstoneBricks, 1, 3), new ItemStack(Items.emerald, 5)));
//		recipes.add(new MerchantRecipe(new ItemStack(MBlocks.sandstoneBricks, 1, 4), new ItemStack(Items.emerald, 5)));
		
		recipes.add(new MerchantRecipe(new ItemStack(MItems.SunstoneDust, 11), new ItemStack(Items.emerald, 1)));
		recipes.add(new MerchantRecipe(new ItemStack(MItems.soulGem, 3), new ItemStack(Items.emerald, 1)));
		recipes.add(new MerchantRecipe(new ItemStack(MItems.BlaziumIngot, 5), new ItemStack(Items.emerald, 1)));
		recipes.add(new MerchantRecipe(new ItemStack(MItems.ToriteIngot, 6), new ItemStack(Items.emerald, 1)));
		recipes.add(new MerchantRecipe(new ItemStack(MItems.PinkQuartz, 18), new ItemStack(Items.emerald, 1)));
		recipes.add(new MerchantRecipe(new ItemStack(MItems.radiantQuartz, 2), new ItemStack(Items.emerald, 1)));
		recipes.add(new MerchantRecipe(new ItemStack(Items.emerald, 5), new ItemStack(MItems.soulBottle, 1)));
	}
}