
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.disavcraftmod.item.TilesbaseItem;
import net.mcreator.disavcraftmod.item.SunItem;
import net.mcreator.disavcraftmod.item.StoneislandsItem;
import net.mcreator.disavcraftmod.item.RubySwordItem;
import net.mcreator.disavcraftmod.item.RubyShovelItem;
import net.mcreator.disavcraftmod.item.RubyPickaxeItem;
import net.mcreator.disavcraftmod.item.RubyItem;
import net.mcreator.disavcraftmod.item.RubyHoeItem;
import net.mcreator.disavcraftmod.item.RubyAxeItem;
import net.mcreator.disavcraftmod.item.RubyArmorItem;
import net.mcreator.disavcraftmod.item.RawrubyItem;
import net.mcreator.disavcraftmod.item.PlasticstickItem;
import net.mcreator.disavcraftmod.item.LimoniteSwordItem;
import net.mcreator.disavcraftmod.item.LimoniteShovelItem;
import net.mcreator.disavcraftmod.item.LimonitePickaxeItem;
import net.mcreator.disavcraftmod.item.LimoniteIngotItem;
import net.mcreator.disavcraftmod.item.LimoniteHoeItem;
import net.mcreator.disavcraftmod.item.LimoniteAxeItem;
import net.mcreator.disavcraftmod.item.HookItem;
import net.mcreator.disavcraftmod.item.ExapepearlItem;
import net.mcreator.disavcraftmod.item.DiamondrawItem;
import net.mcreator.disavcraftmod.item.Blue_stoneDustItem;
import net.mcreator.disavcraftmod.DisavcraftMod;

