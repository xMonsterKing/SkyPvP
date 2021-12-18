package net.pixelplays.skypvp.listeners;

import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class NoHitListener implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            final Player player = (Player) event.getEntity();
            World spawn = SkyPvP.getInstance().getLocationAPI().getLocation("Spawn").getWorld();
            World lobby = SkyPvP.getInstance().getLocationAPI().getLocation("Lobby").getWorld();
            if (player.getLocation().getWorld().equals(spawn) && player.getLocation().getY() >= 165) {
                event.setCancelled(true);
            } else if (player.getLocation().getWorld().equals(lobby)) {
                event.setCancelled(true);
            }
        }
    }

}
