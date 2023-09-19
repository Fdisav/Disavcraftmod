
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.disavcraftmod.DisavcraftmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DisavcraftmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DisavcraftmodMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(DisavcraftmodModItems.RUBY_SWORD.get());
			tabData.accept(DisavcraftmodModItems.RUBY_ARMOR_HELMET.get());
			tabData.accept(DisavcraftmodModItems.RUBY_ARMOR_CHESTPLATE.get());
			tabData.accept(DisavcraftmodModItems.RUBY_ARMOR_LEGGINGS.get());
			tabData.accept(DisavcraftmodModItems.RUBY_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(DisavcraftmodModItems.RUBY_AXE.get());
			tabData.accept(DisavcraftmodModItems.RUBY_PICKAXE.get());
			tabData.accept(DisavcraftmodModItems.RUBY_SHOVEL.get());
			tabData.accept(DisavcraftmodModItems.RUBY_HOE.get());
		}
	}
}
