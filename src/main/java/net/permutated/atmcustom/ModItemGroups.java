package net.permutated.atmcustom;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemGroups
{
    public static final ItemGroup ATM_CUSTOM = new ModItemGroup(ATMCustom.MODID, () -> new ItemStack(ModRegistry.UU_MATTER.get()));

    public static final class ModItemGroup extends ItemGroup
    {
        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon()
        {
            return iconSupplier.get();
        }
    }
}
