package org.qeston.changecolor.main;

import org.bukkit.plugin.java.JavaPlugin;
import org.qeston.changecolor.commands.ColorCommand;
import org.qeston.changecolor.listeners.JoinListener;
import org.qeston.playerprefs.utils.PlayerPrefs;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("color").setExecutor(new ColorCommand());

        getServer().getPluginManager().registerEvents(new JoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
