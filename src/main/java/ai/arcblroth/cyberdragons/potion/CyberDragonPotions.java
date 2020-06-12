package ai.arcblroth.cyberdragons.potion;

import ai.arcblroth.cyberdragons.CyberDragons;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CyberDragonPotions {

    public static CustomStatusEffect CHILLED;

    public static void init() {
        CHILLED = registerStatusEffect("chilled", new CustomStatusEffect(StatusEffectType.BENEFICIAL, 0x40efff));
    }

    private static <S extends StatusEffect> S registerStatusEffect(String name, S statusEffect) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(CyberDragons.MODID, name), statusEffect);
    }

}
