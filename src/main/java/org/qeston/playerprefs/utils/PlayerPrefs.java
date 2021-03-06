package org.qeston.playerprefs.utils;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.qeston.playerprefs.main.Main;

import java.io.File;
import java.io.IOException;

public class PlayerPrefs {

    public static String directoryName = "PlayerPrefs";

    /**
     * Set the value of the key in the player's preference file as string
     * @param player
     * @param key Key of the preference
     * @param value Value you want to assign the key as string
     */
    public static void setString(Player player, String key, String value) {
        set(player, key, value);
    }

    /**
     * Get the value of the key in the player's preference file as string
     * @param player
     * @param key Key of the preference
     * @return The value of the key in the player's preference file as string
     */
    public static String getString(Player player, String key) {
        return (String) get(player, key);
    }

    /**
     * Set the value of the key in the player's preference file as boolean
     * @param player
     * @param key Key of the preference
     * @param value Value you want to assign the key as boolean
     */
    public static void setBoolean(Player player, String key, Boolean value) {
        set(player, key, value);
    }

    /**
     * Get the value of the key in the player's preference file as boolean
     * @param player
     * @param key Key of the preference
     * @return The value of the key in the player's preference file as boolean
     */
    public static Boolean getBoolean(Player player, String key) {
        return (Boolean) get(player, key);
    }

    /**
     * Set the value of the key in the player's preference file as integer
     * @param player
     * @param key Key of the preference
     * @param value Value you want to assign the key as integer
     */
    public static void setInt(Player player, String key, Integer value) {
        set(player, key, value);
    }

    /**
     * Get the value of the key in the player's preference file as integer
     * @param player
     * @param key Key of the preference
     * @return The value of the key in the player's preference file as integer
     */
    public static Integer getInt(Player player, String key) {
        return (Integer) get(player, key);
    }

    /**
     * Set the value of the key in the player's preference file as Float
     * @param player
     * @param key Key of the preference
     * @param value Value you want to assign the key as Float
     */
    public static void setFloat(Player player, String key, Float value) {
        set(player, key, value);
    }

    /**
     * Get the value of the key in the player's preference file as float
     * @param player
     * @param key Key of the preference
     * @return The value of the key in the player's preference file as float
     */
    public static Float getFloat(Player player, String key) {
        return (Float) get(player, key);
    }


    /** Check if the key exists in the player's preference file
     * @param player
     * @param key Key of the reference
     * @return Whenever the key exists or not
     */
    public static boolean hasKey(Player player, String key){
        return get(player, key) != null;
    }

    /**
     * Delete the key in the player's preference file
     * @param player
     * @param key Key of the preference
     */
    public static void deleteKey(Player player, String key) {
       set(player, key, null);
    }


    /**
     * Set the value of the key in the player's preference file
     * @param player
     * @param key Key of the preference
     * @param value Value you want to assign the key
     */
    public static void set(Player player, String key, Object value) {
        YamlConfiguration file = getConfiguration(player);
        file.set(key, value);
        try {
            file.save(getFile(player));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get the value of the key in the player's preference file
     * @param player
     * @param key Key of the preference
     * @return The value of the key in the player's preference file
     */
    public static Object get(Player player, String key) {
        return getConfiguration(player).get(key);
    }

    /**
     * Get the Yaml Configuration for the player
     * @param player
     * @return The Yaml Configuration for the player
     */
    public static YamlConfiguration getConfiguration(Player player){
        return YamlConfiguration.loadConfiguration(getFile(player));
    }

    /**
     * Get the file where all the player preferences for the player are saved.
     * @param player
     * @return The file where all the player preferences fot the player are saved.
     */
    public static File getFile(Player player){
        File path = new File(Main.instance.getDataFolder() + File.separator + directoryName, player.getUniqueId() + ".yml");
        return path;
    }
}
