package minestrapteam.minestrappolation.lib;

import static minestrapteam.minestrappolation.lib.MBlocks.stoneCutter;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class MOreDictionary
{
	public static void load()
	{
		OreDictionary.registerOre("blockCopper", MBlocks.copperBlock);
		OreDictionary.registerOre("ingotCopper", MItems.copperIngot);
		OreDictionary.registerOre("oreCopper", MBlocks.copperOre);
		OreDictionary.registerOre("blockTin", MBlocks.tinBlock);
		OreDictionary.registerOre("ingotTin", MItems.tinIngot);
		OreDictionary.registerOre("oreTin", MBlocks.tinOre);
		OreDictionary.registerOre("plateTin", MBlocks.tinPlate);
		OreDictionary.registerOre("blockBronze", MBlocks.bronzeBlock);
		OreDictionary.registerOre("ingotBronze", MItems.bronzeIngot);
		OreDictionary.registerOre("plateBronze", MBlocks.bronzePlate);
		OreDictionary.registerOre("blockSteel", MBlocks.steelBlock);
		OreDictionary.registerOre("ingotCoalIron", MItems.coalIronIngot);
		OreDictionary.registerOre("ingotSteel", MItems.steelIngot);
		OreDictionary.registerOre("plateSteel", MBlocks.steelPlate);
		OreDictionary.registerOre("blockMeurodite", MBlocks.meuroditeBlock);
		OreDictionary.registerOre("oreMeurodite", MBlocks.meuroditeOre);
		OreDictionary.registerOre("plateMeurodite", MBlocks.meuroditePlate);
		OreDictionary.registerOre("gemMeurodite", MItems.meuroditeGem);
		OreDictionary.registerOre("blockTorite", MBlocks.toriteBlock);
		OreDictionary.registerOre("oreTorite", MBlocks.toriteOre);
		OreDictionary.registerOre("ingotTorite", MItems.toriteIngot);
		OreDictionary.registerOre("blockTitanium", MBlocks.titaniumBlock);
		OreDictionary.registerOre("oreTitanium", MBlocks.titaniumOre);
		OreDictionary.registerOre("ingotTitanium", MItems.titaniumIngot);
		OreDictionary.registerOre("blockSunstone", MBlocks.sunstoneBlock);
		OreDictionary.registerOre("oreSunstone", MBlocks.sunstoneOre);
		OreDictionary.registerOre("dustSunstone", MItems.sunstoneDust);
		OreDictionary.registerOre("blockUranium", MBlocks.uraniumBlock);
		OreDictionary.registerOre("oreUranium", MBlocks.uraniumOre);
		OreDictionary.registerOre("uranium", MItems.uranium);
		OreDictionary.registerOre("ingotUranium", MItems.uranium);
		OreDictionary.registerOre("blockPlutonium", MBlocks.plutoniumBlock);
		OreDictionary.registerOre("orePlutonium", MBlocks.plutoniumOre);
		OreDictionary.registerOre("plutonium", MItems.plutonium);
		OreDictionary.registerOre("ingotPlutonium", MItems.plutonium);
		OreDictionary.registerOre("blockDesertQuartz", new ItemStack(MBlocks.desertQuartz, 1, 0));
		OreDictionary.registerOre("gemDesertQuartz", MItems.desertQuartz);
		OreDictionary.registerOre("blockRadiantQuartz", new ItemStack(MBlocks.radiantQuartz, 1, 0));
		OreDictionary.registerOre("oreQuartzRadiant", MBlocks.radiantQuartzOre);
		OreDictionary.registerOre("gemRadiantQuartz", MItems.radiantQuartz);
		OreDictionary.registerOre("blockBlazium", MBlocks.blaziumBlock);
		OreDictionary.registerOre("oreBlazium", MBlocks.blaziumOre);
		OreDictionary.registerOre("gemBlazium", MItems.blazeShard);
		OreDictionary.registerOre("ingotBlazium", MItems.blaziumIngot);
		OreDictionary.registerOre("blockSoulGem", MBlocks.soulBlock);
		OreDictionary.registerOre("oreSoul", MBlocks.soulOre);
		OreDictionary.registerOre("gemSoul", MItems.soulGem);
		
		// Logs
		OreDictionary.registerOre("logWood", MBlocks.redwoodLog);
		
		// Planks
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.redwood, 1, 0));
		
		OreDictionary.registerOre("plankOak", new ItemStack(Blocks.planks, 1, 0));
		OreDictionary.registerOre("plankBirch", new ItemStack(Blocks.planks, 1, 2));
		OreDictionary.registerOre("plankSpruce", new ItemStack(Blocks.planks, 1, 1));
		OreDictionary.registerOre("plankJungle", new ItemStack(Blocks.planks, 1, 3));
		OreDictionary.registerOre("plankAcacia", new ItemStack(Blocks.planks, 1, 4));
		OreDictionary.registerOre("plankDarkOak", new ItemStack(Blocks.planks, 1, 5));
		OreDictionary.registerOre("plankRedwood", new ItemStack(MBlocks.redwood, 1, 0));
		
		// Boards
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.oak, 1, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.birch, 1, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.spruce, 1, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.jungleWood, 1, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.acacia, 1, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.darkOak, 1, 1));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.redwood, 1, 2));
		
		OreDictionary.registerOre("plankOak", new ItemStack(MBlocks.oak, 1, 1));
		OreDictionary.registerOre("plankBirch", new ItemStack(MBlocks.birch, 1, 1));
		OreDictionary.registerOre("plankSpruce", new ItemStack(MBlocks.spruce, 1, 1));
		OreDictionary.registerOre("plankJungle", new ItemStack(MBlocks.jungleWood, 1, 1));
		OreDictionary.registerOre("plankAcacia", new ItemStack(MBlocks.acacia, 1, 1));
		OreDictionary.registerOre("plankDarkOak", new ItemStack(MBlocks.darkOak, 1, 1));
		OreDictionary.registerOre("plankRedwood", new ItemStack(MBlocks.redwood, 1, 2));
		
		// Mossy Planks
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.oak, 1, 3));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.birch, 1, 3));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.spruce, 1, 3));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.jungleWood, 1, 3));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.acacia, 1, 3));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.darkOak, 1, 3));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.darkOak, 1, 3));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.redwood, 1, 4));
		
		OreDictionary.registerOre("plankOak", new ItemStack(MBlocks.oak, 1, 3));
		OreDictionary.registerOre("plankBirch", new ItemStack(MBlocks.birch, 1, 3));
		OreDictionary.registerOre("plankSpruce", new ItemStack(MBlocks.spruce, 1, 3));
		OreDictionary.registerOre("plankJungle", new ItemStack(MBlocks.jungleWood, 1, 3));
		OreDictionary.registerOre("plankAcacia", new ItemStack(MBlocks.acacia, 1, 3));
		OreDictionary.registerOre("plankDarkOak", new ItemStack(MBlocks.darkOak, 1, 3));
		OreDictionary.registerOre("plankRedwood", new ItemStack(MBlocks.redwood, 1, 4));
		
		// Mossy Boards
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.oak, 1, 4));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.birch, 1, 4));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.spruce, 1, 4));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.jungleWood, 1, 4));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.acacia, 1, 4));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.darkOak, 1, 4));
		OreDictionary.registerOre("plankWood", new ItemStack(MBlocks.redwood, 1, 5));
		
		OreDictionary.registerOre("plankOak", new ItemStack(MBlocks.oak, 1, 4));
		OreDictionary.registerOre("plankBirch", new ItemStack(MBlocks.birch, 1, 4));
		OreDictionary.registerOre("plankSpruce", new ItemStack(MBlocks.spruce, 1, 4));
		OreDictionary.registerOre("plankJungle", new ItemStack(MBlocks.jungleWood, 1, 4));
		OreDictionary.registerOre("plankAcacia", new ItemStack(MBlocks.acacia, 1, 4));
		OreDictionary.registerOre("plankDarkOak", new ItemStack(MBlocks.darkOak, 1, 4));
		OreDictionary.registerOre("plankRedwood", new ItemStack(MBlocks.redwood, 1, 5));
		
		// Planks Slabs
		OreDictionary.registerOre("slabWood", new ItemStack(MBlocks.redwood2, 1, 0));
		
		// Boards Slabs
		OreDictionary.registerOre("slabWood", new ItemStack(MBlocks.oak2, 1, 0));
		OreDictionary.registerOre("slabWood", new ItemStack(MBlocks.birch2, 1, 0));
		OreDictionary.registerOre("slabWood", new ItemStack(MBlocks.spruce2, 1, 0));
		OreDictionary.registerOre("slabWood", new ItemStack(MBlocks.jungleWood2, 1, 0));
		OreDictionary.registerOre("slabWood", new ItemStack(MBlocks.acacia2, 1, 0));
		OreDictionary.registerOre("slabWood", new ItemStack(MBlocks.darkOak2, 1, 0));
		OreDictionary.registerOre("slabWood", new ItemStack(MBlocks.redwood2, 1, 1));
		
		// Stone and Sandstone
		OreDictionary.registerOre("sandstone", MBlocks.sandstone);
		OreDictionary.registerOre("sandstone", MBlocks.redSandstone);
		
		OreDictionary.registerOre("stone", new ItemStack(MBlocks.deepstone, 1, 0));
		OreDictionary.registerOre("stone", new ItemStack(MBlocks.redrock, 1, 0));
		OreDictionary.registerOre("stone", new ItemStack(MBlocks.deepRedrock, 1, 0));
		OreDictionary.registerOre("stone", new ItemStack(MBlocks.coldstone, 1, 0));
		OreDictionary.registerOre("stone", new ItemStack(MBlocks.deepColdstone, 1, 0));
		OreDictionary.registerOre("stone", new ItemStack(MBlocks.icestone, 1, 0));
		OreDictionary.registerOre("stone", new ItemStack(MBlocks.glacierrock, 1, 0));
		OreDictionary.registerOre("stone", new ItemStack(MBlocks.oceanstone, 1, 0));
		OreDictionary.registerOre("stone", new ItemStack(MBlocks.pressurizedOceanstone, 1, 0));
		
		OreDictionary.registerOre("cobblestone", new ItemStack(MBlocks.deepstone, 1, 7));
		OreDictionary.registerOre("cobblestone", new ItemStack(MBlocks.redrock, 1, 7));
		OreDictionary.registerOre("cobblestone", new ItemStack(MBlocks.deepRedrock, 1, 7));
		OreDictionary.registerOre("cobblestone", new ItemStack(MBlocks.coldstone, 1, 7));
		OreDictionary.registerOre("cobblestone", new ItemStack(MBlocks.deepColdstone, 1, 7));
		OreDictionary.registerOre("cobblestone", new ItemStack(MBlocks.icestone, 1, 7));
		OreDictionary.registerOre("cobblestone", new ItemStack(MBlocks.glacierrock, 1, 7));
		OreDictionary.registerOre("cobblestone", new ItemStack(MBlocks.oceanstone, 1, 7));
		OreDictionary.registerOre("cobblestone", new ItemStack(MBlocks.pressurizedOceanstone, 1, 7));
		
		//Meat
		OreDictionary.registerOre("meatRaw", Items.beef);
		OreDictionary.registerOre("meatRaw", Items.porkchop);
		OreDictionary.registerOre("meatRaw", Items.fish);
		OreDictionary.registerOre("meatRaw", Items.chicken);
		OreDictionary.registerOre("meatRaw", Items.rotten_flesh);
		OreDictionary.registerOre("meatRaw", MItems.chickenWingRaw);
		OreDictionary.registerOre("meatRaw", MItems.lambchopRaw);
		OreDictionary.registerOre("meatRaw", MItems.squidTentacle);
		OreDictionary.registerOre("meatRaw", MItems.horseHaunchRaw);
		
		//Glass
		OreDictionary.registerOre("blockGlass", MBlocks.refinedGlass);
		OreDictionary.registerOre("blockGlassColorless", MBlocks.refinedGlass);
		OreDictionary.registerOre("paneGlass", MBlocks.refinedGlassPane);
		OreDictionary.registerOre("paneGlassColorless", MBlocks.refinedGlassPane);
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MBlocks.meatBlock, new Object[] { "MMM", "MMM", "MMM", 'M', "meatRaw" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MBlocks.crate, new Object[] { "WWW", "SSS", "WWW", 'S', "stickWood", 'W', "plankWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MBlocks.barrel, new Object[] { "WTW", "W W", "WTW", 'T', "ingotTin", 'W', "plankWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MItems.glassDoorItem, new Object[] { "GG", "GI", "GG", 'G', "blockGlassColorless", 'I', "ingotIron" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MItems.horseHairBow, new Object[] { " SH", "S H", " SH", 'S', "slabWood", 'H', MItems.horseHairFibre }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(MItems.steelLock, new Object[] { " I ", "SSS", " S ", 'I', "ingotIron", 'S', "ingotSteel" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MItems.steelLock, new Object[] { "I", "L", 'I', "ingotIron", 'L', new ItemStack(MItems.steelLock, 1, 1) }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MItems.steelKey, new Object[] { "SSS", "GG ", 'G', "ingotGold", 'S', "ingotSteel" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(MItems.lockCutter, new Object[] { "C ", " C", 'C', "ingotCopper" }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MBlocks.sawmill, 1, 1), new Object[] { "II", "WW", "WW", 'W', "plankWood", 'I', "ingotCopper" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(Blocks.daylight_detector, new Object[] { "GGG", "QQQ", "SSS", 'G', "blockGlassColorless", 'Q', "gemQuartz", 'S', "slabWood" }));
		GameRegistry.addRecipe(new ShapedOreRecipe(Blocks.brewing_stand, new Object[] { " B ", "CCC", 'B', Items.blaze_rod, 'C', "cobblestone"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(stoneCutter, 1, 1), new Object[] { "II", "CC", "CC", 'C', "cobblestone", 'I', "ingotIron" }));
	}
}
