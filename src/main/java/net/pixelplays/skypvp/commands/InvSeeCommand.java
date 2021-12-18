package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class InvSeeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("invsee")) {
            if (!player.hasPermission(SkyPvP.getInstance().getPerms().godPerms)) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms));
            } else {
                if (args.length > 2 || args.length == 0) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/invsee"));
                }
                if (args.length == 1) {
                    Player target = Bukkit.getPlayer(args[0]);
                    if (target == null) {
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§cDieser Spieler ist nicht online!"));
                    } else {
                        player.openInventory(target.getInventory());
                    }
                }
            }
        }

        return true;
    }
}
