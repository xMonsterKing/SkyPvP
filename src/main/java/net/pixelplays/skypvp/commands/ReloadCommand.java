package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ReloadCommand implements CommandExecutor {

    private int timer;
    private int scheduler;

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("skypvp")) {
            if (!player.hasPermission(SkyPvP.getInstance().getPerms().adminPerms)) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms));
            } else {
                if (args.length != 1) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/skypvp reload"));
                }
                if (args.length == 1) {
                    timer = 4;
                    scheduler = Bukkit.getScheduler().scheduleSyncDelayedTask(SkyPvP.getInstance(), () -> {
                        if (timer != 0) {
                            timer--;
                        }
                        if (timer == 4) {
                            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§cAchtung, das Neuladen eines Plugins kann zu Fehlern führen, starte bitte den Server neu, um keine Fehler zu riskieren."));
                            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§aSkyPvP Reload."));
                        } else if (timer == 3) {
                            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§aSkyPvP Reload.."));
                            Bukkit.getServer().getPluginManager().disablePlugin(SkyPvP.getInstance());
                        } else if (timer == 2) {
                            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§aSkyPvP Reload..."));
                        } else if (timer == 1) {
                            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§aSkyPvP Reload..."));
                        } else if (timer == 0) {
                            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§aReload erfolgreich."));
                            Bukkit.getServer().getPluginManager().enablePlugin(SkyPvP.getInstance());
                            timer = 3;
                        }
                    }, 5);
                }
            }
        }

        return true;
    }
}
