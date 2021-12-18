package net.pixelplays.skypvp.listeners;

import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.apis.CoinAPI;
import net.pixelplays.skypvp.apis.KillDeathAPI;
import net.pixelplays.skypvp.scoreboard.ScoreboardUtil;
import net.pixelplays.skypvp.tablist.TabListManager;
import net.pixelplays.skypvp.utils.PlayerSetup;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        final Player player = event.getPlayer();

        String Welcome1 = SkyPvP.getInstance().getUtils().Welcome.replaceAll("%player%", player.getName());
        String Welcome2 = Welcome1.replaceAll("&", "§");

        event.setJoinMessage(null);
        SkyPvP.getInstance().getUtils().setupNPC();
        SkyPvP.getInstance().getUtils().checkSetup(player);
        PlayerSetup playerSetup = new PlayerSetup(player);
        playerSetup.setupPlayer();
        player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + Welcome2);

        ScoreboardUtil scoreboardUtil = new ScoreboardUtil();
        scoreboardUtil.sendScoreboard(player);

        TabListManager.getInstance().setTabList(player);
        for (Player all : Bukkit.getOnlinePlayers()) {
            TabListManager.getInstance().updateTabList(all);
        }

        KillDeathAPI.createPlayer(player.getUniqueId());
        if (!CoinAPI.playerExists(player.getUniqueId())) {
            CoinAPI.createPlayer(player.getUniqueId());
            player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Als neuer Spieler erhälst du §6+ 1000 Münzen §7von uns.");
        }
    }

}
