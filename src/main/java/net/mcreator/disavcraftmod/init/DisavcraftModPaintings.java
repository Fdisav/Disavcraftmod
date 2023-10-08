
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.disavcraftmod.DisavcraftMod;

public class DisavcraftModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, DisavcraftMod.MODID);
	public static final RegistryObject<PaintingVariant> DISAV_CRAFT_LOGO = REGISTRY.register("disav_craft_logo", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> DISAV_CRAFT_LOGO_SMALL = REGISTRY.register("disav_craft_logo_small", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> DISAV_CRAFT_LOGO_BIG = REGISTRY.register("disav_craft_logo_big", () -> new PaintingVariant(48, 48));
	public static final RegistryObject<PaintingVariant> MINECRAFT_PAINTING_1 = REGISTRY.register("minecraft_painting_1", () -> new PaintingVariant(32, 48));
}
