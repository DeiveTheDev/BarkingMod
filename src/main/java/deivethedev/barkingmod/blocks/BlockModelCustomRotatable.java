package deivethedev.barkingmod.blocks;

import net.minecraft.client.render.block.model.BlockModelAxisAligned;
import net.minecraft.client.render.tessellator.Tessellator;
import net.minecraft.core.block.Block;
import net.minecraft.client.render.texture.stitcher.IconCoordinate;
import net.minecraft.core.block.BlockLogic;
import net.minecraft.core.util.helper.Axis;
import net.minecraft.core.util.helper.Side;


import net.minecraft.client.render.texture.stitcher.TextureRegistry;

//BlockModelFullyRotatable

public class BlockModelCustomRotatable<T extends BlockLogic> extends BlockModelAxisAligned<T> {

	public IconCoordinate[] textures = new IconCoordinate[2];

	public BlockModelCustomRotatable(Block<T> b,  String texture) {
		super(b);
		textures[0] =  TextureRegistry.getTexture(texture);
	}

	public BlockModelCustomRotatable(Block<T> b,  String cap_texture, String side_texture) {
		super(b);
		textures[0] =  TextureRegistry.getTexture(cap_texture);
		textures[1] =  TextureRegistry.getTexture(side_texture);
	}

	public boolean render(Tessellator tessellator, int x, int y, int z) {
		int meta = renderBlocks.blockAccess.getBlockMetadata(x, y, z);
		Axis axis = BlockLogicCustomRotatable.metaToAxis(meta);
		switch (axis) {
			case Y:
				if (meta == 2) {
					renderBlocks.uvRotateTop = 0;
					renderBlocks.uvRotateBottom = 0;
					break;
				} else if (meta == 3) {
					renderBlocks.uvRotateTop = 1;
					renderBlocks.uvRotateBottom = 2;
					break;
				} else if (meta == 4) {
					renderBlocks.uvRotateTop = 3;
					renderBlocks.uvRotateBottom = 3;
					break;
				} else if (meta == 0){
					renderBlocks.uvRotateTop = 2;
					renderBlocks.uvRotateBottom = 1;
					break;
				}
				break;
			case Z:
				renderBlocks.uvRotateSouth = 1;
				renderBlocks.uvRotateNorth = 1;
				break;
			case X:
				renderBlocks.uvRotateEast = 1;
				renderBlocks.uvRotateWest = 1;
				renderBlocks.uvRotateTop = 1;
				renderBlocks.uvRotateBottom = 1;
				break;
		}
		this.renderStandardBlock(tessellator, this.block.getBlockBoundsFromState(renderBlocks.blockAccess, x, y, z), x, y, z);
		this.resetRenderBlocks();
		return true;
	}

	@Override
	public IconCoordinate getBlockTextureFromSideAndMetadata(Side side, int metadata) {
		if (metadata == 5) {
			// metadata 5 indicates aligned along z axis (east-west)
			if (side == Side.EAST || side == Side.WEST)
				return textures[0];

			if (textures[1] != null){
				return textures[1];
			}
			return textures[0];

		} else if (metadata == 1) {
			// metadata 1 indicates aligned along x axis (north-south)
			if (side == Side.NORTH || side == Side.SOUTH)
				return textures[0];

			if (textures[1] != null){
				return textures[1];
			}
			return textures[0];
		}

		//otherwise, we are placed vertically.
		if (!(side == Side.TOP || side == Side.BOTTOM)) {
			if (textures[1] != null){
				return textures[1];
			}
			return textures[0];
		}
		return textures[0];
	}
}
