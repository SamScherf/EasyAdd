package com.integral.easyadd.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemFood;

import com.integral.easyadd.EasyAdd;

public class EasyAddFood extends ItemFood {

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

    public EasyAddFood(String name, int hunger, float saturation) {
	// Default wolf to false
	this(name, hunger, saturation, false);
    }
}
