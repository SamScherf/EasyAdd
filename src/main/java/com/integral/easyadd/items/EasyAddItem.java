package com.integral.easyadd.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import com.integral.easyadd.EasyAdd;

public class EasyAddItem extends Item {

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
