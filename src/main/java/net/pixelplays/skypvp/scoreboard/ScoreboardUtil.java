package net.pixelplays.skypvp.scoreboard;

import fr.mrmicky.fastboard.FastBoard;
import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.apis.CoinAPI;
import net.pixelplays.skypvp.apis.KillDeathAPI;
import net.pixelplays.skypvp.utils.LuckPermsAPIHook;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class ScoreboardUtil {

    public final HashMap<Player, FastBoard> boardCache = new HashMap<>();

    public ScoreboardUtil() {}

    public void sendScoreboard(Player player) {

        FastBoard board = boardCache.get(player);
        if (board == null) {
            board = new FastBoard(player);
            boardCache.put(player, board);
        }

        String group = LuckPermsAPIHook.getGroupOfPlayer(board.getPlayer());
        String color = LuckPermsAPIHook.getPlayerColor(board.getPlayer());

        board.updateTitle("§cSkyPvP");

        board.updateLines(
                "",
                "§7Rang:",
                "§6➥ " + color + group,
                "",
                "§7Tokens:",
                "§6➥ §e" + CoinAPI.getCoins(board.getPlayer().getUniqueId()) + " ⛁",
                "",
                "§7Online:",
                "§6➥ §b" + Bukkit.getServer().getOnlinePlayers().size() + "§7/§b" + Bukkit.getServer().getMaxPlayers(),
                "",
                "§7Kills/Tode:",
                "§6➥ §a" + KillDeathAPI.getKills(board.getPlayer().getUniqueId()) + "§7/§c" + KillDeathAPI.getDeaths(board.getPlayer().getUniqueId()),
                "",
                "§7Clan:",
                "§6➥ §cBald verfügbar");
    }

}
