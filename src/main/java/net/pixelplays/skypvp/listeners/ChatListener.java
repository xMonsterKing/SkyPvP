package net.pixelplays.skypvp.listeners;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String message = event.getMessage();
        if (player.hasPermission(SkyPvP.getInstance().getPerms().adminPerms)) {
            event.setFormat("§4Admin §8| §7" + player.getName() + " §8» §r" + message);
        } else if (player.hasPermission(SkyPvP.getInstance().getPerms().srModeratorPerms)) {
            event.setFormat("§cSrModerator §8| §7" + player.getName() + " §8» §r" + message);
        } else if (player.hasPermission(SkyPvP.getInstance().getPerms().moderatorPerms)) {
            event.setFormat("§6Moderator §8| §7" + player.getName() + " §8» §r" + message);
        } else if (player.hasPermission(SkyPvP.getInstance().getPerms().developerPerms)) {
            event.setFormat("§bDeveloper §8| §7" + player.getName() + " §8» §r" + message);
        } else if (player.hasPermission(SkyPvP.getInstance().getPerms().supporterPerms)) {
            event.setFormat("§aSupporter §8| §7" + player.getName() + " §8» §r" + message);
        } else if (player.hasPermission(SkyPvP.getInstance().getPerms().builderPerms)) {
            event.setFormat("§eBuilder §8| §7" + player.getName() + " §8» §r" + message);
        } else if (player.hasPermission(SkyPvP.getInstance().getPerms().apprenticePerms)) {
            event.setFormat("§9Azubi §8| §7" + player.getName() + " §8» §r" + message);
        } else if (player.hasPermission(SkyPvP.getInstance().getPerms().youtuberPerms)) {
            event.setFormat("§cYou§fTuber §8| §7" + player.getName() + " §8» §r" + message);
        } else if (player.hasPermission(SkyPvP.getInstance().getPerms().superiorPerms)) {
            event.setFormat("§cSuperior §8| §7" + player.getName() + " §8» §r" + message);
        } else if (player.hasPermission(SkyPvP.getInstance().getPerms().godPerms)) {
            event.setFormat("§6God §8| §7" + player.getName() + " §8» §r" + message);
        } else if (player.hasPermission(SkyPvP.getInstance().getPerms().kingPerms)) {
            event.setFormat("§eKing §8| §7" + player.getName() + " §8» §r" + message);
        } else if (player.hasPermission(SkyPvP.getInstance().getPerms().knightPerms)) {
            event.setFormat("§3Knight §8| §7" + player.getName() + " §8» §r" + message);
        } else if (player.hasPermission(SkyPvP.getInstance().getPerms().playerPerms)) {
            event.setFormat("§7Spieler §8| §7" + player.getName() + " §8» §r" + message);
        }


        final String messages = event.getMessage().trim();
        float upperCaseLetter = 0;
        for (int i = 0; i < messages.length(); i++) {
            if (Character.isUpperCase(messages.charAt(i)) && Character.isLetter(messages.charAt(i))) {
                upperCaseLetter++;
            }
        }
        if (upperCaseLetter / (float) messages.length() > 0.3F && !player.hasPermission(SkyPvP.getInstance().getPerms().developerPerms)) {
            event.setCancelled(true);
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§cBitte verwende nicht so viele Großbuchstaben."));
        }

        event.setMessage(message.replaceAll("<3", ChatColor.RED + "❤" + ChatColor.RESET));
    }

}
