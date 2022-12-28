package com.integral.easyadd;

import com.integral.easyadd.items.EasyAddItem;
import com.integral.easyadd.items.EasyAddFood;


public class EasyAddItems {

    public static EasyAddItem addItem(String name) {
	    EasyAddItem newItem = new EasyAddItem(name);
	    return newItem;
    }

    public static EasyAddFood addFood(String name, int hunger, float saturation, boolean wolf) {
	    EasyAddFood newFood = new EasyAddFood(name, hunger, saturation, wolf);
	    return newFood;

    }

    public static EasyAddFood addFood(String name, int hunger, float saturation) {
	    EasyAddFood newFood = new EasyAddFood(name, hunger, saturation);
	    return newFood;

    }

    public static void initItems() {
	    // Repeatedly call addItem(name)
	    addItem("mario");

	    // Repeatedly call addFood(name, hunger, saturation)
	    addFood("supermushroom", 2, 0.2f);
    }
}
