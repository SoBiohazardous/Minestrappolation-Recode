package minestrapteam.minestrappolation.lib;

import static minestrapteam.minestrappolation.Minestrappolation.*;
import clashsoft.cslib.minecraft.item.CSItems;
import clashsoft.cslib.minecraft.item.ItemCustomBucket;
import clashsoft.cslib.minecraft.item.ItemCustomDoor;
import minestrapteam.minestrappolation.Minestrappolation;
import minestrapteam.minestrappolation.item.*;
import minestrapteam.minestrappolation.item.MItemFood.FoodType;
import minestrapteam.minestrappolation.item.grenade.ItemGrenade;
import minestrapteam.minestrappolation.item.grenade.ItemGrenadeImpact;
import minestrapteam.minestrappolation.item.grenade.ItemGrenadeNuke;
import minestrapteam.minestrappolation.item.grenade.ItemGrenadeSticky;
import minestrapteam.minestrappolation.item.lock.ItemKey;
import minestrapteam.minestrappolation.item.lock.ItemLock;
import minestrapteam.minestrappolation.item.lock.ItemLockCutter;
import minestrapteam.minestrappolation.item.mob.*;
import minestrapteam.minestrappolation.item.tool.ItemHangGlider;
import minestrapteam.minestrappolation.item.tool.ItemHorseHairBow;
import minestrapteam.minestrappolation.util.MAssetManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionHelper;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class MItems
{
	/* / {----- Stonecutter Bricks -----} / */
	
	public static Item	brickStone;
	public static Item	brickStoneTin;
	public static Item	brickStoneBronze;
	public static Item	brickStoneSteel;
	public static Item	brickStoneMeurodite;
	
	public static Item	brickDeepstone;
	public static Item	brickRedrock;
	public static Item	brickDeepRedrock;
	public static Item	brickColdstone;
	public static Item	brickDeepColdstone;
	public static Item	brickIcestone;
	public static Item	brickGlacierrock;
	public static Item	brickOceanstone;
	public static Item	brickPressurizedOceanstone;
	
	public static Item	brickSlate;
	public static Item	brickSlateTin;
	public static Item	brickSlateBronze;
	public static Item	brickSlateSteel;
	public static Item	brickSlateMeurodite;
	
	public static Item	brickSandstone;
	public static Item	brickRedSandstone;
	public static Item	brickClay;
	public static Item	brickColoredClay;
	public static Item	brickFlint;
	public static Item	brickLapis;
	public static Item	brickDesertQuartz;
	public static Item	brickNetherQuartz;
	public static Item	brickObsidian;
	public static Item	brickEndStone;
	public static Item	brickBedrock;
	public static Item	brickRadiantQuartz;
	
	/* / {----- EO Items -----} / */
	
	public static Item	copperIngot;
	public static Item	tinIngot;
	public static Item	bronzeIngot;
	public static Item	coalIronIngot;
	public static Item	steelIngot;
	public static Item	titaniumIngot;
	public static Item	toriteIngot;
	public static Item	blaziumIngot;
	
	public static Item	soulGem;
	public static Item	meuroditeGem;
	public static Item	uranium;
	public static Item	plutonium;
	public static Item	radiantQuartz;
	public static Item	desertQuartz;
	public static Item	blazeShard;
	public static Item	sunstoneDust;
	public static Item	blackDiamond;
	
	public static Item	reinforcedStick;
	
	public static Item	magmaBucket;
	
	public static Item	steelKey;
	public static Item	steelLock;
	public static Item	lockCutter;
	
	public static Item	soulBottle;
	public static Item	grenade;
	public static Item	grenadeImpact;
	public static Item	grenadeSticky;
	public static Item	grenadeNuke;
	
	public static Item	plateTinItem;
	public static Item	plateBronzeItem;
	public static Item	plateSteelItem;
	public static Item	plateMeuroditeItem;
	
	public static Item	stoneChunk;
	
	/* / {----- ED Items -----} / */
	
	public static Item	ropeItem;
	public static Item	cardboardItem;
	public static Item	glassDoorItem;
	
	/* / {----- EE Items -----} / */
	
	public static Item	mossLump;
	
	/* / {----- EF Items -----} / */
	
	public static Item	coolantBottle;
	
	/* / {----- EMD Items -----} / */
	
	public static Item	snout;
	public static Item	pigHoof;
	public static Item	fat;
	public static Item	grease;
	
	public static Item	animalBones;
	public static Item	cowHoof;
	public static Item	horn;
	public static Item	beakChicken;
	public static Item	footChicken;
	public static Item	chickenWingRaw;
	public static Item	chickenWingCooked;
	public static Item	lambchopRaw;
	public static Item	lambchopCooked;
	public static Item	sheepHoof;
	public static Item	squidTentacle;
	public static Item	calimari;
	public static Item	airSack;
	public static Item	infectiousFungus;
	public static Item	whisker;
	public static Item	catEye;
	public static Item	wolfHide;
	public static Item	flesh;
	public static Item	marrow;
	public static Item	legSpider;
	public static Item	poisonSack;
	public static Item	guano;
	public static Item	carcassSilverfish;
	public static Item	hideCreeper;
	public static Item	slimeCore;
	public static Item	enderCore;
	public static Item	ghastTentacle;
	public static Item	horseHoof;
	public static Item	horseHaunchRaw;
	public static Item	horseHaunchCooked;
	public static Item	horseHair;
	public static Item	genes;
	public static Item	charms;
	public static Item	amuletPorcum;
	public static Item	amuletVaccam;
	public static Item	amuletPullum;
	public static Item	amuletOves;
	public static Item	wingSinew;
	public static Item	wingSegment;
	public static Item	hangGlider;
	public static Item	enderAura;
	public static Item	ghastlySoul;
	public static Item	witheredBone;
	public static Item	horseHairFibre;
	public static Item	horseHairBow;
	public static Item	deathMeal;
	public static Item	witherAsh;
	
	/*/ {----- Magic Items -----} /*/
	
	public static Item manaLeaf;
	
	public static void init()
	{
		// Brick Items
		
		brickStone = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("stone_brick"));
		brickStoneTin = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("stone_brick_tin"));
		brickStoneBronze = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("stone_brick_bronze"));
		brickStoneSteel = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("stone_brick_steel"));
		brickStoneMeurodite = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("stone_brick_meurodite"));
		
		brickDeepstone = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("deepstone_brick"));
		brickRedrock = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("redrock_brick"));
		brickDeepRedrock = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("deepredrock_brick"));
		brickColdstone = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("coldstone_brick"));
		brickDeepColdstone = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("deepcoldstone_brick"));
		brickIcestone = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("icestone_brick"));
		brickGlacierrock = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("glacierrock_brick"));
		brickOceanstone = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("oceanstone_brick"));
		brickPressurizedOceanstone = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("pressurizedoceanstone_brick"));
		
		brickSlate = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("granite_brick"));
		brickSlateTin = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("granite_brick_tin"));
		brickSlateBronze = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("granite_brick_bronze"));
		brickSlateSteel = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("granite_brick_steel"));
		brickSlateMeurodite = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("granite_brick_meurodite"));
		
		brickSandstone = new MItem().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("sandstone_brick"));
		brickRedSandstone = new MItem().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("red_sandstone_brick"));
		brickColoredClay = new MItemMulti(null, new String[] { MAssetManager.getStonecutterTexture("black_clay_brick"), MAssetManager.getStonecutterTexture("blue_clay_brick"), MAssetManager.getStonecutterTexture("brown_clay_brick"), MAssetManager.getStonecutterTexture("cyan_clay_brick"), MAssetManager.getStonecutterTexture("grey_clay_brick"), MAssetManager.getStonecutterTexture("green_clay_brick"), MAssetManager.getStonecutterTexture("lightblue_clay_brick"), MAssetManager.getStonecutterTexture("lime_clay_brick"), MAssetManager.getStonecutterTexture("magenta_clay_brick"), MAssetManager.getStonecutterTexture("orange_clay_brick"), MAssetManager.getStonecutterTexture("pink_clay_brick"), MAssetManager.getStonecutterTexture("purple_clay_brick"), MAssetManager.getStonecutterTexture("red_clay_brick"), MAssetManager.getStonecutterTexture("silver_clay_brick"), MAssetManager.getStonecutterTexture("white_clay_brick"), MAssetManager.getStonecutterTexture("yellow_clay_brick") }).setUnlocalizedName(
				"clay_brick").setCreativeTab(Minestrappolation.tabStoneDecor);
		brickFlint = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("flint_brick"));
		brickLapis = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("lapis_brick"));
		brickDesertQuartz = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("desertquartz_brick"));
		brickNetherQuartz = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("netherquartz_brick"));
		brickObsidian = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("obsidian_brick"));
		brickEndStone = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("endstone_brick"));
		brickBedrock = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("bedrock_brick"));
		brickRadiantQuartz = new Item().setCreativeTab(Minestrappolation.tabStoneDecor).setTextureName(MAssetManager.getStonecutterTexture("radiantquartz_brick"));
		
		// EO Items
		
		copperIngot = new MItem().setTextureName(MAssetManager.getMineralTexture("copper_ingot"));
		tinIngot = new MItem().setTextureName(MAssetManager.getMineralTexture("tin_ingot"));
		bronzeIngot = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("bronze_ingot"));
		coalIronIngot = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("coaliron_ingot"));
		steelIngot = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("steel_ingot"));
		titaniumIngot = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("titanium_ingot"));
		toriteIngot = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("torite_ingot"));
		blaziumIngot = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("blazium_ingot"));
		
		soulGem = new ItemSoulGem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("soul_gem"));
		meuroditeGem = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("meurodite_gem"));
		uranium = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("uranium"));
		plutonium = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("plutonium"));
		radiantQuartz = new MItemFoiled().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("radiant_quartz"));
		desertQuartz = new MItem().setTextureName(MAssetManager.getMineralTexture("desert_quartz"));
		blazeShard = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("blazium_dust"));
		sunstoneDust = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("sunstone_dust"));
		blackDiamond = new ItemBlackDiamond().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("black_diamond"));
		
		reinforcedStick = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getTexture("reinforced_stick"));
		
		magmaBucket = new ItemCustomBucket(MBlocks.magma).setCreativeTab(tabMisc).setTextureName(MAssetManager.getTexture("magma_bucket"));
		
		steelKey = new ItemKey().setCreativeTab(tabMisc).setTextureName(MAssetManager.getTexture("steel_key"));
		steelLock = new ItemLock().setCreativeTab(tabMisc).setTextureName(MAssetManager.getTexture("steel_lock"));
		lockCutter = new ItemLockCutter().setCreativeTab(tabMisc).setTextureName(MAssetManager.getTexture("lock_cutter"));
		
		soulBottle = new ItemSoulBottle().setCreativeTab(tabTools).setTextureName(MAssetManager.getTexture("soul_bottle"));
		grenade = new ItemGrenade().setCreativeTab(tabCombat).setTextureName(MAssetManager.getTexture("grenade"));
		grenadeImpact = new ItemGrenadeImpact().setCreativeTab(tabCombat).setTextureName(MAssetManager.getTexture("grenade_impact"));
		grenadeSticky = new ItemGrenadeSticky().setCreativeTab(tabCombat).setTextureName(MAssetManager.getTexture("grenade_sticky"));
		grenadeNuke = new ItemGrenadeNuke().setCreativeTab(tabCombat).setTextureName(MAssetManager.getTexture("grenade_nuke"));
		
		plateTinItem = new ItemPlating(MBlocks.tinPlate, "tin", 1F, 64, 1.2F).setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("tin_plating"));
		plateBronzeItem = new ItemPlating(MBlocks.bronzePlate, "bronze", 1.5F, 128, 1.3F).setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("bronze_plating"));
		plateSteelItem = new ItemPlating(MBlocks.steelPlate, "steel", 2F, 192, 1.4F).setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("steel_plating"));
		plateMeuroditeItem = new ItemPlating(MBlocks.meuroditePlate, "meurodite", 2.5F, 256, 1.5F).setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("meurodite_plating"));
		
		stoneChunk = new MItem().setCreativeTab(Minestrappolation.tabMaterials).setTextureName(MAssetManager.getMineralTexture("rock_chunk"));
		
		// ED Items
		
		ropeItem = new ItemReed(MBlocks.rope).setCreativeTab(tabDecorationBlocks).setTextureName(MAssetManager.getTexture("rope"));
		cardboardItem = new ItemReed(MBlocks.cardboard).setCreativeTab(tabDecorationBlocks).setTextureName(MAssetManager.getTexture("cardboard"));
		glassDoorItem = new ItemCustomDoor(MBlocks.glassDoor).setCreativeTab(tabDecorationBlocks).setTextureName(MAssetManager.getTexture("glass_door"));
		
		// EE Items
		
		mossLump = new ItemReed(MBlocks.mossCover).setCreativeTab(tabMaterials).setTextureName(MAssetManager.getTexture("moss_lump"));
		
		// EF Items
		
		coolantBottle = new Item().setCreativeTab(tabMisc).setTextureName(MAssetManager.getTexture("coolant_bottle"));
		
		// EMD Items
		
		snout = new MItemFood(FoodType.MISC, 3, 0.4F).setPotionEffect(Potion.hunger.id, 10, 1, 0.25F).setCreativeTab(tabFood).setTextureName(MAssetManager.getMobTexture("snout"));
		pigHoof = new MItem().setCreativeTab(tabBrewing).setTextureName(MAssetManager.getMobTexture("pig_foot"));
		fat = new ItemFood(8, 0.1F, false).setPotionEffect(Potion.hunger.id, 25, 1, 1.0F).setCreativeTab(tabFood).setTextureName(MAssetManager.getFoodTexture("fat"));
		grease = new ItemGrease().setCreativeTab(tabFood).setTextureName(MAssetManager.getFoodTexture("grease"));
		
		animalBones = new MItem().setCreativeTab(tabMisc).setTextureName(MAssetManager.getMobTexture("animal_bones"));
		cowHoof = new MItem().setCreativeTab(tabBrewing).setTextureName(MAssetManager.getMobTexture("cow_foot"));
		horn = new ItemHorn().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMobTexture("horn"));
		beakChicken = new MItem().setCreativeTab(tabBrewing).setTextureName(MAssetManager.getFoodTexture("chicken_beak"));
		footChicken = new MItem().setCreativeTab(tabBrewing).setTextureName(MAssetManager.getMobTexture("chicken_foot"));
		chickenWingRaw = new MItemFood(FoodType.RAW_MEAT, 1, 0.3F).setPotionEffect(Potion.hunger.id, 15, 1, 0.3F).setCreativeTab(tabFood).setTextureName(MAssetManager.getFoodTexture("chicken_wing_raw"));
		chickenWingCooked = new MItemFood(FoodType.COOKED_FISH, 3, 0.75F).setCreativeTab(tabFood).setTextureName(MAssetManager.getFoodTexture("chicken_wing_cooked"));
		lambchopRaw = new ItemLambchop(FoodType.RAW_MEAT, 2, 0.3F).setCreativeTab(tabFood).setTextureName(MAssetManager.getFoodTexture("lamb_chop_raw"));
		lambchopCooked = new ItemLambchop(FoodType.COOKED_MEAT, 6, 0.8F).setCreativeTab(tabFood).setTextureName(MAssetManager.getFoodTexture("lamb_chop_cooked"));
		sheepHoof = new MItem().setCreativeTab(tabBrewing).setTextureName(MAssetManager.getMobTexture("sheep_hoof"));
		squidTentacle = new MItemFood(FoodType.RAW_FISH, 2, 0.15F).setPotionEffect(Potion.hunger.id, 10, 1, 1F).setCreativeTab(tabFood).setTextureName(MAssetManager.getMobTexture("squid_tentacle"));
		calimari = new ItemCalimari(4, 0.85F).setHealBonus(2F).setCreativeTab(tabFood).setTextureName(MAssetManager.getFoodTexture("calimari"));
		infectiousFungus = new ItemInfectiousFungus(0, 0F).setCreativeTab(tabMisc).setTextureName(MAssetManager.getMobTexture("infectious_fungus"));
		airSack = new ItemAirSack().setCreativeTab(tabBrewing).setTextureName(MAssetManager.getMobTexture("air_sack"));
		whisker = new MItem().setCreativeTab(tabMisc).setTextureName(MAssetManager.getMobTexture("whisker"));
		catEye = new ItemCatEye(0, 0.0F).setCreativeTab(tabBrewing).setTextureName(MAssetManager.getMobTexture("cat_eye"));
		wolfHide = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMobTexture("wolf_hide"));
		flesh = new MItemFood(FoodType.RAW_MEAT, 4, 0.35F).setPotionEffect(Potion.hunger.id, 20, 0, 0.05F).setCreativeTab(tabFood).setTextureName(MAssetManager.getFoodTexture("flesh"));
		marrow = new MItemFood(FoodType.MISC, 5, 0.32F).setCreativeTab(tabBrewing).setTextureName(MAssetManager.getFoodTexture("marrow_bowl"));
		legSpider = new MItem().setCreativeTab(tabBrewing).setTextureName(MAssetManager.getMobTexture("spider_leg"));
		poisonSack = new ItemPoisonSack().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMobTexture("poison_sack"));
		guano = new ItemGuano().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getTexture("guano"));
		carcassSilverfish = new MItem().setCreativeTab(tabBrewing).setTextureName(MAssetManager.getMobTexture("silverfish_carcass"));
		hideCreeper = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMobTexture("creeper_hide"));
		slimeCore = new MItem().setCreativeTab(tabBrewing).setTextureName(MAssetManager.getMobTexture("slime_core"));
		enderCore = new ItemEnderCore(0, 0).setCreativeTab(tabBrewing).setTextureName(MAssetManager.getMobTexture("ender_core"));
		ghastTentacle = new ItemGhastTentacle().setCreativeTab(tabFood).setTextureName(MAssetManager.getMobTexture("ghast_tentacle"));
		horseHoof = new MItem().setCreativeTab(tabBrewing).setTextureName(MAssetManager.getMobTexture("horse_foot"));
		horseHaunchRaw = new MItemFood(FoodType.RAW_MEAT, 4, 0.3F).setPotionEffect(Potion.hunger.id, 12, 1, 0.4F).setCreativeTab(tabFood).setTextureName(MAssetManager.getFoodTexture("horse_haunch_raw"));
		horseHaunchCooked = new MItemFood(FoodType.COOKED_MEAT, 10, 0.75F).setPotionEffect(Potion.digSpeed.id, 30, 1, 0.3F).setCreativeTab(tabFood).setTextureName(MAssetManager.getFoodTexture("horse_haunch_cooked"));
		horseHair = new MItem().setCreativeTab(tabMisc).setTextureName(MAssetManager.getMobTexture("horse_hair"));
		genes = new ItemGene().setCreativeTab(tabMisc);
		charms = new ItemCharm().setCreativeTab(tabMisc);
		amuletPorcum = new ItemAmuletPorcum().setCreativeTab(tabMisc).setTextureName(MAssetManager.getMobTexture("pig_amulet"));
		amuletVaccam = new ItemAmuletVaccam().setCreativeTab(tabMisc).setTextureName(MAssetManager.getMobTexture("horse_amulet"));
		amuletPullum = new ItemAmulet(30).setCreativeTab(tabMisc).setTextureName(MAssetManager.getMobTexture("chicken_amulet"));
		amuletOves = new ItemAmulet(30).setCreativeTab(tabMisc).setTextureName(MAssetManager.getMobTexture("sheep_amulet"));
		wingSinew = new MItem().setCreativeTab(tabMisc).setTextureName(MAssetManager.getMobTexture("wing_sinew"));
		wingSegment = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getTexture("hangglider_segment"));
		hangGlider = new ItemHangGlider().setCreativeTab(null).setTextureName(MAssetManager.getTexture("hangGlider"));
		enderAura = new MItem().setCreativeTab(tabBrewing).setTextureName(MAssetManager.getMobTexture("ender_aura"));
		ghastlySoul = new MItem().setCreativeTab(tabMisc).setTextureName(MAssetManager.getDrinkTexture("ghast_soul_bottle"));
		witheredBone = new MItem().setCreativeTab(tabMisc).setTextureName(MAssetManager.getMobTexture("wither_bone"));
		horseHairFibre = new MItem().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMobTexture("horse_hair_fibre"));
		horseHairBow = new ItemHorseHairBow().setCreativeTab(tabCombat);
		
		deathMeal = new ItemDeathmeal().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMineralTexture("deathmeal"));
		witherAsh = new ItemWitherAsh().setCreativeTab(tabMaterials).setTextureName(MAssetManager.getMobTexture("wither_ash"));
		
		// Magic Items
		
		manaLeaf = new MItem().setCreativeTab(tabMisc).setTextureName(MAssetManager.getTexture("mana_leaf"));
	}
	
	public static void load()
	{
		// Bricks Items
		
		CSItems.addItem(brickStone, "stone_brick");
		CSItems.addItem(brickStoneTin, "stone_brick_tin");
		CSItems.addItem(brickStoneBronze, "stone_brick_bronze");
		CSItems.addItem(brickStoneSteel, "stone_brick_steel");
		CSItems.addItem(brickStoneMeurodite, "stone_brick_meurodite");
		
		CSItems.addItem(brickDeepstone, "deepstone_brick");
		CSItems.addItem(brickRedrock, "redrock_brick");
		CSItems.addItem(brickDeepRedrock, "deepredrock_brick");
		CSItems.addItem(brickColdstone, "coldstone_brick");
		CSItems.addItem(brickDeepColdstone, "deepcoldstone_brick");
		CSItems.addItem(brickIcestone, "icestone_brick");
		CSItems.addItem(brickGlacierrock, "glacierrock_brick");
		CSItems.addItem(brickOceanstone, "oceanstone_brick");
		CSItems.addItem(brickPressurizedOceanstone, "pressurizedoceanstone_brick");
		
		CSItems.addItem(brickSlate, "granite_brick");
		CSItems.addItem(brickSlateTin, "granite_brick_tin");
		CSItems.addItem(brickSlateBronze, "granite_brick_bronze");
		CSItems.addItem(brickSlateSteel, "granite_brick_steel");
		CSItems.addItem(brickSlateMeurodite, "granite_brick_meurodite");
		
		CSItems.addItem(brickSandstone, "sandstone_brick");
		CSItems.addItem(brickRedSandstone, "red_sandstone_brick");
		CSItems.addItem(brickColoredClay, "clay_brick");
		CSItems.addItem(brickFlint, "flint_brick");
		CSItems.addItem(brickLapis, "lapis_brick");
		CSItems.addItem(brickDesertQuartz, "desertquartz_brick");
		CSItems.addItem(brickNetherQuartz, "netherquartz_brick");
		CSItems.addItem(brickObsidian, "obsidian_brick");
		CSItems.addItem(brickEndStone, "endstone_brick");
		CSItems.addItem(brickBedrock, "bedrock_brick");
		CSItems.addItem(brickRadiantQuartz, "radiantquartz_brick");
		
		// EO Items
		
		CSItems.addItem(copperIngot, "copper_ingot");
		CSItems.addItem(tinIngot, "tin_ingot");
		CSItems.addItem(bronzeIngot, "bronze_ingot");
		CSItems.addItem(coalIronIngot, "coaliron_ingot");
		CSItems.addItem(steelIngot, "steel_ingot");
		CSItems.addItem(titaniumIngot, "titanium_ingot");
		CSItems.addItem(toriteIngot, "torite_ingot");
		CSItems.addItem(blaziumIngot, "blazium_ingot");
		
		CSItems.addItem(soulGem, "soul_gem");
		CSItems.addItem(meuroditeGem, "meurodite_gem");
		CSItems.addItem(uranium, "uranium");
		CSItems.addItem(plutonium, "plutonium");
		CSItems.addItem(radiantQuartz, "radiant_quartz");
		CSItems.addItem(desertQuartz, "desert_quartz");
		CSItems.addItem(blazeShard, "blaze_shard");
		CSItems.addItem(sunstoneDust, "sunstone_dust");
		CSItems.addItem(blackDiamond, "black_diamond");
		
		CSItems.addItem(reinforcedStick, "reinforced_stick");
		
		CSItems.addItem(magmaBucket, "magma_bucket");
		
		CSItems.addItem(steelKey, "steel_key");
		CSItems.addItem(steelLock, "steel_lock");
		CSItems.addItem(lockCutter, "lock_cutter");
		
		CSItems.addItem(soulBottle, "soul_bottle");
		CSItems.addItem(grenade, "grenade");
		CSItems.addItem(grenadeImpact, "impact_grenade");
		CSItems.addItem(grenadeSticky, "sticky_grenade");
		CSItems.addItem(grenadeNuke, "nuke_grenade");
		
		CSItems.addItem(plateTinItem, "tin_plate");
		CSItems.addItem(plateBronzeItem, "bronze_plate");
		CSItems.addItem(plateSteelItem, "steel_plate");
		CSItems.addItem(plateMeuroditeItem, "meurodite_plate");
		
		CSItems.addItem(stoneChunk, "stone_chunk");
		
		// ED Items
		
		CSItems.addItem(ropeItem, "rope");
		CSItems.addItem(cardboardItem, "cardboard");
		CSItems.addItem(glassDoorItem, "glass_door");
		
		// EE Items
		
		CSItems.addItem(mossLump, "moss_lump");
		
		// EF Items
		
		CSItems.addItem(coolantBottle, "coolant_bottle");
		
		// EMD Items
		
		CSItems.addItem(snout, "snout");
		CSItems.addItem(pigHoof, "pig_hoof");
		CSItems.addItem(fat, "fat");
		CSItems.addItem(grease, "grease");
		
		CSItems.addItem(animalBones, "animal_bones");
		CSItems.addItem(cowHoof, "cow_hoof");
		CSItems.addItem(horn, "horn");
		CSItems.addItem(beakChicken, "beak_chicken");
		CSItems.addItem(footChicken, "foot_chicken");
		CSItems.addItem(chickenWingRaw, "chicken_wing_raw");
		CSItems.addItem(chickenWingCooked, "chicken_wing_cooked");
		CSItems.addItem(lambchopRaw, "lamb_chop_raw");
		CSItems.addItem(lambchopCooked, "lamb_chop_cooked");
		CSItems.addItem(sheepHoof, "sheep_hoof");
		CSItems.addItem(squidTentacle, "squid_tentacle");
		CSItems.addItem(calimari, "calimari");
		CSItems.addItem(infectiousFungus, "infectious_fungus");
		CSItems.addItem(airSack, "air_sack");
		CSItems.addItem(whisker, "whisker");
		CSItems.addItem(catEye, "cat_eye");
		CSItems.addItem(wolfHide, "wolf_hide");
		CSItems.addItem(flesh, "flesh");
		CSItems.addItem(marrow, "marrow");
		CSItems.addItem(legSpider, "spider_leg");
		CSItems.addItem(poisonSack, "poison_sack");
		CSItems.addItem(guano, "guano");
		CSItems.addItem(carcassSilverfish, "silverfish_carcass");
		CSItems.addItem(hideCreeper, "creeper_hide");
		CSItems.addItem(slimeCore, "slime_core");
		CSItems.addItem(enderCore, "ender_core");
		CSItems.addItem(ghastTentacle, "ghast_tentacle");
		CSItems.addItem(horseHoof, "horse_hoof");
		CSItems.addItem(horseHaunchRaw, "horse_haunch_raw");
		CSItems.addItem(horseHaunchCooked, "horse_haunch_cooked");
		CSItems.addItem(horseHair, "horse_hair");
		CSItems.addItem(genes, "genes");
		CSItems.addItem(charms, "charms");
		CSItems.addItem(amuletPorcum, "porcum_amulet");
		CSItems.addItem(amuletVaccam, "vaccam_amulet");
		CSItems.addItem(amuletPullum, "pullum_amulet");
		CSItems.addItem(amuletOves, "oves_amulet");
		CSItems.addItem(wingSinew, "wing_sinew");
		CSItems.addItem(wingSegment, "wing_segment");
		CSItems.addItem(hangGlider, "hangglider");
		CSItems.addItem(enderAura, "ender_aura");
		CSItems.addItem(ghastlySoul, "ghastly_soul");
		CSItems.addItem(witheredBone, "withered_bone");
		CSItems.addItem(horseHairFibre, "horse_hair_fibre");
		CSItems.addItem(horseHairBow, "horse_hair_bow");
		
		CSItems.addItem(deathMeal, "deathmeal");
		CSItems.addItem(witherAsh, "wither_ash");
		
		CSItems.replaceItem(Items.apple, new MItemFood(FoodType.FRUIT, 4, 0.3F).setUnlocalizedName("apple").setTextureName("apple"));
		CSItems.replaceItem(Items.bread, new MItemFood(FoodType.BAKED, 5, 0.6F).setUnlocalizedName("bread").setTextureName("bread"));
		CSItems.replaceItem(Items.porkchop, new MItemFood(FoodType.RAW_MEAT, 3, 0.3F).setUnlocalizedName("porkchopRaw").setTextureName("porkchop_raw"));
		CSItems.replaceItem(Items.cooked_porkchop, new MItemFood(FoodType.COOKED_MEAT, 8, 0.8F).setUnlocalizedName("porkchopCooked").setTextureName("porkchop_cooked"));
		CSItems.replaceItem(Items.fish, new ItemFishFood2(FoodType.RAW_FISH, false).setUnlocalizedName("fish").setTextureName("fish_raw").setHasSubtypes(true));
		CSItems.replaceItem(Items.cooked_fished, new ItemFishFood2(FoodType.COOKED_FISH, true).setUnlocalizedName("fish").setTextureName("fish_cooked").setHasSubtypes(true));
		CSItems.replaceItem(Items.cookie, new MItemFood(FoodType.BAKED, 2, 0.1F).setUnlocalizedName("cookie").setTextureName("cookie"));
		CSItems.replaceItem(Items.melon, new MItemFood(FoodType.FRUIT, 2, 0.3F).setUnlocalizedName("melon").setTextureName("melon"));
		CSItems.replaceItem(Items.beef, new MItemFood(FoodType.RAW_MEAT, 3, 0.3F).setUnlocalizedName("beefRaw").setTextureName("beef_raw"));
		CSItems.replaceItem(Items.cooked_beef, new MItemFood(FoodType.COOKED_MEAT, 8, 0.8F).setUnlocalizedName("beefCooked").setTextureName("beef_cooked"));
		CSItems.replaceItem(Items.chicken, new MItemFood(FoodType.RAW_MEAT, 2, 0.3F).setPotionEffect(Potion.hunger.id, 30, 0, 0.3F).setUnlocalizedName("chickenRaw").setTextureName("chicken_raw"));
		CSItems.replaceItem(Items.cooked_chicken, new MItemFood(FoodType.COOKED_MEAT, 6, 0.6F).setUnlocalizedName("chickenCooked").setTextureName("chicken_cooked"));
		CSItems.replaceItem(Items.rotten_flesh, new MItemFood(FoodType.MISC, 4, 0.1F).setPotionEffect(Potion.hunger.id, 30, 0, 0.8F).setUnlocalizedName("rottenFlesh").setTextureName("rotten_flesh"));
		CSItems.replaceItem(Items.spider_eye, new MItemFood(FoodType.MISC, 2, 0.8F).setPotionEffect(Potion.poison.id, 5, 0, 1.0F).setUnlocalizedName("spiderEye").setPotionEffect(PotionHelper.spiderEyeEffect).setTextureName("spider_eye"));
		CSItems.replaceItem(Items.carrot, new MItemSeedFood(FoodType.VEGETABLE, 4, 0.6F, Blocks.carrots, Blocks.farmland).setUnlocalizedName("carrots").setTextureName("carrot"));
		CSItems.replaceItem(Items.potato, new MItemSeedFood(FoodType.VEGETABLE, 1, 0.3F, Blocks.potatoes, Blocks.farmland).setUnlocalizedName("potato").setTextureName("potato"));
		CSItems.replaceItem(Items.baked_potato, new MItemFood(FoodType.COOKED_VEGETABLE, 6, 0.6F).setUnlocalizedName("potatoBaked").setTextureName("potato_baked"));
		CSItems.replaceItem(Items.poisonous_potato, new MItemFood(FoodType.MISC, 2, 0.3F).setPotionEffect(Potion.poison.id, 5, 0, 0.6F).setUnlocalizedName("potatoPoisonous").setTextureName("potato_poisonous"));
		CSItems.replaceItem(Items.pumpkin_pie, new MItemFood(FoodType.BAKED, 8, 0.3F).setUnlocalizedName("pumpkinPie").setCreativeTab(CreativeTabs.tabFood).setTextureName("pumpkin_pie"));
		CSItems.replaceItem(Items.mushroom_stew, new MItemFood(FoodType.BAKED, 6, 0.2F).setUnlocalizedName("mushroomStew").setTextureName("mushroom_stew"));
		
		addItemsToChests();
		setHarvestLevels();
	}
	
	public static void setHarvestLevels()
	{
		Blocks.diamond_ore.setHarvestLevel("pickaxe", 3);
		Blocks.diamond_block.setHarvestLevel("pickaxe", 3);
		Blocks.obsidian.setHarvestLevel("pickaxe", 4);
		
		Items.diamond_shovel.setHarvestLevel("shovel", 4);
		Items.diamond_pickaxe.setHarvestLevel("pickaxe", 4);
		Items.diamond_axe.setHarvestLevel("axe", 4);
		
		if (MConfig.isBedrockBreakable)
		{
			Blocks.bedrock.setHardness(80F).setHarvestLevel("pickaxe", 5);
		}
		
		MBlocks.copperOre.setHarvestLevel("pickaxe", 0);
		MBlocks.copperBlock.setHarvestLevel("pickaxe", 0);
		MBlocks.tinOre.setHarvestLevel("pickaxe", 1);
		MBlocks.tinBlock.setHarvestLevel("pickaxe", 1);
		MBlocks.meuroditeOre.setHarvestLevel("pickaxe", 2);
		MBlocks.meuroditeBlock.setHarvestLevel("pickaxe", 2);
		MBlocks.toriteOre.setHarvestLevel("pickaxe", 2);
		MBlocks.toriteBlock.setHarvestLevel("pickaxe", 2);
		MBlocks.titaniumOre.setHarvestLevel("pickaxe", 4);
		MBlocks.titaniumBlock.setHarvestLevel("pickaxe", 4);
		MBlocks.uraniumOre.setHarvestLevel("pickaxe", 2);
		MBlocks.plutoniumOre.setHarvestLevel("pickaxe", 2);
		MBlocks.sunstoneOre.setHarvestLevel("pickaxe", 2);
		MBlocks.blaziumOre.setHarvestLevel("pickaxe", 2);
		MBlocks.radiantQuartzOre.setHarvestLevel("pickaxe", 4);
		MBlocks.blaziumBlock.setHarvestLevel("pickaxe", 2);
		MBlocks.soulOre.setHarvestLevel("shovel", 4);
		MBlocks.bronzeBlock.setHarvestLevel("pickaxe", 1);
		MBlocks.uraniumBlock.setHarvestLevel("pickaxe", 0);
		MBlocks.plutoniumBlock.setHarvestLevel("pickaxe", 0);
		MBlocks.godstone.setHarvestLevel("pickaxe", 2);
		MBlocks.soulBlock.setHarvestLevel("pickaxe", 4);
		
		MBlocks.snowBrick.setHarvestLevel("shovel", 0);
		MBlocks.gunpowderBlock.setHarvestLevel("shovel", 0);
		MBlocks.sugarBlock.setHarvestLevel("shovel", 0);
		MBlocks.ropeCoil.setHarvestLevel("shears", 0);
		MBlocks.rope.setHarvestLevel("shears", 0);
		MBlocks.slimeOoze.setHarvestLevel("shovel", 0);
		MBlocks.magmaOoze.setHarvestLevel("shovel", 0);
		
		MBlocks.obsidianGodstoneLamp.setHarvestLevel("pickaxe", 3);
		MBlocks.obsidianStairsBricks.setHarvestLevel("pickaxe", 3);
		MBlocks.obsidianStairsRaw.setHarvestLevel("pickaxe", 3);
		MBlocks.obsidianStairsTiles.setHarvestLevel("pickaxe", 3);
		
		MBlocks.glassDoor.setHarvestLevel("pickaxe", 0);
	}
	
	public static void addItemsToChests()
	{
		ChestGenHooks bonusChest = ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST);
		ChestGenHooks dungeonChest = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);
		ChestGenHooks mineshaftCorridor = ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR);
		ChestGenHooks strongholdCorridor = ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR);
		ChestGenHooks strongholdCrossing = ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING);
		ChestGenHooks jungleChest = ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST);
		ChestGenHooks desertChest = ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST);
		ChestGenHooks blacksmithChest = ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH);
		ChestGenHooks strongholdLibrary = ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY);
		
		bonusChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.sandstonePickaxe), 0, 1, 4));
		bonusChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.sandstoneShovel), 1, 1, 4));
		bonusChest.addItem(new WeightedRandomChestContent(new ItemStack(MBlocks.stoneCutter), 0, 1, 1));
		bonusChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.granitePickaxe), 0, 1, 2));
		dungeonChest.addItem(new WeightedRandomChestContent(new ItemStack(copperIngot), 1, 4, 20));
		dungeonChest.addItem(new WeightedRandomChestContent(new ItemStack(tinIngot), 1, 4, 20));
		dungeonChest.addItem(new WeightedRandomChestContent(new ItemStack(sunstoneDust), 1, 4, 25));
		dungeonChest.addItem(new WeightedRandomChestContent(new ItemStack(steelIngot), 1, 3, 10));
		dungeonChest.addItem(new WeightedRandomChestContent(new ItemStack(bronzeIngot), 1, 3, 10));
		dungeonChest.addItem(new WeightedRandomChestContent(new ItemStack(meuroditeGem), 1, 1, 5));
		dungeonChest.addItem(new WeightedRandomChestContent(new ItemStack(radiantQuartz), 1, 2, 4));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(copperIngot), 1, 5, 30));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(tinIngot), 1, 5, 30));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(sunstoneDust), 4, 8, 30));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(steelIngot), 1, 3, 15));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(bronzeIngot), 1, 3, 15));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(meuroditeGem), 1, 3, 8));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(MTools.steelPickaxe), 1, 1, 2));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(MTools.bronzePickaxe), 1, 1, 2));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(MBlocks.sunstoneBlock), 1, 1, 3));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(uranium), 0, 2, 2));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(plutonium), 0, 2, 2));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(radiantQuartz), 0, 5, 1));
		mineshaftCorridor.addItem(new WeightedRandomChestContent(new ItemStack(grenadeImpact), 0, 1, 1));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(copperIngot), 1, 5, 30));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(tinIngot), 1, 5, 30));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(sunstoneDust), 3, 9, 30));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(bronzeIngot), 1, 3, 15));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(steelIngot), 1, 3, 15));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(meuroditeGem), 1, 3, 13));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(toriteIngot), 1, 3, 8));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(soulBottle), 1, 2, 8));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(MTools.bronzePickaxe), 1, 1, 2));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(MTools.steelSword), 1, 1, 2));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(MTools.bronzeHelmet), 1, 1, 2));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(MTools.steelChestplate), 1, 1, 2));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(MTools.bronzeLeggings), 1, 1, 2));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(MTools.steelBoots), 1, 1, 2));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(titaniumIngot), 0, 1, 1));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(MBlocks.godstone), 0, 1, 1));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(soulGem), 1, 2, 1));
		strongholdCorridor.addItem(new WeightedRandomChestContent(new ItemStack(radiantQuartz), 1, 2, 2));
		strongholdCrossing.addItem(new WeightedRandomChestContent(new ItemStack(copperIngot), 1, 5, 15));
		strongholdCrossing.addItem(new WeightedRandomChestContent(new ItemStack(tinIngot), 1, 5, 15));
		strongholdCrossing.addItem(new WeightedRandomChestContent(new ItemStack(sunstoneDust), 1, 6, 20));
		strongholdCrossing.addItem(new WeightedRandomChestContent(new ItemStack(bronzeIngot), 1, 3, 8));
		strongholdCrossing.addItem(new WeightedRandomChestContent(new ItemStack(steelIngot), 1, 3, 8));
		strongholdCrossing.addItem(new WeightedRandomChestContent(new ItemStack(meuroditeGem), 1, 1, 8));
		strongholdCrossing.addItem(new WeightedRandomChestContent(new ItemStack(MTools.granitePickaxe), 1, 1, 8));
		strongholdCrossing.addItem(new WeightedRandomChestContent(new ItemStack(MTools.bronzePickaxe), 0, 1, 2));
		strongholdCrossing.addItem(new WeightedRandomChestContent(new ItemStack(MTools.steelPickaxe), 0, 1, 2));
		strongholdCrossing.addItem(new WeightedRandomChestContent(new ItemStack(MTools.meuroditePickaxe), 0, 1, 2));
		strongholdLibrary.addItem(new WeightedRandomChestContent(new ItemStack(desertQuartz), 1, 3, 15));
		strongholdLibrary.addItem(new WeightedRandomChestContent(new ItemStack(radiantQuartz), 1, 3, 8));
		strongholdLibrary.addItem(new WeightedRandomChestContent(new ItemStack(soulGem), 1, 2, 3));
		strongholdLibrary.addItem(new WeightedRandomChestContent(new ItemStack(soulBottle), 1, 4, 2));
		strongholdLibrary.addItem(new WeightedRandomChestContent(new ItemStack(MBlocks.radiantQuartz), 1, 1, 2));
		jungleChest.addItem(new WeightedRandomChestContent(new ItemStack(copperIngot), 1, 4, 30));
		jungleChest.addItem(new WeightedRandomChestContent(new ItemStack(tinIngot), 1, 4, 30));
		jungleChest.addItem(new WeightedRandomChestContent(new ItemStack(bronzeIngot), 1, 4, 25));
		jungleChest.addItem(new WeightedRandomChestContent(new ItemStack(toriteIngot), 1, 5, 15));
		jungleChest.addItem(new WeightedRandomChestContent(new ItemStack(meuroditeGem), 1, 3, 13));
		jungleChest.addItem(new WeightedRandomChestContent(new ItemStack(radiantQuartz), 1, 2, 6));
		jungleChest.addItem(new WeightedRandomChestContent(new ItemStack(steelIngot), 1, 3, 8));
		jungleChest.addItem(new WeightedRandomChestContent(new ItemStack(soulBottle), 1, 4, 2));
		jungleChest.addItem(new WeightedRandomChestContent(new ItemStack(soulGem), 0, 3, 1));
		desertChest.addItem(new WeightedRandomChestContent(new ItemStack(copperIngot), 1, 4, 30));
		desertChest.addItem(new WeightedRandomChestContent(new ItemStack(tinIngot), 1, 4, 30));
		desertChest.addItem(new WeightedRandomChestContent(new ItemStack(bronzeIngot), 1, 4, 25));
		desertChest.addItem(new WeightedRandomChestContent(new ItemStack(desertQuartz), 3, 11, 30));
		desertChest.addItem(new WeightedRandomChestContent(new ItemStack(brickDesertQuartz), 1, 4, 15));
		desertChest.addItem(new WeightedRandomChestContent(new ItemStack(brickSandstone), 1, 12, 15));
		desertChest.addItem(new WeightedRandomChestContent(new ItemStack(meuroditeGem), 1, 3, 13));
		desertChest.addItem(new WeightedRandomChestContent(new ItemStack(radiantQuartz), 1, 4, 6));
		desertChest.addItem(new WeightedRandomChestContent(new ItemStack(steelIngot), 1, 3, 8));
		desertChest.addItem(new WeightedRandomChestContent(new ItemStack(soulBottle), 1, 5, 2));
		desertChest.addItem(new WeightedRandomChestContent(new ItemStack(soulGem), 0, 3, 1));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(copperIngot), 1, 5, 30));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(tinIngot), 1, 5, 30));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(bronzeIngot), 1, 3, 25));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(steelIngot), 1, 3, 25));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(plateTinItem), 1, 6, 15));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(plateBronzeItem), 1, 2, 13));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(plateSteelItem), 1, 2, 13));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(meuroditeGem), 1, 2, 13));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(sunstoneDust), 1, 8, 15));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(desertQuartz), 1, 5, 15));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(radiantQuartz), 1, 3, 8));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(plateMeuroditeItem), 1, 2, 10));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.steelSword), 1, 1, 2));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.steelPickaxe), 1, 1, 2));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.steelHelmet), 1, 1, 2));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.steelChestplate), 1, 1, 2));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.steelLeggings), 1, 1, 2));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.steelBoots), 1, 1, 2));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.bronzeSword), 1, 1, 2));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.bronzePickaxe), 1, 1, 2));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.bronzeHelmet), 1, 1, 2));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.bronzeChestplate), 1, 1, 2));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.bronzeLeggings), 1, 1, 2));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MTools.bronzeBoots), 1, 1, 2));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(MBlocks.radiantQuartz), 1, 1, 1));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(titaniumIngot), 0, 1, 1));
		blacksmithChest.addItem(new WeightedRandomChestContent(new ItemStack(soulGem), 0, 3, 1));
	}
}
