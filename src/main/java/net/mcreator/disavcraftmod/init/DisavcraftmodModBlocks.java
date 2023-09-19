
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.disavcraftmod.block.Stone1Block;
import net.mcreator.disavcraftmod.DisavcraftmodMod;

public class DisavcraftmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DisavcraftmodMod.MODID);
	public static final RegistryObject<Block> STONE_1 = REGISTRY.register("stone_1", () -> new Stone1Block());
}
