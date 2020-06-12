package ai.arcblroth.cyberdragons;

import ai.arcblroth.cyberdragons.blocks.CyberDragonBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class CyberDragonsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(CyberDragonBlocks.ENDER_MINT, RenderLayer.getCutoutMipped());
    }

}
