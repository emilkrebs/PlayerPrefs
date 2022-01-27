<p align="center">
  <a href="https://github.com/emilkrebs/PlayerPrefs" target="_blank" rel="noopener noreferrer">
    <img width="720" src="https://user-images.githubusercontent.com/68400102/151151267-dd5b6834-dd7c-46f2-b2f3-a56c8f620b49.png" alt="PlayerPrefs logo">
  </a>
</p>
<div id="badges" align="center">
  
   [![Build](https://github.com/emilkrebs/PlayerPrefs/actions/workflows/build.yml/badge.svg)](https://github.com/emilkrebs/PlayerPrefs/actions/workflows/build.yml)
   [![Tweet](https://img.shields.io/twitter/url/http/shields.io.svg?style=social)](https://twitter.com/intent/tweet?text=PlayerPrefs%20is%20a%20easy%20tool%20to%20set%20preferences%20for%20each%20player%20for%20new%20spigot%20developers.%20%23spigot%20%23minecraft%20%23easy&url=https%3A%2F%2Fgithub.com%2Femilkrebs%2FPlayerPrefs)
</div>
<hr>
<a href="https://www.buymeacoffee.com/emilkrebs" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>

PlayerPrefs is an easy tool to get and set custom preferences for each player and save them in a yaml file.

## Getting started
Add the jar file as external reference to your project.
After that import using:
```Java
import org.qeston.playerprefs.utils.PlayerPrefs;
```

## Examples
Have a look at the [EasyMoneySystem](https://github.com/emilkrebs/EasyMoneySystem) example. 
This will count the deaths and kills of a player.

```Java
@EventHandler
public void onDeath(PlayerDeathEvent event) {
    Player killed = e.getEntity();
    Player killer = killed.getKiller();
    int deaths = PlayerPrefs.getInt(killed, "deaths") + 1;
    int kills = PlayerPrefs.getInt(killer, "kills") + 1;
    PlayerPrefs.setInt(killed, "deaths", deaths);
    PlayerPrefs.setInt(killer, "kills", kills);
}
```


## Methods

| Method        | Description   |
| ------------- |:------------- |
| getConfiguration| Get the Yaml Configuration for the player.                     |
| getFile       | Get the file where all the player preferences for the player are saved. |
| deleteKey     | Delete a key from the player's preference file.                         |
| hasKey        | Check if the key exists in the player's preference file.                |
| set           | Set the value of a single key in the player's preference file as Object.|
| setString     | Set the value of a single key in the player's preference file as string.|
| setInt        | Set the value of a single key in the player's preference file as integer.|
| setFloat      | Set the value of a single key in the player's preference file as float. |
| get           | Get the value of a single key in the player's preference file as Object.|
| getString     | Get the value of a single key in the player's preference file as string.|
| getInt        | Get the value of a single key in the player's preference file as integer.|
| getFloat      | Get the value of a single key in the player's preference file as float. |
