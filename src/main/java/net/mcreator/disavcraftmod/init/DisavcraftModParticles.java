
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.disavcraftmod.client.particle.Yellowparticle1Particle;
import net.mcreator.disavcraftmod.client.particle.Redparticle1Particle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DisavcraftModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(DisavcraftModParticleTypes.REDPARTICLE_1.get(), Redparticle1Particle::provider);
		event.registerSpriteSet(DisavcraftModParticleTypes.YELLOWPARTICLE_1.get(), Yellowparticle1Particle::provider);
	}
}
