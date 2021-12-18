package net.pixelplays.skypvp.crates;

import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CratePreviewInventories {

    public void getPlayerCratePreviewInventory(Player player) {
        Inventory playerCratePreview = Bukkit.createInventory(null, 9 * 6, SkyPvP.getInstance().getTitles().playerCratePreviewInventoryTitle);
        playerCratePreview.setItem(0, SkyPvP.getInstance().getItems().PLAYER_HELMET_PREVIEW);
        playerCratePreview.setItem(1, SkyPvP.getInstance().getItems().PLAYER_CHESTPLATE_PREVIEW);
        playerCratePreview.setItem(2, SkyPvP.getInstance().getItems().PLAYER_PANTS_PREVIEW);
        playerCratePreview.setItem(3, SkyPvP.getInstance().getItems().PLAYER_SHOES_PREVIEW);
        playerCratePreview.setItem(4, SkyPvP.getInstance().getItems().PLAYER_SWORD_PREVIEW);
        playerCratePreview.setItem(5, SkyPvP.getInstance().getItems().playerPickAxePreview());
        playerCratePreview.setItem(6, SkyPvP.getInstance().getItems().playerAxePreview());
        playerCratePreview.setItem(7, SkyPvP.getInstance().getItems().playerShovelPreview());
        playerCratePreview.setItem(8, SkyPvP.getInstance().getItems().playerHoePreview());
        playerCratePreview.setItem(9, SkyPvP.getInstance().getItems().EXPERIENCE_PREVIEW);
        playerCratePreview.setItem(10, SkyPvP.getInstance().getItems().GOLDEN_APPLE_PREVIEW);
        playerCratePreview.setItem(11, SkyPvP.getInstance().getItems().PLAYER_COINS5_PREVIEW);
        playerCratePreview.setItem(12, SkyPvP.getInstance().getItems().PLAYER_COINS20_PREVIEW);
        playerCratePreview.setItem(13, SkyPvP.getInstance().getItems().PLAYER_COINS100_PREVIEW);

        playerCratePreview.setItem(45, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        playerCratePreview.setItem(46, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        playerCratePreview.setItem(47, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        playerCratePreview.setItem(48, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        playerCratePreview.setItem(49, SkyPvP.getInstance().getItems().CLOSE);
        playerCratePreview.setItem(50, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        playerCratePreview.setItem(51, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        playerCratePreview.setItem(52, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        playerCratePreview.setItem(53, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);

        player.openInventory(playerCratePreview);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }

    public void getKnightCratePreviewInventory(Player player) {
        Inventory knightCratePreview = Bukkit.createInventory(null, 9 * 6, SkyPvP.getInstance().getTitles().knightCratePreviewInventoryTitle);
        knightCratePreview.setItem(0, SkyPvP.getInstance().getItems().knightHelmetPreview());
        knightCratePreview.setItem(1, SkyPvP.getInstance().getItems().knightChestPlatePreview());
        knightCratePreview.setItem(2, SkyPvP.getInstance().getItems().knightPantsPreview());
        knightCratePreview.setItem(3, SkyPvP.getInstance().getItems().knightShoesPreview());
        knightCratePreview.setItem(4, SkyPvP.getInstance().getItems().knightSwordPreview());
        knightCratePreview.setItem(5, SkyPvP.getInstance().getItems().playerPickAxePreview());
        knightCratePreview.setItem(6, SkyPvP.getInstance().getItems().playerAxePreview());
        knightCratePreview.setItem(7, SkyPvP.getInstance().getItems().playerShovelPreview());
        knightCratePreview.setItem(8, SkyPvP.getInstance().getItems().playerHoePreview());
        knightCratePreview.setItem(9, SkyPvP.getInstance().getItems().EXPERIENCE_PREVIEW);
        knightCratePreview.setItem(10, SkyPvP.getInstance().getItems().GOLDEN_APPLE_PREVIEW);
        knightCratePreview.setItem(11, SkyPvP.getInstance().getItems().KNIGHT_COINS10_PREVIEW);
        knightCratePreview.setItem(12, SkyPvP.getInstance().getItems().KNIGHT_COINS50_PREVIEW);
        knightCratePreview.setItem(13, SkyPvP.getInstance().getItems().KNIGHT_COINS200_PREVIEW);

        knightCratePreview.setItem(45, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        knightCratePreview.setItem(46, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        knightCratePreview.setItem(47, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        knightCratePreview.setItem(48, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        knightCratePreview.setItem(49, SkyPvP.getInstance().getItems().CLOSE);
        knightCratePreview.setItem(50, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        knightCratePreview.setItem(51, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        knightCratePreview.setItem(52, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        knightCratePreview.setItem(53, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);

        player.openInventory(knightCratePreview);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }

    public void getKingCratePreviewInventory(Player player) {
        Inventory kingCratePreview = Bukkit.createInventory(null, 9 * 6, SkyPvP.getInstance().getTitles().kingCratePreviewInventoryTitle);
        kingCratePreview.setItem(0, SkyPvP.getInstance().getItems().kingHelmetPreview());
        kingCratePreview.setItem(1, SkyPvP.getInstance().getItems().kingChestPlatePreview());
        kingCratePreview.setItem(2, SkyPvP.getInstance().getItems().kingPantsPreview());
        kingCratePreview.setItem(3, SkyPvP.getInstance().getItems().kingShoesPreview());
        kingCratePreview.setItem(4, SkyPvP.getInstance().getItems().kingSwordPreview());
        kingCratePreview.setItem(5, SkyPvP.getInstance().getItems().kingPickAxePreview());
        kingCratePreview.setItem(6, SkyPvP.getInstance().getItems().kingAxePreview());
        kingCratePreview.setItem(7, SkyPvP.getInstance().getItems().kingShovelPreview());
        kingCratePreview.setItem(8, SkyPvP.getInstance().getItems().kingHoePreview());
        kingCratePreview.setItem(9, SkyPvP.getInstance().getItems().EXPERIENCE_PREVIEW);
        kingCratePreview.setItem(10, SkyPvP.getInstance().getItems().GOLDEN_APPLE_PREVIEW);
        kingCratePreview.setItem(11, SkyPvP.getInstance().getItems().KING_COINS20_PREVIEW);
        kingCratePreview.setItem(12, SkyPvP.getInstance().getItems().KING_COINS100_PREVIEW);
        kingCratePreview.setItem(13, SkyPvP.getInstance().getItems().KING_COINS1000_PREVIEW);

        kingCratePreview.setItem(45, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        kingCratePreview.setItem(46, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        kingCratePreview.setItem(47, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        kingCratePreview.setItem(48, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        kingCratePreview.setItem(49, SkyPvP.getInstance().getItems().CLOSE);
        kingCratePreview.setItem(50, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        kingCratePreview.setItem(51, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        kingCratePreview.setItem(52, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        kingCratePreview.setItem(53, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);

        player.openInventory(kingCratePreview);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }

    public void getGodCratePreviewInventory(Player player) {
        Inventory godCratePreview = Bukkit.createInventory(null, 9 * 6, SkyPvP.getInstance().getTitles().godCratePreviewInventoryTitle);
        godCratePreview.setItem(0, SkyPvP.getInstance().getItems().godHelmetPreview());
        godCratePreview.setItem(1, SkyPvP.getInstance().getItems().godChestPlatePreview());
        godCratePreview.setItem(2, SkyPvP.getInstance().getItems().godPantsPreview());
        godCratePreview.setItem(3, SkyPvP.getInstance().getItems().godShoesPreview());
        godCratePreview.setItem(4, SkyPvP.getInstance().getItems().godSwordPreview());
        godCratePreview.setItem(5, SkyPvP.getInstance().getItems().godPickAxePreview());
        godCratePreview.setItem(6, SkyPvP.getInstance().getItems().godAxePreview());
        godCratePreview.setItem(7, SkyPvP.getInstance().getItems().godShovelPreview());
        godCratePreview.setItem(8, SkyPvP.getInstance().getItems().godHoePreview());
        godCratePreview.setItem(9, SkyPvP.getInstance().getItems().EXPERIENCE_PREVIEW);
        godCratePreview.setItem(10, SkyPvP.getInstance().getItems().GOLDEN_APPLE_PREVIEW);
        godCratePreview.setItem(11, SkyPvP.getInstance().getItems().GOD_COINS50_PREVIEW);
        godCratePreview.setItem(12, SkyPvP.getInstance().getItems().GOD_COINS200_PREVIEW);
        godCratePreview.setItem(13, SkyPvP.getInstance().getItems().GOD_COINS2500_PREVIEW);

        godCratePreview.setItem(45, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        godCratePreview.setItem(46, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        godCratePreview.setItem(47, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        godCratePreview.setItem(48, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        godCratePreview.setItem(49, SkyPvP.getInstance().getItems().CLOSE);
        godCratePreview.setItem(50, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        godCratePreview.setItem(51, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        godCratePreview.setItem(52, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        godCratePreview.setItem(53, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);

        player.openInventory(godCratePreview);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }

    public void getSuperiorCratePreviewInventory(Player player) {
        Inventory superiorCratePreview = Bukkit.createInventory(null, 9 * 6, SkyPvP.getInstance().getTitles().superiorCratePreviewInventoryTitle);
        superiorCratePreview.setItem(0, SkyPvP.getInstance().getItems().superiorHelmetPreview());
        superiorCratePreview.setItem(1, SkyPvP.getInstance().getItems().superiorChestPlatePreview());
        superiorCratePreview.setItem(2, SkyPvP.getInstance().getItems().superiorPantsPreview());
        superiorCratePreview.setItem(3, SkyPvP.getInstance().getItems().superiorShoesPreview());
        superiorCratePreview.setItem(4, SkyPvP.getInstance().getItems().superiorSwordPreview());
        superiorCratePreview.setItem(5, SkyPvP.getInstance().getItems().superiorPickAxePreview());
        superiorCratePreview.setItem(6, SkyPvP.getInstance().getItems().superiorAxePreview());
        superiorCratePreview.setItem(7, SkyPvP.getInstance().getItems().superiorShovelPreview());
        superiorCratePreview.setItem(8, SkyPvP.getInstance().getItems().superiorHoePreview());
        superiorCratePreview.setItem(9, SkyPvP.getInstance().getItems().EXPERIENCE_PREVIEW);
        superiorCratePreview.setItem(10, SkyPvP.getInstance().getItems().GOLDEN_APPLE_PREVIEW);
        superiorCratePreview.setItem(11, SkyPvP.getInstance().getItems().SUPERIOR_COINS100_PREVIEW);
        superiorCratePreview.setItem(12, SkyPvP.getInstance().getItems().SUPERIOR_COINS1000_PREVIEW);
        superiorCratePreview.setItem(13, SkyPvP.getInstance().getItems().SUPERIOR_COINS10000_PREVIEW);

        superiorCratePreview.setItem(45, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        superiorCratePreview.setItem(46, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        superiorCratePreview.setItem(47, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        superiorCratePreview.setItem(48, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        superiorCratePreview.setItem(49, SkyPvP.getInstance().getItems().CLOSE);
        superiorCratePreview.setItem(50, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        superiorCratePreview.setItem(51, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        superiorCratePreview.setItem(52, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        superiorCratePreview.setItem(53, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);

        player.openInventory(superiorCratePreview);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }

    public void getCoinCratePreviewInventory(Player player) {
        Inventory coinCratePreview = Bukkit.createInventory(null, 9 * 6, SkyPvP.getInstance().getTitles().coinCratePreviewInventoryTitle);
        coinCratePreview.setItem(0, SkyPvP.getInstance().getItems().COINS5_PREVIEW);
        coinCratePreview.setItem(1, SkyPvP.getInstance().getItems().COINS10_PREVIEW);
        coinCratePreview.setItem(2, SkyPvP.getInstance().getItems().COINS20_PREVIEW);
        coinCratePreview.setItem(3, SkyPvP.getInstance().getItems().COINS50_PREVIEW);
        coinCratePreview.setItem(4, SkyPvP.getInstance().getItems().COINS100_PREVIEW);
        coinCratePreview.setItem(5, SkyPvP.getInstance().getItems().COINS200_PREVIEW);
        coinCratePreview.setItem(6, SkyPvP.getInstance().getItems().COINS1000_PREVIEW);
        coinCratePreview.setItem(7, SkyPvP.getInstance().getItems().COINS2500_PREVIEW);
        coinCratePreview.setItem(8, SkyPvP.getInstance().getItems().COINS10000_PREVIEW);

        coinCratePreview.setItem(45, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        coinCratePreview.setItem(46, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        coinCratePreview.setItem(47, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        coinCratePreview.setItem(48, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        coinCratePreview.setItem(49, SkyPvP.getInstance().getItems().CLOSE);
        coinCratePreview.setItem(50, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        coinCratePreview.setItem(51, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        coinCratePreview.setItem(52, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        coinCratePreview.setItem(53, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);

        player.openInventory(coinCratePreview);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }

}
