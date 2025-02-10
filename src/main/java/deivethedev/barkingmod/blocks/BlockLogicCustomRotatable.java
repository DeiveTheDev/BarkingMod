package deivethedev.barkingmod.blocks;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicAxisAligned;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.enums.PlacementMode;
import net.minecraft.core.util.helper.Axis;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

import org.jetbrains.annotations.NotNull;

import static deivethedev.barkingmod.BarkingMod.LOGGER;

public class BlockLogicCustomRotatable extends BlockLogicAxisAligned {

	public BlockLogicCustomRotatable(Block<?> block, Material material) {
		super(block, material);
	}

	@Override
	public void onBlockPlacedByMob(World world, int x, int y, int z, @NotNull Side side, Mob mob, double xPlaced, double yPlaced) {
		Axis axis = mob.getPlacementDirection(side, PlacementMode.SIDE).getAxis();
		Direction hRotation = mob.getHorizontalPlacementDirection(side);

		if (axis == Axis.X) {
			world.setBlockMetadataWithNotify(x, y, z, 5);
			return;
		}

		if (axis == Axis.Z) {
			world.setBlockMetadataWithNotify(x, y, z, 1);
			return;
		}

		if (axis == Axis.Y) {
			if (hRotation == Direction.NORTH) {
				world.setBlockMetadataWithNotify(x, y, z, 2);
			} else if (hRotation == Direction.EAST) {
				world.setBlockMetadataWithNotify(x, y, z, 3);
			} else if (hRotation == Direction.SOUTH) {
				world.setBlockMetadataWithNotify(x, y, z, 4);
			} else if (hRotation == Direction.WEST) {
				world.setBlockMetadataWithNotify(x, y, z, 0);
			} else {

				LOGGER.error("Invalid horizontal placement direction");
				// default to vertical north, i guess?
				world.setBlockMetadataWithNotify(x, y, z, 3);
			}
		}
	}

	public static Axis metaToAxis(int meta) {
		if (meta == 5) {
			return Axis.X;
		} else {
			return meta == 1 ? Axis.Z : Axis.Y;
		}
	}
}
