<p align="center">
  <a href="https://github.com/emilkrebs/PlayerPrefs" target="_blank" rel="noopener noreferrer">
    <img width="720" src="https://user-images.githubusercontent.com/68400102/151151267-dd5b6834-dd7c-46f2-b2f3-a56c8f620b49.png" alt="PlayerPrefs logo">
  </a>
</p>
<hr>

PlayerPrefs is a easy tool to get and set custom preferences for each player and save them in a yaml file.

## Getting started
Add the jar file as external reference to your project.
After that import using:
```Java
import org.qeston.playerprefs.utils.PlayerPrefs;
```

## Examples
Have a look at the [examples](https://github.com/emilkrebs/PlayerPrefs/tree/a55e47bceb4eb910cb5c479ec6976a91907ba0a1/examples) directory.

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
