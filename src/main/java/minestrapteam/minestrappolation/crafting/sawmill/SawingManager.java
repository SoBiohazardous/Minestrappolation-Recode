package minestrapteam.minestrappolation.crafting.sawmill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import minestrapteam.minestrappolation.lib.MBlocks;
import minestrapteam.minestrappolation.lib.MItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class SawingManager
{
	/** The static instance of this class */
	public static final SawingManager	instance	= new SawingManager();
	
	/** A list of all the recipes added */
	private List<IRecipe>				recipes		= new ArrayList();
	private boolean						listSorted;
	
	private SawingManager()
	{
		this.addRecipe(new ItemStack(Blocks.chest, 1), new Object[] { "###", "# #", "###", '#', "plankWood" });
		this.addRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[] { "##", "##", '#', "plankWood" });
		this.addRecipe(new ItemStack(Blocks.fence, 2), new Object[] { "###", "###", '#', "stickWood" });
		this.addRecipe(new ItemStack(Blocks.fence_gate, 1), new Object[] { "#W#", "#W#", '#', "stickWood", 'W', "plankWood" });
		this.addRecipe(new ItemStack(Blocks.jukebox, 1), new Object[] { "###", "#X#", "###", '#', "plankWood", 'X', "gemDiamond" });
		this.addRecipe(new ItemStack(Blocks.noteblock, 1), new Object[] { "###", "#X#", "###", '#', "plankWood", 'X', "dustRedstone" });
		this.addRecipe(new ItemStack(Blocks.bookshelf, 1), new Object[] { "###", "XXX", "###", '#', "plankWood", 'X', Items.book });
		this.addRecipe(new ItemStack(Items.stick, 6), new Object[] { "#", "#", '#', "plankWood" });
		this.addRecipe(new ItemStack(Items.boat, 1), new Object[] { "# #", "###", '#', "plankWood" });
		this.addRecipe(new ItemStack(Blocks.ladder, 3), new Object[] { "# #", "###", "# #", '#', "stickWood" });
		this.addRecipe(new ItemStack(Items.wooden_door, 1), new Object[] { "##", "##", "##", '#', "plankWood" });
		this.addRecipe(new ItemStack(Blocks.trapdoor, 2), new Object[] { "###", "###", '#', "plankWood" });
		this.addRecipe(new ItemStack(Items.sign, 3), new Object[] { "###", "###", " X ", '#', "plankWood", 'X', "stickWood" });
		this.addRecipe(new ItemStack(Items.item_frame, 1), new Object[] { "###", "#X#", "###", '#', "stickWood", 'X', Items.leather });
		this.addRecipe(new ItemStack(Items.painting, 1), new Object[] { "###", "#X#", "###", '#', "stickWood", 'X', Blocks.wool });
		this.addRecipe(new ItemStack(Items.bed, 1), new Object[] { "###", "XXX", '#', Blocks.wool, 'X', "plankWood" });
		this.addRecipe(new ItemStack(Items.bowl, 4), new Object[] { "# #", " # ", '#', "plankWood" });
		this.addRecipe(new ItemStack(Blocks.wooden_button, 1), new Object[] { "#", '#', "plankWood" });
		this.addRecipe(new ItemStack(Blocks.wooden_pressure_plate, 1), new Object[] { "##", '#', "plankWood" });
		this.addRecipe(new ItemStack(MBlocks.crate, 1), new Object[] { "###", "XXX", "###", '#', "plankWood", 'X', "stickWood" });
		this.addRecipe(new ItemStack(MBlocks.barrel, 1), new Object[] { "#X#", "# #", "#X#", '#', "plankWood", 'X', "ingotTin" });
		this.addShapelessRecipe(new ItemStack(MItems.reinforcedStick, 6), "stickWood", "stickWood", "stickWood", "stickWood", "stickWood", "stickWood", MItems.plateTinItem);
		
		// Planks
		this.addRecipe(new ItemStack(Blocks.planks, 6, 0), new Object[] { "#", '#', new ItemStack(Blocks.log, 1, 0) });
		this.addRecipe(new ItemStack(Blocks.planks, 6, 1), new Object[] { "#", '#', new ItemStack(Blocks.log, 1, 1) });
		this.addRecipe(new ItemStack(Blocks.planks, 6, 2), new Object[] { "#", '#', new ItemStack(Blocks.log, 1, 2) });
		this.addRecipe(new ItemStack(Blocks.planks, 6, 3), new Object[] { "#", '#', new ItemStack(Blocks.log, 1, 3) });
		this.addRecipe(new ItemStack(Blocks.planks, 6, 4), new Object[] { "#", '#', new ItemStack(Blocks.log2, 1, 0) });
		this.addRecipe(new ItemStack(Blocks.planks, 6, 5), new Object[] { "#", '#', new ItemStack(Blocks.log2, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.redwood, 6, 0), new Object[] { "#", '#', new ItemStack(MBlocks.redwoodLog, 1, 0) });
		
		// Bevel
		this.addRecipe(new ItemStack(MBlocks.oak, 4, 0), new Object[] { "PP", "PP", 'P', new ItemStack(MBlocks.oak, 1, 2) });
		this.addRecipe(new ItemStack(MBlocks.spruce, 4, 0), new Object[] { "PP", "PP", 'P', new ItemStack(MBlocks.spruce, 1, 2) });
		this.addRecipe(new ItemStack(MBlocks.birch, 4, 0), new Object[] { "PP", "PP", 'P', new ItemStack(MBlocks.birch, 1, 2) });
		this.addRecipe(new ItemStack(MBlocks.jungleWood, 4, 0), new Object[] { "PP", "PP", 'P', new ItemStack(MBlocks.jungleWood, 1, 2) });
		this.addRecipe(new ItemStack(MBlocks.acacia, 4, 0), new Object[] { "PP", "PP", 'P', new ItemStack(MBlocks.acacia, 1, 2) });
		this.addRecipe(new ItemStack(MBlocks.darkOak, 4, 0), new Object[] { "PP", "PP", 'P', new ItemStack(MBlocks.darkOak, 1, 2) });
		this.addRecipe(new ItemStack(MBlocks.redwood, 4, 1), new Object[] { "PP", "PP", 'P', new ItemStack(MBlocks.redwood, 1, 3) });
		
		// Boards
		this.addRecipe(new ItemStack(MBlocks.oak, 16, 1), new Object[] { "LL", "LL", 'L', new ItemStack(Blocks.log, 1, 0) });
		this.addRecipe(new ItemStack(MBlocks.spruce, 16, 1), new Object[] { "LL", "LL", 'L', new ItemStack(Blocks.log, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.birch, 16, 1), new Object[] { "LL", "LL", 'L', new ItemStack(Blocks.log, 1, 2) });
		this.addRecipe(new ItemStack(MBlocks.jungleWood, 16, 1), new Object[] { "LL", "LL", 'L', new ItemStack(Blocks.log, 1, 3) });
		this.addRecipe(new ItemStack(MBlocks.acacia, 16, 1), new Object[] { "LL", "LL", 'L', new ItemStack(Blocks.log2, 1, 0) });
		this.addRecipe(new ItemStack(MBlocks.darkOak, 16, 1), new Object[] { "LL", "LL", 'L', new ItemStack(Blocks.log2, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.redwood, 16, 2), new Object[] { "LL", "LL", 'L', new ItemStack(MBlocks.redwoodLog, 1, 0) });
		
		// Panels
		this.addRecipe(new ItemStack(MBlocks.oak, 9, 2), new Object[] { "WWW", "WWW", "WWW", 'W', new ItemStack(Blocks.planks, 1, 0) });
		this.addRecipe(new ItemStack(MBlocks.spruce, 9, 2), new Object[] { "WWW", "WWW", "WWW", 'W', new ItemStack(Blocks.planks, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.birch, 9, 2), new Object[] { "WWW", "WWW", "WWW", 'W', new ItemStack(Blocks.planks, 1, 2) });
		this.addRecipe(new ItemStack(MBlocks.jungleWood, 9, 2), new Object[] { "WWW", "WWW", "WWW", 'W', new ItemStack(Blocks.planks, 1, 3) });
		this.addRecipe(new ItemStack(MBlocks.acacia, 9, 2), new Object[] { "WWW", "WWW", "WWW", 'W', new ItemStack(Blocks.planks, 1, 4) });
		this.addRecipe(new ItemStack(MBlocks.darkOak, 9, 2), new Object[] { "WWW", "WWW", "WWW", 'W', new ItemStack(Blocks.planks, 1, 5) });
		this.addRecipe(new ItemStack(MBlocks.redwood, 9, 3), new Object[] { "WWW", "WWW", "WWW", 'W', new ItemStack(MBlocks.redwood, 1, 0) });
		
		// Mossy Planks
		this.addRecipe(new ItemStack(MBlocks.oak, 8, 3), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(Blocks.planks, 1, 0), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.spruce, 8, 3), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(Blocks.planks, 1, 1), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.birch, 8, 3), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(Blocks.planks, 1, 2), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.jungleWood, 8, 3), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(Blocks.planks, 1, 3), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.acacia, 8, 3), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(Blocks.planks, 1, 4), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.darkOak, 8, 3), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(Blocks.planks, 1, 5), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.redwood, 8, 4), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.redwood, 1, 0), 'V', MItems.mossLump });
		
		// Mossy Boards
		this.addRecipe(new ItemStack(MBlocks.oak, 8, 4), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.oak, 1, 1), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.spruce, 8, 4), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.spruce, 1, 1), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.birch, 8, 4), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.birch, 1, 1), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.jungleWood, 8, 4), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.jungleWood, 1, 1), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.acacia, 8, 4), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.acacia, 1, 1), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.darkOak, 8, 4), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.darkOak, 1, 1), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.redwood, 8, 5), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.redwood, 1, 2), 'V', MItems.mossLump });
		
		// Mossy Panels
		this.addRecipe(new ItemStack(MBlocks.oak, 8, 5), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.oak, 1, 2), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.spruce, 8, 5), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.spruce, 1, 2), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.birch, 8, 5), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.birch, 1, 2), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.jungleWood, 8, 5), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.jungleWood, 1, 2), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.acacia, 8, 5), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.acacia, 1, 2), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.darkOak, 8, 5), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.darkOak, 1, 2), 'V', MItems.mossLump });
		this.addRecipe(new ItemStack(MBlocks.redwood, 8, 6), new Object[] { "PPP", "PVP", "PPP", 'P', new ItemStack(MBlocks.redwood, 1, 3), 'V', MItems.mossLump });
		
		// Rotten Planks
		this.addRecipe(new ItemStack(MBlocks.oak, 8, 6), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.oak, 1, 3), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.spruce, 8, 6), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.spruce, 1, 3), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.birch, 8, 6), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.birch, 1, 3), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.jungleWood, 8, 6), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.jungleWood, 1, 3), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.acacia, 8, 6), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.acacia, 1, 3), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.darkOak, 8, 6), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.darkOak, 1, 3), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.redwood, 8, 7), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.redwood, 1, 3), 'B', Items.water_bucket });
		
		// Rotten Boards
		this.addRecipe(new ItemStack(MBlocks.oak, 8, 7), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.oak, 1, 4), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.spruce, 8, 7), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.spruce, 1, 4), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.birch, 8, 7), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.birch, 1, 4), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.jungleWood, 8, 7), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.jungleWood, 1, 4), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.acacia, 8, 7), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.acacia, 1, 4), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.darkOak, 8, 7), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.darkOak, 1, 4), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.redwood, 8, 8), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.redwood, 1, 5), 'B', Items.water_bucket });
		
		// Rotten Panels
		this.addRecipe(new ItemStack(MBlocks.oak, 8, 8), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.oak, 1, 5), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.spruce, 8, 8), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.spruce, 1, 5), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.birch, 8, 8), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.birch, 1, 5), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.jungleWood, 8, 8), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.jungleWood, 1, 5), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.acacia, 8, 8), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.acacia, 1, 5), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.darkOak, 8, 8), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.darkOak, 1, 5), 'B', Items.water_bucket });
		this.addRecipe(new ItemStack(MBlocks.redwood, 8, 9), new Object[] { "MMM", "MBM", "MMM", 'M', new ItemStack(MBlocks.redwood, 1, 6), 'B', Items.water_bucket });
		
		// Planks Slabs
		this.addRecipe(new ItemStack(Blocks.wooden_slab, 6, 0), new Object[] { "###", '#', new ItemStack(Blocks.planks, 1, 0) });
		this.addRecipe(new ItemStack(Blocks.wooden_slab, 6, 1), new Object[] { "###", '#', new ItemStack(Blocks.planks, 1, 1) });
		this.addRecipe(new ItemStack(Blocks.wooden_slab, 6, 2), new Object[] { "###", '#', new ItemStack(Blocks.planks, 1, 2) });
		this.addRecipe(new ItemStack(Blocks.wooden_slab, 6, 3), new Object[] { "###", '#', new ItemStack(Blocks.planks, 1, 3) });
		this.addRecipe(new ItemStack(Blocks.wooden_slab, 6, 4), new Object[] { "###", '#', new ItemStack(Blocks.planks, 1, 4) });
		this.addRecipe(new ItemStack(Blocks.wooden_slab, 6, 5), new Object[] { "###", '#', new ItemStack(Blocks.planks, 1, 5) });
		this.addRecipe(new ItemStack(MBlocks.redwood2, 6, 0), new Object[] { "###", '#', new ItemStack(MBlocks.redwood, 1, 0) });
		
		// Boards Slabs
		this.addRecipe(new ItemStack(MBlocks.oak2, 6, 0), new Object[] { "BBB", 'B', new ItemStack(MBlocks.oak, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.spruce2, 6, 0), new Object[] { "BBB", 'B', new ItemStack(MBlocks.spruce, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.birch2, 6, 0), new Object[] { "BBB", 'B', new ItemStack(MBlocks.birch, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.jungleWood2, 6, 0), new Object[] { "BBB", 'B', new ItemStack(MBlocks.jungleWood, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.acacia2, 6, 0), new Object[] { "BBB", 'B', new ItemStack(MBlocks.acacia, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.darkOak2, 6, 0), new Object[] { "BBB", 'B', new ItemStack(MBlocks.darkOak, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.redwood2, 6, 1), new Object[] { "BBB", 'B', new ItemStack(MBlocks.redwood, 1, 2) });
		
		// Planks Stairs
		this.addRecipe(new ItemStack(Blocks.oak_stairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 0) });
		this.addRecipe(new ItemStack(Blocks.spruce_stairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 1) });
		this.addRecipe(new ItemStack(Blocks.birch_stairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 2) });
		this.addRecipe(new ItemStack(Blocks.jungle_stairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 3) });
		this.addRecipe(new ItemStack(Blocks.acacia_stairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 4) });
		this.addRecipe(new ItemStack(Blocks.dark_oak_stairs, 4), new Object[] { "#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 5) });
		this.addRecipe(new ItemStack(MBlocks.redwoodStairsPlanks, 6, 0), new Object[] { "#  ", "## ", "###", '#', new ItemStack(MBlocks.redwood, 1, 0) });
		
		// Boards Stairs
		this.addRecipe(new ItemStack(MBlocks.oakStairsBoards, 4, 0), new Object[] { "B  ", "BB ", "BBB", 'B', new ItemStack(MBlocks.oak, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.spruceStairsBoards, 4, 0), new Object[] { "B  ", "BB ", "BBB", 'B', new ItemStack(MBlocks.spruce, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.birchStairsBoards, 4, 0), new Object[] { "B  ", "BB ", "BBB", 'B', new ItemStack(MBlocks.birch, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.jungleWoodStairsBoards, 4, 0), new Object[] { "B  ", "BB ", "BBB", 'B', new ItemStack(MBlocks.jungleWood, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.acaciaStairsBoards, 4, 0), new Object[] { "B  ", "BB ", "BBB", 'B', new ItemStack(MBlocks.acacia, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.darkOakStairsBoards, 4, 0), new Object[] { "B  ", "BB ", "BBB", 'B', new ItemStack(MBlocks.darkOak, 1, 1) });
		this.addRecipe(new ItemStack(MBlocks.redwoodStairsBoards, 4, 0), new Object[] { "B  ", "BB ", "BBB", 'B', new ItemStack(MBlocks.redwood, 1, 2) });
	}
	
	public ShapedOreRecipe addRecipe(ItemStack output, Object... data)
	{
		ShapedOreRecipe recipe = new ShapedOreRecipe(output, data);
		this.recipes.add(recipe);
		this.listSorted = false;
		return recipe;
	}
	
	public ShapelessOreRecipe addShapelessRecipe(ItemStack stack, Object... data)
	{
		ShapelessOreRecipe recipe = new ShapelessOreRecipe(stack, data);
		this.recipes.add(recipe);
		this.listSorted = false;
		return recipe;
	}
	
	public ItemStack findMatchingRecipe(InventoryCrafting inventory, World world)
	{
		for (IRecipe recipe : this.getRecipeList())
		{
			if (recipe.matches(inventory, world))
			{
				return recipe.getCraftingResult(inventory);
			}
		}
		
		return null;
	}
	
	public List<IRecipe> getRecipeList()
	{
		if (!this.listSorted)
		{
			Collections.sort(this.recipes, new Comparator<IRecipe>()
			{
				@Override
				public int compare(IRecipe recipe1, IRecipe recipe2)
				{
					boolean flag1 = recipe1 instanceof ShapedRecipes;
					boolean flag2 = recipe1 instanceof ShapelessRecipes;
					boolean flag3 = recipe2 instanceof ShapedRecipes;
					boolean flag4 = recipe2 instanceof ShapelessRecipes;
					return flag2 && flag3 ? 1 : flag4 && flag1 ? -1 : recipe2.getRecipeSize() < recipe1.getRecipeSize() ? -1 : recipe2.getRecipeSize() > recipe1.getRecipeSize() ? 1 : 0;
				}
			});
			
			this.listSorted = true;
		}
		
		return this.recipes;
	}
}
