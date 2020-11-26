package net.permutated.atmcustom;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.permutated.atmcustom.block.BlockMagicalSoil;
import net.permutated.atmcustom.block.BlockNetherStar;
import net.permutated.atmcustom.item.ItemMassOfWills;
import net.permutated.atmcustom.item.ItemRottenLeather;
import net.permutated.atmcustom.item.ItemRuneOfSins;
import net.permutated.atmcustom.item.ItemUUMatter;

public class ModRegistry
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "kubejs");
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "kubejs");

    // Blocks
    public static final RegistryObject<Block> MAGICAL_SOIL_BLOCK = BLOCKS.register("magical_soil", BlockMagicalSoil::new);
    public static final RegistryObject<Block> NETHER_STAR_BLOCK = BLOCKS.register("nether_star_block", BlockNetherStar::new);

    // BlockItems
    public static final RegistryObject<Item> MAGICAL_SOIL_BLOCK_ITEM = ITEMS.register("magical_soil",
            () -> new BlockItem(MAGICAL_SOIL_BLOCK.get(), new Item.Properties().group(ModItemGroups.ATM_CUSTOM)));
    public static final RegistryObject<Item> NETHER_STAR_BLOCK_ITEM = ITEMS.register("nether_star_block",
            () -> new BlockItem(NETHER_STAR_BLOCK.get(), new Item.Properties().group(ModItemGroups.ATM_CUSTOM)));

    // Items
    public static final RegistryObject<Item> MASS_OF_WILLS = ITEMS.register("mass_of_wills", ItemMassOfWills::new);
    public static final RegistryObject<Item> RUNE_OF_SINS = ITEMS.register("rune_of_sins", ItemRuneOfSins::new);
    public static final RegistryObject<Item> ROTTEN_LEATHER = ITEMS.register("rotten_leather", ItemRottenLeather::new);
    public static final RegistryObject<Item> UU_MATTER = ITEMS.register("uu_matter", ItemUUMatter::new);


    public static void register()
    {
       BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
