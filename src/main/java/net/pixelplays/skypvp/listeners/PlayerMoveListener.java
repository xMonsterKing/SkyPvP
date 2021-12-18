package net.pixelplays.skypvp.listeners;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMoveListener implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        final Player player = event.getPlayer();
        World spawn = SkyPvP.getInstance().getLocationAPI().getLocation("Spawn").getWorld();
        if (player.getLocation().getWorld().equals(spawn) && player.getLocation().getY() <= 165 && !player.hasPermission(SkyPvP.getInstance().getPerms().apprenticePerms)) {
            player.teleport(SkyPvP.getInstance().getLocationAPI().getLocation("Spawn"));
            player.setAllowFlight(false);
            player.setFlying(false);
            player.sendActionBar(Component.text("§7Du darfst in der PvP Zone nicht fliegen!"));
        }
    }

}
