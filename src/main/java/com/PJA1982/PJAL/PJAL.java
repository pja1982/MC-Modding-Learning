package com.PJA1982.PJAL;

import com.PJA1982.PJAL.handler.ConfigurationHandler;
import com.PJA1982.PJAL.proxy.IPorxy;
import com.PJA1982.PJAL.reference.Reference;
import com.PJA1982.PJAL.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;


/**
 * Created by Abbott on 10/29/2015.
 */
@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class PJAL {

    @Mod.Instance(Reference.MOD_ID)
    public static PJAL instance;

    @SidedProxy (clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IPorxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Int Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
        LogHelper.info("Int Complete!");

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
    LogHelper.info("Post Int Complete!");
        }

}
