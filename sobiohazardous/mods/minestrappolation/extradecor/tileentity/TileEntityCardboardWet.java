package sobiohazardous.mods.minestrappolation.extradecor.tileentity;

import sobiohazardous.mods.minestrappolation.core.util.MUtil;
import sobiohazardous.mods.minestrappolation.extradecor.lib.EDBlocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityCardboardWet extends TileEntity
{
	private long	ticks	= 0;
	
	/**
	 * Allows the entity to update its state. Overridden in most subclasses,
	 * e.g. the mob spawner uses this to count ticks and creates a new spawn
	 * inside its implementation.
	 */
	@Override
	public void updateEntity()
	{
		this.ticks++;
		
		if (this.isDry(this.worldObj))
		{
			if (this.ticks == 1000)
			{
				this.worldObj.setBlock(this.xCoord, this.yCoord, this.zCoord, EDBlocks.cardboardBlock);
			}
		}
	}
	
	public boolean isDry(World world)
	{
		if (MUtil.isWaterTouchingAnySide(world, this.xCoord, this.yCoord, this.zCoord))
		{
			return false;
		}
		return true;
	}
}
