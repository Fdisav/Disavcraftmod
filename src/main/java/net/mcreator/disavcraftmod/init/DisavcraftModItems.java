
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.disavcraftmod.item.TilesbaseItem;
import net.mcreator.disavcraftmod.item.RubySwordItem;
import net.mcreator.disavcraftmod.item.RubyShovelItem;
import net.mcreator.disavcraftmod.item.RubyPickaxeItem;
import net.mcreator.disavcraftmod.item.RubyItem;
import net.mcreator.disavcraftmod.item.RubyHoeItem;
import net.mcreator.disavcraftmod.item.RubyAxeItem;
import net.mcreator.disavcraftmod.item.RubyArmorItem;
import net.mcreator.disavcraftmod.item.RawrubyItem;
import net.mcreator.disavcraftmod.item.DiamondrawItem;
import net.mcreator.disavcraftmod.DisavcraftMod;

public class DisavcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DisavcraftMod.MODID);
	public static final RegistryObject<Item> RUBY_BLOCK = block(DisavcraftModBlocks.RUBY_BLOCK);
	public static final RegistryObject<Item> RUBY_ORE = block(DisavcraftModBlocks.RUBY_ORE);
	public static final RegistryObject<Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final RegistryObject<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", () -> new RubyPickaxeItem());
	public static final RegistryObject<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", () -> new RubySwordItem());
	public static final RegistryObject<Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", () -> new RubyShovelItem());
	public static final RegistryObject<Item> RUBY_HOE = REGISTRY.register("ruby_hoe", () -> new RubyHoeItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_ARMOR_HELMET = REGISTRY.register("ruby_armor_helmet", () -> new RubyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_chestplate", () -> new RubyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_leggings", () -> new RubyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOR_BOOTS = REGISTRY.register("ruby_armor_boots", () -> new RubyArmorItem.Boots());
	public static final RegistryObject<Item> DIAMONDTILESBLOCK = block(DisavcraftModBlocks.DIAMONDTILESBLOCK);
	public static final RegistryObject<Item> TILESBASE = REGISTRY.register("tilesbase", () -> new TilesbaseItem());
	public static final RegistryObject<Item> GOLDTILESBLOCK = block(DisavcraftModBlocks.GOLDTILESBLOCK);
	public static final RegistryObject<Item> DIAMONDRAW = REGISTRY.register("diamondraw", () -> new DiamondrawItem());
	public static final RegistryObject<Item> RAWRUBY = REGISTRY.register("rawruby", () -> new RawrubyItem());
	public static final RegistryObject<Item> REDPILLAR = block(DisavcraftModBlocks.REDPILLAR);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
