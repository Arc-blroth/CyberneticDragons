package ai.arcblroth.cyberdragons.blocks;

import ai.arcblroth.cyberdragons.items.CyberDragonItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class EnderMintBlock extends CropBlock {

    protected EnderMintBlock(Settings settings) {
        super(settings);
    }

    @Override
    @Environment(EnvType.CLIENT)
    protected ItemConvertible getSeedsItem() {
        return CyberDragonItems.ENDER_MINT;
    }

}
