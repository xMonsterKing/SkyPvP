package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class VerlosungCommand implements CommandExecutor {

    private boolean isRunning = false;

    public BukkitTask verlosungTask;

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        final Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("verlosung")) {
            if (!player.hasPermission(SkyPvP.getInstance().getPerms().adminPerms)) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms));
            } else {
                if (isRunning) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Es läuft bereits eine §cVerlosung§7!"));
                } else if (Bukkit.getOnlinePlayers().size() < 2 && Bukkit.getOnlinePlayers().toArray()[0] == player) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du kannst keine Verlosung starten, wenn du der einzige Spieler bist!"));
                } else {
                    this.isRunning = true;
                    Random random = new Random();
                    Player winner = (Player) Bukkit.getOnlinePlayers().toArray()[random.nextInt(Bukkit.getOnlinePlayers().size())];
                    if (args.length != 1) {
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/verlosung <Verlosungssache>"));
                    }
                    if (args.length == 1) {
                        String summary = "";
                        for (String el : args) {
                            summary = summary + " " + el;
                        }
                        Bukkit.getServer().broadcast(Component.text("§7Eine Verlosung für §6" + summary + " §7wurde gestartet!"));
                        revealer(winner, summary);
                    }
                }
            }
        }

        return true;
    }

    private void revealer(Player player, final String message) {
        final Random random = new Random();
        verlosungTask = Bukkit.getScheduler().runTaskTimer(SkyPvP.getInstance(), () -> {
            int integer = 0;
            String[] revealed = new String[player.getDisplayName().length()];

            for (int i = 0; i < player.getDisplayName().length() * 100; i++) {
                int tmp = random.nextInt(revealed.length);
                if (revealed[tmp] == null) {
                    revealed[tmp] = player.getDisplayName().charAt(tmp) + "";
                    break;
                }
            }
            titleBroadCast(ChatColor.translateAlternateColorCodes('&', arrayToString(revealed)), "", 0, 40, 20, null);
            if (integer == player.getDisplayName().length() - 1) {
                isRunning = false;
                Bukkit.broadcast(Component.text(ChatColor.translateAlternateColorCodes('&', player.getDisplayName() + " hat &a" + message + " &7gewonnen!")));
                verlosungTask.cancel();
            }
            integer++;
        }, 0L, 10L);
    }

    private void titleBroadCast(String main, String sub, int fadeIn, int stay, int fadeOut, Sound sound) {
        for (Player allPlayers : Bukkit.getServer().getOnlinePlayers()) {
            if (sound != null) {
                allPlayers.playSound(allPlayers.getLocation(), sound, 10.0F, 1.0F);
            }
            allPlayers.sendTitle(main, sub, fadeIn, stay, fadeOut);
        }
    }

    private String arrayToString(String[] array) {
        String tmp = "";
        for (String el : array) {
            if (el != null) {
                tmp = tmp + el;
            } else {
                tmp = tmp + "&k_&7";
            }
        }
        return tmp;
    }
}
