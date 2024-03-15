
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mimod.item.MagmaticcoalItem;
import net.mcreator.mimod.item.MagmaticalArmorItem;
import net.mcreator.mimod.item.KsjbdvgiuItem;
import net.mcreator.mimod.MiModMod;

public class MiModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MiModMod.MODID);
	public static final RegistryObject<Item> MAGMATICCOAL = REGISTRY.register("magmaticcoal", () -> new MagmaticcoalItem());
	public static final RegistryObject<Item> MAGMATICAL_ARMOR_HELMET = REGISTRY.register("magmatical_armor_helmet", () -> new MagmaticalArmorItem.Helmet());
	public static final RegistryObject<Item> MAGMATICAL_ARMOR_CHESTPLATE = REGISTRY.register("magmatical_armor_chestplate", () -> new MagmaticalArmorItem.Chestplate());
	public static final RegistryObject<Item> MAGMATICAL_ARMOR_LEGGINGS = REGISTRY.register("magmatical_armor_leggings", () -> new MagmaticalArmorItem.Leggings());
	public static final RegistryObject<Item> MAGMATICAL_ARMOR_BOOTS = REGISTRY.register("magmatical_armor_boots", () -> new MagmaticalArmorItem.Boots());
	public static final RegistryObject<Item> KSJBDVGIU_BLOCK = block(MiModModBlocks.KSJBDVGIU_BLOCK);
	public static final RegistryObject<Item> KSJBDVGIU_ORE = block(MiModModBlocks.KSJBDVGIU_ORE);
	public static final RegistryObject<Item> KSJBDVGIU = REGISTRY.register("ksjbdvgiu", () -> new KsjbdvgiuItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
