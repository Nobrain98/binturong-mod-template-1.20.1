package net.nobrain98.binturong;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinturongMod implements ModInitializer {
	public static final String MOD_ID = "binturongmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Binturongs Online!");
	}
}