package net.patpuck.packable;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.patpuck.packable.block.ModBlocks;
import net.patpuck.packable.item.ModItemGroups;
import net.patpuck.packable.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Packable implements ModInitializer {
    public static final String MOD_ID = "packable";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
    }
}