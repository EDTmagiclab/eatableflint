package net.mlrgroup.eatableflint.procedures;

import net.mlrgroup.eatableflint.EatableflintMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

import java.util.Map;

public class EatableFlintWanJiaWanChengShiYongWuPinShiProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				EatableflintMod.LOGGER.warn("Failed to load dependency world for procedure EatableFlintWanJiaWanChengShiYongWuPinShi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EatableflintMod.LOGGER.warn("Failed to load dependency entity for procedure EatableFlintWanJiaWanChengShiYongWuPinShi!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), 4, Explosion.BlockInteraction.NONE);
	}
}
