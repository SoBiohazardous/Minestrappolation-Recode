package minestrapteam.minestrappolation.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public abstract class BlockRadiation extends Block
{
	protected float	range;
	protected EntityLivingBase entityEffected = null;
	
	protected BlockRadiation(Material material)
	{
		super(material);
	}
	
	@Override
	public void onBlockAdded(World random, int x, int y, int z)
	{
		random.setBlockMetadataWithNotify(x, y, z, 0, z);
		random.scheduleBlockUpdate(x, y, z, this, 1);
	}
	
	@Override
	public void updateTick(World world, int x, int y, int z, Random random)
	{
		if (!world.isRemote)
		{
			world.scheduleBlockUpdate(x, y, z, this, 1);
			
			AxisAlignedBB axisalignedbb = this.getCollisionBoundingBoxFromPool(world, x, y, z).expand(this.range, this.range, this.range);
			List<EntityLivingBase> list = world.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
			
			for (EntityLivingBase living : list)
			{
				this.entityEffected = living;
				this.addPotionEffect(living);
			}
		}
	}
	
	public abstract void addPotionEffect(EntityLivingBase living);
}
