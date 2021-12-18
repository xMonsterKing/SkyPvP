package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class SpawnCommand implements CommandExecutor {

    private int spawnTPStart;
    private int spawnScheduler;

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("spawn")) {
            if (args.length == 0) {
                if (!player.hasPermission(SkyPvP.getInstance().getPerms().adminPerms)) {
                    teleportPlayer(SkyPvP.getInstance(), player, player.getLocation(), SkyPvP.getInstance().getLocationAPI().getLocation("Spawn"), 5);
                } else {
                    player.teleport(SkyPvP.getInstance().getLocationAPI().getLocation("Spawn"));
                }
            }
        }

        return true;
    }

    private void teleportPlayer(Plugin plugin, Player player, Location source, Location destination, int seconds) {
        if (seconds < 0) return;
        if (!source.equals(player.getLocation())) {
            player.sendActionBar(Component.text("§7[§c§l♚§7]  §c§lTeleport abgebrochen"));
            return;
        }
        if (seconds == 0) {
            player.teleport(destination);
            return;
        }
        player.sendActionBar(Component.text(String.format("§7[§c§l♚§7] Teleport in §a§l%d Sekunde/n §7(Nicht bewegen)", seconds)));
        plugin.getServer().getScheduler().runTaskLater(plugin, () -> teleportPlayer(plugin, player, source, destination, seconds - 1), 20L);
    }

}
