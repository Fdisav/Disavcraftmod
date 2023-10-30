
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.disavcraftmod.block.SunPortalBlock;
import net.mcreator.disavcraftmod.block.Sturdywallverticalstripes2Block;
import net.mcreator.disavcraftmod.block.Sturdywallverticalstripes1Block;
import net.mcreator.disavcraftmod.block.SequoiatrapdoorBlock;
import net.mcreator.disavcraftmod.block.SequoiadoorBlock;
import net.mcreator.disavcraftmod.block.SequoiaWoodBlock;
import net.mcreator.disavcraftmod.block.SequoiaStairsBlock;
import net.mcreator.disavcraftmod.block.SequoiaSlabBlock;
import net.mcreator.disavcraftmod.block.SequoiaPressurePlateBlock;
import net.mcreator.disavcraftmod.block.SequoiaPlanksBlock;
import net.mcreator.disavcraftmod.block.SequoiaLogBlock;
import net.mcreator.disavcraftmod.block.SequoiaLeavesBlock;
import net.mcreator.disavcraftmod.block.SequoiaFenceGateBlock;
import net.mcreator.disavcraftmod.block.SequoiaFenceBlock;
import net.mcreator.disavcraftmod.block.SequoiaButtonBlock;
import net.mcreator.disavcraftmod.block.RubytilesblockBlock;
import net.mcreator.disavcraftmod.block.RubyOreBlock;
import net.mcreator.disavcraftmod.block.RubyBlockBlock;
import net.mcreator.disavcraftmod.block.NetheritetilesblockBlock;
import net.mcreator.disavcraftmod.block.IrontilesblockBlock;
import net.mcreator.disavcraftmod.block.IrondivisorBlock;
import net.mcreator.disavcraftmod.block.IroncolonBlock;
import net.mcreator.disavcraftmod.block.Ironcolon2Block;
import net.mcreator.disavcraftmod.block.Ironcolon1Block;
import net.mcreator.disavcraftmod.block.GoldtilesblockBlock;
import net.mcreator.disavcraftmod.block.GolddivisoriumBlock;
import net.mcreator.disavcraftmod.block.Golddivisorium2Block;
import net.mcreator.disavcraftmod.block.GoldcolonBlock;
import net.mcreator.disavcraftmod.block.Goldcolon1Block;
import net.mcreator.disavcraftmod.block.EmeraldtilesblockBlock;
import net.mcreator.disavcraftmod.block.DiamondtilesblockBlock;
import net.mcreator.disavcraftmod.block.CoaltilesblockBlock;
import net.mcreator.disavcraftmod.DisavcraftMod;

public class DisavcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DisavcraftMod.MODID);
	public static final RegistryObject<Block> COALTILESBLOCK = REGISTRY.register("coaltilesblock", () -> new CoaltilesblockBlock());
	public static final RegistryObject<Block> IRONTILESBLOCK = REGISTRY.register("irontilesblock", () -> new IrontilesblockBlock());
	public static final RegistryObject<Block> GOLDTILESBLOCK = REGISTRY.register("goldtilesblock", () -> new GoldtilesblockBlock());
	public static final RegistryObject<Block> EMERALDTILESBLOCK = REGISTRY.register("emeraldtilesblock", () -> new EmeraldtilesblockBlock());
	public static final RegistryObject<Block> DIAMONDTILESBLOCK = REGISTRY.register("diamondtilesblock", () -> new DiamondtilesblockBlock());
	public static final RegistryObject<Block> NETHERITETILESBLOCK = REGISTRY.register("netheritetilesblock", () -> new NetheritetilesblockBlock());
	public static final RegistryObject<Block> SEQUOIA_WOOD = REGISTRY.register("sequoia_wood", () -> new SequoiaWoodBlock());
	public static final RegistryObject<Block> SEQUOIA_LOG = REGISTRY.register("sequoia_log", () -> new SequoiaLogBlock());
	public static final RegistryObject<Block> SEQUOIA_PLANKS = REGISTRY.register("sequoia_planks", () -> new SequoiaPlanksBlock());
	public static final RegistryObject<Block> SEQUOIA_STAIRS = REGISTRY.register("sequoia_stairs", () -> new SequoiaStairsBlock());
	public static final RegistryObject<Block> SEQUOIA_SLAB = REGISTRY.register("sequoia_slab", () -> new SequoiaSlabBlock());
	public static final RegistryObject<Block> SEQUOIA_BUTTON = REGISTRY.register("sequoia_button", () -> new SequoiaButtonBlock());
	public static final RegistryObject<Block> SEQUOIADOOR = REGISTRY.register("sequoiadoor", () -> new SequoiadoorBlock());
	public static final RegistryObject<Block> SEQUOIATRAPDOOR = REGISTRY.register("sequoiatrapdoor", () -> new SequoiatrapdoorBlock());
	public static final RegistryObject<Block> SEQUOIA_LEAVES = REGISTRY.register("sequoia_leaves", () -> new SequoiaLeavesBlock());
	public static final RegistryObject<Block> SEQUOIA_FENCE = REGISTRY.register("sequoia_fence", () -> new SequoiaFenceBlock());
	public static final RegistryObject<Block> SEQUOIA_FENCE_GATE = REGISTRY.register("sequoia_fence_gate", () -> new SequoiaFenceGateBlock());
	public static final RegistryObject<Block> SEQUOIA_PRESSURE_PLATE = REGISTRY.register("sequoia_pressure_plate", () -> new SequoiaPressurePlateBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> RUBYTILESBLOCK = REGISTRY.register("rubytilesblock", () -> new RubytilesblockBlock());
	public static final RegistryObject<Block> SUN_PORTAL = REGISTRY.register("sun_portal", () -> new SunPortalBlock());
	public static final RegistryObject<Block> STURDYWALLVERTICALSTRIPES_1 = REGISTRY.register("sturdywallverticalstripes_1", () -> new Sturdywallverticalstripes1Block());
	public static final RegistryObject<Block> STURDYWALLVERTICALSTRIPES_2 = REGISTRY.register("sturdywallverticalstripes_2", () -> new Sturdywallverticalstripes2Block());
	public static final RegistryObject<Block> IRONDIVISOR = REGISTRY.register("irondivisor", () -> new IrondivisorBlock());
	public static final RegistryObject<Block> GOLDDIVISORIUM = REGISTRY.register("golddivisorium", () -> new GolddivisoriumBlock());
	public static final RegistryObject<Block> GOLDDIVISORIUM_2 = REGISTRY.register("golddivisorium_2", () -> new Golddivisorium2Block());
	public static final RegistryObject<Block> IRONCOLON = REGISTRY.register("ironcolon", () -> new IroncolonBlock());
	public static final RegistryObject<Block> IRONCOLON_1 = REGISTRY.register("ironcolon_1", () -> new Ironcolon1Block());
	public static final RegistryObject<Block> IRONCOLON_2 = REGISTRY.register("ironcolon_2", () -> new Ironcolon2Block());
	public static final RegistryObject<Block> GOLDCOLON_1 = REGISTRY.register("goldcolon_1", () -> new Goldcolon1Block());
	public static final RegistryObject<Block> GOLDCOLON = REGISTRY.register("goldcolon", () -> new GoldcolonBlock());
}
