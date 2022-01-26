package org.qeston.changecolor.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.qeston.playerprefs.utils.PlayerPrefs;

public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if(PlayerPrefs.hasKey(player,"color")) player.setDisplayName((String) PlayerPrefs.get(player, "color"));

    }
}
