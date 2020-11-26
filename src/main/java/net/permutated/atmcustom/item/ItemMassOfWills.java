package net.permutated.atmcustom.item;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.permutated.atmcustom.ModItemGroups;

import javax.annotation.Nullable;
import java.util.List;

public class ItemMassOfWills extends Item {
    public ItemMassOfWills() {
        super(new Item.Properties().maxStackSize(1).group(ModItemGroups.ATM_CUSTOM));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new StringTextComponent(I18n.format("tooltip.kubejs.mass_of_wills")));
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
