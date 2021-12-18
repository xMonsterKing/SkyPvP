package net.pixelplays.skypvp.apis;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.UUID;

public class TimeBeforeAPI {

    public static File database;
    public static FileConfiguration cfg;

    public static void readConfig() {
        database = new File("plugins/SkyPvP/", "timebefore.yml");
        cfg = YamlConfiguration.loadConfiguration(database);
    }

    public static boolean playerExists(UUID uuid, String name) {
        if (cfg.contains(name + "." + uuid + ".time")) {
            return true;
        }
        return false;
    }

    public static void createPlayer(UUID uuid, String name) {
        if (!playerExists(uuid, name)) {
            cfg.set(name + "." + uuid + ".time", "null");
            cfg.set(name + "." + uuid + ".ptime", "null");
            saveFile();
        }
    }

    public static void setTime(UUID uuid, String time, String name) {
        if (playerExists(uuid, name)) {
            cfg.set(name + "." + uuid + ".time", time);
            saveFile();
        } else {
            createPlayer(uuid, name);
            setTime(uuid, time, name);
        }
    }

    public static String getTime(UUID uuid, String name) {
        if (playerExists(uuid, name)) {
            return cfg.getString(name + "." + uuid + ".time");
        } else {
            createPlayer(uuid, name);
            getTime(uuid, name);
        }
        return null;
    }

    public static void saveFile() {
        try {
            cfg.save(database);
        } catch (Exception exception) {
            Bukkit.getConsoleSender().sendMessage("[SkyPvP] Something went wrong while saving file 'reward.yml' !");
            exception.printStackTrace();
        }
    }

}
