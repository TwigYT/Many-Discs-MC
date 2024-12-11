
package net.mcreator.manydiscs.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.manydiscs.ManyDiscsMod;

public class ATimeOfLegendsItem extends Item {
	public ATimeOfLegendsItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(ManyDiscsMod.MODID, "a_time_of_legends"))));
	}
}
