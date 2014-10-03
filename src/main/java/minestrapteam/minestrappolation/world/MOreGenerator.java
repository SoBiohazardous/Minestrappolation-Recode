package minestrapteam.minestrappolation.world;

import java.util.Random;

import clashsoft.cslib.config.CSConfig;
import clashsoft.cslib.minecraft.block.ore.BlockOre2;
import clashsoft.cslib.minecraft.world.gen.OreGen;
import cpw.mods.fml.common.IWorldGenerator;
import minestrapteam.minestrappolation.lib.MBlocks;
import minestrapteam.minestrappolation.world.gen.WorldGenDesertQuartz;
import minestrapteam.minestrappolation.world.gen.WorldGenRedSandstone;
import minestrapteam.minestrappolation.world.gen.WorldGenRedWoodTreeSmall;
import minestrapteam.minestrappolation.world.gen.WorldGenStructureStone;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.*;
import net.minecraft.world.biome.BiomeGenBase.TempCategory;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderGenerate;
import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraftforge.event.terraingen.ChunkProviderEvent.ReplaceBiomeBlocks;

/**
 * @author SoBiohazardous
 * @author Clashsoft
 */
public class MOreGenerator implements IWorldGenerator
{
	public static boolean					generateBiomeStone;
	public static boolean					generateInvincium;
	
	public static OreGen					copperGen;
	public static OreGen					tinGen;
	public static OreGen					radiantQuartzGen;
	public static OreGen					meuroditeGen;
	public static OreGen					uraniumGen;
	public static OreGen					plutoniumGen;
	public static OreGen					titaniumGen;
	public static OreGen					toriteGen;
	public static OreGen					sunstoneGen;
	public static OreGen					blaziumGen;
	public static OreGen					soulOreGen;
	
	public static OreGen					slateGen;
	public static OreGen					sandstoneGen;
	public static OreGen					sandstoneGen2;
	public static OreGen					mossyPlankGen;
	
	public static WorldGenRedSandstone		redSandstoneGen		= new WorldGenRedSandstone();
	public static WorldGenStructureStone	stoneStructureGen	= new WorldGenStructureStone();
	public static WorldGenDesertQuartz		desertQuartzGen		= new WorldGenDesertQuartz();
	
	public static WorldGenRedWoodTreeSmall	redwoodTreeGen		= new WorldGenRedWoodTreeSmall();
	
	public static void loadConfig()
	{
		generateBiomeStone = CSConfig.getBool("gen", "Replace Biome Stone", true);
		generateInvincium = CSConfig.getBool("gen", "Generate Invincium", true);
		
		copperGen = CSConfig.getOreGen("copper", new OreGen(10, 14, 80));
		tinGen = CSConfig.getOreGen("tin", new OreGen(11, 14, 80));
		radiantQuartzGen = CSConfig.getOreGen("radiant_quartz", new OreGen(3, 9, 128));
		meuroditeGen = CSConfig.getOreGen("meurodite", new OreGen(5, 8, 40));
		uraniumGen = CSConfig.getOreGen("uranium", new OreGen(3, 6, 32));
		plutoniumGen = CSConfig.getOreGen("plutonium", new OreGen(3, 6, 32));
		titaniumGen = CSConfig.getOreGen("titanium", new OreGen(3, 4, 10));
		toriteGen = CSConfig.getOreGen("torite", new OreGen(3, 7, 30).inBiome(BiomeGenBase.jungle).inBiome(BiomeGenBase.forest));
		sunstoneGen = CSConfig.getOreGen("sunstone", new OreGen(3, 15, 256));
		blaziumGen = CSConfig.getOreGen("blazium", new OreGen(8, 8, 128));
		soulOreGen = CSConfig.getOreGen("soul_ore", new OreGen(15, 20, 128));
		
		slateGen = CSConfig.getOreGen("slate", new OreGen(50, 12, 256));
		sandstoneGen = CSConfig.getOreGen("sandstone", new OreGen(7, 40, 256));
		sandstoneGen2 = CSConfig.getOreGen("sandstone_2", new OreGen(7, 40, 256));
		mossyPlankGen = CSConfig.getOreGen("mossy_planks", new OreGen(15, 50, 128));
	}
	
