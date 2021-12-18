package net.pixelplays.skypvp.listeners;

import fr.mrmicky.fastboard.FastBoard;
import net.pixelplays.skypvp.scoreboard.ScoreboardUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        final Player player = event.getPlayer();

        event.setQuitMessage(null);
        ScoreboardUtil scoreboardUtil = new ScoreboardUtil();
        FastBoard board = scoreboardUtil.boardCache.remove(player);
        if (board != null) {
            board.delete();
        }
    }

}
