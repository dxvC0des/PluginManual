package com.github.dxvc0des.plugin_manual;

import com.github.dxvc0des.plugin_manual.block.ModBlocks;
import com.github.dxvc0des.plugin_manual.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Plugin_manual implements ModInitializer {
	public static final String MOD_ID = "plugin_manual";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}