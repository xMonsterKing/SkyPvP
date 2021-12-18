package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.apis.BankAPI;
import net.pixelplays.skypvp.apis.CoinAPI;
import net.pixelplays.skypvp.scoreboard.ScoreboardUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BankCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("bank")) {
            if (args.length >= 2) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/bank"));
            }
            if (args.length == 0) {
                if (!BankAPI.playerExists(player.getUniqueId())) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Suche den §6Bankarbeiter§7, um dir ein Bankkonto zu erstellen."));
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§6Tipp: §7Er befindet sich in der Nähe des Lobbyspawns."));
                } else {
                    SkyPvP.getInstance().getInventories().getBankInventory(player);
                }
            } else if (args.length == 1 && !BankAPI.playerExists(player.getUniqueId())) {
                if (args[0].equalsIgnoreCase("applyaccount")) {
                    try {
                        BankAPI.createPlayer(player.getUniqueId());
                    } catch (Exception e) {
                        e.printStackTrace();
                        player.sendMessage(Component.text("§cFehler beim Erstellen des Bankaccounts!"));
                    }
                    if (BankAPI.playerExists(player.getUniqueId())) {
                        ScoreboardUtil scoreboardUtil = new ScoreboardUtil();
                        CoinAPI.removeCoins(player.getUniqueId(), 20000);
                        scoreboardUtil.sendScoreboard(player);
                        player.sendMessage(Component.text("§7[§6Bankarbeiter§7] Dein §6Bankkonto §7wurde soeben erfolgreich erstellt. Mit §e/bank §7kannst du nun jederzeit darauf zugreifen oder du besuchst mich, um Transaktionen zu tätigen."));
                        player.sendMessage(Component.text("§7[§6Bankarbeiter§7] Außerdem haben wir dir als Dankeschön, §61.000 Tokens §7deinem Konto gutgeschrieben."));
                    }
                }
            } else {
                return true;
            }
        }

        return true;
    }
}
