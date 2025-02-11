package deivethedev.barkingmod.items;

import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.sound.SoundCategory;
import net.minecraft.core.world.World;

public class DogFlute extends Item {

	public DogFlute(String translationKey, String namespaceId, int id) {
		super(translationKey, namespaceId, id);
		maxStackSize = 1;
	}

	@Override
	public ItemStack onUseItem(ItemStack itemstack, World world, Player entityplayer) {
		for (Player player : world.players) {
			world.playSoundEffect(player, SoundCategory.WORLD_SOUNDS, entityplayer.x, entityplayer.y, entityplayer.z, "mob.wolf.bark", 1, 1);
		}
		return itemstack;
	}
}
