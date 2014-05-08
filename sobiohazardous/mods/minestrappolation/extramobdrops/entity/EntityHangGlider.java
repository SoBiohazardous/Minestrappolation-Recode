package sobiohazardous.mods.minestrappolation.extramobdrops.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityHangGlider extends Entity
{
	public String		owner;
	public EntityPlayer	player;
	
	boolean				initCheck	= true;
	boolean				checking	= false;
	public ItemStack	theItem;
	
	public EntityHangGlider(World par1World)
	{
		super(par1World);
	}
	
	public EntityHangGlider(World par1World, double x, double y, double z, EntityPlayer owner, ItemStack item)
	{
		super(par1World);
		this.owner = owner.getDisplayName();
		this.player = owner;
		this.setPosition(x, y, z);
		this.theItem = item;
	}
	
	@Override
	public void onUpdate()
	{
		// if(player.inventory.getCurrentItem() !=
		// EMDItemManager.hangGlider.getContainerItem(theItem) &&
		// player.onGround == false && player.isInWater() == false)
		// {
		this.player.motionY /= 1.55;
		this.player.fallDistance = 0;
		if (Math.abs(this.player.motionX) < 0.15)
		{
			this.player.motionX *= 1.1;
		}
		else if (Math.abs(this.player.motionX) < 0.9)
		{
			this.player.motionX *= 1.06;
		}
		if (Math.abs(this.player.motionZ) < 0.15)
		{
			this.player.motionZ *= 1.1;
		}
		if (Math.abs(this.player.motionZ) < 0.9)
		{
			this.player.motionZ *= 1.06;
		}
		if (this.initCheck == true && Math.abs(this.player.motionX) + Math.abs(this.player.motionZ) > 0.15)
		{
			this.checking = true;
			this.initCheck = false;
		}
		if (this.checking == true && Math.abs(this.player.motionX) + Math.abs(this.player.motionZ) <= 0.15 && this.player.isCollidedHorizontally == false)
		{
			this.checking = false;
			this.initCheck = true;
		}
		
		// The problem for no damage is that player.isCollidedHorizontally only
		// works client side, so it damages only client side, and not server
		// side. these packets do nothing.
		if (this.checking == true && this.player.isCollidedHorizontally == true)
		{
			this.player.motionX = 0;
			this.player.motionZ = 0;
			this.checking = false;
			this.initCheck = true;
		}
		
		// wall colision
		/*
		 * if((Math.abs(prev2XMotion) > 0.3 || Math.abs(prev2ZMotion) > 0.3 ||
		 * (Math.abs(prev2XMotion) > 0.3 && Math.abs(prev2ZMotion) > 0.3)) &&
		 * player.isCollidedHorizontally && Math.abs(player.motionY) > 0.13) {
		 * par1ItemStack.damageItem(1, Minecraft.getMinecraft().thePlayer); }
		 */
		// System.out.println("Checking" + checking);
		// System.out.println("InitChecking" + initCheck);
		// System.out.println("SpeedZ" + player.motionZ);
		// System.out.println("SpeedX" + player.motionX);
		// }
	}
	
	@Override
	protected void entityInit()
	{
		
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound var1)
	{
		this.owner = var1.getString("owner");
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound var1)
	{
		var1.setString(this.owner, "owner");
	}
	
}
