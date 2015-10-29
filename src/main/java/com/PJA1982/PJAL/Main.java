package com.PJA1982.PJAL;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;


/**
 * Created by Abbott on 10/29/2015.
 */
@Mod(modid = Main.MODID,version = Main.VERSION)

public class Main {
    public static final String MODID = "PJAL";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());

    }

}
