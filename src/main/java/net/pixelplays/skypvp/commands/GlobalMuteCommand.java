package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GlobalMuteCommand implements CommandExecutor {

    public static boolean globalMute = true;

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("globalmute")) {
            if (!player.hasPermission(SkyPvP.getInstance().getPerms().moderatorPerms)) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms));
            } else {
                if (globalMute) {
                    globalMute = false;
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        all.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Der Globale Chat wurde von §e" + player.getName() + " §aaktiviert."));
                    }
                } else {
                    globalMute = true;
                    for (Player all : Bukkit.getOnlinePlayers()) {
                        all.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Der Globale Chat wurde von §e" + player.getName() + " §cdeaktiviert."));
                    }
                }
            }
        }

        return true;
    }
}
