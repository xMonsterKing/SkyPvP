package net.pixelplays.skypvp.apis;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.UUID;

public class BankAPI {

    public static File database;
    public static FileConfiguration cfg;

    public static void readConfig() {
        database = new File("plugins/SkyPvP/Coins", "PlayerBank.yml");
        cfg = YamlConfiguration.loadConfiguration(database);
    }

    public static boolean playerExists(UUID uuid) {
        if (cfg.contains("BankCoins." + uuid)) {
            return true;
        }
        return false;
    }

    public static Integer getBankCoins(UUID uuid) {
        if (playerExists(uuid)) {
            return cfg.getInt("BankCoins." + uuid);
        } else {
            createPlayer(uuid);
            getBankCoins(uuid);
        }
        return 0;
    }

    public static void addBankCoins(UUID uuid, int coins) {
        if (playerExists(uuid)) {
            cfg.set("BankCoins." + uuid, getBankCoins(uuid) + coins);
            saveFile();
        } else {
            createPlayer(uuid);
            addBankCoins(uuid, coins);
        }
    }
    public static void removeBankCoins(UUID uuid, int coins) {
        if (playerExists(uuid)) {
            cfg.set("BankCoins." + uuid, getBankCoins(uuid) - coins);
            saveFile();
        } else {
            createPlayer(uuid);
            removeBankCoins(uuid, coins);
        }
    }
    public static void createPlayer(UUID uuid) {
        if (!playerExists(uuid)) {
            cfg.set("BankCoins." + uuid, 1000);
            saveFile();
        }
    }

    public static void saveFile() {
        try {
            cfg.save(database);
        } catch (Exception exc) {
            Bukkit.getConsoleSender().sendMessage("Fehler in PlayerBank.yml!");
            exc.printStackTrace();
        }
    }

}
