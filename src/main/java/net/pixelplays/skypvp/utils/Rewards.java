package net.pixelplays.skypvp.utils;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.apis.CoinAPI;
import net.pixelplays.skypvp.apis.TimeBeforeAPI;
import net.pixelplays.skypvp.scoreboard.ScoreboardUtil;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Rewards {

    ScoreboardUtil scoreboardUtil = new ScoreboardUtil();

    public void getPlayerReward(Player player) {
        if (TimeBeforeAPI.getTime(player.getUniqueId(), "playerreward") == null) {
            Calendar date = Calendar.getInstance();
            date.add(Calendar.SECOND, 60*60*24*7);
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            TimeBeforeAPI.setTime(player.getUniqueId(), df.format(date.getTime()), "playerreward");
            CoinAPI.addCoins(player.getUniqueId(), 100);
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §9Spieler §8• §9Reward §7erfolgreich abgeholt."));
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ 100 Tokens"));
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ §9Player §8◆ §9Crate"));
            scoreboardUtil.sendScoreboard(player);
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 2);
        }
        if (TimeBeforeAPI.getTime(player.getUniqueId(), "playerreward") != null) {
            Calendar date = Calendar.getInstance();
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            try {
                date.setTime(df.parse(TimeBeforeAPI.getTime(player.getUniqueId(), "playerreward")));
            } catch (ParseException e1) {
                e1.printStackTrace();
            }

            DateFormat df2 = new SimpleDateFormat("dd.MM.yyyy");
            DateFormat df3 = new SimpleDateFormat("HH:mm");
            Calendar date2 = Calendar.getInstance();
            date2.setTimeInMillis(System.currentTimeMillis());

            if (date.before(date2)) {

                Calendar date4 = Calendar.getInstance();
                date4.add(Calendar.SECOND, 60 * 60 * 24 * 7);
                DateFormat df4 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

                TimeBeforeAPI.setTime(player.getUniqueId(), df4.format(date4.getTime()), "playerreward");

                CoinAPI.addCoins(player.getUniqueId(), 100);
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §9Spieler §8• §9Reward §7erfolgreich abgeholt."));
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ 100 Tokens"));
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ §9Player §8◆ §9Crate"));
                scoreboardUtil.sendScoreboard(player);
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 2);

            } else {
                Bukkit.getScheduler().scheduleSyncDelayedTask(SkyPvP.getInstance(), () -> {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §9Spieler §8• §9Reward §7heute bereits abgeholt."));
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du kannst dir dein §9Spieler §8• §9Reward §7wieder am §6" + df2.format(date.getTime()) + " §7um §6" + df3.format(date.getTime()) + " §7abholen!"));
                    player.closeInventory();
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_BREAK, 1, 1);
                }, 5L);
            }
        }
    }

    public void getKnightReward(Player player) {
        if (TimeBeforeAPI.getTime(player.getUniqueId(), "knightreward") == null) {
            Calendar date = Calendar.getInstance();
            date.add(Calendar.SECOND, 60*60*24*7);
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            TimeBeforeAPI.setTime(player.getUniqueId(), df.format(date.getTime()), "knightreward");
            CoinAPI.addCoins(player.getUniqueId(), 200);
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §3Knight §8• §3Reward §7erfolgreich abgeholt."));
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ 200 Tokens"));
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ §3Knight §8◆ §3Crate"));
            scoreboardUtil.sendScoreboard(player);
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 2);
        }
        if (TimeBeforeAPI.getTime(player.getUniqueId(), "knightreward") != null) {
            Calendar date = Calendar.getInstance();
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            try {
                date.setTime(df.parse(TimeBeforeAPI.getTime(player.getUniqueId(), "knightreward")));
            } catch (ParseException e1) {
                e1.printStackTrace();
            }

            DateFormat df2 = new SimpleDateFormat("dd.MM.yyyy");
            DateFormat df3 = new SimpleDateFormat("HH:mm");
            Calendar date2 = Calendar.getInstance();
            date2.setTimeInMillis(System.currentTimeMillis());

            if (date.before(date2)) {

                Calendar date4 = Calendar.getInstance();
                date4.add(Calendar.SECOND, 60 * 60 * 24 * 7);
                DateFormat df4 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

                TimeBeforeAPI.setTime(player.getUniqueId(), df4.format(date4.getTime()), "knightreward");

                CoinAPI.addCoins(player.getUniqueId(), 200);
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §3Knight §8• §3Reward §7erfolgreich abgeholt."));
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ 200 Tokens"));
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ §3Knight §8◆ §3Crate"));
                scoreboardUtil.sendScoreboard(player);
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 2);

            } else {
                Bukkit.getScheduler().scheduleSyncDelayedTask(SkyPvP.getInstance(), () -> {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §3Knight §8• §3Reward §7heute bereits abgeholt."));
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du kannst dir dein §3Knight §8• §3Reward §7wieder am §6" + df2.format(date.getTime()) + " §7um §6" + df3.format(date.getTime()) + " §7abholen!"));
                    player.closeInventory();
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_BREAK, 1, 1);
                }, 5L);
            }
        }
    }

    public void getKingReward(Player player) {
        if (TimeBeforeAPI.getTime(player.getUniqueId(), "kingreward") == null) {
            Calendar date = Calendar.getInstance();
            date.add(Calendar.SECOND, 60*60*24*7);
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            TimeBeforeAPI.setTime(player.getUniqueId(), df.format(date.getTime()), "kingreward");
            CoinAPI.addCoins(player.getUniqueId(), 300);
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §eKing §8• §eReward §7erfolgreich abgeholt."));
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ 300 Tokens"));
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ §eKing §8◆ §eCrate"));
            scoreboardUtil.sendScoreboard(player);
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 2);
        }
        if (TimeBeforeAPI.getTime(player.getUniqueId(), "kingreward") != null) {
            Calendar date = Calendar.getInstance();
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            try {
                date.setTime(df.parse(TimeBeforeAPI.getTime(player.getUniqueId(), "kingreward")));
            } catch (ParseException e1) {
                e1.printStackTrace();
            }

            DateFormat df2 = new SimpleDateFormat("dd.MM.yyyy");
            DateFormat df3 = new SimpleDateFormat("HH:mm");
            Calendar date2 = Calendar.getInstance();
            date2.setTimeInMillis(System.currentTimeMillis());

            if (date.before(date2)) {

                Calendar date4 = Calendar.getInstance();
                date4.add(Calendar.SECOND, 60 * 60 * 24 * 7);
                DateFormat df4 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

                TimeBeforeAPI.setTime(player.getUniqueId(), df4.format(date4.getTime()), "kingreward");

                CoinAPI.addCoins(player.getUniqueId(), 300);
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §eKing §8• §eReward §7erfolgreich abgeholt."));
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ 300 Tokens"));
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ §eKing §8◆ §eCrate"));
                scoreboardUtil.sendScoreboard(player);
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 2);

            } else {
                Bukkit.getScheduler().scheduleSyncDelayedTask(SkyPvP.getInstance(), () -> {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §eKing §8• §eReward §7heute bereits abgeholt."));
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du kannst dir dein §eKing §8• §eReward §7wieder am §6" + df2.format(date.getTime()) + " §7um §6" + df3.format(date.getTime()) + " §7abholen!"));
                    player.closeInventory();
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_BREAK, 1, 1);
                }, 5L);
            }
        }
    }

    public void getGodReward(Player player) {
        if (TimeBeforeAPI.getTime(player.getUniqueId(), "godreward") == null) {
            Calendar date = Calendar.getInstance();
            date.add(Calendar.SECOND, 60*60*24*7);
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            TimeBeforeAPI.setTime(player.getUniqueId(), df.format(date.getTime()), "godreward");
            CoinAPI.addCoins(player.getUniqueId(), 400);
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §6God §8• §6Reward §7erfolgreich abgeholt."));
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ 400 Tokens"));
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ §6God §8◆ §6Crate"));
            scoreboardUtil.sendScoreboard(player);
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 2);
        }
        if (TimeBeforeAPI.getTime(player.getUniqueId(), "godreward") != null) {
            Calendar date = Calendar.getInstance();
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            try {
                date.setTime(df.parse(TimeBeforeAPI.getTime(player.getUniqueId(), "godreward")));
            } catch (ParseException e1) {
                e1.printStackTrace();
            }

            DateFormat df2 = new SimpleDateFormat("dd.MM.yyyy");
            DateFormat df3 = new SimpleDateFormat("HH:mm");
            Calendar date2 = Calendar.getInstance();
            date2.setTimeInMillis(System.currentTimeMillis());

            if (date.before(date2)) {

                Calendar date4 = Calendar.getInstance();
                date4.add(Calendar.SECOND, 60 * 60 * 24 * 7);
                DateFormat df4 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

                TimeBeforeAPI.setTime(player.getUniqueId(), df4.format(date4.getTime()), "godreward");

                CoinAPI.addCoins(player.getUniqueId(), 400);
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §6God §8• §6Reward §7erfolgreich abgeholt."));
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ 400 Tokens"));
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ §6God §8◆ §6Crate"));
                scoreboardUtil.sendScoreboard(player);
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 2);

            } else {
                Bukkit.getScheduler().scheduleSyncDelayedTask(SkyPvP.getInstance(), () -> {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §6God §8• §6Reward §7heute bereits abgeholt."));
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du kannst dir dein §6God §8• §6Reward §7wieder am §6" + df2.format(date.getTime()) + " §7um §6" + df3.format(date.getTime()) + " §7abholen!"));
                    player.closeInventory();
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_BREAK, 1, 1);
                }, 5L);
            }
        }
    }

    public void getSuperiorReward(Player player) {
        if (TimeBeforeAPI.getTime(player.getUniqueId(), "superiorreward") == null) {
            Calendar date = Calendar.getInstance();
            date.add(Calendar.SECOND, 60*60*24*7);
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            TimeBeforeAPI.setTime(player.getUniqueId(), df.format(date.getTime()), "superiorreward");
            CoinAPI.addCoins(player.getUniqueId(), 500);
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §dSuperior §8• §dReward §7erfolgreich abgeholt."));
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ 500 Tokens"));
            player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ §dSuperior §8◆ §dCrate"));
            scoreboardUtil.sendScoreboard(player);
            player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 2);
        }
        if (TimeBeforeAPI.getTime(player.getUniqueId(), "superiorreward") != null) {
            Calendar date = Calendar.getInstance();
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            try {
                date.setTime(df.parse(TimeBeforeAPI.getTime(player.getUniqueId(), "superiorreward")));
            } catch (ParseException e1) {
                e1.printStackTrace();
            }

            DateFormat df2 = new SimpleDateFormat("dd.MM.yyyy");
            DateFormat df3 = new SimpleDateFormat("HH:mm");
            Calendar date2 = Calendar.getInstance();
            date2.setTimeInMillis(System.currentTimeMillis());

            if (date.before(date2)) {

                Calendar date4 = Calendar.getInstance();
                date4.add(Calendar.SECOND, 60 * 60 * 24 * 7);
                DateFormat df4 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

                TimeBeforeAPI.setTime(player.getUniqueId(), df4.format(date4.getTime()), "superiorreward");

                CoinAPI.addCoins(player.getUniqueId(), 500);
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §dSuperior §8• §dReward §7erfolgreich abgeholt."));
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ 500 Tokens"));
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + " §b+ §dSuperior §8◆ §dCrate"));
                scoreboardUtil.sendScoreboard(player);
                player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 2);

            } else {
                Bukkit.getScheduler().scheduleSyncDelayedTask(SkyPvP.getInstance(), () -> {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast dir dein §dSuperior §8• §dReward §7heute bereits abgeholt."));
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du kannst dir dein §dSuperior §8• §dReward §7wieder am §6" + df2.format(date.getTime()) + " §7um §6" + df3.format(date.getTime()) + " §7abholen!"));
                    player.closeInventory();
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_BREAK, 1, 1);
                }, 5L);
            }
        }
    }

}
