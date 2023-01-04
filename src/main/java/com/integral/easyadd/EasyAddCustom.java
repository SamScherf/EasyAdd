package com.integral.easyadd;

import com.integral.easyadd.items.EasyAddItem;
import com.integral.easyadd.items.EasyAddFood;

public class EasyAddCustom {
    /**
     * Users should modify this method to create and register all their custom blocks and items.
     * This can be done via the default ways or, ideally, via the custom classes and methods implemented by
     * EasyAdd.
     *
     **/
    public static void initialize() {
	    // Repeatedly create instances of EasyAddItem(name)
	    new EasyAddItem("mario");

	    // Repeatedly create instances of EasyAddFood(name, hunger, saturation)
	    new EasyAddFood("supermushroom", 2, 0.2f);
    }
}
