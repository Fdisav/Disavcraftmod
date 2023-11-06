
package net.mcreator.disavcraftmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.disavcraftmod.init.DisavcraftModItems;

public class LimoniteHoeItem extends HoeItem {
	public LimoniteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 802;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 32;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DisavcraftModItems.LIMONITE_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
