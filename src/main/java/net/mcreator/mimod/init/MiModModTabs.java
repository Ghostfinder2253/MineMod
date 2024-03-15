
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mimod.MiModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MiModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MiModMod.MODID);
	public static final RegistryObject<CreativeModeTab> MIMOD = REGISTRY.register("mimod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mi_mod.mimod")).icon(() -> new ItemStack(MiModModItems.MAGMATICCOAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MiModModItems.MAGMATICCOAL.get());
				tabData.accept(MiModModItems.MAGMATICAL_ARMOR_HELMET.get());
				tabData.accept(MiModModItems.MAGMATICAL_ARMOR_CHESTPLATE.get());
				tabData.accept(MiModModItems.MAGMATICAL_ARMOR_LEGGINGS.get());
				tabData.accept(MiModModItems.MAGMATICAL_ARMOR_BOOTS.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MiModModBlocks.KSJBDVGIU_BLOCK.get().asItem());
			tabData.accept(MiModModBlocks.KSJBDVGIU_ORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MiModModItems.KSJBDVGIU.get());
		}
	}
}
