package io.github.techtastic.vs_addon_template.fabric;

import io.github.techtastic.vs_addon_template.VSAddonTemplateMod;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import org.valkyrienskies.mod.fabric.common.ValkyrienSkiesModFabric;

public class VSAddonTemplateModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // force VS2 to load before eureka
        new ValkyrienSkiesModFabric().onInitialize();

        VSAddonTemplateMod.init();
    }

    @Environment(EnvType.CLIENT)
    public static class Client implements ClientModInitializer {
        @Override
        public void onInitializeClient() {
            VSAddonTemplateMod.initClient();
        }
    }
}
