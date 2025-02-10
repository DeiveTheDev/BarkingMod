package deivethedev.barkingmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;

public class BarkingMod implements ModInitializer, GameStartEntrypoint {
    public static final String MOD_ID = "barkingmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//	change implementation("turniplabs:halplibe:${project.halplibe_version}") to modImplementation("turniplabs:halplibe:${project.halplibe_version}")

    @Override
    public void onInitialize() {
		BarkingBlocks.initBlocks();
		BarkingItems.initArmorMaterials();
		BarkingItems.initItems();
        LOGGER.info("BarkingMod initialized.");
    }

	@Override
	public void beforeGameStart() {
		new BarkingModels();
	}

	@Override
	public void afterGameStart() {

	}
}
