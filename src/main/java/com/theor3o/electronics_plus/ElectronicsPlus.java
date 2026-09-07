package com.theor3o.electronics_plus;

import com.theor3o.electronics_plus.block.ModBlocks;
import com.theor3o.electronics_plus.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ElectronicsPlus.MODID)
public class ElectronicsPlus {
    public static final String MODID = "electronics_plus";

    public ElectronicsPlus(IEventBus eventBus) {
        // Register blocks and items
        ModBlocks.register(eventBus);
        ModItems.register(eventBus);
        // Register creative mode tabs
        ModCreativeTabs.register(eventBus);
    }
}