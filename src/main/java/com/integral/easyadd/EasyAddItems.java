package com.integral.easyadd;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

import com.integral.easyadd.items.EasyAddItem;
import com.integral.easyadd.items.EasyAddFood;


public class EasyAddItems
{
    public static Item addItem(String name) {
	    Item newItem = new EasyAddItem(name);
	    return newItem;
    }

    public static ItemFood addFood(String name, int hunger, float saturation, boolean wolf) {
	    ItemFood newFood = new EasyAddFood(name, hunger, saturation, wolf);
	    return newFood;

    }

    public static ItemFood addFood(String name, int hunger, float saturation) {
	    ItemFood newFood = new EasyAddFood(name, hunger, saturation);
	    return newFood;

    }

    public static void initItems() {
	    // Repeatedly call addItem(name)
	    addItem("mario");

	    // Repeatedly call addFood(name, hunger, saturation)
	    addFood("supermushroom", 2, 0.2f);
    }
}
