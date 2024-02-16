package com.example.rasingsteve.item;

import com.example.rasingsteve.RasingSteve;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RasingSteve.MODID);

    public static final RegistryObject<Item> BRONZE_COIN = ITEMS.register("bronze_coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_COIN = ITEMS.register("diamond_coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEST_RAW_GOLD = ITEMS.register("test_raw_gold",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
