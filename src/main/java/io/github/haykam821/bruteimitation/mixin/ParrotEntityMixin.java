package io.github.haykam821.bruteimitation.mixin;

import java.util.HashMap;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

@Mixin(ParrotEntity.class)
public class ParrotEntityMixin {
	@Inject(method = "method_6579", at = @At("TAIL"))
	private static void addPiglinBruteImitation(HashMap<EntityType<?>, SoundEvent> imitations, CallbackInfo ci) {
		imitations.put(EntityType.PIGLIN_BRUTE, SoundEvents.ENTITY_PARROT_IMITATE_PIGLIN_BRUTE);
	}
}