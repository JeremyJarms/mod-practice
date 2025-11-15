package com.jeremyjarms.practicemod.item;

import com.jeremyjarms.practicemod.PracticeMod;
import com.jeremyjarms.practicemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PracticeMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GEORGE_ITEMS_TAB = CREATIVE_MODE_TABS.register("george_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GEORGE.get()))
                    .title(Component.translatable("creativetab.practicemod.george_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GEORGE.get());
                        output.accept(ModItems.RAW_GEORGE.get());

                        output.accept(ModItems.CHISEL.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> GEORGE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("george_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GEORGE_BLOCK.get()))
                    .withTabsBefore(GEORGE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.practicemod.george_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.GEORGE_BLOCK.get());
                        output.accept(ModBlocks.RAW_GEORGE_BLOCK.get());

                        output.accept(ModBlocks.GEORGE_ORE.get());
                        output.accept(ModBlocks.GEORGE_DEEPSLATE_ORE.get());


                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