public class DisavcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DisavcraftMod.MODID);
	public static final RegistryObject<Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final RegistryObject<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", () -> new RubyPickaxeItem());
	public static final RegistryObject<Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", () -> new RubyShovelItem());
	public static final RegistryObject<Item> RUBY_HOE = REGISTRY.register("ruby_hoe", () -> new RubyHoeItem());
	public static final RegistryObject<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", () -> new RubySwordItem());
	public static final RegistryObject<Item> RUBY_ARMOR_HELMET = REGISTRY.register("ruby_armor_helmet", () -> new RubyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_chestplate", () -> new RubyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_leggings", () -> new RubyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOR_BOOTS = REGISTRY.register("ruby_armor_boots", () -> new RubyArmorItem.Boots());
	public static final RegistryObject<Item> TILESBASE = REGISTRY.register("tilesbase", () -> new TilesbaseItem());
	public static final RegistryObject<Item> COALTILESBLOCK = block(DisavcraftModBlocks.COALTILESBLOCK);
	public static final RegistryObject<Item> IRONTILESBLOCK = block(DisavcraftModBlocks.IRONTILESBLOCK);
	public static final RegistryObject<Item> GOLDTILESBLOCK = block(DisavcraftModBlocks.GOLDTILESBLOCK);
	public static final RegistryObject<Item> EMERALDTILESBLOCK = block(DisavcraftModBlocks.EMERALDTILESBLOCK);
	public static final RegistryObject<Item> DIAMONDTILESBLOCK = block(DisavcraftModBlocks.DIAMONDTILESBLOCK);
	public static final RegistryObject<Item> NETHERITETILESBLOCK = block(DisavcraftModBlocks.NETHERITETILESBLOCK);
	public static final RegistryObject<Item> SEQUOIA_WOOD = block(DisavcraftModBlocks.SEQUOIA_WOOD);
	public static final RegistryObject<Item> SEQUOIA_LOG = block(DisavcraftModBlocks.SEQUOIA_LOG);
	public static final RegistryObject<Item> SEQUOIA_PLANKS = block(DisavcraftModBlocks.SEQUOIA_PLANKS);
	public static final RegistryObject<Item> SEQUOIA_STAIRS = block(DisavcraftModBlocks.SEQUOIA_STAIRS);
	public static final RegistryObject<Item> SEQUOIA_SLAB = block(DisavcraftModBlocks.SEQUOIA_SLAB);
	public static final RegistryObject<Item> SEQUOIA_BUTTON = block(DisavcraftModBlocks.SEQUOIA_BUTTON);
	public static final RegistryObject<Item> SEQUOIADOOR = doubleBlock(DisavcraftModBlocks.SEQUOIADOOR);
	public static final RegistryObject<Item> SEQUOIATRAPDOOR = block(DisavcraftModBlocks.SEQUOIATRAPDOOR);
	public static final RegistryObject<Item> DIAMONDRAW = REGISTRY.register("diamondraw", () -> new DiamondrawItem());
	public static final RegistryObject<Item> RAWRUBY = REGISTRY.register("rawruby", () -> new RawrubyItem());
	public static final RegistryObject<Item> HOOK = REGISTRY.register("hook", () -> new HookItem());
	public static final RegistryObject<Item> SEQUOIA_LEAVES = block(DisavcraftModBlocks.SEQUOIA_LEAVES);
	public static final RegistryObject<Item> SEQUOIA_FENCE = block(DisavcraftModBlocks.SEQUOIA_FENCE);
	public static final RegistryObject<Item> SEQUOIA_FENCE_GATE = block(DisavcraftModBlocks.SEQUOIA_FENCE_GATE);
	public static final RegistryObject<Item> SEQUOIA_PRESSURE_PLATE = block(DisavcraftModBlocks.SEQUOIA_PRESSURE_PLATE);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_ORE = block(DisavcraftModBlocks.RUBY_ORE);
	public static final RegistryObject<Item> RUBY_BLOCK = block(DisavcraftModBlocks.RUBY_BLOCK);
	public static final RegistryObject<Item> RUBYTILESBLOCK = block(DisavcraftModBlocks.RUBYTILESBLOCK);
	public static final RegistryObject<Item> SUN = REGISTRY.register("sun", () -> new SunItem());
	public static final RegistryObject<Item> EXAPEPEARL = REGISTRY.register("exapepearl", () -> new ExapepearlItem());
	public static final RegistryObject<Item> STURDYWALLVERTICALSTRIPES_1 = block(DisavcraftModBlocks.STURDYWALLVERTICALSTRIPES_1);
	public static final RegistryObject<Item> STURDYWALLVERTICALSTRIPES_2 = block(DisavcraftModBlocks.STURDYWALLVERTICALSTRIPES_2);
	public static final RegistryObject<Item> IRONDIVISOR = block(DisavcraftModBlocks.IRONDIVISOR);
	public static final RegistryObject<Item> GOLDDIVISORIUM = block(DisavcraftModBlocks.GOLDDIVISORIUM);
	public static final RegistryObject<Item> GOLDDIVISORIUM_2 = block(DisavcraftModBlocks.GOLDDIVISORIUM_2);
	public static final RegistryObject<Item> IRONCOLON = block(DisavcraftModBlocks.IRONCOLON);
	public static final RegistryObject<Item> IRONCOLON_1 = block(DisavcraftModBlocks.IRONCOLON_1);
	public static final RegistryObject<Item> IRONCOLON_2 = block(DisavcraftModBlocks.IRONCOLON_2);
	public static final RegistryObject<Item> GOLDCOLON_1 = block(DisavcraftModBlocks.GOLDCOLON_1);
	public static final RegistryObject<Item> GOLDCOLON = block(DisavcraftModBlocks.GOLDCOLON);
	public static final RegistryObject<Item> PLASTICSTICK = REGISTRY.register("plasticstick", () -> new PlasticstickItem());
	public static final RegistryObject<Item> STONEISLANDS = REGISTRY.register("stoneislands", () -> new StoneislandsItem());
	public static final RegistryObject<Item> LIMONITE_ORE = block(DisavcraftModBlocks.LIMONITE_ORE);
	public static final RegistryObject<Item> LIMONITE_BLOCK = block(DisavcraftModBlocks.LIMONITE_BLOCK);
	public static final RegistryObject<Item> BLUE_STONE_ORE = block(DisavcraftModBlocks.BLUE_STONE_ORE);
	public static final RegistryObject<Item> BLUE_STONE_BLOCK = block(DisavcraftModBlocks.BLUE_STONE_BLOCK);
	public static final RegistryObject<Item> LIMONITE_INGOT = REGISTRY.register("limonite_ingot", () -> new LimoniteIngotItem());
	public static final RegistryObject<Item> BLUE_STONE_DUST = REGISTRY.register("blue_stone_dust", () -> new Blue_stoneDustItem());
	public static final RegistryObject<Item> LIMONITE_PICKAXE = REGISTRY.register("limonite_pickaxe", () -> new LimonitePickaxeItem());
	public static final RegistryObject<Item> LIMONITE_AXE = REGISTRY.register("limonite_axe", () -> new LimoniteAxeItem());
	public static final RegistryObject<Item> LIMONITE_SWORD = REGISTRY.register("limonite_sword", () -> new LimoniteSwordItem());
	public static final RegistryObject<Item> LIMONITE_SHOVEL = REGISTRY.register("limonite_shovel", () -> new LimoniteShovelItem());
	public static final RegistryObject<Item> LIMONITE_HOE = REGISTRY.register("limonite_hoe", () -> new LimoniteHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
