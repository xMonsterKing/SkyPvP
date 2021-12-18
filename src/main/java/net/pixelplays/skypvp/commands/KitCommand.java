package net.pixelplays.skypvp.commands;

import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.apis.TextureAPI;
import net.pixelplays.skypvp.apis.TimeBeforeAPI;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class KitCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("kit")) {
            if (args.length > 1) {
                player.sendMessage("<rainbow> </rainbow>");
            }
            if (args.length == 0) {
                //getKitInventory();
            }
        }

        return true;
    }

    private void getKitInventory(Player player, String timeName, int seconds) {
        if (TimeBeforeAPI.getTime(player.getUniqueId(), timeName) != null) {
            Calendar date = Calendar.getInstance();
            date.add(Calendar.SECOND, seconds);
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            TimeBeforeAPI.setTime(player.getUniqueId(), df.format(date.getTime()), timeName);

        }

        if (TimeBeforeAPI.getTime(player.getUniqueId(), timeName) != null) {
            Calendar date = Calendar.getInstance();
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            try {
                date.setTime(dateFormat.parse(TimeBeforeAPI.getTime(player.getUniqueId(), timeName)));
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }

            DateFormat dateFormat1 = new SimpleDateFormat("dd.MM.yyyy");
            DateFormat dateFormat2 = new SimpleDateFormat("HH:mm");
            Calendar date2 = Calendar.getInstance();
            date2.setTimeInMillis(System.currentTimeMillis());

            if (date.before(date2)) {
                Calendar date3 = Calendar.getInstance();
                date3.add(Calendar.SECOND, seconds);
                DateFormat dateFormat3 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

                TimeBeforeAPI.setTime(player.getUniqueId(), dateFormat3.format(date3.getTime()), timeName);
            } else {

            }
        }
        openKitInventory(player);
    }

    private void getKitTime(Player player, String timeName, int minute) {
        if (TimeBeforeAPI.getTime(player.getUniqueId(), timeName) != null) {
            Calendar date = Calendar.getInstance();
            date.add(Calendar.MINUTE, minute);
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            TimeBeforeAPI.setTime(player.getUniqueId(), df.format(date.getTime()), timeName);
        }

        if (TimeBeforeAPI.getTime(player.getUniqueId(), timeName) != null) {
            Calendar date = Calendar.getInstance();
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            try {
                date.setTime(dateFormat.parse(TimeBeforeAPI.getTime(player.getUniqueId(), timeName)));
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }

            DateFormat dateFormat1 = new SimpleDateFormat("dd.MM.yyyy");
            DateFormat dateFormat2 = new SimpleDateFormat("HH:mm");
            Calendar date2 = Calendar.getInstance();
            date2.setTimeInMillis(System.currentTimeMillis());

            if (date.before(date2)) {
                Calendar date3 = Calendar.getInstance();
                date3.add(Calendar.SECOND, minute);
                DateFormat dateFormat3 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

                TimeBeforeAPI.setTime(player.getUniqueId(), dateFormat3.format(date3.getTime()), timeName);
            } else {

            }
        }
    }

    private void openKitInventory(Player player) {
        Inventory kitInventory = Bukkit.createInventory(null, 9 * 5, SkyPvP.getInstance().getTitles().kitInventoryTitle);
        for (int i = 0; i < kitInventory.getSize(); i++) {
            kitInventory.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        getKitTime(player, "playerkit", 30);
        kitInventory.setItem(13, TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWU4YTdhZGMyNWU5YmFlNDE0NTA3Zjk2ZWQ0ZTZmOWU0NmI4NGNiNDM5YTQ4YjBjZjIzYmFlMWI2ZTFmNjg1OSJ9fX0="
                , 1, "§7Spieler §8◈ §7Kit", "", "§aKlicke§7, um dir dein Kit abzuholen."));
        if (!player.hasPermission(SkyPvP.getInstance().getPerms().knightPerms)) {
            kitInventory.setItem(19, TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTIzMTJlNzJkMDMwMTJiZTEwNmI0OGFjY2QzMzgyY2VjN2NiY2VjZWIxNDJlYzc2MjM3OTM0NjM5YTZhMmU5In19fQ=="
                    , 1, "§3Knight §8◈ §7Kit", "", "§7Du kannst dir dieses Kit erst ab", "§7dem §3Knight §7Rang abholen!"));
        } else {
            kitInventory.setItem(19, TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTIzMTJlNzJkMDMwMTJiZTEwNmI0OGFjY2QzMzgyY2VjN2NiY2VjZWIxNDJlYzc2MjM3OTM0NjM5YTZhMmU5In19fQ=="
                    , 1, "§3Knight §8◈ §7Kit", "", "§aKlicke§7, um dir dein Kit abzuholen."));
        }
        if (!player.hasPermission(SkyPvP.getInstance().getPerms().kingPerms)) {
            kitInventory.setItem(25, TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQxNWFhY2I3MjEzYzgzMTFlZWQ3YmFmMzdlYmI1OGE1ZjRiOTI1NjMxN2Q4NDU4ZDE1ZDMzN2E3NGU0YmU2In19fQ=="
                    , 1, "§eKing §8◈ §7Kit","", "§7Du kannst dir dieses Kit erst ab", "§7dem §eKing §7Rang abholen!"));
        } else {
            kitInventory.setItem(25, TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQxNWFhY2I3MjEzYzgzMTFlZWQ3YmFmMzdlYmI1OGE1ZjRiOTI1NjMxN2Q4NDU4ZDE1ZDMzN2E3NGU0YmU2In19fQ=="
                    , 1, "§eKing §8◈ §7Kit", "", "§aKlicke§7, um dir dein Kit abzuholen."));
        }
        if (!player.hasPermission(SkyPvP.getInstance().getPerms().godPerms)) {
            kitInventory.setItem(30, TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmM4YjFmNmJiYjBlMmExYTllMDhiNDM0NmRmYWE2MWEzOTQ5NDM2Yzc5MmY1NDMwOGE0OGE4MGU1ZjlkODI5YSJ9fX0="
                    , 1, "§6God §8◈ §7Kit", "", "§7Du kannst dir dieses Kit erst ab", "§7dem §6God §7Rang abholen!"));
        } else {
            kitInventory.setItem(30, TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmM4YjFmNmJiYjBlMmExYTllMDhiNDM0NmRmYWE2MWEzOTQ5NDM2Yzc5MmY1NDMwOGE0OGE4MGU1ZjlkODI5YSJ9fX0="
                    , 1, "§6God §8◈ §7Kit", "", "§aKlicke§7, um dir dein Kit abzuholen."));
        }
        if (!player.hasPermission(SkyPvP.getInstance().getPerms().superiorPerms)) {
            kitInventory.setItem(32, TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDlmY2MyOGE5OGQxY2ZjYzk1MDEzMGJhMTUzYWE5OTYwNGNjYTUxZGRiOTRiZmJhNWZhNGUzMWMzNjNhMWM4MSJ9fX0="
                    , 1, "§dSuperior §8◈ §7Kit", "", "§7Du kannst dir dieses Kit erst ab", "§7dem §cSuperior §7Rang abholen!"));
        } else {
            kitInventory.setItem(32, TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDlmY2MyOGE5OGQxY2ZjYzk1MDEzMGJhMTUzYWE5OTYwNGNjYTUxZGRiOTRiZmJhNWZhNGUzMWMzNjNhMWM4MSJ9fX0="
                    , 1, "§dSuperior §8◈ §7Kit", "", "§aKlicke§7, um dir dein Kit abzuholen."));
        }
        player.openInventory(kitInventory);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }
}
