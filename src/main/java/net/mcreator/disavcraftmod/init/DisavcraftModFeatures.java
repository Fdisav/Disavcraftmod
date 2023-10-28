
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.disavcraftmod.world.features.ores.RubyOreFeature;
import net.mcreator.disavcraftmod.world.features.SequoiatreeFeature;
import net.mcreator.disavcraftmod.world.features.RandomhouseFeature;
import net.mcreator.disavcraftmod.world.features.IrongeodesFeature;
import net.mcreator.disavcraftmod.world.features.CoalgeodesFeature;
import net.mcreator.disavcraftmod.DisavcraftMod;

@Mod.EventBusSubscriber
public class DisavcraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DisavcraftMod.MODID);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::new);
	public static final RegistryObject<Feature<?>> RANDOMHOUSE = REGISTRY.register("randomhouse", RandomhouseFeature::new);
	public static final RegistryObject<Feature<?>> SEQUOIATREE = REGISTRY.register("sequoiatree", SequoiatreeFeature::new);
	public static final RegistryObject<Feature<?>> COALGEODES = REGISTRY.register("coalgeodes", CoalgeodesFeature::new);
	public static final RegistryObject<Feature<?>> IRONGEODES = REGISTRY.register("irongeodes", IrongeodesFeature::new);
}
