package org.qeston.playerprefs.utils;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.qeston.playerprefs.main.Main;

import java.io.File;
import java.io.IOException;

public class PlayerPrefs {

    public static String directoryName = "PlayerPrefs";

    public static void setInt(Player player, String key, Integer value) {
        set(player, key, value);
    }

    public static Integer getInt(Player player, String key) {
        return (Integer) get(player, key);
    }

    public static boolean hasKey(Player player, String key){
        return get(player, key) != null;
    }
    public static void set(Player player, String key, Object value) {
        File path = new File(Main.instance.getDataFolder() + File.separator + directoryName, player.getUniqueId() + ".yml");
        YamlConfiguration file = YamlConfiguration.loadConfiguration(path);
        file.set(key, value);
        try {
            file.save(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object get(Player player, String key) {
        File path = new File(Main.instance.getDataFolder() + File.separator + directoryName, player.getUniqueId() + ".yml");
        YamlConfiguration file = YamlConfiguration.loadConfiguration(path);
        return file.get(key);
    }
}
