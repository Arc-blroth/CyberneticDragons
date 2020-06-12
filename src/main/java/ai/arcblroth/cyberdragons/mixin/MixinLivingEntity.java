package ai.arcblroth.cyberdragons.mixin;

import ai.arcblroth.cyberdragons.potion.CyberDragonPotions;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class MixinLivingEntity {

    @Inject(method = "damage(Lnet/minecraft/entity/damage/DamageSource;F)Z", at = @At("HEAD"), cancellable = true)
    public void damageCheckForChilledEffect(DamageSource damageSource, float amount, CallbackInfoReturnable<Boolean> ci) {
        if(hasStatusEffect(CyberDragonPotions.CHILLED)) {
            if(damageSource.equals(DamageSource.ON_FIRE) || damageSource.equals(DamageSource.IN_FIRE)) {
                ci.setReturnValue(false);
                ci.cancel();
            }
        }
    }

    @Shadow
    public abstract boolean hasStatusEffect(StatusEffect effect);

}
