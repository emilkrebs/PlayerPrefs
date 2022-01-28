package org.qeston.playerprefs.main;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.qeston.playerprefs.utils.DefaultPlayerPrefs;
import org.qeston.playerprefs.utils.PlayerPrefs;

public final class Main extends JavaPlugin {

    public static Plugin instance;

    @Override
    public void onEnable() {
        instance = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
