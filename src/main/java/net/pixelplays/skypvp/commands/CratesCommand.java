package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CratesCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("crates")) {
            if (!player.hasPermission(SkyPvP.getInstance().getPerms().adminPerms)) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms));
            } else {
                SkyPvP.getInstance().getInventories().getCrateInventoryPageOne(player);
            }
        }

        return true;
    }
}
