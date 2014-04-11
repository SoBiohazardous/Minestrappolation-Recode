package sobiohazardous.minestrappolation.extradecor.itemblocks;

import sobiohazardous.minestrappolation.extradecor.block.BlockStoneLamp;
import sobiohazardous.minestrappolation.extradecor.lib.EDBlockManager;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;

public class ItemBlockGoblet extends ItemBlock
{
	public static final String[] types = new String[] {"0", "1", "2", "3","4","5","6","7"};

	public ItemBlockGoblet(Block block)
	{
		super(block);

		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int meta)
	{
		return meta & 15;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		int meta = itemStack.getItemDamage();
		if (meta < 0 || meta >= types.length) 
		{
			meta = 0;
		}

		return super.getUnlocalizedName() + "." + types[meta];
	}
}
