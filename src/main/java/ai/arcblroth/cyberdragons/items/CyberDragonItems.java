package ai.arcblroth.cyberdragons.items;

import ai.arcblroth.cyberdragons.CyberDragons;
import ai.arcblroth.cyberdragons.blocks.CyberDragonBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CyberDragonItems {

    public static Item ENDER_MINT;

    public static void init() {
        ENDER_MINT = register("ender_mint", new AliasedBlockItem(CyberDragonBlocks.ENDER_MINT, new Item.Settings().group(ItemGroup.MATERIALS)));
    }

    private static <I extends Item> I register(String name, I item) {
        return Registry.register(Registry.ITEM, new Identifier(CyberDragons.MODID, name), item);
    }

}
