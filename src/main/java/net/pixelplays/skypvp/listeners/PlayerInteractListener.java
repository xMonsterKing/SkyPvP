package net.pixelplays.skypvp.listeners;

import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.commands.BuildCommand;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        final Player player = event.getPlayer();
        World spawn = SkyPvP.getInstance().getLocationAPI().getLocation("Spawn").getWorld();
        World lobby = SkyPvP.getInstance().getLocationAPI().getLocation("Lobby").getWorld();
        if (event.getAction() == Action.PHYSICAL) {
            event.setCancelled(!BuildCommand.buildMode.contains(player.getUniqueId()) && player.getLocation().getWorld().equals(spawn) && player.getLocation().getWorld().equals(lobby));
        }
    }

}
