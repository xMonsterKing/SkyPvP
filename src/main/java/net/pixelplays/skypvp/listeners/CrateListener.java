package net.pixelplays.skypvp.listeners;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.apis.SettingsAPI;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class CrateListener implements Listener {

    HashMap<String, ItemStack> playerCrateMap = new HashMap<>();
    HashMap<String, ItemStack> knightCrateMap = new HashMap<>();
    HashMap<String, ItemStack> kingCrateMap = new HashMap<>();
    HashMap<String, ItemStack> godCrateMap = new HashMap<>();
    HashMap<String, ItemStack> superiorCrateMap = new HashMap<>();
    HashMap<String, ItemStack> coinCrateMap = new HashMap<>();

    ArrayList<Player> crateInInventory = new ArrayList<>();

    @EventHandler
    public void onOpenCrate(PlayerInteractEvent event) {
        final Player player = event.getPlayer();
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            boolean confirmation = SettingsAPI.getCrateConfirmation(player.getUniqueId());

            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().PLAYER_CRATE.getItemMeta().getDisplayName())) {
                if (confirmation) {
                    crateOpenAcceptDenyInv(player, SkyPvP.getInstance().getItems().PLAYER_CRATE);
                } else {
                    openCrate(player, SkyPvP.getInstance().getItems().PLAYER_CRATE, SkyPvP.getInstance().getCrateItems().playerCrate, playerCrateMap, crateInInventory);
                }
            }
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().KNIGHT_CRATE.getItemMeta().getDisplayName())) {
                crateOpenAcceptDenyInv(player, SkyPvP.getInstance().getItems().KNIGHT_CRATE);
            }
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().KING_CRATE.getItemMeta().getDisplayName())) {
                crateOpenAcceptDenyInv(player, SkyPvP.getInstance().getItems().KING_CRATE);
            }
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().GOD_CRATE.getItemMeta().getDisplayName())) {
                crateOpenAcceptDenyInv(player, SkyPvP.getInstance().getItems().GOD_CRATE);
            }
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().SUPERIOR_CRATE.getItemMeta().getDisplayName())) {
                crateOpenAcceptDenyInv(player, SkyPvP.getInstance().getItems().SUPERIOR_CRATE);
            }
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().COIN_CRATE.getItemMeta().getDisplayName())) {
                crateOpenAcceptDenyInv(player, SkyPvP.getInstance().getItems().COIN_CRATE);
            }
        }
        if (event.getAction().equals(Action.LEFT_CLICK_AIR)) {
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().PLAYER_CRATE.getItemMeta().getDisplayName())) {
                SkyPvP.getInstance().getCratePreviewInventories().getPlayerCratePreviewInventory(player);
            }
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().KNIGHT_CRATE.getItemMeta().getDisplayName())) {
                SkyPvP.getInstance().getCratePreviewInventories().getKnightCratePreviewInventory(player);
            }
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().KING_CRATE.getItemMeta().getDisplayName())) {
                SkyPvP.getInstance().getCratePreviewInventories().getKingCratePreviewInventory(player);
            }
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().GOD_CRATE.getItemMeta().getDisplayName())) {
                SkyPvP.getInstance().getCratePreviewInventories().getGodCratePreviewInventory(player);
            }
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().SUPERIOR_CRATE.getItemMeta().getDisplayName())) {
                SkyPvP.getInstance().getCratePreviewInventories().getSuperiorCratePreviewInventory(player);
            }
            if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                    player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().COIN_CRATE.getItemMeta().getDisplayName())) {
                SkyPvP.getInstance().getCratePreviewInventories().getCoinCratePreviewInventory(player);
            }
        }
    }

    @EventHandler
    public void onCrateClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        boolean animation = SettingsAPI.getCrateAnimation(player.getUniqueId());
        if (event.getCurrentItem() != null &&
                event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().CRATE_CONFIRM.getItemMeta().getDisplayName())) {
            event.setCancelled(true);
            if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getItems().PLAYER_CRATE.getItemMeta().getDisplayName())) {
                event.setCancelled(true);
                if (animation) {
                    openCrate(player, SkyPvP.getInstance().getItems().PLAYER_CRATE, SkyPvP.getInstance().getCrateItems().playerCrate, playerCrateMap, crateInInventory);
                } else {
                    getWinWithoutAnimation(player, event, SkyPvP.getInstance().getCrateItems().playerCrate);
                }
                crateCancelClick(player, event);
            }
            if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().playerCratePreviewInventoryTitle)) {
                event.setCancelled(true);
                closeInventoryWhenClickOnClose(player, event);
            }
            if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getItems().KNIGHT_CRATE.getItemMeta().getDisplayName())) {
                event.setCancelled(true);
                if (animation) {
                    openCrate(player, SkyPvP.getInstance().getItems().KNIGHT_CRATE, SkyPvP.getInstance().getCrateItems().knightCrate, knightCrateMap, crateInInventory);
                } else {
                    getWinWithoutAnimation(player, event, SkyPvP.getInstance().getCrateItems().knightCrate);
                }
                crateCancelClick(player, event);
            }
            if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().knightCratePreviewInventoryTitle)) {
                event.setCancelled(true);
                closeInventoryWhenClickOnClose(player, event);
            }
            if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getItems().KING_CRATE.getItemMeta().getDisplayName())) {
                event.setCancelled(true);
                if (animation) {
                    openCrate(player, SkyPvP.getInstance().getItems().KING_CRATE, SkyPvP.getInstance().getCrateItems().kingCrate, kingCrateMap, crateInInventory);
                } else {
                    getWinWithoutAnimation(player, event, SkyPvP.getInstance().getCrateItems().playerCrate);
                }
                crateCancelClick(player, event);
            }
            if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().kingCratePreviewInventoryTitle)) {
                event.setCancelled(true);
                closeInventoryWhenClickOnClose(player, event);
            }
            if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getItems().GOD_CRATE.getItemMeta().getDisplayName())) {
                event.setCancelled(true);
                if (animation) {
                    openCrate(player, SkyPvP.getInstance().getItems().GOD_CRATE, SkyPvP.getInstance().getCrateItems().godCrate, godCrateMap, crateInInventory);
                } else {
                    getWinWithoutAnimation(player, event, SkyPvP.getInstance().getCrateItems().godCrate);
                }
                crateCancelClick(player, event);
            }
            if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().godCratePreviewInventoryTitle)) {
                event.setCancelled(true);
                closeInventoryWhenClickOnClose(player, event);
            }
            if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getItems().SUPERIOR_CRATE.getItemMeta().getDisplayName())) {
                event.setCancelled(true);
                if (animation) {
                    openCrate(player, SkyPvP.getInstance().getItems().SUPERIOR_CRATE, SkyPvP.getInstance().getCrateItems().superiorCrate, superiorCrateMap, crateInInventory);
                } else {
                    getWinWithoutAnimation(player, event, SkyPvP.getInstance().getCrateItems().superiorCrate);
                }
                crateCancelClick(player, event);
            }
            if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().superiorCratePreviewInventoryTitle)) {
                event.setCancelled(true);
                closeInventoryWhenClickOnClose(player, event);
            }
            if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getItems().COIN_CRATE.getItemMeta().getDisplayName())) {
                event.setCancelled(true);
                if (animation) {
                    openCrate(player, SkyPvP.getInstance().getItems().COIN_CRATE, SkyPvP.getInstance().getCrateItems().coinCrate, coinCrateMap, crateInInventory);
                } else {
                    getWinWithoutAnimation(player, event, SkyPvP.getInstance().getCrateItems().coinCrate);
                }
                crateCancelClick(player, event);
            }
            if (event.getView().getTitle().equalsIgnoreCase(SkyPvP.getInstance().getTitles().coinCratePreviewInventoryTitle)) {
                event.setCancelled(true);
                closeInventoryWhenClickOnClose(player, event);
            }
        }
    }

    public void crateOpenAcceptDenyInv(Player player, ItemStack item) {
        if (player.getInventory().getItemInMainHand().getItemMeta() != null &&
                player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(item.getItemMeta().getDisplayName())) {
            Inventory inventory = Bukkit.createInventory(null, 9 * 3, item.getItemMeta().getDisplayName());
            for (int i = 0; i < inventory.getSize(); i++) {
                inventory.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
            }
            inventory.setItem(10, SkyPvP.getInstance().getItems().CRATE_CONFIRM);
            inventory.setItem(11, SkyPvP.getInstance().getItems().CRATE_CONFIRM);
            inventory.setItem(13, SkyPvP.getInstance().getItems().CRATE_CONFIRMATION_INFO);
            inventory.setItem(15, SkyPvP.getInstance().getItems().CRATE_CANCEL);
            inventory.setItem(16, SkyPvP.getInstance().getItems().CRATE_CANCEL);
            player.openInventory(inventory);
            player.updateInventory();
            player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 2);
        }
    }

    public void getWinWithoutAnimation(Player player, InventoryClickEvent event, ArrayList<ItemStack> crateItems) {
        if (event.getCurrentItem() != null &&
                event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().CRATE_CONFIRM.getItemMeta().getDisplayName())) {
            Random random = new Random();
            ItemStack win = crateItems.get(random.nextInt(crateItems.size()));
            player.getInventory().addItem(win);

            if (player.getInventory().getItemInMainHand().getAmount() == 1) {
                player.getInventory().remove(player.getInventory().getItemInMainHand());
            } else {
                player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
            }
            player.closeInventory();
            player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast das Item " + win.getItemMeta().getDisplayName() + " §7gewonnen!");
        }
    }

    public void openCrate(Player player, ItemStack item, ArrayList<ItemStack> crateItems, HashMap<String, ItemStack> crateMap, ArrayList<Player> crateInInventory) {
        Random random = new Random();
        ItemStack itemOne;
        ItemStack itemTwo;
        ItemStack itemThree;
        ItemStack itemFour;
        ItemStack itemFive;
        if (!crateItems.isEmpty()) {
            itemOne = crateItems.get(random.nextInt(crateItems.size()));
            itemTwo = crateItems.get(random.nextInt(crateItems.size()));
            itemThree = crateItems.get(random.nextInt(crateItems.size()));
            itemFour = crateItems.get(random.nextInt(crateItems.size()));
            itemFive = crateItems.get(random.nextInt(crateItems.size()));
        } else {
            player.sendMessage(Component.text("§cEs konnten keine Items gefunden werden"));
            return;
        }

        if (player.getInventory().getItemInMainHand().getAmount() == 1) {
            player.getInventory().remove(player.getInventory().getItemInMainHand());
        } else {
            player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
        }
        Inventory inventory = Bukkit.createInventory(null, 9 * 3, item.displayName());
        for (int i = 0; i < inventory.getSize(); i++) {
            inventory.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        if (!crateItems.isEmpty()) {
            inventory.setItem(11, itemOne);
            inventory.setItem(12, itemTwo);
            inventory.setItem(12, itemThree);
            inventory.setItem(12, itemFour);
            inventory.setItem(12, itemFive);

            crateMap.put(player.getName() + "1", itemOne);
            crateMap.put(player.getName() + "2", itemTwo);
            crateMap.put(player.getName() + "3", itemThree);
            crateMap.put(player.getName() + "4", itemFour);
            crateMap.put(player.getName() + "5", itemFive);
        } else {
            player.sendMessage(Component.text("§cEs konnten keine Items gefunden werden"));
            return;
        }
        inventory.setItem(4, SkyPvP.getInstance().getItems().CRATE_WIN);

        player.openInventory(inventory);
        SkyPvP.getInstance().getUtils().crateOpened.add(player);
        crateInInventory.add(player);

        int taskOne = Bukkit.getScheduler().scheduleSyncRepeatingTask(SkyPvP.getInstance(), () -> {
            if (player.getOpenInventory() != null) {
                ItemStack item01 = crateItems.get(random.nextInt(crateItems.size()));
                ItemStack item02 = crateMap.get(player.getName() + "1");
                ItemStack item03 = crateMap.get(player.getName() + "2");
                ItemStack item04 = crateMap.get(player.getName() + "3");
                ItemStack item05 = crateMap.get(player.getName() + "4");

                crateMap.remove(player.getName() + "1");
                crateMap.remove(player.getName() + "2");
                crateMap.remove(player.getName() + "3");
                crateMap.remove(player.getName() + "4");
                crateMap.remove(player.getName() + "5");

                crateMap.put(player.getName() + "1", item01);
                crateMap.put(player.getName() + "2", item02);
                crateMap.put(player.getName() + "3", item03);
                crateMap.put(player.getName() + "4", item04);
                crateMap.put(player.getName() + "5", item05);

                inventory.setItem(11, item01);
                inventory.setItem(12, item02);
                inventory.setItem(13, item03);
                inventory.setItem(14, item04);
                inventory.setItem(15, item05);
            }
        }, 5L, 5L);

        AtomicInteger taskTwo = new AtomicInteger();
        Bukkit.getScheduler().runTaskLaterAsynchronously(SkyPvP.getInstance(), () -> {
            Bukkit.getScheduler().cancelTask(taskOne);
            taskTwo.set(Bukkit.getScheduler().scheduleSyncRepeatingTask(SkyPvP.getInstance(), () -> {
                if (player.getOpenInventory() != null) {
                    ItemStack item01 = crateItems.get(random.nextInt(crateItems.size()));
                    ItemStack item02 = crateMap.get(player.getName() + "1");
                    ItemStack item03 = crateMap.get(player.getName() + "2");
                    ItemStack item04 = crateMap.get(player.getName() + "3");
                    ItemStack item05 = crateMap.get(player.getName() + "4");

                    crateMap.remove(player.getName() + "1");
                    crateMap.remove(player.getName() + "2");
                    crateMap.remove(player.getName() + "3");
                    crateMap.remove(player.getName() + "4");
                    crateMap.remove(player.getName() + "5");

                    crateMap.put(player.getName() + "1", item01);
                    crateMap.put(player.getName() + "2", item02);
                    crateMap.put(player.getName() + "3", item03);
                    crateMap.put(player.getName() + "4", item04);
                    crateMap.put(player.getName() + "5", item05);

                    inventory.setItem(11, item01);
                    inventory.setItem(12, item02);
                    inventory.setItem(13, item03);
                    inventory.setItem(14, item04);
                    inventory.setItem(15, item05);
                }
            }, 10L, 10L));
        }, 20 * 5L);

        AtomicInteger taskThree = new AtomicInteger();
        Bukkit.getScheduler().runTaskLaterAsynchronously(SkyPvP.getInstance(), () -> {
            Bukkit.getScheduler().cancelTask(taskTwo.get());
            taskThree.set(Bukkit.getScheduler().scheduleSyncRepeatingTask(SkyPvP.getInstance(), () -> {
                if (player.getOpenInventory() != null) {
                    ItemStack item01 = crateItems.get(random.nextInt(crateItems.size()));
                    ItemStack item02 = crateMap.get(player.getName() + "1");
                    ItemStack item03 = crateMap.get(player.getName() + "2");
                    ItemStack item04 = crateMap.get(player.getName() + "3");
                    ItemStack item05 = crateMap.get(player.getName() + "4");

                    crateMap.remove(player.getName() + "1");
                    crateMap.remove(player.getName() + "2");
                    crateMap.remove(player.getName() + "3");
                    crateMap.remove(player.getName() + "4");
                    crateMap.remove(player.getName() + "5");

                    crateMap.put(player.getName() + "1", item01);
                    crateMap.put(player.getName() + "2", item02);
                    crateMap.put(player.getName() + "3", item03);
                    crateMap.put(player.getName() + "4", item04);
                    crateMap.put(player.getName() + "5", item05);

                    inventory.setItem(11, item01);
                    inventory.setItem(12, item02);
                    inventory.setItem(13, item03);
                    inventory.setItem(14, item04);
                    inventory.setItem(15, item05);
                }
            }, 10L, 10L));
        }, 20 * 10L);

        Bukkit.getScheduler().runTaskLaterAsynchronously(SkyPvP.getInstance(), () -> {
            if (player.getOpenInventory() != null) {
                Bukkit.getScheduler().cancelTask(taskThree.get());
                ItemStack win = crateMap.get(player.getName() + "3");
                Bukkit.getScheduler().runTaskLater(SkyPvP.getInstance(), () -> {
                    player.getInventory().addItem(win);
                    player.sendMessage(SkyPvP.getInstance().getUtils().Prefix + "§7Du hast das Item " + win.getItemMeta().getDisplayName() + " §7gewonnen!");
                    SkyPvP.getInstance().getUtils().crateOpened.remove(player);
                    player.closeInventory();
                }, 20 * 3L);
            }
        }, 20 * 15L);
    }

    public void crateCancelClick(Player player, InventoryClickEvent event) {
        if (event.getCurrentItem() != null && event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cAbbrechen")) {
            player.closeInventory();
        }
    }

    public void closeInventoryWhenClickOnClose(Player player, InventoryClickEvent event) {
        if (event.getCurrentItem() != null &&
                event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(SkyPvP.getInstance().getItems().CLOSE.getItemMeta().getDisplayName())) {
            player.playSound(player.getLocation(), Sound.BLOCK_ENDER_CHEST_CLOSE, (float) 0.2, 2);
            player.closeInventory();
        }
    }
}
