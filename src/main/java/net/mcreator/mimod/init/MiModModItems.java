
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
import net.mcreator.mimod.item.MagmaticToolsPickaxeItem;
import net.mcreator.mimod.item.AmatItem;
import net.mcreator.mimod.MiModMod;

public class MiModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MiModMod.MODID);
	public static final RegistryObject<Item> MAGMATICCOAL = REGISTRY.register("magmaticcoal", () -> new MagmaticcoalItem());
	public static final RegistryObject<Item> MAGMATICAL_ARMOR_HELMET = REGISTRY.register("magmatical_armor_helmet", () -> new MagmaticalArmorItem.Helmet());
	public static final RegistryObject<Item> MAGMATICAL_ARMOR_CHESTPLATE = REGISTRY.register("magmatical_armor_chestplate", () -> new MagmaticalArmorItem.Chestplate());
	public static final RegistryObject<Item> MAGMATICAL_ARMOR_LEGGINGS = REGISTRY.register("magmatical_armor_leggings", () -> new MagmaticalArmorItem.Leggings());
	public static final RegistryObject<Item> MAGMATICAL_ARMOR_BOOTS = REGISTRY.register("magmatical_armor_boots", () -> new MagmaticalArmorItem.Boots());
	public static final RegistryObject<Item> MAGMATIC_TOOLS_PICKAXE = REGISTRY.register("magmatic_tools_pickaxe", () -> new MagmaticToolsPickaxeItem());
	public static final RegistryObject<Item> AMAT = REGISTRY.register("amat", () -> new AmatItem());
	public static final RegistryObject<Item> AMATISTITA_ORE = block(MiModModBlocks.AMATISTITA_ORE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
