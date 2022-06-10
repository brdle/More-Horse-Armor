package net.onvoid.morehorsearmor.common;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import javax.annotation.Nullable;
import java.util.List;

public class CompatHorseArmorItem extends HorseArmorItem {

    private final String compat;
    /**
     * @param pProtection the given protection level of the {@code HorseArmorItem}
     * @param pIdentifier the texture path identifier for the {@code DyeableHorseArmorItem}, {@link
     *                    HorseArmorItem}
     * @param pProperties the item properties
     */
    public CompatHorseArmorItem(int pProtection, String pIdentifier, Properties pProperties, String compat) {
        super(pProtection, pIdentifier, pProperties);
        this.compat = compat;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level pLevel, List<Component> tool, TooltipFlag pIsAdvanced) {
        tool.add(new TextComponent("Requires " + compat));
    }
}
