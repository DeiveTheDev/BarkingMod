package deivethedev.barkingmod.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.core.block.*;
import net.minecraft.core.block.entity.TileEntityActivator;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.entity.Entity;
import net.minecraft.core.entity.EntityItem;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemTool;
import net.minecraft.core.item.tool.ItemToolAxe;
import net.minecraft.core.item.tool.ItemToolShears;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.util.collection.NamespaceID;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;

import java.util.Objects;
import java.util.Random;

@Mixin(ItemToolAxe.class)
public abstract class AxeMixin extends ItemTool {

	protected AxeMixin(String name, String namespaceId, int id, int damageDealt, ToolMaterial toolMaterial, Tag<Block<?>> tagEffectiveAgainst) {
		super(name, namespaceId, id, damageDealt, toolMaterial, tagEffectiveAgainst);
	}

	@Override
	public boolean onUseItemOnBlock(ItemStack itemstack, Player entityplayer, World world, int blockX, int blockY, int blockZ, Side side, double xPlaced, double yPlaced) {
		Block<?> block = world.getBlock(blockX, blockY, blockZ);
		String name = Objects.requireNonNull(block).namespaceId().toString();

		if (name.contains("wood") || name.contains("log")) {
			if (!(name.contains("stripped"))) {

				String type = name.contains("wood") ? "wood" : "log";
				String regex = "[/:]";
				String[] words = name.split(regex);
				String mod = words[0];

				if (mod.equals("minecraft")) {
					mod = "barkingmod";
				}

				String species = words[words.length - 1].replaceFirst("wood_","");
				species = species.replaceFirst("log_","");

				Item drop = null;

				drop = Item.itemsMap.get(NamespaceID.getPermanent(mod,"item/bark_" + species));

				if (drop != null) {
					System.out.print(drop.namespaceID);
					int dropQuantity;

					int rand = (int) (Math.random() * 10 + 0.5) ; // Gera um número entre 0 e 9

					if (rand < 2) {
						dropQuantity = 2; // 20% de chance
					} else if (rand < 6) {
						dropQuantity = 3; // 20% de chance
					} else {
						dropQuantity = 4;
					}

					EntityItem item = new EntityItem(world, entityplayer.x, entityplayer.y-1, entityplayer.z, new ItemStack(drop, dropQuantity));
					world.entityJoinedWorld(item);
					for (Player player : world.players) {
						world.playSoundEffect(player, SoundCategory.WORLD_SOUNDS, blockX, blockY, blockZ, "step.wood", 1, 1);
					}

					Block<?> striped;

					striped = Blocks.blockMap.get(NamespaceID.getPermanent(mod, "block/" + type + "_stripped_" + species));

					int meta = world.getBlockMetadata(blockX, blockY, blockZ);

					Minecraft.getMinecraft().particleEngine.destroy(blockX, blockY, blockZ,block.id(),meta);
					world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, striped.id(), meta);

					itemstack.damageItem(1, (Entity) null);
					return true;
				}
			}
		}
		return false;
	}


	@Override
	public void onUseByActivator(ItemStack itemStack, TileEntityActivator activatorBlock, World world, Random random, int blockX, int blockY, int blockZ, double offX, double offY, double offZ, Direction direction) {
		blockX += direction.getOffsetX();
		blockY += direction.getOffsetY();
		blockZ += direction.getOffsetZ();

		Block<?> block = world.getBlock(blockX, blockY, blockZ);

		if (block == null) {
			return;
		}

		String name = Objects.requireNonNull(block).namespaceId().toString();

		System.out.println("1");

		if (name.contains("wood") || name.contains("log")) {
			if (!(name.contains("stripped"))) {

				String type = name.contains("wood") ? "wood" : "log";
				String regex = "[/:]";
				String[] words = name.split(regex);
				String mod = words[0];

				if (mod.equals("minecraft")) {
					mod = "barkingmod";
				}

				String species = words[words.length - 1].replaceFirst("wood_","");
				species = species.replaceFirst("log_","");

				Item drop = null;

				drop = Item.itemsMap.get(NamespaceID.getPermanent(mod,"item/bark_" + species));

				System.out.println("2");

				if (drop != null) {
					System.out.print(drop.namespaceID);
					int dropQuantity;

					int rand = (int) (Math.random() * 10 + 0.5) ; // Gera um número entre 0 e 9

					if (rand < 2) {
						dropQuantity = 2; // 20% de chance
					} else if (rand < 6) {
						dropQuantity = 3; // 20% de chance
					} else {
						dropQuantity = 4;
					}

					EntityItem item = new EntityItem(world, blockX + 0.5, blockY + 0.5, blockZ + 0.5, new ItemStack(drop, dropQuantity));
					world.entityJoinedWorld(item);

					for (Player player : world.players) {
						world.playSoundEffect(player, SoundCategory.WORLD_SOUNDS, blockX, blockY, blockZ, "step.wood", 1, 1);
					}

					Block<?> striped;

					striped = Blocks.blockMap.get(NamespaceID.getPermanent(mod, "block/" + type + "_stripped_" + species));

					int meta = world.getBlockMetadata(blockX, blockY, blockZ);
					System.out.println("3");
					Minecraft.getMinecraft().particleEngine.destroy(blockX, blockY, blockZ, block.id(),meta);
					world.setBlockAndMetadataWithNotify(blockX, blockY, blockZ, striped.id(), meta);

					itemStack.damageItem(1, (Entity) null);
				}
			}
		}
	}

}


