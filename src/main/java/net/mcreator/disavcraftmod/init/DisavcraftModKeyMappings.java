
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disavcraftmod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.disavcraftmod.network.OpenpocketsMessage;
import net.mcreator.disavcraftmod.DisavcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DisavcraftModKeyMappings {
	public static final KeyMapping OPENPOCKETS = new KeyMapping("key.disavcraft.openpockets", GLFW.GLFW_KEY_F1, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				DisavcraftMod.PACKET_HANDLER.sendToServer(new OpenpocketsMessage(0, 0));
				OpenpocketsMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(OPENPOCKETS);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				OPENPOCKETS.consumeClick();
			}
		}
	}
}