	public static void loadBlocks()
	{
		copperGen.block = MBlocks.copperOre;
		tinGen.block = MBlocks.tinOre;
		radiantQuartzGen.block = MBlocks.radiantQuartzOre;
		meuroditeGen.block = MBlocks.meuroditeOre;
		uraniumGen.block = MBlocks.uraniumOre;
		plutoniumGen.block = MBlocks.plutoniumOre;
		titaniumGen.block = MBlocks.titaniumOre;
		toriteGen.block = MBlocks.toriteOre;
		sunstoneGen.block = MBlocks.sunstoneOre;
		blaziumGen.generate(MBlocks.blaziumOre).replace(Blocks.netherrack);
		soulOreGen.generate(MBlocks.soulOre).replace(Blocks.soul_sand);
		
		mossyPlankGen.generate(MBlocks.oak, 3).replace(Blocks.planks, 0);
		sandstoneGen.generate(MBlocks.sandstone, 6).replace(Blocks.sandstone);
		sandstoneGen2.generate(MBlocks.sandstone, 7).replace(Blocks.sandstone);
		
		slateGen.block = MBlocks.copperOre;
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		chunkX <<= 4;
		chunkZ <<= 4;
		if (chunkGenerator instanceof ChunkProviderGenerate)
		{
			if (generateBiomeStone)
			{
				this.genBiomeStone(world, chunkX, chunkZ, random);
			}
			this.generateSurface(world, random, chunkX, chunkZ);
		}
		else if (chunkGenerator instanceof ChunkProviderHell)
		{
			this.generateNether(world, random, chunkX, chunkZ);
		}
		else if (chunkGenerator instanceof ChunkProviderEnd)
		{
			this.generateEnd(world, random, chunkX, chunkZ);
		}
	}
	
	public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{
		int x1 = chunkX;
		int y1 = 0;
		int z1 = chunkZ;
		
		BiomeGenBase biome = world.getBiomeGenForCoords(chunkX, chunkZ);
		
		copperGen.generate(world, rand, x1, y1, z1);
		tinGen.generate(world, rand, x1, y1, z1);
		radiantQuartzGen.generate(world, rand, x1, y1, z1);
		meuroditeGen.generate(world, rand, x1, y1, z1);
		uraniumGen.generate(world, rand, x1, y1, z1);
		plutoniumGen.generate(world, rand, x1, y1, z1);
		titaniumGen.generate(world, rand, x1, y1, z1);
		toriteGen.generate(world, rand, x1, y1, z1);
		sunstoneGen.generate(world, rand, x1, y1, z1);
		blaziumGen.generate(world, rand, x1, y1, z1);
		soulOreGen.generate(world, rand, x1, y1, z1);
		
		slateGen.generate(world, rand, x1, y1, z1);
		sandstoneGen.generate(world, rand, x1, y1, z1);
		sandstoneGen2.generate(world, rand, x1, y1, z1);
		mossyPlankGen.generate(world, rand, x1, y1, z1);
		
		// Sandstone
		if (biome instanceof BiomeGenDesert)
		{
			for (int i = 0; i < 40; i++)
			{
				x1 = chunkX + rand.nextInt(16);
				y1 = rand.nextInt(256);
				z1 = chunkZ + rand.nextInt(16);
				
				sandstoneGen.generate(world, rand, x1, y1, z1);
				sandstoneGen2.generate(world, rand, x1, y1, z1);
			}
		}
		
		// Red Sandstone
		if (biome instanceof BiomeGenMesa)
		{
			x1 = chunkX + rand.nextInt(16);
			y1 = rand.nextInt(256);
			z1 = chunkZ + rand.nextInt(16);
			redSandstoneGen.generate(world, rand, x1, y1, z1);
		}
		
		// Redwood Trees
		if (biome instanceof BiomeGenHills || biome instanceof BiomeGenTaiga)
		{
			x1 = chunkX + rand.nextInt(16);
			y1 = 64 + rand.nextInt(64);
			z1 = chunkZ + rand.nextInt(16);
			
			redwoodTreeGen.generate(world, rand, x1, y1, z1);
		}
		
		// Desert Quartz
		if (biome instanceof BiomeGenDesert)
		{
			for (int i = 0; i < 12; i++)
			{
				x1 = chunkX + rand.nextInt(16);
				y1 = rand.nextInt(100);
				z1 = chunkZ + rand.nextInt(16);
				
				desertQuartzGen.generate(world, rand, x1, y1, z1);
			}
		}
		
		// Structure Gen
		stoneStructureGen.generate(world, rand, x1, y1, z1);
		
		if (generateInvincium)
		{
			for (x1 = 0; x1 < 16; x1++)
			{
				for (z1 = 0; z1 < 16; z1++)
				{
					world.setBlock(chunkX + x1, 0, chunkZ + z1, MBlocks.invincium, 0, 0);
				}
			}
		}
	}
	
	public void generateNether(World world, Random rand, int chunkX, int chunkZ)
	{
		int x1 = chunkX;
		int y1 = 0;
		int z1 = chunkZ;
		
		blaziumGen.generate(world, rand, x1, y1, z1);
		soulOreGen.generate(world, rand, x1, y1, z1);
		
		// Invincium
		for (int i = 0; i < 16; i++)
		{
			for (int j = 0; j < 16; j++)
			{
				world.setBlock(chunkX + i, 0, chunkZ + j, MBlocks.invincium, 0, 0);
			}
		}
	}
	
	public void generateEnd(World world, Random random, int chunkX, int chunkZ)
	{
		for (int x = 0; x < 16; x++)
		{
			int x1 = chunkX + x;
			for (int z = 0; z < 16; z++)
			{
				int z1 = chunkZ + z;
				yLoop:
				for (int y = 0; y < 128; y++)
				{
					if (world.getBlock(x1, y, z1) == Blocks.obsidian && world.getBlock(x1, y + 1, z1) == Blocks.air)
					{
						world.setBlock(x1, y, z1, MBlocks.endstone, 4, 3);
						break yLoop;
					}
				}
			}
		}
	}
	
