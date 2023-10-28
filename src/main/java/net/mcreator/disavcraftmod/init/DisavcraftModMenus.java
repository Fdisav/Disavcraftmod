
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.disavcraftmod.world.inventory.PoketMenu;
import net.mcreator.disavcraftmod.DisavcraftMod;

public class DisavcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DisavcraftMod.MODID);
	public static final RegistryObject<MenuType<PoketMenu>> POKET = REGISTRY.register("poket", () -> IForgeMenuType.create(PoketMenu::new));
}
