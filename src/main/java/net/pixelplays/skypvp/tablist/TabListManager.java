package net.pixelplays.skypvp.tablist;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class TabListManager {

    private static TabListManager instance;

    public TabListManager() {
    }

    public void setTabList(Player player) {
        Scoreboard scoreboard = player.getScoreboard();

        Team admin = scoreboard.registerNewTeam("0002Admin");
        Team srModerator = scoreboard.registerNewTeam("0003SrModerator");
        Team moderator = scoreboard.registerNewTeam("0004Moderator");
        Team developer = scoreboard.registerNewTeam("0005Developer");
        Team supporter = scoreboard.registerNewTeam("0006Supporter");
        Team builder = scoreboard.registerNewTeam("0007Builder");
        Team apprentice = scoreboard.registerNewTeam("0008Azubi");
        Team youtuber = scoreboard.registerNewTeam("0009Youtuber");
        Team superior = scoreboard.registerNewTeam("0010Superior");
        Team god = scoreboard.registerNewTeam("0011God");
        Team king = scoreboard.registerNewTeam("0012King");
        Team knight = scoreboard.registerNewTeam("0013Knight");
        Team spieler = scoreboard.registerNewTeam("0014Spieler");

        admin.prefix(Component.text("§4Admin §8| §7"));
        srModerator.prefix(Component.text("§cSrMod §8| §7"));
        moderator.prefix(Component.text("§7Moderator §8| §7"));
        developer.prefix(Component.text("§bDeveloper §8| §7"));
        supporter.prefix(Component.text("§aSupporter §8| §7"));
        builder.prefix(Component.text("§eBuilder §8| §7"));
        apprentice.prefix(Component.text("§9Azubi §8| §7"));
        youtuber.prefix(Component.text("§cYou§fTuber §8| §7"));
        superior.prefix(Component.text("§dSuperior §8| §7"));
        god.prefix(Component.text("§6God §8| §7"));
        king.prefix(Component.text("§eKing §8| §7"));
        knight.prefix(Component.text("§3Knight §8| §7"));
        spieler.prefix(Component.text("§8Spieler | §7"));

        for (Player all : Bukkit.getOnlinePlayers()) {
            if (all.hasPermission(SkyPvP.getInstance().getPerms().adminPerms)) {
                admin.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().srModeratorPerms)) {
                srModerator.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().moderatorPerms)) {
                moderator.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().developerPerms)) {
                developer.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().supporterPerms)) {
                supporter.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().builderPerms)) {
                builder.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().apprenticePerms)) {
                apprentice.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().youtuberPerms)) {
                youtuber.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().superiorPerms)) {
                superior.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().godPerms)) {
                god.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().kingPerms)) {
                king.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().knightPerms)) {
                knight.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().playerPerms)) {
                spieler.addEntry(all.getName());
            }
        }
    }

    public void updateTabList(Player player) {
        Scoreboard scoreboard = player.getScoreboard();

        Team admin = scoreboard.registerNewTeam("0002Admin");
        Team srModerator = scoreboard.registerNewTeam("0003SrModerator");
        Team moderator = scoreboard.registerNewTeam("0004Moderator");
        Team developer = scoreboard.registerNewTeam("0005Developer");
        Team supporter = scoreboard.registerNewTeam("0006Supporter");
        Team builder = scoreboard.registerNewTeam("0007Builder");
        Team apprentice = scoreboard.registerNewTeam("0008Azubi");
        Team youtuber = scoreboard.registerNewTeam("0009Youtuber");
        Team superior = scoreboard.registerNewTeam("0010Superior");
        Team god = scoreboard.registerNewTeam("0011God");
        Team king = scoreboard.registerNewTeam("0012King");
        Team knight = scoreboard.registerNewTeam("0013Knight");
        Team spieler = scoreboard.registerNewTeam("0014Spieler");

        if (admin == null || srModerator == null || moderator == null || developer == null
                || supporter == null || builder == null || apprentice == null || youtuber == null
                || superior == null || god == null || king == null || knight == null || spieler == null) {
            setTabList(player);
            return;
        }

        for (Player all : Bukkit.getOnlinePlayers()) {
            if (all.hasPermission(SkyPvP.getInstance().getPerms().adminPerms)) {
                admin.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().srModeratorPerms)) {
                srModerator.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().moderatorPerms)) {
                moderator.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().developerPerms)) {
                developer.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().supporterPerms)) {
                supporter.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().builderPerms)) {
                builder.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().apprenticePerms)) {
                apprentice.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().youtuberPerms)) {
                youtuber.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().superiorPerms)) {
                superior.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().godPerms)) {
                god.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().kingPerms)) {
                king.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().knightPerms)) {
                knight.addEntry(all.getName());
            } else if (all.hasPermission(SkyPvP.getInstance().getPerms().playerPerms)) {
                spieler.addEntry(all.getName());
            }
        }
    }

    public static TabListManager getInstance() {
        if (instance == null) {
            instance = new TabListManager();
        }
        return instance;
    }
}
