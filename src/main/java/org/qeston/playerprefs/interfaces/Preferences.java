package org.qeston.playerprefs.interfaces;

import org.bukkit.entity.Player;

public interface Preferences {
    boolean hasKey(Player player, String key);
    void deleteKey(Player player, String key);

    Object get(Player player, String key);
    String getString(Player player, String key);
    Integer getInt(Player player, String key);
    Float getFloat(Player player, String key);
    Boolean getBoolean(Player player, String key);

    void set(Player player, String key, Object value);
    void setString(Player player, String key, String value);
    void setInt(Player player, String key, Integer value);
    void setFloat(Player player, String key, Float value);
    void setBoolean(Player player, String key, Boolean value);


}
