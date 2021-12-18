package net.pixelplays.skypvp.listeners;

import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodLevelChangeListener implements Listener {

    @EventHandler
    public void onFoodLevelChange(FoodLevelChangeEvent event) {
        final Player player = (Player) event.getEntity();
        World spawn = SkyPvP.getInstance().getLocationAPI().getLocation("Spawn").getWorld();
        if (player.getLocation().getWorld().equals(spawn) && player.getLocation().getY() >= 165) {
            event.setCancelled(true);
        }
    }

}
