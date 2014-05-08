package sobiohazardous.mods.minestrappolation.extramobdrops.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import sobiohazardous.mods.minestrappolation.core.lib.MReference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class ItemCharm extends Item
{
	public static final String[]	geneNames	= new String[] { "Pig", "Cow", "Chicken", "Sheep", "Horse" };
	@SideOnly(Side.CLIENT)
	private IIcon[]					geneIcons;
	
	public ItemCharm()
	{
		super();
	}
	
	@Override
	public IIcon getIconFromDamage(int par1)
	{
		int j = MathHelper.clamp_int(par1, 0, 4);
		return this.geneIcons[j];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		int i = MathHelper.clamp_int(par1ItemStack.getItemDamage(), 0, 4);
		return super.getUnlocalizedName() + "." + geneNames[i];
	}
	
	/**
	 * returns a list of items with the same ID, but different meta (eg: dye
	 * returns 16 items)
	 */
	@Override
	public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List)
	{
		for (int j = 0; j < 5; ++j)
		{
			par3List.add(new ItemStack(par1, 1, j));
		}
	}
	
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.geneIcons = new IIcon[geneNames.length];
		
		for (int i = 0; i < geneNames.length; ++i)
		{
			this.geneIcons[i] = par1IconRegister.registerIcon(MReference.MODID_EMD + ":charm" + geneNames[i]);
		}
	}
}