	public void genBiomeStone(World world, int chunkX, int chunkZ, Random random)
	{
		Chunk chunk = world.getChunkFromBlockCoords(chunkX, chunkZ);
		WorldChunkManager chunkManager = world.getWorldChunkManager();
		
		for (int x = 0; x < 16; x++)
		{
			for (int z = 0; z < 16; z++)
			{
				BiomeGenBase biome = chunk.getBiomeGenForWorldCoords(x, z, chunkManager);
				Block stoneBlock = Blocks.stone;
				Block deepStoneBlock = null;
				int oreMetadata = 0;
				int deepOreMetadata = 0;
				int deepStoneDepth = 0;
				
				if (biome.temperature < 0.2F)
				{
					stoneBlock = MBlocks.icestone;
					deepStoneBlock = MBlocks.glacierrock;
					deepStoneDepth = random.nextInt(5) + 30;
					oreMetadata = 10;
					deepOreMetadata = 11;
				}
				else if (biome.temperature < 0.4F)
				{
					stoneBlock = MBlocks.coldstone;
					deepStoneBlock = MBlocks.deepColdstone;
					deepStoneDepth = random.nextInt(5) + 35;
					oreMetadata = 8;
					deepOreMetadata = 9;
				}
				else if (biome.getTempCategory() == TempCategory.OCEAN)
				{
					stoneBlock = MBlocks.oceanstone;
					deepStoneBlock = MBlocks.pressurizedOceanstone;
					deepStoneDepth = random.nextInt(5) + 20;
					oreMetadata = 12;
					deepOreMetadata = 13;
				}
				else if (biome.temperature >= 1.0F)
				{
					stoneBlock = MBlocks.redrock;
					deepStoneBlock = MBlocks.deepRedrock;
					deepStoneDepth = random.nextInt(5) + 35;
					oreMetadata = 6;
					deepOreMetadata = 7;
				}
				else
				{
					deepStoneBlock = MBlocks.deepstone;
					deepStoneDepth = random.nextInt(5) + 35;
					deepOreMetadata = 5;
				}
				
				for (int y = 128; y >= 0; y--)
				{
					Block block = chunk.getBlock(x, y, z);
					if (block == Blocks.stone)
					{
						if (y < deepStoneDepth)
						{
							chunk.func_150807_a(x, y, z, deepStoneBlock, 0);
						}
						else
						{
							chunk.func_150807_a(x, y, z, stoneBlock, 0);
						}
					}
					else if (block instanceof BlockOre2)
					{
						if (y < deepStoneDepth)
						{
							chunk.func_150807_a(x, y, z, block, deepOreMetadata);
						}
						else
						{
							chunk.func_150807_a(x, y, z, block, oreMetadata);
						}
					}
				}
			}
		}
	}
	
	/**
	 * Old, faster way to replace the stone blocks. We will switch to this as
	 * soon as someone merges my PR for {@link ReplaceBiomeBlocks}.Post events,
	 */
	private static void genBiomeStone(BiomeGenBase biome, World world, Random random, Block[] blocks, byte[] metadata, int chunkX, int chunkZ)
	{
		Block stoneBlock = Blocks.stone;
		Block deepStoneBlock = null;
		int deepStoneDepth = 0;
		
		if (biome.temperature < 0.2F)
		{
			stoneBlock = MBlocks.icestone;
			deepStoneBlock = MBlocks.glacierrock;
			deepStoneDepth = random.nextInt(5) + 30;
		}
		else if (biome.temperature < 0.4F)
		{
			stoneBlock = MBlocks.coldstone;
			deepStoneBlock = MBlocks.deepColdstone;
			deepStoneDepth = random.nextInt(5) + 35;
		}
		else if (biome.getTempCategory() == TempCategory.OCEAN)
		{
			stoneBlock = MBlocks.oceanstone;
			deepStoneBlock = MBlocks.pressurizedOceanstone;
			deepStoneDepth = random.nextInt(5) + 20;
		}
		else if (biome.temperature >= 1.0F)
		{
			stoneBlock = MBlocks.redrock;
			deepStoneBlock = MBlocks.deepRedrock;
			deepStoneDepth = random.nextInt(5) + 35;
		}
		else
		{
			deepStoneBlock = MBlocks.deepstone;
			deepStoneDepth = random.nextInt(5) + 35;
		}
		
		int x = chunkX & 15;
		int z = chunkZ & 15;
		int count = blocks.length / 256;
		
		for (int y = 128; y >= 0; y--)
		{
			int index = (z * 16 + x) * count + y;
			if (blocks[index] == Blocks.stone)
			{
				if (y < deepStoneDepth)
				{
					blocks[index] = deepStoneBlock;
				}
				else
				{
					blocks[index] = stoneBlock;
				}
			}
		}
	}
}
