
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.manydiscs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.manydiscs.ManyDiscsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ManyDiscsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ManyDiscsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(ManyDiscsModItems.CREATOR_REMIX.get());
			tabData.accept(ManyDiscsModItems.PRECIPICE_REMIX.get());
			tabData.accept(ManyDiscsModItems.DOUBLE_TIME.get());
			tabData.accept(ManyDiscsModItems.AGILE_ACCELERANDO.get());
			tabData.accept(ManyDiscsModItems.DALARNA.get());
			tabData.accept(ManyDiscsModItems.A_TIME_OF_LEGENDS.get());

		}
	}
}
