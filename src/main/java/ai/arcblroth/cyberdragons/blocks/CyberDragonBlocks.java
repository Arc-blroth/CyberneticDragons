package ai.arcblroth.cyberdragons.blocks;

import ai.arcblroth.cyberdragons.CyberDragons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CyberDragonBlocks {

    public static CropBlock ENDER_MINT;

    public static void init() {
        ENDER_MINT = register("ender_mint", new EnderMintBlock(Block.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));
    }

    private static <B extends Block> B register(String name, B block) {
        return Registry.register(Registry.BLOCK, new Identifier(CyberDragons.MODID, name), block);
    }

}
