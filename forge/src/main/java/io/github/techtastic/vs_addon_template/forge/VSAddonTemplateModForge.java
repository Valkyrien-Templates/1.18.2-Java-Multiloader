package io.github.techtastic.vs_addon_template.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.techtastic.vs_addon_template.VSAddonTemplateMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(VSAddonTemplateMod.MOD_ID)
public class VSAddonTemplateModForge {
    public VSAddonTemplateModForge() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        EventBuses.registerModEventBus(VSAddonTemplateMod.MOD_ID, bus);

        bus.addListener(this::clientSetup);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        VSAddonTemplateMod.initClient();
    }
}
