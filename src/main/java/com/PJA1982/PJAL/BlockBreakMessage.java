package com.PJA1982.PJAL;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent;

/**
 * Created by Abbott on 10/29/2015.
 */
public class BlockBreakMessage {
    @SubscribeEvent
    public void sendMessage(BlockEvent.BreakEvent event){
        event
                .getPlayer()
                .addChatComponentMessage(
                        new ChatComponentText(
                                EnumChatFormatting.GOLD +
                                        "You broke a block!" ));
    }

}
