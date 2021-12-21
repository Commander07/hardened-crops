package me.commander07.hardenedcrops;

import net.fabricmc.api.ModInitializer;

public class HardenedCrops implements ModInitializer {

    @Override
    public void onInitialize() {
        SimpleConfig CONFIG = SimpleConfig.of("hardened-crops").provider(this::defaultConfig).request();
    }

    private String defaultConfig(String filename) {
        return "# Hardened Crops Config\nheight=1";
    }
}
