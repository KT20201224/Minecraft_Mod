package com.example.rasingsteve.item;

import com.example.rasingsteve.RasingSteve;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RasingSteve.MODID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("coin_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.GOLDCOIN.get()))
                    .title(Component.translatable("creativetab.coin_tab"))
                    .displayItems((pParameters, pOutput) ->{
                        pOutput.accept(Moditems.BRONZECOIN.get());
                        pOutput.accept(Moditems.SILVERCOIN.get());
                        pOutput.accept(Moditems.GOLDCOIN.get());
                        pOutput.accept(Moditems.DIAMONDCOIN.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
