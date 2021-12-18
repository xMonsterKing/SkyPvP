package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class VanishCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("vanish")) {
            if (!player.hasPermission(SkyPvP.getInstance().getPerms().supporterPerms)) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms));
            } else {
                if (args.length != 0) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/vanish"));
                }
                if (args.length == 0) {
                    if (!SkyPvP.getInstance().getUtils().vanished.contains(player)) {
                        SkyPvP.getInstance().getUtils().vanished.add(player);
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du bist nun für alle Spieler §aunsichtbar!"));
                        for (Player all : Bukkit.getOnlinePlayers()) {
                            if (!all.hasPermission(SkyPvP.getInstance().getPerms().supporterPerms)) {
                                all.hidePlayer(SkyPvP.getInstance(), player);
                            }
                        }
                    } else {
                        SkyPvP.getInstance().getUtils().vanished.remove(player);
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du bist nun für alle Spieler §cwieder sichtbar!"));
                        for (Player all : Bukkit.getOnlinePlayers()) {
                            all.showPlayer(SkyPvP.getInstance(), player);
                        }
                    }
                }
            }
        }

        return true;
    }
}
