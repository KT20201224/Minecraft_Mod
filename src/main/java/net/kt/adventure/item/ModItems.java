package net.kt.adventure.item;

import net.kt.adventure.Adventure;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Adventure.MODID);

    public static final RegistryObject<Item> Test = ITEMS.register("test",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Raw_Test = ITEMS.register("raw_test",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
