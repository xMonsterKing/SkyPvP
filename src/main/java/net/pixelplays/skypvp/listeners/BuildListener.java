package net.pixelplays.skypvp.listeners;

import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.commands.BuildCommand;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BuildListener implements Listener {

    World spawn = SkyPvP.getInstance().getLocationAPI().getLocation("Spawn").getWorld();
    World lobby = SkyPvP.getInstance().getLocationAPI().getLocation("Lobby").getWorld();

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        final Player player = event.getPlayer();
        event.setCancelled(!BuildCommand.buildMode.contains(player.getUniqueId()) && player.getLocation().getWorld().equals(spawn) || player.getLocation().getWorld().equals(lobby));
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        final Player player = event.getPlayer();
        event.setCancelled(!BuildCommand.buildMode.contains(player.getUniqueId()) && player.getLocation().getWorld().equals(spawn) || player.getLocation().getWorld().equals(lobby));
    }

}
