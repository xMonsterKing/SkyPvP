package net.pixelplays.skypvp.listeners;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.apis.CoinAPI;
import net.pixelplays.skypvp.apis.KillDeathAPI;
import net.pixelplays.skypvp.scoreboard.ScoreboardUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.Objects;

public class PlayerDeathListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        if (event.getEntity() instanceof Player) {
            final Player player = event.getPlayer();
            final Player killer = event.getEntity().getKiller();
            ScoreboardUtil scoreboardUtil = new ScoreboardUtil();

            if (!player.getName().equals(Objects.requireNonNull(killer).getName())) {
                CoinAPI.addCoins(killer.getUniqueId(), 50);
                KillDeathAPI.addKills(killer.getUniqueId(), 1);
                killer.sendActionBar(Component.text("§7Du hast durch den Kill §c§l50 Tokens §7erhalten"));
                scoreboardUtil.sendScoreboard(killer);

                losePurseCoinsOnDeath(player);
            }
            Bukkit.getScheduler().runTaskLater(SkyPvP.getInstance(), () -> {
                player.spigot().respawn();
                player.teleport(SkyPvP.getInstance().getLocationAPI().getLocation("Spawn"));
            }, 10L);

            if (player.isDead()) {
                player.spigot().respawn();
                KillDeathAPI.addDeaths(player.getUniqueId(), 1);
            }
        }
    }

    public void losePurseCoinsOnDeath(Player player) {
        ScoreboardUtil scoreboardUtil = new ScoreboardUtil();
        if (CoinAPI.getCoins(player.getUniqueId()) > 1) {
            CoinAPI.removeCoins(player.getUniqueId(), CoinAPI.getCoins(player.getUniqueId()) / 2);
            KillDeathAPI.addDeaths(player.getUniqueId(), 1);
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Durch den Tod hast du §c-" + CoinAPI.getCoins(player.getUniqueId()) + " §7Münzen verloren."));
            scoreboardUtil.sendScoreboard(player);
        } else if (CoinAPI.getCoins(player.getUniqueId()) == 1) {
            CoinAPI.removeCoins(player.getUniqueId(), 1);
            KillDeathAPI.addDeaths(player.getUniqueId(), 1);
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Durch den Tod hast du deine §cletzte §7Münze verloren."));
            scoreboardUtil.sendScoreboard(player);
        }  else if (CoinAPI.getCoins(player.getUniqueId()) == 0) {
            KillDeathAPI.addDeaths(player.getUniqueId(), 1);
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Da du keine Münzen mehr hast, konntest du auch keine Münzen verlieren."));
            scoreboardUtil.sendScoreboard(player);
        }
    }

}
