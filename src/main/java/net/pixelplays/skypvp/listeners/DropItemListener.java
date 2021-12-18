package net.pixelplays.skypvp.listeners;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropItemListener implements Listener {

    @EventHandler
    public void onDropItems(PlayerDropItemEvent event) {
        final Player player = event.getPlayer();
        World spawn = SkyPvP.getInstance().getLocationAPI().getLocation("Spawn").getWorld();
        if (player.getLocation().getWorld().equals(spawn) && player.getLocation().getY() >= 155) {
            event.setCancelled(true);
            player.sendActionBar(Component.text("§cItemdrop am Spawn ist verboten."));
        } else {
            event.setCancelled(false);
        }
    }

}
