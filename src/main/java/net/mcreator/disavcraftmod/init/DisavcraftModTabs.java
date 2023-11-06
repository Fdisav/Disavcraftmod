
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.disavcraftmod.DisavcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DisavcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DisavcraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> BLOCKS = REGISTRY.register("blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.disavcraft.blocks")).icon(() -> new ItemStack(DisavcraftModItems.TILESBASE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DisavcraftModItems.TILESBASE.get());
				tabData.accept(DisavcraftModBlocks.COALTILESBLOCK.get().asItem());
				tabData.accept(DisavcraftModBlocks.IRONTILESBLOCK.get().asItem());
				tabData.accept(DisavcraftModBlocks.GOLDTILESBLOCK.get().asItem());
				tabData.accept(DisavcraftModBlocks.EMERALDTILESBLOCK.get().asItem());
				tabData.accept(DisavcraftModBlocks.DIAMONDTILESBLOCK.get().asItem());
				tabData.accept(DisavcraftModBlocks.NETHERITETILESBLOCK.get().asItem());
				tabData.accept(DisavcraftModBlocks.SEQUOIA_WOOD.get().asItem());
				tabData.accept(DisavcraftModBlocks.SEQUOIA_LOG.get().asItem());
				tabData.accept(DisavcraftModBlocks.SEQUOIA_PLANKS.get().asItem());
				tabData.accept(DisavcraftModBlocks.SEQUOIA_STAIRS.get().asItem());
				tabData.accept(DisavcraftModBlocks.SEQUOIA_SLAB.get().asItem());
				tabData.accept(DisavcraftModBlocks.SEQUOIA_BUTTON.get().asItem());
				tabData.accept(DisavcraftModBlocks.SEQUOIADOOR.get().asItem());
				tabData.accept(DisavcraftModBlocks.SEQUOIATRAPDOOR.get().asItem());
				tabData.accept(DisavcraftModBlocks.RUBYTILESBLOCK.get().asItem());
				tabData.accept(DisavcraftModBlocks.IRONDIVISOR.get().asItem());
				tabData.accept(DisavcraftModBlocks.GOLDDIVISORIUM.get().asItem());
				tabData.accept(DisavcraftModBlocks.GOLDDIVISORIUM_2.get().asItem());
				tabData.accept(DisavcraftModBlocks.IRONCOLON.get().asItem());
				tabData.accept(DisavcraftModBlocks.IRONCOLON_1.get().asItem());
				tabData.accept(DisavcraftModBlocks.IRONCOLON_2.get().asItem());
				tabData.accept(DisavcraftModBlocks.GOLDCOLON_1.get().asItem());
				tabData.accept(DisavcraftModBlocks.GOLDCOLON.get().asItem());
				tabData.accept(DisavcraftModBlocks.LIMONITE_ORE.get().asItem());
				tabData.accept(DisavcraftModBlocks.LIMONITE_BLOCK.get().asItem());
				tabData.accept(DisavcraftModBlocks.BLUE_STONE_ORE.get().asItem());
				tabData.accept(DisavcraftModBlocks.BLUE_STONE_BLOCK.get().asItem());
				tabData.accept(DisavcraftModItems.LIMONITE_INGOT.get());
				tabData.accept(DisavcraftModItems.BLUE_STONE_DUST.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> PIRATETAB = REGISTRY.register("piratetab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.disavcraft.piratetab")).icon(() -> new ItemStack(DisavcraftModItems.HOOK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DisavcraftModItems.HOOK.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> UNIVERSEUPDATE = REGISTRY.register("universeupdate",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.disavcraft.universeupdate")).icon(() -> new ItemStack(DisavcraftModItems.SUN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DisavcraftModBlocks.STURDYWALLVERTICALSTRIPES_1.get().asItem());
				tabData.accept(DisavcraftModBlocks.STURDYWALLVERTICALSTRIPES_2.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(DisavcraftModBlocks.SEQUOIA_FENCE_GATE.get().asItem());
			tabData.accept(DisavcraftModBlocks.SEQUOIA_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(DisavcraftModItems.RUBY_SWORD.get());
			tabData.accept(DisavcraftModItems.RUBY_ARMOR_HELMET.get());
			tabData.accept(DisavcraftModItems.RUBY_ARMOR_CHESTPLATE.get());
			tabData.accept(DisavcraftModItems.RUBY_ARMOR_LEGGINGS.get());
			tabData.accept(DisavcraftModItems.RUBY_ARMOR_BOOTS.get());
			tabData.accept(DisavcraftModItems.LIMONITE_SWORD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(DisavcraftModItems.DIAMONDRAW.get());
			tabData.accept(DisavcraftModItems.RAWRUBY.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(DisavcraftModItems.RUBY_AXE.get());
			tabData.accept(DisavcraftModItems.RUBY_PICKAXE.get());
			tabData.accept(DisavcraftModItems.RUBY_SHOVEL.get());
			tabData.accept(DisavcraftModItems.RUBY_HOE.get());
			tabData.accept(DisavcraftModItems.SUN.get());
			tabData.accept(DisavcraftModItems.EXAPEPEARL.get());
			tabData.accept(DisavcraftModItems.STONEISLANDS.get());
			tabData.accept(DisavcraftModItems.LIMONITE_PICKAXE.get());
			tabData.accept(DisavcraftModItems.LIMONITE_AXE.get());
			tabData.accept(DisavcraftModItems.LIMONITE_SHOVEL.get());
			tabData.accept(DisavcraftModItems.LIMONITE_HOE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(DisavcraftModBlocks.SEQUOIA_LEAVES.get().asItem());
			tabData.accept(DisavcraftModBlocks.SEQUOIA_FENCE.get().asItem());
		}
	}
}
