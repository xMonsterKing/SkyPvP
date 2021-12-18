package net.pixelplays.skypvp.utils;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class PlayerSetup {

    private final Player player;

    /**
     * Constructor to create a player. Used for inventory setup, animations, etc.
     *
     * @param player Defines the player that should be set up.
     *
     */
    public PlayerSetup(Player player) {
        this.player = player;
    }

    /**
     * Setup all parts at once.
     */
    public void setupPlayer() {
        setPlayerAttributes();
    }

    private void setPlayerAttributes() {
        player.setGameMode(GameMode.SURVIVAL);
        player.setHealthScale(20D);
        player.setHealth(20D);
        player.setFoodLevel(40);
        player.setFlying(false);
        player.setAllowFlight(false);
        player.sendPlayerListHeaderAndFooter(Component.text("§cSkyPvP §7- §cSystem\n \n§7Spieler online: §e" + Bukkit.getServer().getOnlinePlayers().size() + "\n§7Derzeitiger Server: §e" + player.getWorld().getName() + "\n\n  §8§l§m ▶ ]                    [ §m§l◀ §r  \n")
                , Component.text("\n  §8§l§m ▶ ]                    [ ◀ §r  \n\n§7Teamspeak: §bSkyPvP.de\n§7Discord: §bdiscord.gg/SkyPvP\n§7Website: §bSkyPvP.de\n"));
        Location lobby = SkyPvP.getInstance().getLocationAPI().getLocation("Lobby");
        if (lobby != null) {
            Bukkit.getScheduler().scheduleSyncDelayedTask(SkyPvP.getInstance(), () -> {
                player.teleport(lobby);
            }, 7L);
        }
    }

    /**
     * Get the player from the constructor.
     * @return Bukkit Player Object.
     */
    public Player getPlayer() {
        return player;
    }

}
