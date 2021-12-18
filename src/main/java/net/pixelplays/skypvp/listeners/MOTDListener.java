package net.pixelplays.skypvp.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class MOTDListener implements Listener {

    @EventHandler
    public void onServerListPing(ServerListPingEvent event) {
        event.setMotd("§cSkyPvP §7- §cDein SkyPvP Server §8[§e1.17.1§8] \n§a+ Update §8[§cClanSystem & Neue Crates§8]");
    }

}
