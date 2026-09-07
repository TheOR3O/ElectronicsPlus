package com.theor3o.electronics_plus;

import com.theor3o.electronics_plus.block.ModBlocks;
import com.theor3o.electronics_plus.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElectronicsPlus.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELECTRONICS_PLUS =
            CREATIVE_MODE_TABS.register("electronics_plus", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.electronics_plus"))
                    .icon(() -> new ItemStack(ModBlocks.GREEN_LED.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.GREEN_LED.get());
                    })
                    .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}