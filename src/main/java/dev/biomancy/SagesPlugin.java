package dev.biomancy;

import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.server.core.util.Config;
import dev.biomancy.commands.DebugCommand;
//import dev.biomancy.config.ExampleConfig;
import dev.biomancy.events.SagesEvent;

import javax.annotation.Nonnull;

public class SagesPlugin extends JavaPlugin {

    // private static Config<ExampleConfig> config = null;

    public SagesPlugin(@Nonnull JavaPluginInit init) {
        super(init);
        //config = this.withConfig("sages_config", SagesConfig.CODEC);
    }

    @Override
    protected void setup() {
        //config.save();
        this.getCommandRegistry().registerCommand(new DebugCommand("newSage", "testing a spawn"));
        // if (getConfig().get().isEnabledWelcomeMessage()) {
        //     this.getEventRegistry().registerGlobal(PlayerReadyEvent.class, SageEvent::onPlayerReady);
        // }
        // TODO do we want to make this on a config?
        this.getEventRegistry().registerGlobal(PlayerReadyEvent.class, SagesEvent::onPlayerReady);
    }

    // public static Config<SageConfig> getConfig() {
    //     return config;
    // }
}