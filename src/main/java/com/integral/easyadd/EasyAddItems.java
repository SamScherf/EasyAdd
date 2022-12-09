package com.integral.easyadd;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import com.integral.easyadd.EasyAdd;

public class EasyAddItems
{
    public static void initItems()
    {
	Item mario = new Item().setUnlocalizedName("mario").setTextureName(EasyAdd.MODID + ":mario");
        GameRegistry.registerItem(mario, "mario");
	mario.setCreativeTab(EasyAdd.tabEasyAdd);
    }
}
