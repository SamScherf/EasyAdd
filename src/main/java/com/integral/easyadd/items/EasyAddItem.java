package com.integral.easyadd.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import com.integral.easyadd.EasyAdd;

/**
 * This is a more user friendly version of the default Item class
 *
 * */
public class EasyAddItem extends Item {
    /**
     * This constructor creates a new item, sets the base values, and registers it
     *
     * @param name The internal name
     **/
    public EasyAddItem(String name) {
	// Create new item
	super();
	    
	// Set name based attributes
	this.setUnlocalizedName(name);
	this.setTextureName(EasyAdd.MODID + ":" + name);
	this.setCreativeTab(EasyAdd.tabEasyAdd);

	// Register
        GameRegistry.registerItem(this, name);
    }
}
