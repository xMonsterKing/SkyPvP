package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.apis.CoinAPI;
import net.pixelplays.skypvp.scoreboard.ScoreboardUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PayCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("pay")) {
            if (args.length != 2) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/pay <Playername>, <Anzahl>"));
            } else {
                Player target = Bukkit.getPlayer(args[0]);
                if (target == null) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Dieser Spieler ist nicht online."));
                } else {
                    int money;
                    try {
                        money = Integer.parseInt(args[1]);
                    } catch (Exception exception) {
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§e" + args[1] + " §7ist keine Zahl."));
                        return true;
                    }
                    if (money == 0) {
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du kannst nicht weniger als 1 Token überweisen"));
                    } else {
                        if (CoinAPI.getCoins(player.getUniqueId()) == money || CoinAPI.getCoins(player.getUniqueId()) >= money) {
                            CoinAPI.removeCoins(player.getUniqueId(), money);
                            CoinAPI.addCoins(target.getUniqueId(), money);
                            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast §e" + target.getName() + " §6" + money + " Tokens §7überwiesen."));
                            target.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§e" + player.getName() + " §7hat dir §6" + money + " Tokens §7überwiesen."));
                            ScoreboardUtil scoreboardUtil = new ScoreboardUtil();
                            scoreboardUtil.sendScoreboard(player);
                            scoreboardUtil.sendScoreboard(target);
                        } else {
                            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast nicht genügend Tokens."));
                        }
                    }
                }
            }
        }

        return true;
    }
}
