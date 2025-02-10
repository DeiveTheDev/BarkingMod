package deivethedev.barkingmod;

import deivethedev.barkingmod.items.DogFlute;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;

import static deivethedev.barkingmod.BarkingMod.LOGGER;
import static deivethedev.barkingmod.BarkingMod.MOD_ID;

public class BarkingItems {

	private static int startingID = BarkingConfig.CFG.getInt("IDs.startingItemID");
	private static int nextID() {return startingID++;}

	public static ArmorMaterial oakBarkArmor;

	// Declaring items
	public static Item barkOak;
	public static Item barkPalm;
	public static Item barkBirch;
	public static Item barkThorn;
	public static Item barkCherry;
	public static Item barkPine;
	public static Item barkOakMossy;
	public static Item barkEucalyptus;

	public static Item helmetOakBark;
	public static Item chestplateOakBark;
	public static Item leggingsOakBark;
	public static Item bootsOakBark;

	public static Item dogFlute;

	public static void initArmorMaterials() {
		oakBarkArmor = ArmorHelper.createArmorMaterial(MOD_ID, "oak_bark", 30, 20f, 20f, 0f, 20f);
	}

	public static void initItems() {

		dogFlute = new ItemBuilder(MOD_ID)
			.build(new DogFlute("dog_flute", MOD_ID + ":item/dog_flute", nextID()));



		barkOak = new ItemBuilder(MOD_ID)
			.build(new Item("bark.oak", MOD_ID + ":item/bark_oak", nextID()));

		barkPalm = new ItemBuilder(MOD_ID)
			.build(new Item("bark.palm", MOD_ID + ":item/bark_palm", nextID()));

		barkBirch = new ItemBuilder(MOD_ID)
			.build(new Item("bark.birch", MOD_ID + ":item/bark_birch", nextID()));

		barkThorn = new ItemBuilder(MOD_ID)
			.build(new Item("bark.thorn", MOD_ID + ":item/bark_thorn", nextID()));

		barkCherry = new ItemBuilder(MOD_ID)
			.build(new Item("bark.cherry", MOD_ID + ":item/bark_cherry", nextID()));

		barkPine = new ItemBuilder(MOD_ID)
			.build(new Item("bark.pine", MOD_ID + ":item/bark_pine", nextID()));

		barkOakMossy = new ItemBuilder(MOD_ID)
			.build(new Item("bark.oak.mossy", MOD_ID + ":item/bark_oak_mossy", nextID()));

		barkEucalyptus = new ItemBuilder(MOD_ID)
			.build(new Item("bark.eucalyptus", MOD_ID + ":item/bark_eucalyptus", nextID()));


		helmetOakBark = new ItemBuilder(MOD_ID)
			.build(new ItemArmor("oak_bark.helmet", MOD_ID + (":item/oak_bark_helmet"), nextID(), oakBarkArmor, 3));
		chestplateOakBark = new ItemBuilder(MOD_ID)
			.build(new ItemArmor("oak_bark.chestplate", MOD_ID + (":item/oak_bark_chestplate"), nextID(), oakBarkArmor, 2));
		leggingsOakBark = new ItemBuilder(MOD_ID)
			.build(new ItemArmor("oak_bark.leggings", MOD_ID + (":item/oak_bark_leggings"), nextID(), oakBarkArmor, 1));
		bootsOakBark = new ItemBuilder(MOD_ID)
			.build(new ItemArmor("oak_bark.boots", MOD_ID + (":item/oak_bark_boots"), nextID(), oakBarkArmor, 0));

		LOGGER.info("Items initialized.");
	}
}
