package ai.arcblroth.cyberdragons.items;

import ai.arcblroth.cyberdragons.CyberDragons;
import ai.arcblroth.cyberdragons.blocks.CyberDragonBlocks;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CyberDragonItems {

    public static Item ENDER_LEAF;
    public static Item ENDER_MINT;

    public static void init() {
        ENDER_LEAF = register("ender_leaf", new EnderLeafItem(new Item.Settings().group(CyberDragons.STUFF).food(FoodComponents.CHORUS_FRUIT)));
        ENDER_MINT = register("ender_mint", new EnderMintItem(CyberDragonBlocks.ENDER_MINT, new Item.Settings().food(FoodComponents.CHORUS_FRUIT).group(CyberDragons.STUFF)));
    }

    private static <I extends Item> I register(String name, I item) {
        return Registry.register(Registry.ITEM, new Identifier(CyberDragons.MODID, name), item);
    }

}
