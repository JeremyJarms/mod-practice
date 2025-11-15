package com.jeremyjarms.practicemod.item;

import com.jeremyjarms.practicemod.PracticeMod;
import com.jeremyjarms.practicemod.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PracticeMod.MOD_ID); // Puts items in the game.

    public static final RegistryObject<Item> GEORGE = ITEMS.register("george",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GEORGE = ITEMS.register("raw_george",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
