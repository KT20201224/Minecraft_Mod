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

    public static final RegistryObject<Item> BRONZECOIN = ITEMS.register("bronze_coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVERCOIN = ITEMS.register("silver_coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDCOIN = ITEMS.register("gold_coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMONDCOIN = ITEMS.register("diamond_coin",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
