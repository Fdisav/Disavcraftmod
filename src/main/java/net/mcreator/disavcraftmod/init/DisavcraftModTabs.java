
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
				tabData.accept(DisavcraftModBlocks.DIAMONDTILESBLOCK.get().asItem());
				tabData.accept(DisavcraftModItems.TILESBASE.get());
				tabData.accept(DisavcraftModBlocks.GOLDTILESBLOCK.get().asItem());
				tabData.accept(DisavcraftModBlocks.REDPILLAR.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(DisavcraftModItems.RUBY_SWORD.get());
			tabData.accept(DisavcraftModItems.RUBY_ARMOR_HELMET.get());
			tabData.accept(DisavcraftModItems.RUBY_ARMOR_CHESTPLATE.get());
			tabData.accept(DisavcraftModItems.RUBY_ARMOR_LEGGINGS.get());
			tabData.accept(DisavcraftModItems.RUBY_ARMOR_BOOTS.get());
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
		}
	}
}
