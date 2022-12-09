package com.integral.easyadd.handlers;

import java.util.Random;

import com.integral.easyadd.EasyAdd;
import com.integral.easyadd.network.packets.ExamplePacket;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class GenericEventHandler {

    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event) {
        Entity entity = event.entity;

        if (!entity.worldObj.isRemote && entity instanceof EntityPlayerMP) {
            System.out.println("Entity joined world: " + entity);
            EasyAdd.packetHandler.sendTo(new ExamplePacket(), (EntityPlayerMP)entity);
        }
    }

}
