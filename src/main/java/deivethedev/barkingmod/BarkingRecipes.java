package deivethedev.barkingmod;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static deivethedev.barkingmod.BarkingMod.LOGGER;
import static deivethedev.barkingmod.BarkingMod.MOD_ID;

import static deivethedev.barkingmod.BarkingBlocks.*;
import static deivethedev.barkingmod.BarkingItems.*;

public class BarkingRecipes implements RecipeEntrypoint {

	@Override
	public void onRecipesReady() {

		LookupFuelFurnace.instance.addFuelEntry(barkOak.id, 60);
		LookupFuelFurnace.instance.addFuelEntry(barkPalm.id, 60);
		LookupFuelFurnace.instance.addFuelEntry(barkPine.id, 60);
		LookupFuelFurnace.instance.addFuelEntry(barkBirch.id, 60);
		LookupFuelFurnace.instance.addFuelEntry(barkThorn.id, 60);
		LookupFuelFurnace.instance.addFuelEntry(barkCherry.id, 60);
		LookupFuelFurnace.instance.addFuelEntry(barkOakMossy.id, 60);
		LookupFuelFurnace.instance.addFuelEntry(barkEucalyptus.id, 60);



		RecipeBuilder.getItemGroup(MOD_ID, "barks");
		RecipeBuilder.addItemsToGroup(MOD_ID, "barks", barkOak, barkPalm, barkPine, barkBirch, barkCherry, barkThorn, barkOakMossy, barkEucalyptus);



		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Blocks.LOG_OAK)
			.addInput(Blocks.LOG_OAK)
			.addInput(Blocks.LOG_OAK)
			.create("wood_oak", new ItemStack(woodOak, 2));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(barkOak)
			.addInput(Blocks.LOG_OAK)
			.addInput(barkOak)
			.create("wood_oak", new ItemStack(woodOak, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"B b",
				"BBB",
				"B B")
			.addInput('B', "barkingmod:barks")
			.addInput('b', Items.BONE)
			.create("oak_bark_helmet", new ItemStack(helmetOakBark, 1));



		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BLB")
			.addInput('B', "barkingmod:barks")
			.addInput('L', Items.LEATHER)
			.create("oak_bark_helmet", new ItemStack(helmetOakBark, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BLB",
				"BBB",
				"BBB")
			.addInput('B', "barkingmod:barks")
			.addInput('L', Items.LEATHER)
			.create("oak_bark_chestplate", new ItemStack(chestplateOakBark, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"BBB",
				"BLB",
				"B B")
			.addInput('B', "barkingmod:barks")
			.addInput('L', Items.LEATHER)
			.create("oak_bark_leggings", new ItemStack(leggingsOakBark, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"B B",
				"BLB")
			.addInput('B', "barkingmod:barks")
			.addInput('L', Items.LEATHER)
			.create("oak_bark_boots", new ItemStack(bootsOakBark, 1));



		LOGGER.info("Recipes initialized.");
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}

}
