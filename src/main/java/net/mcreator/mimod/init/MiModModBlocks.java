
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mimod.block.KsjbdvgiuOreBlock;
import net.mcreator.mimod.block.KsjbdvgiuBlockBlock;
import net.mcreator.mimod.MiModMod;

public class MiModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MiModMod.MODID);
	public static final RegistryObject<Block> KSJBDVGIU_BLOCK = REGISTRY.register("ksjbdvgiu_block", () -> new KsjbdvgiuBlockBlock());
	public static final RegistryObject<Block> KSJBDVGIU_ORE = REGISTRY.register("ksjbdvgiu_ore", () -> new KsjbdvgiuOreBlock());
}
