package com.theor3o.electronics_plus.item;

import com.theor3o.electronics_plus.ElectronicsPlus;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ElectronicsPlus.MODID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
