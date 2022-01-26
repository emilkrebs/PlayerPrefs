package org.qeston.changecolor.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.qeston.playerprefs.utils.PlayerPrefs;

public class ColorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String arg, String[] args) {
        if (sender instanceof Player)
        {
            Player player = (Player) sender;
            if(ChatColor.getByChar(args[0]).isColor())
            {
                PlayerPrefs.set(player, "color", ChatColor.getByChar(args[0]));
                player.setDisplayName(PlayerPrefs.get(player, "color") + player.getName());
                sender.sendMessage(color("&7[&eColor&7] &a your color is now " +  PlayerPrefs.getString(player, "color")));
            }
            else{
                sender.sendMessage(color("&7[&eColor&7] &4 color does not exist: &e" +  args[0]));
            }
        }
        return false;
    }

    public String color(String message){
        return ChatColor.translateAlternateColorCodes('&', message);
    }

}
