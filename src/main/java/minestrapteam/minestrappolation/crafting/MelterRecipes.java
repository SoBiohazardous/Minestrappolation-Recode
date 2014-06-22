package minestrapteam.minestrappolation.crafting;

import clashsoft.cslib.minecraft.crafting.ExperienceRecipeManager;
import minestrapteam.minestrap_core.lib.MCBlocks;
import minestrapteam.minestrappolation.lib.MBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MelterRecipes extends ExperienceRecipeManager
{
	public static final MelterRecipes	instance	= new MelterRecipes();
	
	private MelterRecipes()
	{
		this.addRecipe(Blocks.cobblestone, new ItemStack(Items.lava_bucket, 1, 0), 0.4F);
		this.addRecipe(Blocks.mossy_cobblestone, new ItemStack(Items.lava_bucket, 1, 0), 0.6F);
		this.addRecipe(Blocks.gravel, new ItemStack(Items.lava_bucket, 1, 0), 0.2F);
		this.addRecipe(Blocks.stone, new ItemStack(Items.lava_bucket, 1, 0), 0.5F);
		this.addRecipe(Blocks.stonebrick, new ItemStack(Items.lava_bucket, 1, 0), 0.8F);
		this.addRecipe(Blocks.snow, new ItemStack(Items.water_bucket, 1, 0), 0.6F);
		this.addRecipe(Blocks.ice, new ItemStack(Items.water_bucket, 1, 0), 0.7F);
		this.addRecipe(Blocks.cobblestone_wall, new ItemStack(Items.lava_bucket, 1, 0), 0.7F);
		this.addRecipe(MCBlocks.granite, new ItemStack(Items.lava_bucket, 1, 0), 0.8F);
		this.addRecipe(MCBlocks.granite2, new ItemStack(Items.lava_bucket, 1, 0), 0.8F);
		this.addRecipe(MCBlocks.graniteBronze, new ItemStack(Items.lava_bucket, 1, 0), 0.8F);
		this.addRecipe(MCBlocks.graniteBronze2, new ItemStack(Items.lava_bucket, 1, 0), 0.8F);
		this.addRecipe(MCBlocks.graniteMeurodite, new ItemStack(Items.lava_bucket, 1, 0), 0.8F);
		this.addRecipe(MCBlocks.graniteMeurodite2, new ItemStack(Items.lava_bucket, 1, 0), 0.8F);
		this.addRecipe(MCBlocks.graniteSteel, new ItemStack(Items.lava_bucket, 1, 0), 0.8F);
		this.addRecipe(MCBlocks.graniteSteel2, new ItemStack(Items.lava_bucket, 1, 0), 0.8F);
		this.addRecipe(MCBlocks.graniteTin, new ItemStack(Items.lava_bucket, 1, 0), 0.8F);
		this.addRecipe(MCBlocks.graniteTin2, new ItemStack(Items.lava_bucket, 1, 0), 0.8F);
		// addSmelting(Blocks.obsidian, new
		// ItemStack(EOItemManager.bucketMagma,1,0), 0.7F);
		// addSmelting(Blocks.bedrock, new
		// ItemStack(EOItemManager.bucketMagma,1,0), 0.7F);
		// this.addRecipe(MBlocks.Granite, new ItemStack(Items.lava_bucket, 1,
		// 0), 0.7F);
		this.addRecipe(Blocks.glowstone, new ItemStack(MBlocks.glowGlass), 0.7F);
	}
}
