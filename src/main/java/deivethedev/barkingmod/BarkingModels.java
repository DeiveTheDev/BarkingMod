package deivethedev.barkingmod;

import deivethedev.barkingmod.blocks.BlockModelCustomRotatable;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;

import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.block.BlockLogicMotionSensor;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static deivethedev.barkingmod.BarkingMod.MOD_ID;
import static deivethedev.barkingmod.BarkingMod.LOGGER;

// Importing blocks and items

import static deivethedev.barkingmod.BarkingBlocks.*;
import static deivethedev.barkingmod.BarkingItems.*;

public class BarkingModels implements ModelEntrypoint {

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {

		ModelHelper.setBlockModel(woodOak, () -> new BlockModelCustomRotatable<>(woodOak, woodOak.namespaceId().toString())
		);

		ModelHelper.setBlockModel(woodPalm, () -> new BlockModelCustomRotatable<>(woodPalm, woodPalm.namespaceId().toString())
		);

		ModelHelper.setBlockModel(woodThorn, () -> new BlockModelCustomRotatable<>(woodThorn, woodThorn.namespaceId().toString())
		);

		ModelHelper.setBlockModel(woodBirch, () -> new BlockModelCustomRotatable<>(woodBirch, woodBirch.namespaceId().toString())
		);

		ModelHelper.setBlockModel(woodCherry, () -> new BlockModelCustomRotatable<>(woodCherry, woodCherry.namespaceId().toString())
		);

		ModelHelper.setBlockModel(woodPine, () -> new BlockModelCustomRotatable<>(woodPine, woodPine.namespaceId().toString())
		);

		ModelHelper.setBlockModel(woodOakMossy, () -> new BlockModelCustomRotatable<>(woodOakMossy, woodOakMossy.namespaceId().toString())
		);

		ModelHelper.setBlockModel(woodEucalyptus, () -> new BlockModelCustomRotatable<>(woodEucalyptus, woodEucalyptus.namespaceId().toString())
		);

		ModelHelper.setBlockModel(woodStrippedOak, () -> new BlockModelCustomRotatable<>(woodStrippedOak, MOD_ID + ":block/stripped_oak_side")
		);

		ModelHelper.setBlockModel(woodStrippedPalm, () -> new BlockModelCustomRotatable<>(woodStrippedPalm, MOD_ID + ":block/stripped_palm_side")
		);

		ModelHelper.setBlockModel(woodStrippedBirch, () -> new BlockModelCustomRotatable<>(woodStrippedBirch, MOD_ID + ":block/stripped_birch_side")
		);

		ModelHelper.setBlockModel(woodStrippedThorn, () -> new BlockModelCustomRotatable<>(woodStrippedThorn, MOD_ID + ":block/stripped_thorn_side")
		);

		ModelHelper.setBlockModel(woodStrippedCherry, () -> new BlockModelCustomRotatable<>(woodStrippedCherry, MOD_ID + ":block/stripped_cherry_side")
		);

		ModelHelper.setBlockModel(woodStrippedPine, () -> new BlockModelCustomRotatable<>(woodStrippedPine, MOD_ID + ":block/stripped_pine_side")
		);

		ModelHelper.setBlockModel(woodStrippedOakMossy, () -> new BlockModelCustomRotatable<>(woodStrippedOakMossy, MOD_ID + ":block/stripped_oak_mossy_side")
		);

		ModelHelper.setBlockModel(woodStrippedEucalyptus, () -> new BlockModelCustomRotatable<>(woodStrippedEucalyptus, MOD_ID + ":block/stripped_eucalyptus_side")
		);

		ModelHelper.setBlockModel(logStrippedOak, () -> new BlockModelAxisAligned<>(logStrippedOak)
			.setTex(0, MOD_ID + ":block/stripped_oak_top", Side.TOP, Side.BOTTOM)
			.setTex(0, MOD_ID + ":block/stripped_oak_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
		);

		ModelHelper.setBlockModel(logStrippedPalm, () -> new BlockModelAxisAligned<>(logStrippedPalm)
			.setTex(0, MOD_ID + ":block/stripped_palm_top", Side.TOP, Side.BOTTOM)
			.setTex(0, MOD_ID + ":block/stripped_palm_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
		);

		ModelHelper.setBlockModel(logStrippedBirch, () -> new BlockModelAxisAligned<>(logStrippedBirch)
			.setTex(0, MOD_ID + ":block/stripped_birch_top", Side.TOP, Side.BOTTOM)
			.setTex(0, MOD_ID + ":block/stripped_birch_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
		);

		ModelHelper.setBlockModel(logStrippedThorn, () -> new BlockModelAxisAligned<>(logStrippedThorn)
			.setTex(0, MOD_ID + ":block/stripped_thorn_top", Side.TOP, Side.BOTTOM)
			.setTex(0, MOD_ID + ":block/stripped_thorn_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
		);

		ModelHelper.setBlockModel(logStrippedCherry, () -> new BlockModelAxisAligned<>(logStrippedCherry)
			.setTex(0, MOD_ID + ":block/stripped_cherry_top", Side.TOP, Side.BOTTOM)
			.setTex(0, MOD_ID + ":block/stripped_cherry_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
		);

		ModelHelper.setBlockModel(logStrippedPine, () -> new BlockModelAxisAligned<>(logStrippedPine)
			.setTex(0, MOD_ID + ":block/stripped_pine_top", Side.TOP, Side.BOTTOM)
			.setTex(0, MOD_ID + ":block/stripped_pine_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
		);

		ModelHelper.setBlockModel(logStrippedOakMossy, () -> new BlockModelAxisAligned<>(logStrippedOakMossy)
			.setTex(0, MOD_ID + ":block/stripped_oak_mossy_top", Side.TOP, Side.BOTTOM)
			.setTex(0, MOD_ID + ":block/stripped_oak_mossy_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
		);

		ModelHelper.setBlockModel(logStrippedEucalyptus, () -> new BlockModelAxisAligned<>(logStrippedEucalyptus)
			.setTex(0, MOD_ID + ":block/stripped_eucalyptus_top", Side.TOP, Side.BOTTOM)
			.setTex(0, MOD_ID + ":block/stripped_eucalyptus_side", Side.NORTH, Side.SOUTH, Side.EAST, Side.WEST)
		);


		LOGGER.info("Block Models initialized.");
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {

		ModelHelper.setItemModel(dogFlute, () -> {
			ItemModelStandard model = new ItemModelStandard(dogFlute, MOD_ID);
			model.icon = TextureRegistry.getTexture(dogFlute.namespaceID);
			return model;
		});



		ModelHelper.setItemModel(barkOak, () -> {
			ItemModelStandard model = new ItemModelStandard(barkOak, MOD_ID);
			model.icon = TextureRegistry.getTexture(barkOak.namespaceID);
			return model;
		});

		ModelHelper.setItemModel(barkPalm, () -> {
			ItemModelStandard model = new ItemModelStandard(barkPalm, MOD_ID);
			model.icon = TextureRegistry.getTexture(barkPalm.namespaceID);
			return model;
		});

		ModelHelper.setItemModel(barkBirch, () -> {
			ItemModelStandard model = new ItemModelStandard(barkBirch, MOD_ID);
			model.icon = TextureRegistry.getTexture(barkBirch.namespaceID);
			return model;
		});

		ModelHelper.setItemModel(barkThorn, () -> {
			ItemModelStandard model = new ItemModelStandard(barkThorn, MOD_ID);
			model.icon = TextureRegistry.getTexture(barkThorn.namespaceID);
			return model;
		});

		ModelHelper.setItemModel(barkCherry, () -> {
			ItemModelStandard model = new ItemModelStandard(barkCherry, MOD_ID);
			model.icon = TextureRegistry.getTexture(barkCherry.namespaceID);
			return model;
		});

		ModelHelper.setItemModel(barkPine, () -> {
			ItemModelStandard model = new ItemModelStandard(barkPine, MOD_ID);
			model.icon = TextureRegistry.getTexture(barkPine.namespaceID);
			return model;
		});

		ModelHelper.setItemModel(barkOakMossy, () -> {
			ItemModelStandard model = new ItemModelStandard(barkOakMossy, MOD_ID);
			model.icon = TextureRegistry.getTexture(barkOakMossy.namespaceID);
			return model;
		});

		ModelHelper.setItemModel(barkEucalyptus, () -> {
			ItemModelStandard model = new ItemModelStandard(barkEucalyptus, MOD_ID);
			model.icon = TextureRegistry.getTexture(barkEucalyptus.namespaceID);
			return model;
		});





		ModelHelper.setItemModel(helmetOakBark, () -> {
			ItemModelStandard model = new ItemModelStandard(helmetOakBark, MOD_ID);
			model.icon = TextureRegistry.getTexture(helmetOakBark.namespaceID);
			return model;
		});

		ModelHelper.setItemModel(chestplateOakBark, () -> {
			ItemModelStandard model = new ItemModelStandard(chestplateOakBark, MOD_ID);
			model.icon = TextureRegistry.getTexture(chestplateOakBark.namespaceID);
			return model;
		});

		ModelHelper.setItemModel(leggingsOakBark, () -> {
			ItemModelStandard model = new ItemModelStandard(leggingsOakBark, MOD_ID);
			model.icon = TextureRegistry.getTexture(leggingsOakBark.namespaceID);
			return model;
		});

		ModelHelper.setItemModel(bootsOakBark, () -> {
			ItemModelStandard model = new ItemModelStandard(bootsOakBark, MOD_ID);
			model.icon = TextureRegistry.getTexture(bootsOakBark.namespaceID);
			return model;
		});

		LOGGER.info("Item Models initialized.");
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {}
}
