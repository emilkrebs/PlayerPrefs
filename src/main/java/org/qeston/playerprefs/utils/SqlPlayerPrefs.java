package org.qeston.playerprefs.utils;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.qeston.playerprefs.main.Main;

import java.io.File;
import java.io.IOException;
import java.sql.*;

public class SqlPlayerPrefs extends PlayerPrefs  {

    public static String directoryName = "PlayerPrefs";
    private Connection connection;


    private void initDatabase() throws SQLException {
        // create a database connection
        connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);  // set timeout to 30 sec.

        statement.executeUpdate("drop table if exists player");
        statement.executeUpdate("create table player (uuid string)");
        statement.executeUpdate("insert into player values(1, 'leo')");
        statement.executeUpdate("insert into player values(2, 'yui')");
        ResultSet rs = statement.executeQuery("select * from player");

    }
    public static void deleteKey(Player player, String key) {
        set(player, key, null);
    }

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
