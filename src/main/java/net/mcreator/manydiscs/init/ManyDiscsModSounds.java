
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.manydiscs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.manydiscs.ManyDiscsMod;

public class ManyDiscsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, ManyDiscsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> CREATOR_REMIX = REGISTRY.register("creator_remix", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("many_discs", "creator_remix")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PRECIPICE_REMIX = REGISTRY.register("precipice_remix", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("many_discs", "precipice_remix")));
	public static final DeferredHolder<SoundEvent, SoundEvent> AGILE_ACCELERANDO = REGISTRY.register("agile_accelerando", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("many_discs", "agile_accelerando")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DOUBLE_TIME = REGISTRY.register("double_time", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("many_discs", "double_time")));
}
