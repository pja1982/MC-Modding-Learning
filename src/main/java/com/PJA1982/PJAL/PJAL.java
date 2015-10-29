package com.PJA1982.pjal;

import com.PJA1982.pjal.handler.ConfigurationHandler;
import com.PJA1982.pjal.init.ModItems;
import com.PJA1982.pjal.proxy.IPorxy;
import com.PJA1982.pjal.reference.Reference;
import com.PJA1982.pjal.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


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
        ModItems.init();

        LogHelper.info("Pre Int Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

        LogHelper.info("Int Complete!");

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
    LogHelper.info("Post Int Complete!");
        }

}
