package net.pixelplays.skypvp.listeners;

import net.kyori.adventure.text.Component;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.apis.CoinAPI;
import net.pixelplays.skypvp.apis.SettingsAPI;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().blocksInventoryTitle)) {
            event.setCancelled(true);
            closeInventoryWhenClickOnClose(player, event);
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBlöcke §7(Seite 1)")) {
                SkyPvP.getInstance().getInventories().getBlocksInventoryPageOne(player);
            }
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBlöcke §7(Seite 2)")) {
                SkyPvP.getInstance().getInventories().getBlocksInventoryPageTwo(player);
            }
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBlöcke §7(Seite 3)")) {
                SkyPvP.getInstance().getInventories().getBlocksInventoryPageThree(player);
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().blocksInventoryTitlePageOne)) {
            event.setCancelled(true);
            closeInventoryWhenClickOnClose(player, event);
            openBlocksInventoryWhenClickOnBack(player, event);
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBlöcke §7(Seite 2)")) {
                SkyPvP.getInstance().getInventories().getBlocksInventoryPageTwo(player);
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().blocksInventoryTitlePageTwo)) {
            event.setCancelled(true);
            closeInventoryWhenClickOnClose(player, event);
            openBlocksInventoryWhenClickOnBack(player, event);
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBlöcke §7(Seite 1)")) {
                SkyPvP.getInstance().getInventories().getBlocksInventoryPageOne(player);
            }
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBlöcke §7(Seite 3)")) {
                SkyPvP.getInstance().getInventories().getBlocksInventoryPageThree(player);
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().blocksInventoryTitlePageThree)) {
            event.setCancelled(true);
            closeInventoryWhenClickOnClose(player, event);
            openBlocksInventoryWhenClickOnBack(player, event);
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aBlöcke §7(Seite 2)")) {
                SkyPvP.getInstance().getInventories().getBlocksInventoryPageTwo(player);
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().warpInventoryTitle)) {
            event.setCancelled(true);
            closeInventoryWhenClickOnClose(player, event);
            if (event.getCurrentItem() != null
                    && event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Citybuild §7(Klicke)")) {
                player.closeInventory();
                player.teleport(SkyPvP.getInstance().getLocationAPI().getLocation("Warp.Citybuild"));
                player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Du wurdest zum Citybuild Warp teleportiert");
            }
            if (event.getCurrentItem() != null
                    && event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§2Farmwelt §7(Klicke)")) {
                player.closeInventory();
                player.teleport(SkyPvP.getInstance().getLocationAPI().getLocation("Warp.Farmwelt"));
                player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Du wurdest zum Farmwelt Warp teleportiert");
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().rewardInventoryTitle)) {
            event.setCancelled(true);
            closeInventoryWhenClickOnClose(player, event);
            if (event.getCurrentItem() != null
                    && event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Spieler §8• §9Reward")) {
                SkyPvP.getInstance().getRewards().getPlayerReward(player);
                if (player.hasPermission(SkyPvP.getInstance().getPerms().superiorPerms)) {
                    return;
                } else if (player.hasPermission(SkyPvP.getInstance().getPerms().godPerms)) {
                    return;
                } else if (player.hasPermission(SkyPvP.getInstance().getPerms().kingPerms)) {
                    return;
                } else if (player.hasPermission(SkyPvP.getInstance().getPerms().knightPerms)) {
                    return;
                } else if (player.hasPermission(SkyPvP.getInstance().getPerms().playerPerms)) {
                    player.closeInventory();
                }
            }
            if (event.getCurrentItem() != null
                    && event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§3Knight §8• §3Reward")) {
                if (!player.hasPermission(SkyPvP.getInstance().getPerms().knightPerms)) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du kannst dir die Belohnung erst ab dem §3Knight Rang §7abholen."));
                } else {
                    SkyPvP.getInstance().getRewards().getKnightReward(player);
                    if (player.hasPermission(SkyPvP.getInstance().getPerms().superiorPerms)) {
                        return;
                    } else if (player.hasPermission(SkyPvP.getInstance().getPerms().godPerms)) {
                        return;
                    } else if (player.hasPermission(SkyPvP.getInstance().getPerms().kingPerms)) {
                        return;
                    } else if (player.hasPermission(SkyPvP.getInstance().getPerms().knightPerms)) {
                        player.closeInventory();
                    }
                }
            }
            if (event.getCurrentItem() != null
                    && event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eKing §8• §eReward")) {
                if (!player.hasPermission(SkyPvP.getInstance().getPerms().kingPerms)) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du kannst dir die Belohnung erst ab dem §eKing Rang §7abholen."));
                } else {
                    SkyPvP.getInstance().getRewards().getKingReward(player);
                    if (player.hasPermission(SkyPvP.getInstance().getPerms().superiorPerms)) {
                        return;
                    } else if (player.hasPermission(SkyPvP.getInstance().getPerms().godPerms)) {
                        return;
                    } else if (player.hasPermission(SkyPvP.getInstance().getPerms().kingPerms)) {
                        player.closeInventory();
                    }
                }
            }
            if (event.getCurrentItem() != null
                    && event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6God §8• §6Reward")) {
                if (!player.hasPermission(SkyPvP.getInstance().getPerms().godPerms)) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du kannst dir die Belohnung erst ab dem §6God Rang §7abholen."));
                } else {
                    SkyPvP.getInstance().getRewards().getGodReward(player);
                    if (player.hasPermission(SkyPvP.getInstance().getPerms().superiorPerms)) {
                        return;
                    } else if (player.hasPermission(SkyPvP.getInstance().getPerms().godPerms)) {
                        player.closeInventory();
                    }
                }
            }
            if (event.getCurrentItem() != null
                    && event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§dSuperior §8• §dReward")) {
                if (!player.hasPermission(SkyPvP.getInstance().getPerms().superiorPerms)) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du kannst dir die Belohnung erst ab dem §dSuperior Rang §7abholen."));
                } else {
                    SkyPvP.getInstance().getRewards().getSuperiorReward(player);
                    if (player.hasPermission(SkyPvP.getInstance().getPerms().superiorPerms)) {
                        player.closeInventory();
                    }
                }
            }
        }
        if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().bankInventoryTitle)) {
            event.setCancelled(true);
            closeInventoryWhenClickOnClose(player, event);
        }
        if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().rankInfoInventoryTitle)) {
            event.setCancelled(true);
            closeInventoryWhenClickOnClose(player, event);
        }
        // Crate Inventory
        if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().crateInventoryTitlePageOne)) {
            event.setCancelled(true);
            closeInventoryWhenClickOnClose(player, event);
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().PLAYER_CRATE_INVENTORY.getItemMeta().getDisplayName())) {
                addCrate(player, SkyPvP.getInstance().getItems().PLAYER_CRATE);
            }
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().KNIGHT_CRATE_INVENTORY.getItemMeta().getDisplayName())) {
                addCrate(player, SkyPvP.getInstance().getItems().KNIGHT_CRATE);
            }
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().KING_CRATE_INVENTORY.getItemMeta().getDisplayName())) {
                addCrate(player, SkyPvP.getInstance().getItems().KING_CRATE);
            }
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().GOD_CRATE_INVENTORY.getItemMeta().getDisplayName())) {
                addCrate(player, SkyPvP.getInstance().getItems().GOD_CRATE);
            }
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().SUPERIOR_CRATE_INVENTORY.getItemMeta().getDisplayName())) {
                addCrate(player, SkyPvP.getInstance().getItems().SUPERIOR_CRATE);
            }
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().COIN_CRATE_INVENTORY.getItemMeta().getDisplayName())) {
                addCrate(player, SkyPvP.getInstance().getItems().COIN_CRATE);
            }
        }
        // Settings Inventory
        if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().settingsInventoryTitle)) {
            event.setCancelled(true);
            closeInventoryWhenClickOnClose(player, event);
            boolean animation = SettingsAPI.getCrateAnimation(player.getUniqueId());
            boolean confirmation = SettingsAPI.getCrateConfirmation(player.getUniqueId());
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().CRATE_ANIMATION_ON.getItemMeta().getDisplayName())) {
                if (SettingsAPI.playerExists(player.getUniqueId())) {
                    if (animation) {
                        player.closeInventory();
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast die Animation bereits §aeingeschaltet!"));
                    } else {
                        SettingsAPI.setCrateAnimation(player.getUniqueId(), true);
                        player.closeInventory();
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Crateanimation §aaktiviert."));
                    }
                }
            }
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().CRATE_ANIMATION_OFF.getItemMeta().getDisplayName())) {
                if (SettingsAPI.playerExists(player.getUniqueId())) {
                    if (!animation) {
                        player.closeInventory();
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast die Animation bereits §causgeschaltet!"));
                    } else {
                        SettingsAPI.setCrateAnimation(player.getUniqueId(), false);
                        player.closeInventory();
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Crateanimation §cdeaktiviert."));
                    }
                }
            }
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().CRATE_CONFIRMATION_ON.getItemMeta().getDisplayName())) {
                if (SettingsAPI.playerExists(player.getUniqueId())) {
                    if (confirmation) {
                        player.closeInventory();
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast die Animation bereits §aeingeschaltet!"));
                    } else {
                        SettingsAPI.setCrateConfirmation(player.getUniqueId(), true);
                        player.closeInventory();
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Cratebestätigung §aaktiviert."));
                    }
                }
            }
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().CRATE_CONFIRMATION_OFF.getItemMeta().getDisplayName())) {
                if (SettingsAPI.playerExists(player.getUniqueId())) {
                    if (!confirmation) {
                        player.closeInventory();
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast die Bestätigung bereits §causgeschaltet!"));
                    } else {
                        SettingsAPI.setCrateConfirmation(player.getUniqueId(), false);
                        player.closeInventory();
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Cratebestätigung §cdeaktiviert."));
                    }
                }
            }
        }
        // Bank Unlock Inventory
        if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().bankUnlockInventoryTitle)) {
            event.setCancelled(true);
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().BANK_UNLOCK.getItemMeta().getDisplayName())) {
                if (!(CoinAPI.getCoins(player.getUniqueId()) >= 20000)) {
                    player.closeInventory();
                    player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 3);
                    player.sendMessage(Component.text("§7[§6Bankarbeiter§7] Du brauchst mindestens §620.000 Tokens§7, um ein Bankkonto erstellen zu können. Komme später wieder!"));
                } else {
                    player.closeInventory();
                    player.sendMessage(Component.text("§7[§6Bankarbeiter§7] Soweit haben wir nun alle Formalitäten geklärt. Klicke auf bestätigen, um dein Bankkonto zu erstellen."));
                    TextComponent applyMessage = new TextComponent("§7[§6Bankarbeiter§7] §aBestätigen");
                    applyMessage.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/bank applyaccount"));
                    applyMessage.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Klicke, um dein Bankkonto zu erstellen!").color(ChatColor.GRAY).create()));
                    player.sendMessage(applyMessage);
                }
            }
        }
        // Verlosung Inventory
        if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().drawInventoryTitle)) {
            event.setCancelled(true);
            if (event.getCurrentItem() != null &&
                    event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().CRATES.getItemMeta().getDisplayName())) {

            }
        }
    }

    /**
     * Any Methods that I need in the {@link org.bukkit.event.inventory.InventoryClickEvent}
     * @param player
     * @param event
     */
    public void closeInventoryWhenClickOnClose(Player player, InventoryClickEvent event) {
        if (event.getCurrentItem() != null &&
                event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().CLOSE.getItemMeta().getDisplayName())) {
            player.playSound(player.getLocation(), Sound.BLOCK_ENDER_CHEST_CLOSE, (float) 0.2, 2);
            player.closeInventory();
        }
    }

    public void openBlocksInventoryWhenClickOnBack(Player player, InventoryClickEvent event) {
        if (event.getCurrentItem() != null &&
                event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().CRATE_INVENTORY_PAGE_BACK.getItemMeta().getDisplayName())) {
            SkyPvP.getInstance().getInventories().getBlocksInventory(player);
        }
    }

    public void addCrate(Player player, ItemStack item) {
        player.getInventory().addItem(item);
        player.closeInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 2);
    }
}
