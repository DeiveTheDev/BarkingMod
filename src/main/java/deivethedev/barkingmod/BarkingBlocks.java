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

	public static Block<?> woodStripedOak;
	public static Block<?> woodStripedPalm;
	public static Block<?> woodStripedBirch;
	public static Block<?> woodStripedThorn;
	public static Block<?> woodStripedCherry;
	public static Block<?> woodStripedPine;
	public static Block<?> woodStripedOakMossy;
	public static Block<?> woodStripedEucalyptus;

	public static Block<?> logStripedOak;
	public static Block<?> logStripedPalm;
	public static Block<?> logStripedBirch;
	public static Block<?> logStripedThorn;
	public static Block<?> logStripedCherry;
	public static Block<?> logStripedPine;
	public static Block<?> logStripedOakMossy;
	public static Block<?> logStripedEucalyptus;

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

		woodStripedOak = wood_builder.build("wood.striped.oak", "wood_striped_oak", nextID(), b -> new BlockLogicWood(b));
		woodStripedPalm = wood_builder.build("wood.striped.palm", "wood_striped_palm", nextID(), b -> new BlockLogicWood(b));
		woodStripedBirch = wood_builder.build("wood.striped.birch", "wood_striped_birch", nextID(), b -> new BlockLogicWood(b));
		woodStripedThorn = wood_builder.build("wood.striped.thorn", "wood_striped_thorn", nextID(), b -> new BlockLogicWood(b));
		woodStripedCherry = wood_builder.build("wood.striped.cherry", "wood_striped_cherry", nextID(), b -> new BlockLogicWood(b));
		woodStripedPine = wood_builder.build("wood.striped.pine", "wood_striped_pine", nextID(), b -> new BlockLogicWood(b));
		woodStripedOakMossy = wood_builder.build("wood.striped.oak.mossy", "wood_striped_oak_mossy", nextID(), b -> new BlockLogicWood(b));
		woodStripedEucalyptus = wood_builder.build("wood.striped.eucalyptus", "wood_striped_eucalyptus", nextID(), b -> new BlockLogicWood(b));

		logStripedOak = wood_builder.build("log.striped.oak", "log_striped_oak", nextID(), b -> new BlockLogicLog(b));
		logStripedPalm = wood_builder.build("log.striped.palm", "log_striped_palm", nextID(), b -> new BlockLogicLog(b));
		logStripedBirch = wood_builder.build("log.striped.birch", "log_striped_birch", nextID(), b -> new BlockLogicLog(b));
		logStripedThorn = wood_builder.build("log.striped.thorn", "log_striped_thorn", nextID(), b -> new BlockLogicLog(b));
		logStripedCherry = wood_builder.build("log.striped.cherry", "log_striped_cherry", nextID(), b -> new BlockLogicLog(b));
		logStripedPine = wood_builder.build("log.striped.pine", "log_striped_pine", nextID(), b -> new BlockLogicLog(b));
		logStripedOakMossy = wood_builder.build("log.striped.oak.mossy", "log_striped_oak_mossy", nextID(), b -> new BlockLogicLog(b));
		logStripedEucalyptus = wood_builder.build("log.striped.eucalyptus", "log_striped_eucalyptus", nextID(), b -> new BlockLogicLog(b));

		LOGGER.info("Blocks initialized.");
	}
}
