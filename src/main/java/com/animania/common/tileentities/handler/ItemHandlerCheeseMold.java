package com.animania.common.tileentities.handler;

import com.animania.common.blocks.BlockTrough;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemStackHandler;

public class ItemHandlerCheeseMold extends ItemStackHandler
{
	
	public ItemHandlerCheeseMold()
	{
		this.setSize(1);
	}

    @Override
    public int getSlotLimit(int slot) {
        return 1;
    }

    @Override
    public ItemStack insertItem(int slot, ItemStack stack, boolean simulate) {	
    	return stack;
    }
    
   

}
