package net.pixelplays.skypvp.apis;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.UUID;

public class SettingsAPI {

    public static File database;
    public static FileConfiguration cfg;

    public static void readConfig() {
        database = new File("plugins/SkyPvP/Settings", "Settings.yml");
        cfg = YamlConfiguration.loadConfiguration(database);
    }

    public static boolean playerExists(UUID uuid) {
        if (cfg.contains("Settings." + uuid)) {
            return true;
        }
        return false;
    }

    public static Boolean getCrateAnimation(UUID uuid) {
        if (!playerExists(uuid)) {
            createPlayer(uuid);
            getCrateAnimation(uuid);
        } else {
            return cfg.getBoolean("Settings.Crate.Animation." + uuid);
        }
        return true;
    }

    public static Boolean getCrateConfirmation(UUID uuid) {
        if (!playerExists(uuid)) {
            createPlayer(uuid);
            getCrateAnimation(uuid);
        } else {
            return cfg.getBoolean("Settings.Crate.Confirmation." + uuid);
        }
        return true;
    }

    public static void setCrateAnimation(UUID uuid, Boolean animation) {
        if (!playerExists(uuid)) {
            createPlayer(uuid);
            setCrateAnimation(uuid, true);
        } else {
            cfg.set("Settings.Crate.Animation." + uuid, animation);
            saveFile();
        }
    }

    public static void setCrateConfirmation(UUID uuid, Boolean confirmation) {
        if (!playerExists(uuid)) {
            createPlayer(uuid);
            setCrateConfirmation(uuid, true);
        } else {
            cfg.set("Settings.Crate.Confirmation." + uuid, confirmation);
            saveFile();
        }
    }

    public static void createPlayer(UUID uuid) {
        if (!playerExists(uuid)) {
            cfg.set("Settings." + uuid, true);
            saveFile();
        }
    }

    public static void saveFile() {
        try {
            cfg.save(database);
        } catch (Exception exc) {
            Bukkit.getConsoleSender().sendMessage("Fehler in Settings.yml!");
            exc.printStackTrace();
        }
    }

}
