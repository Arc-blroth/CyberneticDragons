package ai.arcblroth.cyberdragons;

import ai.arcblroth.cyberdragons.blocks.CyberDragonBlocks;
import ai.arcblroth.cyberdragons.items.CyberDragonItems;
import ai.arcblroth.cyberdragons.potion.CyberDragonPotions;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class CyberDragons implements ModInitializer {

    public static final String MODID = "cyberdragons";
    public static ItemGroup STUFF;

    @Override
    public void onInitialize() {
        STUFF = FabricItemGroupBuilder.create(new Identifier(MODID, "stuff")).build();
        CyberDragonBlocks.init();
        CyberDragonItems.init();
        CyberDragonPotions.init();
    }

}
