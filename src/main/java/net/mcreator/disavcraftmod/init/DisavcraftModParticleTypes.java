
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.disavcraftmod.DisavcraftMod;

public class DisavcraftModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, DisavcraftMod.MODID);
	public static final RegistryObject<SimpleParticleType> REDPARTICLE_1 = REGISTRY.register("redparticle_1", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> YELLOWPARTICLE_1 = REGISTRY.register("yellowparticle_1", () -> new SimpleParticleType(false));
}
