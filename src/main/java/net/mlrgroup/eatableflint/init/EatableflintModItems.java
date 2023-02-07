
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mlrgroup.eatableflint.init;

import net.mlrgroup.eatableflint.item.EatableFlintItem;
import net.mlrgroup.eatableflint.EatableflintMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class EatableflintModItems {
	public static Item EATABLE_FLINT;

	public static void load() {
		EATABLE_FLINT = Registry.register(Registry.ITEM, new ResourceLocation(EatableflintMod.MODID, "eatable_flint"), new EatableFlintItem());
	}
}
