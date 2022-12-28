package com.integral.easyadd.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;

import com.integral.easyadd.EasyAdd;

/**
 * This class is a more user friendly version of the default ItemFood class
 *
 **/
public class EasyAddFood extends ItemFood {
    /**
     * This constructor creates a new food item, sets base values, and registers
     * the item
     *
     * @param name The internal name
     * @param hunger The number of food points (half drumsticks)
     * @param saturation The number of saturation points
     * @param wolf A boolean representing if the food can be fed to wolfs
     **/
    public EasyAddFood(String name, int hunger, float saturation, boolean wolf) {
	// Create food item
	super(hunger, saturation, wolf);
     
	// Set name based attributes
	this.setUnlocalizedName(name);
	this.setTextureName(EasyAdd.MODID + ":" + name);
	this.setCreativeTab(EasyAdd.tabEasyAdd);

	// Register
        GameRegistry.registerItem(this, name);
    }

    /**
     * wolf defaults to False.
     *
     * @see #EasyAddFood(String, int, float, boolean)
     **/
    public EasyAddFood(String name, int hunger, float saturation) {
	this(name, hunger, saturation, false);
    }
}
