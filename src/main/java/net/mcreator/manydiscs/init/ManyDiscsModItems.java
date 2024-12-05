
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.manydiscs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.manydiscs.item.PrecipiceRemixItem;
import net.mcreator.manydiscs.item.DoubleTimeItem;
import net.mcreator.manydiscs.item.DalarnaItem;
import net.mcreator.manydiscs.item.CreatorRemixItem;
import net.mcreator.manydiscs.item.AgileAccelerandoItem;
import net.mcreator.manydiscs.ManyDiscsMod;

public class ManyDiscsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ManyDiscsMod.MODID);
	public static final DeferredItem<Item> CREATOR_REMIX = REGISTRY.register("creator_remix", CreatorRemixItem::new);
	public static final DeferredItem<Item> PRECIPICE_REMIX = REGISTRY.register("precipice_remix", PrecipiceRemixItem::new);
	public static final DeferredItem<Item> DOUBLE_TIME = REGISTRY.register("double_time", DoubleTimeItem::new);
	public static final DeferredItem<Item> AGILE_ACCELERANDO = REGISTRY.register("agile_accelerando", AgileAccelerandoItem::new);
	public static final DeferredItem<Item> DALARNA = REGISTRY.register("dalarna", DalarnaItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
