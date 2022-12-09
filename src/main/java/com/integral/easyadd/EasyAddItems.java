package com.integral.easyadd;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

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

    public static ItemFood addFood(String name, int hunger, float saturation, boolean wolf) {
	// Create food item
	ItemFood newItemFood = new ItemFood(hunger, saturation, wolf);
     
	// Set name based attributes
	newItemFood.setUnlocalizedName(name);
	newItemFood.setTextureName(EasyAdd.MODID + ":" + name);
	newItemFood.setCreativeTab(EasyAdd.tabEasyAdd);

	// Register and return
        GameRegistry.registerItem(newItemFood, name);
	return newItemFood;
    }

    public static ItemFood addFood(String name, int hunger, float saturation) {
	    // Default wolf to false
	    return addFood(name, hunger, saturation, false);
    }

    public static void initItems() {
	    // Repeatedly call addItem(name)
	    addItem("mario");

	    // Repeatedly call addFood(name, hunger, saturation)
	    addFood("supermushroom", 2, 0.2f);
    }
}
