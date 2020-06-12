package ai.arcblroth.cyberdragons.items;

import ai.arcblroth.cyberdragons.potion.CyberDragonPotions;
import net.minecraft.block.Block;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EnderMintItem extends AliasedBlockItem {

    public EnderMintItem(Block block, Settings settings) {
        super(block, settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        if (!world.isClient) {
            user.applyStatusEffect(new StatusEffectInstance(CyberDragonPotions.CHILLED, 30 * 20, 0));
        }
        return itemStack;
    }

}
