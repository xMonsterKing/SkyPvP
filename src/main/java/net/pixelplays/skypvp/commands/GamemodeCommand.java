package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GamemodeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("gamemode")) {
            if (!player.hasPermission(SkyPvP.getInstance().getPerms().srModeratorPerms)) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms));
            } else {
                if (args.length == 0 || args.length > 3) {
                    sendHelp(player);
                } else if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du bist nun in Gamemode §cSurvival"));
                    } else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du bist nun in Gamemode §cCreative."));
                    } else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du bist nun in Gamemode §cAdventure."));
                    } else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du bist nun in Gamemode §cSpectator."));
                    }
                } else if (args.length == 2) {
                    if (!player.hasPermission(SkyPvP.getInstance().getPerms().adminPerms)) {
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms));
                    } else {
                        Player target = Bukkit.getServer().getPlayer(args[1]);
                        if (target == null) {
                            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/gamemode <0, 1, 2, 3 / survival, creative, adventure, spectator> <Playername>"));
                        } else {
                            if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
                                target.setGameMode(GameMode.SURVIVAL);
                                target.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du bist nun in Gamemode §cSurvival."));
                                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast §e" + target.getName() + " §7in Gamemode §cSurvival §7gesetzt."));
                            } else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
                                target.setGameMode(GameMode.CREATIVE);
                                target.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du bist nun in Gamemode §cCreative."));
                                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast §e" + target.getName() + " §7in Gamemode §cCreative §7gesetzt."));
                            } else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
                                target.setGameMode(GameMode.ADVENTURE);
                                target.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du bist nun in Gamemode §cAdventure."));
                                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast §e" + target.getName() + " §7in Gamemode §cAdventure §7gesetzt."));
                            } else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
                                target.setGameMode(GameMode.SPECTATOR);
                                target.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du bist nun in Gamemode §cSpectator."));
                                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast §e" + target.getName() + " §7in Gamemode §cSpectator §7gesetzt."));
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

    private void sendHelp(Player player) {
        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§e/gamemode <0, 1, 2, 3 / survival, creative, adventure, spectator>"));
        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§e/gamemode <0, 1, 2, 3 / survival, creative, adventure, spectator> <Playername>"));
        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§e/gm <0, 1, 2, 3 / survival, creative, adventure, spectator>"));
        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§e/gm <0, 1, 2, 3 / survival, creative, adventure, spectator> <Playername>"));
    }
}
