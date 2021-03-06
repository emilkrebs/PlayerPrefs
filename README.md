<p align="center">
  <a href="https://github.com/emilkrebs/PlayerPrefs" target="_blank" rel="noopener noreferrer">
    <img width="720" src="https://user-images.githubusercontent.com/68400102/151151267-dd5b6834-dd7c-46f2-b2f3-a56c8f620b49.png" alt="PlayerPrefs logo">
  </a>
</p>
<div id="badges" align="center">
  
   ![Price](https://img.shields.io/badge/price-FREE-34D058)
   [![Build](https://github.com/emilkrebs/PlayerPrefs/actions/workflows/build.yml/badge.svg)](https://github.com/emilkrebs/PlayerPrefs/actions/workflows/build.yml)

</div>
<hr>
<a href="https://www.buymeacoffee.com/emilkrebs" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>

PlayerPrefs is an easy tool to get and set custom preferences for each player and save them in a yaml file.

## Getting started
Download the newest build from [releases](https://github.com/emilkrebs/PlayerPrefs/releases/). Now add the jar file as module to your project.

After that import using:
```Java
import org.qeston.playerprefs.utils.PlayerPrefs;
```

## Examples
Have a look at the [EasyMoneySystem](https://github.com/emilkrebs/EasyMoneySystem) example. 

This code example will count the deaths and kills of a player:
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


## Known Issues

None

[Add Issue](https://github.com/emilkrebs/PlayerPrefs/issues/new)
