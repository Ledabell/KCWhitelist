package com.ledabell.kcwhitelist;

import org.spongepowered.api.Game;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.Server;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;

import static org.spongepowered.api.Sponge.getGame;

@Plugin(id = "exampleplugin", name = "Example Plugin", version = "1.0")
public class KCWhitelist{
    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        Game game = getGame();
        Server server = game.getServer();
        server.setHasWhitelist(true);
    }
}