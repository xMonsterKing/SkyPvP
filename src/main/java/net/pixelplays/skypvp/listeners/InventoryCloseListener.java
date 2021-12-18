package net.pixelplays.skypvp.listeners;

import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class InventoryCloseListener implements Listener {

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event) {
        final Player player = (Player) event.getPlayer();
        if (SkyPvP.getInstance().getUtils().crateOpened.contains(player) && event.getInventory() != null) {
            Bukkit.getScheduler().scheduleSyncDelayedTask(SkyPvP.getInstance(), () -> {
                player.openInventory(event.getInventory());
            }, 10L);
        }
    }

}
