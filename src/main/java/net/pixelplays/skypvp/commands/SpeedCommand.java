package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SpeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("speed")) {
            if (!player.hasPermission(SkyPvP.getInstance().getPerms().apprenticePerms)) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms));
            } else {
                if (args.length == 0 || args.length > 2) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/speed <1-10>"));
                } else if (args.length == 1) {
                    int speed;
                    try {
                        speed = Integer.parseInt(args[0]);
                    } catch (NumberFormatException exception) {
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/speed <1-10>"));
                        return false;
                    }
                    if (speed < 1 || speed > 10) {
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/speed <1-10>"));
                        return false;
                    }
                    Location location = player.getLocation();
                    Block block = location.getBlock().getRelative(BlockFace.DOWN);
                    if (block.getType().isAir() && player.isFlying()) {
                        player.setFlySpeed((float) speed / 10);
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dein Flyspeed nun auf §a" + speed + " §7gesetzt."));
                    } else {
                        player.setWalkSpeed((float) speed / 10);
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dein Walkspeed nun auf §a" + speed + " §7gesetzt."));
                    }
                }
            }
        }

        return true;
    }
}
