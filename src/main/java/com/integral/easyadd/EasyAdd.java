package com.integral.easyadd;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.integral.easyadd.EasyAddItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = EasyAdd.MODID, version = EasyAdd.VERSION, name = EasyAdd.NAME)
public class EasyAdd {
    public static final String MODID = "easyadd";
    public static final String NAME = "Easy Add";
    public static final String VERSION = "@VERSION@";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
	EasyAddItems.initItems();
    };

    public static CreativeTabs tabEasyAdd = new CreativeTabs("tabEasyAdd") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.baked_potato;
        }
    };
}
