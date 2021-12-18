package net.pixelplays.skypvp.listeners;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.commands.GlobalMuteCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class GlobalMuteListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        final Player player = event.getPlayer();
        if (GlobalMuteCommand.globalMute) {
            if (player.hasPermission(SkyPvP.getInstance().getPerms().apprenticePerms)) {
                return;
            }
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Der Chat ist gerade §cdeaktiviert!"));
            event.setCancelled(true);
        }
    }

}
