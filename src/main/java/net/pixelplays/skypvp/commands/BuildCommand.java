package net.pixelplays.skypvp.commands;

import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.UUID;

public class BuildCommand implements CommandExecutor {

    public final static ArrayList<UUID> buildMode = new ArrayList<>();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;
        UUID playerUUID = player.getUniqueId();

        if (command.getName().equalsIgnoreCase("build")) {
            if (!player.hasPermission(SkyPvP.getInstance().getPerms().adminPerms)) {
                player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms);
            } else {
                if (args.length == 0) {
                    if (!buildMode.contains(playerUUID)) {
                        buildMode.add(playerUUID);
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Buildmodus §aaktiviert.");
                        player.setAllowFlight(true);
                    } else {
                        buildMode.remove(playerUUID);
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Buildmodus §cdeaktiviert.");
                        player.setAllowFlight(false);
                    }
                } else if (args.length == 1) {
                    Player target = Bukkit.getServer().getPlayer(args[0]);
                    if (target != null) {
                        UUID targetUUID = target.getUniqueId();
                        if (!buildMode.contains(targetUUID)) {
                            buildMode.add(targetUUID);
                            target.setGameMode(GameMode.CREATIVE);
                            target.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Buildmodus §aaktiviert.");
                            player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Buildmodus für §6" + target.getName() + " §aaktiviert");
                            target.setAllowFlight(true);
                        } else {
                            buildMode.remove(targetUUID);
                            target.setGameMode(GameMode.SURVIVAL);
                            target.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Buildmodus §cdeaktiviert.");
                            player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Buildmodus für §6" + target.getName() + " §cdeaktiviert");
                            target.setAllowFlight(false);
                        }
                    }
                } else if (args.length > 2) {
                    player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/build <Playername>");
                }
            }
        }

        return true;
    }
}
