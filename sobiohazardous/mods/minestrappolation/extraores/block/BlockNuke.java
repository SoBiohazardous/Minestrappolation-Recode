package sobiohazardous.mods.minestrappolation.extraores.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import sobiohazardous.mods.minestrappolation.core.util.MAssetManager;
import sobiohazardous.mods.minestrappolation.extraores.entity.EntityNukePrimed;
import sobiohazardous.mods.minestrappolation.extraores.lib.EOBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.IIcon;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BlockNuke extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon	top;
	@SideOnly(Side.CLIENT)
	private IIcon	bottom;
	
	public BlockNuke()
	{
		super(Material.tnt);
		this.setCreativeTab(EOBlocks.tabOresBlocks);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(MAssetManager.getEOTexture("nukeSide"));
		this.top = iconRegister.registerIcon(MAssetManager.getEOTexture("nukeTop"));
		this.bottom = iconRegister.registerIcon(MAssetManager.getEOTexture("nukeBottom"));
	}
	
	@Override
	public IIcon getIcon(int i, int j)
	{
		if (i == 0)
		{
			return this.bottom;
		}
		if (i == 1)
		{
			return this.top;
		}
		
		if (i == 2)
		{
			return this.blockIcon;
		}
		if (i == 3)
		{
			return this.blockIcon;
		}
		if (i == 4)
		{
			return this.blockIcon;
		}
		if (i == 5)
		{
			return this.blockIcon;
		}
		
		if (j == 1)
		{
			return this.blockIcon;
		}
		return this.top;
	}
	
	/**
	 * Called whenever the block is added into the world. Args: world, x, y, z
	 */
	@Override
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
	{
		super.onBlockAdded(par1World, par2, par3, par4);
		
		if (par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
		{
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlockToAir(par2, par3, par4);
		}
	}
	
	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which
	 * neighbor changed (coordinates passed are their own) Args: x, y, z,
	 * neighbor blockID
	 */
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
	{
		if (par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
		{
			this.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			par1World.setBlockToAir(par2, par3, par4);
		}
	}
	
	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}
	
	/**
	 * Called upon the block being destroyed by an explosion
	 */
	@Override
	public void onBlockDestroyedByExplosion(World par1World, int par2, int par3, int par4, Explosion par5Explosion)
	{
		if (!par1World.isRemote)
		{
			EntityNukePrimed entitytntprimed = new EntityNukePrimed(par1World, par2 + 0.5F, par3 + 0.5F, par4 + 0.5F, par5Explosion.getExplosivePlacedBy());
			entitytntprimed.fuse = par1World.rand.nextInt(entitytntprimed.fuse / 4) + entitytntprimed.fuse / 8;
			par1World.spawnEntityInWorld(entitytntprimed);
		}
	}
	
	/**
	 * Called right before the block is destroyed by a player. Args: world, x,
	 * y, z, metaData
	 */
	@Override
	public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5)
	{
		this.func_94391_a(par1World, par2, par3, par4, par5, (EntityLivingBase) null);
	}
	
	public void func_94391_a(World par1World, int par2, int par3, int par4, int par5, EntityLivingBase par6EntityLivingBase)
	{
		if (!par1World.isRemote)
		{
			if ((par5 & 1) == 1)
			{
				EntityNukePrimed entitytntprimed = new EntityNukePrimed(par1World, par2 + 0.5F, par3 + 0.5F, par4 + 0.5F, par6EntityLivingBase);
				par1World.spawnEntityInWorld(entitytntprimed);
				par1World.playSoundAtEntity(entitytntprimed, "random.fuse", 1.0F, 1.0F);
			}
		}
	}
	
	// Uncomment To use flint and steel for ignite.
	/*
	 * public boolean onBlockActivated(World par1World, int par2, int par3, int
	 * par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8,
	 * float par9) { if (par5EntityPlayer.getCurrentEquippedItem() != null &&
	 * par5EntityPlayer.getCurrentEquippedItem().itemID ==
	 * Item.flintAndSteel.itemID) { this.func_94391_a(par1World, par2, par3,
	 * par4, 1, par5EntityPlayer); par1World.setBlockToAir(par2, par3, par4);
	 * par5EntityPlayer.getCurrentEquippedItem().damageItem(1,
	 * par5EntityPlayer); return true; } else { return
	 * super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer,
	 * par6, par7, par8, par9); } }
	 */
	
	/**
	 * Triggered whenever an entity collides with this block (enters into the
	 * block). Args: world, x, y, z, entity
	 */
	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		if (par5Entity instanceof EntityArrow && !par1World.isRemote)
		{
			EntityArrow entityarrow = (EntityArrow) par5Entity;
			
			if (entityarrow.isBurning())
			{
				this.func_94391_a(par1World, par2, par3, par4, 1, entityarrow.shootingEntity instanceof EntityLivingBase ? (EntityLivingBase) entityarrow.shootingEntity : null);
				par1World.setBlockToAir(par2, par3, par4);
			}
		}
	}
	
	/**
	 * Return whether this block can drop from an explosion.
	 */
	@Override
	public boolean canDropFromExplosion(Explosion par1Explosion)
	{
		return false;
	}
	
}