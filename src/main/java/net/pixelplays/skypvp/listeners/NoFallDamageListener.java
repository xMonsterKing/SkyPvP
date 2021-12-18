package net.pixelplays.skypvp.listeners;

import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class NoFallDamageListener implements Listener {

    @EventHandler
    public void onFallDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            final Player player = (Player) event.getEntity();
            World spawn = SkyPvP.getInstance().getLocationAPI().getLocation("Spawn").getWorld();
            World lobby = SkyPvP.getInstance().getLocationAPI().getLocation("Lobby").getWorld();
            if (event.getCause() == EntityDamageEvent.DamageCause.FALL && player.getLocation().getWorld().equals(spawn) && player.getLocation().getWorld().equals(lobby)) {
                event.setCancelled(true);
            }
        }
    }

}
