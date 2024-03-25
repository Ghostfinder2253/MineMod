
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mimod.MiModMod;

public class MiModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MiModMod.MODID);
	public static final RegistryObject<CreativeModeTab> MIMOD = REGISTRY.register("mimod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mi_mod.mimod")).icon(() -> new ItemStack(MiModModItems.MAGMATICCOAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MiModModItems.MAGMATICCOAL.get());
				tabData.accept(MiModModItems.MAGMATICAL_ARMOR_HELMET.get());
				tabData.accept(MiModModItems.MAGMATICAL_ARMOR_CHESTPLATE.get());
				tabData.accept(MiModModItems.MAGMATICAL_ARMOR_LEGGINGS.get());
				tabData.accept(MiModModItems.MAGMATICAL_ARMOR_BOOTS.get());
				tabData.accept(MiModModItems.MAGMATIC_TOOLS_PICKAXE.get());
				tabData.accept(MiModModItems.AMAT.get());
				tabData.accept(MiModModBlocks.AMATISTITA_ORE.get().asItem());
			}).withSearchBar().build());
}
