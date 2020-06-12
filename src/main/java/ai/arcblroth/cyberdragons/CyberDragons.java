package ai.arcblroth.cyberdragons;

import ai.arcblroth.cyberdragons.blocks.CyberDragonBlocks;
import ai.arcblroth.cyberdragons.items.CyberDragonItems;
import net.fabricmc.api.ModInitializer;

public class CyberDragons implements ModInitializer {

    public static final String MODID = "cyberdragons";

    @Override
    public void onInitialize() {
        CyberDragonBlocks.init();
        CyberDragonItems.init();
    }

}
