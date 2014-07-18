package minestrapteam.minestrappolation.tileentity;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPlate extends TileEntity
{
	public ItemStack	stack;
	private EntityItem	theItem;
	
	public EntityItem spawnItem()
	{
		if (this.worldObj.isRemote && this.stack != null)
		{
			this.theItem = new EntityItem(this.worldObj, this.xCoord + 0.5F, this.yCoord + 0.15F, this.zCoord + 0.5F, this.stack);
			this.theItem.hoverStart = 0F;
		}
		return this.theItem;
	}
	
	public EntityItem dropItem()
	{
		EntityItem item = null;
		if (!this.worldObj.isRemote && this.stack != null)
		{
			item = new EntityItem(this.worldObj, this.xCoord + 0.5F, this.yCoord + 0.15F, this.zCoord + 0.5F, this.stack);
			this.worldObj.spawnEntityInWorld(item);
		}
		this.setItem(null);
		return item;
	}
	
	public EntityItem getItemEntity()
	{
		if (this.theItem == null)
		{
			this.spawnItem();
		}
		return this.theItem;
	}
	
	public void setItem(ItemStack stack)
	{
		this.stack = stack;
		if (this.theItem != null)
		{
			this.theItem.setDead();
			this.theItem = null;
		}
	}
	
	public ItemStack getItem()
	{
		return this.stack;
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		if (this.stack != null)
		{
			NBTTagCompound nbt1 = new NBTTagCompound();
			this.stack.writeToNBT(nbt1);
			nbt.setTag("Item", nbt1);
		}
		
		this.setItem(null);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		if (nbt.hasKey("Item"))
		{
			NBTTagCompound nbt1 = nbt.getCompoundTag("Item");
			this.stack = ItemStack.loadItemStackFromNBT(nbt1);
		}
	}
}
