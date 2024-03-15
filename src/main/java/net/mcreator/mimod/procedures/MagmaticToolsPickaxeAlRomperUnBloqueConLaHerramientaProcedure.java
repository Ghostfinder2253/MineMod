package net.mcreator.mimod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.mimod.init.MiModModParticleTypes;

public class MagmaticToolsPickaxeAlRomperUnBloqueConLaHerramientaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (MiModModParticleTypes.MAGMAPARTICLE.get()), x, y, z, 0, 1, 0);
	}
}
