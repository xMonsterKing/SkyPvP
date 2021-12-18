package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;
        World spawn = SkyPvP.getInstance().getLocationAPI().getLocation("Spawn").getWorld();

        if (command.getName().equalsIgnoreCase("fly")) {
            if (!player.hasPermission(SkyPvP.getInstance().getPerms().kingPerms)) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms));
            } else {
                if (args.length >= 2) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/fly <Playername>"));
                }
                if (args.length == 0) {
                    if (player.getLocation().getWorld().equals(spawn) && player.getLocation().getY() <= 165 && !player.hasPermission(SkyPvP.getInstance().getPerms().apprenticePerms)) {
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Fliegen ist in der PvP Zone §cnicht §7erlaubt."));
                    } else {
                        if (!player.getAllowFlight()) {
                            player.setAllowFlight(true);
                            player.setFlySpeed(0.1F);
                            player.setFlying(true);
                            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§aDu kannst nun fliegen."));
                        } else if (player.getAllowFlight()) {
                            player.setAllowFlight(false);
                            player.setFlying(false);
                            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§cDu kannst nun nicht mehr fliegen."));
                        }
                    }
                } else if (args.length == 1) {
                    if (!player.hasPermission(SkyPvP.getInstance().getPerms().adminPerms)) {
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms));
                    } else {
                        Player target = Bukkit.getServer().getPlayer(args[0]);
                        if (target == null) {
                            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/fly <Playername>"));
                        } else {
                            if (target.getLocation().getWorld().equals(spawn) && target.getLocation().getY() <= 165 && !target.hasPermission(SkyPvP.getInstance().getPerms().apprenticePerms)) {
                                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§e" + target.getName() + " §7befindet sich derzeit in der PvP Zone."));
                            } else {
                                if (!target.getAllowFlight()) {
                                    target.setAllowFlight(true);
                                    target.setFlySpeed(0.1F);
                                    target.setFlying(true);
                                    target.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§aDu kannst nun fliegen."));
                                } else if (target.getAllowFlight()) {
                                    target.setAllowFlight(false);
                                    target.setFlying(false);
                                    target.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§cDu kannst nun nicht mehr fliegen."));
                                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§cDer Spieler §e" + target.getName() + " §ckann nun nicht mehr fliegen"));
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
