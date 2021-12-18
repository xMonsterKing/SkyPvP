package net.pixelplays.skypvp.commands;

import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class WarpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        final Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("warp")) {
            if (args.length > 1) {
                player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/warp");
            }
            if (args.length == 0) {
                SkyPvP.getInstance().getInventories().getWarpInventory(player);
            }
        }

        return false;
    }
}
