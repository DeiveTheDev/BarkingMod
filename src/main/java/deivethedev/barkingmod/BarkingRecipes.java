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

		LookupFuelFurnace.instance.addFuelEntry(woodOak.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodPalm.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodPine.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodBirch.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodThorn.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodCherry.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodOakMossy.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodEucalyptus.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodStrippedOak.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodStrippedPalm.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodStrippedPine.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodStrippedBirch.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodStrippedThorn.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodStrippedCherry.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodStrippedOakMossy.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(woodStrippedEucalyptus.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(logStrippedOak.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(logStrippedPalm.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(logStrippedPine.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(logStrippedBirch.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(logStrippedThorn.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(logStrippedCherry.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(logStrippedOakMossy.id(), 300 );
		LookupFuelFurnace.instance.addFuelEntry(logStrippedEucalyptus.id(), 300 );


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
		RecipeBuilder.addItemsToGroup(MOD_ID, "logs",
			woodOak, woodPalm, woodPine, woodBirch, woodCherry, woodThorn, woodOakMossy, woodEucalyptus,
			woodStrippedOak, woodStrippedPalm, woodStrippedPine, woodStrippedBirch, woodStrippedThorn, woodStrippedCherry, woodStrippedOakMossy, woodStrippedEucalyptus,
			logStrippedOak, logStrippedPalm, logStrippedPine, logStrippedBirch, logStrippedThorn, logStrippedCherry, logStrippedOakMossy, logStrippedEucalyptus
			);

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

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodOak)
			.create("wood_oak_to_planks_oak", new ItemStack(Blocks.PLANKS_OAK, 4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodPalm)
			.create("wood_palm_to_planks_palm", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodPine)
			.create("wood_pine_to_planks_pine", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4,12));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodBirch)
			.create("wood_birch_to_planks_birch", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodCherry)
			.create("wood_cherry_to_planks_cherry", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4,6));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodThorn)
			.create("wood_thorn_to_planks_thorn", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 14));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodOakMossy)
			.create("wood_oak_mossy_to_planks_oak_mossy", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 13));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodEucalyptus)
			.create("wood_eucalyptus_to_planks_eucalyptus", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 1));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodStrippedOak)
			.create("wood_stripped_oak_to_planks_oak", new ItemStack(Blocks.PLANKS_OAK, 4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodStrippedPalm)
			.create("wood_stripped_palm_to_planks_palm", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodStrippedPine)
			.create("wood_stripped_pine_to_planks_pine", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4,12));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodStrippedBirch)
			.create("wood_stripped_birch_to_planks_birch", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodStrippedCherry)
			.create("wood_stripped_cherry_to_planks_cherry", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4,6));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodStrippedThorn)
			.create("wood_stripped_thorn_to_planks_thorn", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 14));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodStrippedOakMossy)
			.create("wood_stripped_oak_mossy_to_planks_oak_mossy", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 13));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(woodStrippedEucalyptus)
			.create("wood_stripped_eucalyptus_to_planks_eucalyptus", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 1));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(logStrippedOak)
			.create("log_stripped_oak_to_planks_oak", new ItemStack(Blocks.PLANKS_OAK, 4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(logStrippedPalm)
			.create("log_stripped_palm_to_planks_palm", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4,4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(logStrippedPine)
			.create("log_stripped_pine_to_planks_pine", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4,12));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(logStrippedBirch)
			.create("log_stripped_birch_to_planks_birch", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(logStrippedCherry)
			.create("log_stripped_cherry_to_planks_cherry", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4,6));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(logStrippedThorn)
			.create("wood_stripped_thorn_to_planks_thorn", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 14));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(logStrippedOakMossy)
			.create("log_stripped_oak_mossy_to_planks_oak_mossy", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 13));

		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(logStrippedEucalyptus)
			.create("log_stripped_eucalyptus_to_planks_eucalyptus", new ItemStack(Blocks.PLANKS_OAK_PAINTED, 4, 1));


		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"D b",
				"BBB",
				"B B")
			.addInput('B', "barkingmod:barks")
			.addInput('D', Items.DIAMOND)
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
