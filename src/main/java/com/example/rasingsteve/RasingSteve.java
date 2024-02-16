package com.example.rasingsteve;

import com.example.rasingsteve.block.ModBlocks;
import com.example.rasingsteve.item.ModCreativeModTabs;
import com.example.rasingsteve.item.Moditems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RasingSteve.MODID)
public class RasingSteve
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "rasingsteve";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public RasingSteve()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Moditems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // 사용자 설정 탭
        ModCreativeModTabs.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // 기존 탭에 넣고 싶을땐 다음과 같이 사용
    private void addCreative(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(Moditems.BRONZE_COIN);
            event.accept(Moditems.SILVER_COIN);
            event.accept(Moditems.GOLD_COIN);
            event.accept(Moditems.DIAMOND_COIN);

        }
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event){

    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
