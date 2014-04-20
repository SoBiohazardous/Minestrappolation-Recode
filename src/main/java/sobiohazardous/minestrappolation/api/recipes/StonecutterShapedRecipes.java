package sobiohazardous.minestrappolation.api.recipes;

import sobiohazardous.minestrappolation.api.tileentity.InventoryStonecutterExtraSlot;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class StonecutterShapedRecipes implements IStonecutterRecipe
{
    /** How many horizontal slots this recipe is wide. */
    public final int recipeWidth;

    /** How many vertical slots this recipe uses. */
    public final int recipeHeight;

    /** Is a array of ItemStack that composes the recipe. */
    public final ItemStack[] recipeItems;

    /** Is the ItemStack that you get when craft the recipe. */
    private ItemStack recipeOutput;
    
    /** Is the itemID of the output item that you get when craft the recipe. */
    public final ItemStack recipeOutputItemID;
    private boolean field_92101_f;
    
    private ItemStack neededExtraSlot;
    
    public StonecutterShapedRecipes(int par1, int par2, ItemStack[] par3ArrayOfItemStack, ItemStack par4ItemStack, ItemStack neededExtraSlot)
    {
        this.recipeOutputItemID = par4ItemStack;
        this.recipeWidth = par1;
        this.recipeHeight = par2;
        this.recipeItems = par3ArrayOfItemStack;
        this.recipeOutput = par4ItemStack;
        this.neededExtraSlot = neededExtraSlot;
    }

    public ItemStack getRecipeOutput()
    {
        return this.recipeOutput;
    }

    /**
     * Used to check if a recipe matches current crafting inventory
     */
    public boolean matches(InventoryCrafting par1InventoryCrafting, InventoryStonecutterExtraSlot extra, World par2World)
    {
        for (int i = 0; i <= 3 - this.recipeWidth; ++i)
        {
            for (int j = 0; j <= 3 - this.recipeHeight; ++j)
            {
                if (this.checkMatch(par1InventoryCrafting, extra, i, j, neededExtraSlot, true))
                {
                    return true;
                }

                if (this.checkMatch(par1InventoryCrafting, extra, i, j, neededExtraSlot, false))
                {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Checks if the region of a crafting inventory is match for the recipe.
     */
    private boolean checkMatch(InventoryCrafting par1InventoryCrafting, InventoryStonecutterExtraSlot extraInv, int par2, int par3, ItemStack extra, boolean par4)
    { 	
        for (int k = 0; k < 3; ++k)
        {
            for (int l = 0; l < 3; ++l)
            {
                int i1 = k - par2;
                int j1 = l - par3;
                ItemStack itemstack = null;

                if (i1 >= 0 && j1 >= 0 && i1 < this.recipeWidth && j1 < this.recipeHeight)
                {
                    if (par4)
                    {
                        itemstack = this.recipeItems[this.recipeWidth - i1 - 1 + j1 * this.recipeWidth];
                    }
                    else
                    {
                        itemstack = this.recipeItems[i1 + j1 * this.recipeWidth];
                    }
                }

                ItemStack itemstack1 = par1InventoryCrafting.getStackInRowAndColumn(k, l);
                ItemStack currentExtraSlot = extraInv.getStackInSlot(0);
                
                if (itemstack1 != null || itemstack != null)
                {
                    if (itemstack1 == null && itemstack != null || itemstack1 != null && itemstack == null)
                    {
                        return false;
                    }

                    if (itemstack != itemstack1)
                    {
                        return false;
                    }

                    if (itemstack.getItemDamage() != 32767 && itemstack.getItemDamage() != itemstack1.getItemDamage())
                    {
                        return false;
                    }  
                    
                    if(currentExtraSlot == null && neededExtraSlot != null || currentExtraSlot != null && neededExtraSlot == null)
                    {
                        return false;
                    }
                    if(currentExtraSlot != neededExtraSlot)
                    {
                    	return false;
                    }                             
                }               
            }
        }
        return true;
    }

    /**
     * Returns an Item that is the result of this recipe
     */
    public ItemStack getCraftingResult(InventoryCrafting par1InventoryCrafting, InventoryStonecutterExtraSlot extra)
    {
        ItemStack itemstack = this.getRecipeOutput().copy();

        if (this.field_92101_f)
        {
            for (int i = 0; i < par1InventoryCrafting.getSizeInventory(); ++i)
            {
                ItemStack itemstack1 = par1InventoryCrafting.getStackInSlot(i);

                if (itemstack1 != null && itemstack1.hasTagCompound())
                {
                    itemstack.setTagCompound((NBTTagCompound)itemstack1.stackTagCompound.copy());
                }
            }
        }

        return itemstack;
    }

    /**
     * Returns the size of the recipe area
     */
    public int getRecipeSize()
    {
        return this.recipeWidth * this.recipeHeight;
    }

    public StonecutterShapedRecipes func_92100_c()
    {
        this.field_92101_f = true;
        return this;
    }
}
