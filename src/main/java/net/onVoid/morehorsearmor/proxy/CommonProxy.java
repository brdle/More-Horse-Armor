package net.onvoid.morehorsearmor.proxy;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.onvoid.morehorsearmor.common.MoreHorseArmorItems;

public class CommonProxy {

    public void start() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        //IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        MoreHorseArmorItems.create(modBus);
    }
}
