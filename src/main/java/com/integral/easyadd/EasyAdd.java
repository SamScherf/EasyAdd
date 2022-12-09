package com.integral.easyadd;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.integral.easyadd.handlers.ExampleConfig;
import com.integral.easyadd.handlers.GenericEventHandler;
import com.integral.easyadd.network.packets.ExamplePacket;
import com.integral.easyadd.proxy.CommonProxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = EasyAdd.MODID, version = EasyAdd.VERSION, name = EasyAdd.NAME)
public class EasyAdd {
    public static final String MODID = "easyadd";
    public static final String NAME = "Easy Add";
    public static final String VERSION = "@VERSION@";

    public static SimpleNetworkWrapper packetHandler;

    @SidedProxy(clientSide = "com.integral.easyadd.proxy.ClientProxy", serverSide = "com.integral.easyadd.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final Logger logger = LogManager.getLogger("EasyAdd");
    public static final int howCoolAmI = Integer.MAX_VALUE;

    @EventHandler
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        // NO-OP
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ExampleConfig.load(event);

        packetHandler = NetworkRegistry.INSTANCE.newSimpleChannel("ExampleModChannel");
        packetHandler.registerMessage(ExamplePacket.Handler.class, ExamplePacket.class, 1, Side.CLIENT);

        GenericEventHandler handler = new GenericEventHandler();
        MinecraftForge.EVENT_BUS.register(handler);
        FMLCommonHandler.instance().bus().register(handler);

        NetworkRegistry.INSTANCE.registerGuiHandler(this, proxy);
    }


    public static CreativeTabs tabExampleMod = new CreativeTabs("tabExampleMod") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.baked_potato;
        }
    };
}
