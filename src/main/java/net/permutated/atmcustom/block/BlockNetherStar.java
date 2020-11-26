package net.permutated.atmcustom.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockNetherStar extends Block {
    public BlockNetherStar() {
        super(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f).setLightLevel((state) -> 1));
    }
}
