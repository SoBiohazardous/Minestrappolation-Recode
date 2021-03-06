package minestrapteam.minestrappolation.block;

import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;

public class MBlockLog extends BlockLog
{
	private IIcon	topIcon;
	
	public MBlockLog()
	{
		this.setHardness(2.0F);
		this.setStepSound(soundTypeWood);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(this.textureName + "_side");
		this.topIcon = iconRegister.registerIcon(this.textureName + "_top");
	}
	
	@Override
	protected IIcon getSideIcon(int metadata)
	{
		return this.blockIcon;
	}
	
	@Override
	protected IIcon getTopIcon(int metadata)
	{
		return this.topIcon;
	}
	
	@Override
	public int damageDropped(int metadata)
	{
		return 0;
	}
	
	@Override
	public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face)
	{
		return true;
	}
}
