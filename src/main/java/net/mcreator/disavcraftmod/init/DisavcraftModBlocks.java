
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.disavcraftmod.block.RubyOreBlock;
import net.mcreator.disavcraftmod.block.RubyBlockBlock;
import net.mcreator.disavcraftmod.block.NetheritetilesblockBlock;
import net.mcreator.disavcraftmod.block.IrontilesblockBlock;
import net.mcreator.disavcraftmod.block.GoldtilesblockBlock;
import net.mcreator.disavcraftmod.block.EmeraldtilesblockBlock;
import net.mcreator.disavcraftmod.block.DiamondtilesblockBlock;
import net.mcreator.disavcraftmod.block.CoaltilesblockBlock;
import net.mcreator.disavcraftmod.DisavcraftMod;

public class DisavcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DisavcraftMod.MODID);
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> DIAMONDTILESBLOCK = REGISTRY.register("diamondtilesblock", () -> new DiamondtilesblockBlock());
	public static final RegistryObject<Block> GOLDTILESBLOCK = REGISTRY.register("goldtilesblock", () -> new GoldtilesblockBlock());
	public static final RegistryObject<Block> EMERALDTILESBLOCK = REGISTRY.register("emeraldtilesblock", () -> new EmeraldtilesblockBlock());
	public static final RegistryObject<Block> IRONTILESBLOCK = REGISTRY.register("irontilesblock", () -> new IrontilesblockBlock());
	public static final RegistryObject<Block> COALTILESBLOCK = REGISTRY.register("coaltilesblock", () -> new CoaltilesblockBlock());
	public static final RegistryObject<Block> NETHERITETILESBLOCK = REGISTRY.register("netheritetilesblock", () -> new NetheritetilesblockBlock());
}
