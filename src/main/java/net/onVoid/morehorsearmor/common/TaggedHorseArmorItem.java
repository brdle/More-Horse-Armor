package net.onvoid.morehorsearmor.common;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import javax.annotation.Nullable;
import java.util.List;

public class TaggedHorseArmorItem extends HorseArmorItem {

    private final String tag;
    /**
     * @param pProtection the given protection level of the {@code HorseArmorItem}
     * @param pIdentifier the texture path identifier for the {@code DyeableHorseArmorItem}, {@link
     *                    HorseArmorItem}
     * @param pProperties the item properties
     */
    public TaggedHorseArmorItem(int pProtection, String pIdentifier, Properties pProperties, String compat) {
        super(pProtection, pIdentifier, pProperties);
        this.tag = compat;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level pLevel, List<Component> tool, TooltipFlag pIsAdvanced) {
        if (ForgeRegistries.ITEMS.tags().getTag(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(), new ResourceLocation("forge", "ingots/" + this.tag))).isEmpty()) {
            tool.add(new TextComponent("Requires ingot tag \"" + this.tag + "\""));
        }
    }
}
