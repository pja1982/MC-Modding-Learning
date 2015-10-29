package com.PJA1982.pjal.init;

import com.PJA1982.pjal.item.ItemMapleLeaf;
import com.PJA1982.pjal.item.ItemPJAL;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Abbott on 10/30/2015.
 */
public class ModItems {

    public static final ItemPJAL mapleLeaf = new ItemMapleLeaf();

        public static void init()
        {
            GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
        }
}
