package deivethedev.barkingmod;

import deivethedev.barkingmod.blocks.BlockLogicWood;
import net.minecraft.core.block.*;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;

import static deivethedev.barkingmod.BarkingMod.LOGGER;
import static deivethedev.barkingmod.BarkingMod.MOD_ID;

public class BarkingBlocks {

	// Importing the starting id that we set in TestConfig
	private static int startingID = BarkingConfig.CFG.getInt("IDs.startingBlockID");
	private static int nextID() {return startingID++;}

	// Declaring blocks
	public static Block<?> woodOak;
	public static Block<?> woodPalm;
	public static Block<?> woodBirch;
	public static Block<?> woodThorn;
	public static Block<?> woodCherry;
	public static Block<?> woodPine;
	public static Block<?> woodOakMossy;
	public static Block<?> woodEucalyptus;

	public static Block<?> woodStrippedOak;
	public static Block<?> woodStrippedPalm;
	public static Block<?> woodStrippedBirch;
	public static Block<?> woodStrippedThorn;
	public static Block<?> woodStrippedCherry;
	public static Block<?> woodStrippedPine;
	public static Block<?> woodStrippedOakMossy;
	public static Block<?> woodStrippedEucalyptus;

	public static Block<?> logStrippedOak;
	public static Block<?> logStrippedPalm;
	public static Block<?> logStrippedBirch;
	public static Block<?> logStrippedThorn;
	public static Block<?> logStrippedCherry;
	public static Block<?> logStrippedPine;
	public static Block<?> logStrippedOakMossy;
	public static Block<?> logStrippedEucalyptus;

	public static void initBlocks() {

		BlockBuilder wood_builder = new BlockBuilder(MOD_ID)
			.setBlockSound(BlockSounds.WOOD)
			.setHardness(1.0f)
			.setResistance(1.0f)
			.setLuminance(0)
			.addTags(BlockTags.MINEABLE_BY_AXE);

		woodOak = wood_builder.build("wood.oak", "wood_oak", nextID(), b -> new BlockLogicWood(b));
		woodPalm = wood_builder.build("wood.palm", "wood_palm", nextID(), b -> new BlockLogicWood(b));
		woodBirch = wood_builder.build("wood.birch", "wood_birch", nextID(), b -> new BlockLogicWood(b));
		woodThorn = wood_builder.build("wood.thorn", "wood_thorn", nextID(), b -> new BlockLogicWood(b));
		woodCherry = wood_builder.build("wood.cherry", "wood_cherry", nextID(), b -> new BlockLogicWood(b));
		woodPine = wood_builder.build("wood.pine", "wood_pine", nextID(), b -> new BlockLogicWood(b));
		woodOakMossy = wood_builder.build("wood.oak.mossy", "wood_oak_mossy", nextID(), b -> new BlockLogicWood(b));
		woodEucalyptus = wood_builder.build("wood.eucalyptus", "wood_eucalyptus", nextID(), b -> new BlockLogicWood(b));

		woodStrippedOak = wood_builder.build("wood.stripped.oak", "wood_stripped_oak", nextID(), b -> new BlockLogicWood(b));
		woodStrippedPalm = wood_builder.build("wood.stripped.palm", "wood_stripped_palm", nextID(), b -> new BlockLogicWood(b));
		woodStrippedBirch = wood_builder.build("wood.stripped.birch", "wood_stripped_birch", nextID(), b -> new BlockLogicWood(b));
		woodStrippedThorn = wood_builder.build("wood.stripped.thorn", "wood_stripped_thorn", nextID(), b -> new BlockLogicWood(b));
		woodStrippedCherry = wood_builder.build("wood.stripped.cherry", "wood_stripped_cherry", nextID(), b -> new BlockLogicWood(b));
		woodStrippedPine = wood_builder.build("wood.stripped.pine", "wood_stripped_pine", nextID(), b -> new BlockLogicWood(b));
		woodStrippedOakMossy = wood_builder.build("wood.stripped.oak.mossy", "wood_stripped_oak_mossy", nextID(), b -> new BlockLogicWood(b));
		woodStrippedEucalyptus = wood_builder.build("wood.stripped.eucalyptus", "wood_stripped_eucalyptus", nextID(), b -> new BlockLogicWood(b));

		logStrippedOak = wood_builder.build("log.stripped.oak", "log_stripped_oak", nextID(), b -> new BlockLogicLog(b));
		logStrippedPalm = wood_builder.build("log.stripped.palm", "log_stripped_palm", nextID(), b -> new BlockLogicLog(b));
		logStrippedBirch = wood_builder.build("log.stripped.birch", "log_stripped_birch", nextID(), b -> new BlockLogicLog(b));
		logStrippedThorn = wood_builder.build("log.stripped.thorn", "log_stripped_thorn", nextID(), b -> new BlockLogicLog(b));
		logStrippedCherry = wood_builder.build("log.stripped.cherry", "log_stripped_cherry", nextID(), b -> new BlockLogicLog(b));
		logStrippedPine = wood_builder.build("log.stripped.pine", "log_stripped_pine", nextID(), b -> new BlockLogicLog(b));
		logStrippedOakMossy = wood_builder.build("log.stripped.oak.mossy", "log_stripped_oak_mossy", nextID(), b -> new BlockLogicLog(b));
		logStrippedEucalyptus = wood_builder.build("log.stripped.eucalyptus", "log_stripped_eucalyptus", nextID(), b -> new BlockLogicLog(b));

		LOGGER.info("Blocks initialized.");
	}
}
