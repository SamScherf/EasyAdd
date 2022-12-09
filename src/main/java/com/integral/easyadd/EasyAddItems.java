package com.integral.easyadd;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import com.integral.easyadd.EasyAdd;

public class EasyAddItems
{
    public static Item addItem(String name) {
	    // Create new item
	    Item newItem = new Item();
	    
	    // Set name based attributes
	    newItem.setUnlocalizedName(name);
	    newItem.setTextureName(EasyAdd.MODID + ":" + name);
	    newItem.setCreativeTab(EasyAdd.tabEasyAdd);

	    // Register and return
            GameRegistry.registerItem(newItem, name);
	    return newItem;
    }

    public static void initItems() {
	    // Add your items here by repeatedly calling addItem
	    addItem("mario");
    }
}
