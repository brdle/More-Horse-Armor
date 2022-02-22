package net.onvoid.morehorsearmor.common;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.onvoid.morehorsearmor.MoreHorseArmor;

public class MoreHorseArmorItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreHorseArmor.MODID);

    public static final RegistryObject<HorseArmorItem> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor", () ->
            new HorseArmorItem(13, "netherite", (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<HorseArmorItem> ENDERITE_HORSE_ARMOR = ITEMS.register("enderite_horse_armor", () ->
            new HorseArmorItem(15, "enderite", (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC)));

    public static void create(IEventBus bus) {
        ITEMS.register(bus);
    }
}
