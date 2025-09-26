/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.radioandrecordmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.radioandrecordmod.block.TestBlock;
import net.mcreator.radioandrecordmod.RadioAndRecordModMod;

public class RadioAndRecordModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RadioAndRecordModMod.MODID);
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}