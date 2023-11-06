
package net.mcreator.disavcraftmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LimoniteIngotItem extends Item {
	public LimoniteIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
