package net.pixelplays.skypvp.utils;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.apis.BankAPI;
import net.pixelplays.skypvp.apis.TextureAPI;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Inventories {

    /**
     * Create the Inventory for the blocks command
     */

    public void getBlocksInventory(Player player) {
        Inventory blocksInventory = Bukkit.createInventory(null, 9 * 3, SkyPvP.getInstance().getTitles().blocksInventoryTitle);
        for (int i = 0; i < blocksInventory.getSize(); i++) {
            blocksInventory.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        blocksInventory.setItem(11, SkyPvP.getInstance().getItems().BLOCKS_PAGE_ONE);
        blocksInventory.setItem(13, SkyPvP.getInstance().getItems().BLOCKS_PAGE_TWO);
        blocksInventory.setItem(15, SkyPvP.getInstance().getItems().BLOCKS_PAGE_THREE);

        blocksInventory.setItem(22, SkyPvP.getInstance().getItems().CLOSE);
        player.openInventory(blocksInventory);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }


    /**
     * Create the Inventory for the first page of the blocks command
     */

    public void getBlocksInventoryPageOne(Player player) {
        Inventory blockInventoryPageOne = Bukkit.createInventory(null, 9 * 6, SkyPvP.getInstance().getTitles().blocksInventoryTitlePageOne);
        for (int i = 0; i < blockInventoryPageOne.getSize(); i++) {
            blockInventoryPageOne.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        blockInventoryPageOne.setItem(0, SkyPvP.getInstance().getBlocksItems().STONE);
        blockInventoryPageOne.setItem(1, SkyPvP.getInstance().getBlocksItems().GRANITE);
        blockInventoryPageOne.setItem(2, SkyPvP.getInstance().getBlocksItems().POLISHED_GRANITE);
        blockInventoryPageOne.setItem(3, SkyPvP.getInstance().getBlocksItems().DIORITE);
        blockInventoryPageOne.setItem(4, SkyPvP.getInstance().getBlocksItems().POLISHED_DIORITE);
        blockInventoryPageOne.setItem(5, SkyPvP.getInstance().getBlocksItems().ANDESITE);
        blockInventoryPageOne.setItem(6, SkyPvP.getInstance().getBlocksItems().POLISHED_ANDESITE);
        blockInventoryPageOne.setItem(7, SkyPvP.getInstance().getBlocksItems().DEEPSLATE);
        blockInventoryPageOne.setItem(8, SkyPvP.getInstance().getBlocksItems().COBBLED_DEEPSLATE);

        blockInventoryPageOne.setItem(9, SkyPvP.getInstance().getBlocksItems().POLISHED_DEEPSLATE);
        blockInventoryPageOne.setItem(10, SkyPvP.getInstance().getBlocksItems().TUFF);
        blockInventoryPageOne.setItem(11, SkyPvP.getInstance().getBlocksItems().GRASS_BLOCK);
        blockInventoryPageOne.setItem(12, SkyPvP.getInstance().getBlocksItems().DIRT);
        blockInventoryPageOne.setItem(13, SkyPvP.getInstance().getBlocksItems().COARSE_DIRT);
        blockInventoryPageOne.setItem(14, SkyPvP.getInstance().getBlocksItems().PODZOL);
        blockInventoryPageOne.setItem(15, SkyPvP.getInstance().getBlocksItems().ROOTED_DIRT);
        blockInventoryPageOne.setItem(16, SkyPvP.getInstance().getBlocksItems().CRIMSON_NYLIUM);
        blockInventoryPageOne.setItem(17, SkyPvP.getInstance().getBlocksItems().WARPED_NYLIUM);

        blockInventoryPageOne.setItem(18, SkyPvP.getInstance().getBlocksItems().COBBLESTONE);
        blockInventoryPageOne.setItem(19, SkyPvP.getInstance().getBlocksItems().SAND);
        blockInventoryPageOne.setItem(20, SkyPvP.getInstance().getBlocksItems().RED_SAND);
        blockInventoryPageOne.setItem(21, SkyPvP.getInstance().getBlocksItems().GRAVEL);
        blockInventoryPageOne.setItem(22, SkyPvP.getInstance().getBlocksItems().SANDSTONE);
        blockInventoryPageOne.setItem(23, SkyPvP.getInstance().getBlocksItems().CHISELED_SANDSTONE);
        blockInventoryPageOne.setItem(24, SkyPvP.getInstance().getBlocksItems().CUT_SANDSTONE);
        blockInventoryPageOne.setItem(25, SkyPvP.getInstance().getBlocksItems().SMOOTH_SANDSTONE);
        blockInventoryPageOne.setItem(26, SkyPvP.getInstance().getBlocksItems().RED_SANDSTONE);

        blockInventoryPageOne.setItem(27, SkyPvP.getInstance().getBlocksItems().CHISELED_RED_SANDSTONE);
        blockInventoryPageOne.setItem(28, SkyPvP.getInstance().getBlocksItems().CUT_RED_SANDSTONE);
        blockInventoryPageOne.setItem(29, SkyPvP.getInstance().getBlocksItems().SMOOTH_RED_SANDSTONE);
        blockInventoryPageOne.setItem(30, SkyPvP.getInstance().getBlocksItems().SMOOTH_STONE);
        blockInventoryPageOne.setItem(31, SkyPvP.getInstance().getBlocksItems().STONE_BRICKS);
        blockInventoryPageOne.setItem(32, SkyPvP.getInstance().getBlocksItems().MOSSY_STONE_BRICKS);
        blockInventoryPageOne.setItem(33, SkyPvP.getInstance().getBlocksItems().CRACKED_STONE_BRICKS);
        blockInventoryPageOne.setItem(34, SkyPvP.getInstance().getBlocksItems().CHISELED_STONE_BRICKS);
        blockInventoryPageOne.setItem(35, SkyPvP.getInstance().getBlocksItems().BRICKS);

        blockInventoryPageOne.setItem(36, SkyPvP.getInstance().getBlocksItems().MOSSY_COBBLESTONE);
        blockInventoryPageOne.setItem(37, SkyPvP.getInstance().getBlocksItems().NETHERRACK);
        blockInventoryPageOne.setItem(38, SkyPvP.getInstance().getBlocksItems().NETHER_BRICKS);
        blockInventoryPageOne.setItem(39, SkyPvP.getInstance().getBlocksItems().SOUL_SAND);
        blockInventoryPageOne.setItem(40, SkyPvP.getInstance().getBlocksItems().SOUL_SOIL);
        blockInventoryPageOne.setItem(41, SkyPvP.getInstance().getBlocksItems().BASALT);
        blockInventoryPageOne.setItem(42, SkyPvP.getInstance().getBlocksItems().POLISHED_BASALT);
        blockInventoryPageOne.setItem(43, SkyPvP.getInstance().getBlocksItems().SMOOTH_BASALT);
        blockInventoryPageOne.setItem(44, SkyPvP.getInstance().getBlocksItems().MYCELIUM);

        blockInventoryPageOne.setItem(45, SkyPvP.getInstance().getItems().BACK);
        blockInventoryPageOne.setItem(49, SkyPvP.getInstance().getItems().CLOSE);
        blockInventoryPageOne.setItem(50, SkyPvP.getInstance().getItems().BLOCKS_PAGE_TWO);
        player.openInventory(blockInventoryPageOne);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }

    public void getBlocksInventoryPageTwo(Player player) {
        Inventory blockInventoryPageTwo = Bukkit.createInventory(null, 9 * 6, SkyPvP.getInstance().getTitles().blocksInventoryTitlePageTwo);
        for (int i = 0; i < blockInventoryPageTwo.getSize(); i++) {
            blockInventoryPageTwo.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        blockInventoryPageTwo.setItem(0, SkyPvP.getInstance().getBlocksItems().OAK_LOG);
        blockInventoryPageTwo.setItem(1, SkyPvP.getInstance().getBlocksItems().SPRUCE_LOG);
        blockInventoryPageTwo.setItem(2, SkyPvP.getInstance().getBlocksItems().BIRCH_LOG);
        blockInventoryPageTwo.setItem(3, SkyPvP.getInstance().getBlocksItems().JUNGLE_LOG);
        blockInventoryPageTwo.setItem(4, SkyPvP.getInstance().getBlocksItems().ACACIA_LOG);
        blockInventoryPageTwo.setItem(5, SkyPvP.getInstance().getBlocksItems().DARK_OAK_LOG);
        blockInventoryPageTwo.setItem(6, SkyPvP.getInstance().getBlocksItems().CRIMSON_STEM);
        blockInventoryPageTwo.setItem(7, SkyPvP.getInstance().getBlocksItems().WARPED_STEM);
        blockInventoryPageTwo.setItem(8, SkyPvP.getInstance().getBlocksItems().STRIPPED_OAK_LOG);

        blockInventoryPageTwo.setItem(9, SkyPvP.getInstance().getBlocksItems().STRIPPED_SPRUCE_LOG);
        blockInventoryPageTwo.setItem(10, SkyPvP.getInstance().getBlocksItems().STRIPPED_BIRCH_LOG);
        blockInventoryPageTwo.setItem(11, SkyPvP.getInstance().getBlocksItems().STRIPPED_JUNGLE_LOG);
        blockInventoryPageTwo.setItem(12, SkyPvP.getInstance().getBlocksItems().STRIPPED_ACACIA_LOG);
        blockInventoryPageTwo.setItem(13, SkyPvP.getInstance().getBlocksItems().STRIPPED_DARK_OAK_LOG);
        blockInventoryPageTwo.setItem(14, SkyPvP.getInstance().getBlocksItems().STRIPPED_CRIMSON_STEM);
        blockInventoryPageTwo.setItem(15, SkyPvP.getInstance().getBlocksItems().STRIPPED_WARPED_STEM);
        blockInventoryPageTwo.setItem(16, SkyPvP.getInstance().getBlocksItems().STRIPPED_OAK_WOOD);
        blockInventoryPageTwo.setItem(17, SkyPvP.getInstance().getBlocksItems().STRIPPED_SPRUCE_WOOD);

        blockInventoryPageTwo.setItem(18, SkyPvP.getInstance().getBlocksItems().STRIPPED_BIRCH_WOOD);
        blockInventoryPageTwo.setItem(19, SkyPvP.getInstance().getBlocksItems().STRIPPED_JUNGLE_WOOD);
        blockInventoryPageTwo.setItem(20, SkyPvP.getInstance().getBlocksItems().STRIPPED_ACACIA_WOOD);
        blockInventoryPageTwo.setItem(21, SkyPvP.getInstance().getBlocksItems().STRIPPED_DARK_OAK_WOOD);
        blockInventoryPageTwo.setItem(22, SkyPvP.getInstance().getBlocksItems().STRIPPED_CRIMSON_HYPHAE);
        blockInventoryPageTwo.setItem(23, SkyPvP.getInstance().getBlocksItems().STRIPPED_WARPED_HYPHAE);
        blockInventoryPageTwo.setItem(24, SkyPvP.getInstance().getBlocksItems().OAK_WOOD);
        blockInventoryPageTwo.setItem(25, SkyPvP.getInstance().getBlocksItems().SPRUCE_WOOD);
        blockInventoryPageTwo.setItem(26, SkyPvP.getInstance().getBlocksItems().BIRCH_WOOD);

        blockInventoryPageTwo.setItem(27, SkyPvP.getInstance().getBlocksItems().JUNGLE_WOOD);
        blockInventoryPageTwo.setItem(28, SkyPvP.getInstance().getBlocksItems().ACACIA_WOOD);
        blockInventoryPageTwo.setItem(29, SkyPvP.getInstance().getBlocksItems().DARK_OAK_WOOD);
        blockInventoryPageTwo.setItem(30, SkyPvP.getInstance().getBlocksItems().CRIMSON_HYPHAE);
        blockInventoryPageTwo.setItem(31, SkyPvP.getInstance().getBlocksItems().WARPED_HYPHAE);
        blockInventoryPageTwo.setItem(32, SkyPvP.getInstance().getBlocksItems().OAK_PLANKS);
        blockInventoryPageTwo.setItem(33, SkyPvP.getInstance().getBlocksItems().SPRUCE_PLANKS);
        blockInventoryPageTwo.setItem(34, SkyPvP.getInstance().getBlocksItems().BIRCH_PLANKS);
        blockInventoryPageTwo.setItem(35, SkyPvP.getInstance().getBlocksItems().JUNGLE_PLANKS);

        blockInventoryPageTwo.setItem(36, SkyPvP.getInstance().getBlocksItems().ACACIA_PLANKS);
        blockInventoryPageTwo.setItem(37, SkyPvP.getInstance().getBlocksItems().DARK_OAK_PLANKS);
        blockInventoryPageTwo.setItem(38, SkyPvP.getInstance().getBlocksItems().CRIMSON_PLANKS);
        blockInventoryPageTwo.setItem(39, SkyPvP.getInstance().getBlocksItems().WARPED_PLANKS);
        blockInventoryPageTwo.setItem(40, SkyPvP.getInstance().getBlocksItems().CHEST);
        blockInventoryPageTwo.setItem(41, SkyPvP.getInstance().getBlocksItems().BARREL);
        blockInventoryPageTwo.setItem(42, SkyPvP.getInstance().getBlocksItems().CRAFTING_TABLE);
        blockInventoryPageTwo.setItem(43, SkyPvP.getInstance().getBlocksItems().COMPOSTER);
        blockInventoryPageTwo.setItem(44, SkyPvP.getInstance().getBlocksItems().LOOM);

        blockInventoryPageTwo.setItem(45, SkyPvP.getInstance().getItems().BACK);
        blockInventoryPageTwo.setItem(48, SkyPvP.getInstance().getItems().BLOCKS_PAGE_ONE);
        blockInventoryPageTwo.setItem(49, SkyPvP.getInstance().getItems().CLOSE);
        blockInventoryPageTwo.setItem(50, SkyPvP.getInstance().getItems().BLOCKS_PAGE_THREE);
        player.openInventory(blockInventoryPageTwo);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }

    public void getBlocksInventoryPageThree(Player player) {
        Inventory blockInventoryPageThree = Bukkit.createInventory(null, 9 * 6, SkyPvP.getInstance().getTitles().blocksInventoryTitlePageThree);
        for (int i = 0; i < blockInventoryPageThree.getSize(); i++) {
            blockInventoryPageThree.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        blockInventoryPageThree.setItem(0, SkyPvP.getInstance().getBlocksItems().WHITE_WOOL);
        blockInventoryPageThree.setItem(1, SkyPvP.getInstance().getBlocksItems().ORANGE_WOOL);
        blockInventoryPageThree.setItem(2, SkyPvP.getInstance().getBlocksItems().MAGENTA_WOOL);
        blockInventoryPageThree.setItem(3, SkyPvP.getInstance().getBlocksItems().LIGHT_BLUE_WOOL);
        blockInventoryPageThree.setItem(4, SkyPvP.getInstance().getBlocksItems().YELLOW_WOOL);
        blockInventoryPageThree.setItem(5, SkyPvP.getInstance().getBlocksItems().LIME_WOOL);
        blockInventoryPageThree.setItem(6, SkyPvP.getInstance().getBlocksItems().PINK_WOOL);
        blockInventoryPageThree.setItem(7, SkyPvP.getInstance().getBlocksItems().GRAY_WOOL);
        blockInventoryPageThree.setItem(8, SkyPvP.getInstance().getBlocksItems().LIGHT_GRAY_WOOL);

        blockInventoryPageThree.setItem(9, SkyPvP.getInstance().getBlocksItems().CYAN_WOOL);
        blockInventoryPageThree.setItem(10, SkyPvP.getInstance().getBlocksItems().PURPLE_WOOL);
        blockInventoryPageThree.setItem(11, SkyPvP.getInstance().getBlocksItems().BLUE_WOOL);
        blockInventoryPageThree.setItem(12, SkyPvP.getInstance().getBlocksItems().BROWN_WOOL);
        blockInventoryPageThree.setItem(13, SkyPvP.getInstance().getBlocksItems().GREEN_WOOL);
        blockInventoryPageThree.setItem(14, SkyPvP.getInstance().getBlocksItems().RED_WOOL);
        blockInventoryPageThree.setItem(15, SkyPvP.getInstance().getBlocksItems().BLACK_WOOL);
        blockInventoryPageThree.setItem(16, SkyPvP.getInstance().getBlocksItems().WHITE_TERRACOTTA);
        blockInventoryPageThree.setItem(17, SkyPvP.getInstance().getBlocksItems().ORANGE_TERRACOTTA);

        blockInventoryPageThree.setItem(18, SkyPvP.getInstance().getBlocksItems().MAGENTA_TERRACOTTA);
        blockInventoryPageThree.setItem(19, SkyPvP.getInstance().getBlocksItems().LIGHT_BLUE_TERRACOTTA);
        blockInventoryPageThree.setItem(20, SkyPvP.getInstance().getBlocksItems().YELLOW_TERRACOTTA);
        blockInventoryPageThree.setItem(21, SkyPvP.getInstance().getBlocksItems().LIME_TERRACOTTA);
        blockInventoryPageThree.setItem(22, SkyPvP.getInstance().getBlocksItems().PINK_TERRACOTTA);
        blockInventoryPageThree.setItem(23, SkyPvP.getInstance().getBlocksItems().GRAY_TERRACOTTA);
        blockInventoryPageThree.setItem(24, SkyPvP.getInstance().getBlocksItems().LIGHT_GRAY_TERRACOTTA);
        blockInventoryPageThree.setItem(25, SkyPvP.getInstance().getBlocksItems().CYAN_TERRACOTTA);
        blockInventoryPageThree.setItem(26, SkyPvP.getInstance().getBlocksItems().PURPLE_TERRACOTTA);

        blockInventoryPageThree.setItem(27, SkyPvP.getInstance().getBlocksItems().BLUE_TERRACOTTA);
        blockInventoryPageThree.setItem(28, SkyPvP.getInstance().getBlocksItems().BROWN_TERRACOTTA);
        blockInventoryPageThree.setItem(29, SkyPvP.getInstance().getBlocksItems().GREEN_TERRACOTTA);
        blockInventoryPageThree.setItem(30, SkyPvP.getInstance().getBlocksItems().RED_TERRACOTTA);
        blockInventoryPageThree.setItem(31, SkyPvP.getInstance().getBlocksItems().BLACK_TERRACOTTA);
        blockInventoryPageThree.setItem(32, SkyPvP.getInstance().getBlocksItems().BLACKSTONE);
        blockInventoryPageThree.setItem(33, SkyPvP.getInstance().getBlocksItems().POLISHED_BLACKSTONE);
        blockInventoryPageThree.setItem(34, SkyPvP.getInstance().getBlocksItems().CHISELED_POLISHED_BLACKSTONE);
        blockInventoryPageThree.setItem(35, SkyPvP.getInstance().getBlocksItems().POLISHED_BLACKSTONE_BRICKS);

        blockInventoryPageThree.setItem(36, SkyPvP.getInstance().getBlocksItems().CRACKED_POLISHED_BLACKSTONE_BRICKS);
        blockInventoryPageThree.setItem(37, SkyPvP.getInstance().getBlocksItems().PRISMARINE);
        blockInventoryPageThree.setItem(38, SkyPvP.getInstance().getBlocksItems().PRISMARINE_BRICKS);
        blockInventoryPageThree.setItem(39, SkyPvP.getInstance().getBlocksItems().DARK_PRISMARINE);
        blockInventoryPageThree.setItem(40, SkyPvP.getInstance().getBlocksItems().SEA_LANTERN);
        blockInventoryPageThree.setItem(41, SkyPvP.getInstance().getBlocksItems().GLOWSTONE);
        blockInventoryPageThree.setItem(42, SkyPvP.getInstance().getBlocksItems().QUARTZ_BLOCK);
        blockInventoryPageThree.setItem(43, SkyPvP.getInstance().getBlocksItems().QUARTZ_BRICKS);
        blockInventoryPageThree.setItem(44, SkyPvP.getInstance().getBlocksItems().CHISELED_QUARTZ_BLOCK);

        blockInventoryPageThree.setItem(45, SkyPvP.getInstance().getItems().BACK);
        blockInventoryPageThree.setItem(48, SkyPvP.getInstance().getItems().BLOCKS_PAGE_TWO);
        blockInventoryPageThree.setItem(49, SkyPvP.getInstance().getItems().CLOSE);
        player.openInventory(blockInventoryPageThree);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }


    /**
     * Create the Inventory for the warp command
     */

    public void getWarpInventory(Player player) {
        Inventory warpInventory = Bukkit.createInventory(null, 9 * 3, SkyPvP.getInstance().getTitles().warpInventoryTitle);
        for (int i = 0; i < warpInventory.getSize(); i++) {
            warpInventory.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        warpInventory.setItem(12, SkyPvP.getInstance().getItems().CITYBUILD_WARP);
        warpInventory.setItem(14, SkyPvP.getInstance().getItems().FARMWELT_WARP);

        warpInventory.setItem(22, SkyPvP.getInstance().getItems().CLOSE);
        player.openInventory(warpInventory);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }


    /**
     * Create the Inventory for the reward command
     */

    public void getRewardInventory(Player player) {
        Inventory rewardInventory = Bukkit.createInventory(null, 9 * 3, SkyPvP.getInstance().getTitles().rewardInventoryTitle);
        for (int i = 0; i < rewardInventory.getSize(); i++) {
            rewardInventory.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        rewardInventory.setItem(10, SkyPvP.getInstance().getItems().PLAYER_REWARD);
        rewardInventory.setItem(12, SkyPvP.getInstance().getItems().KNIGHT_REWARD);
        rewardInventory.setItem(13, SkyPvP.getInstance().getItems().KING_REWARD);
        rewardInventory.setItem(14, SkyPvP.getInstance().getItems().GOD_REWARD);
        rewardInventory.setItem(16, SkyPvP.getInstance().getItems().SUPERIOR_REWARD);

        rewardInventory.setItem(22, SkyPvP.getInstance().getItems().CLOSE);
        player.openInventory(rewardInventory);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }


    /**
     * Create the Inventory for the bank
     */
    public void getBankUnlockInventory(Player player) {
        Inventory bankUnlockInventory = Bukkit.createInventory(null, 9, SkyPvP.getInstance().getTitles().bankUnlockInventoryTitle);
        for (int i = 0; i < bankUnlockInventory.getSize(); i++) {
            bankUnlockInventory.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        bankUnlockInventory.setItem(4, SkyPvP.getInstance().getItems().BANK_UNLOCK);
        player.openInventory(bankUnlockInventory);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }


    /**
     * Create the Inventory for the bank
     */
    public void getBankInventory(Player player) {
        Inventory bankInventory = Bukkit.createInventory(null, 9 * 3, SkyPvP.getInstance().getTitles().bankInventoryTitle);
        for (int i = 0; i < bankInventory.getSize(); i++) {
            bankInventory.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        bankInventory.setItem(11, TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2RiY2E0YjY5ZWFmOGRjYjdhYzM3MjgyMjhkZThhNjQ0NDA3ODcwMTMzNDJkZGFhYmMxYjAwZWViOGVlYzFlMiJ9fX0="
                , 1, "§aMünzen einzahlen", ""
                , "§7Zahle deine Münzen ein, um", "§7sie während deiner Kämpfe und", "§7Ausflüge nicht zu verlieren.", "", "§aKlicke, um Münzen einzuzahlen!"));
        bankInventory.setItem(13, TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmM0ODJlM2I1YzdkNmZiNmIwMDFkZTBlM2JiZmEwOWQyODE3YTY5OGNhYTZlMzNlYjI3NmFlYTA4MTA0NDFmNiJ9fX0="
                , 1, "§6Dein Bankkonto", ""
                , "§7Guthaben: §e" + BankAPI.getBankCoins(player.getUniqueId()) + " Münzen"));
        bankInventory.setItem(15, TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjMyNmYwZTczOTM1M2QyZDdjOGU5YWI0ZTkxZTFmYmVjNjA3Y2FkMGZlMTAyOTZhZmQyMWQ2MzNiOWVjZWUifX19"
                , 1, "§cMünzen abheben", ""
                , "§7Hebe Münzen ab, um", "§7sie auf dem Server ausgeben zu können.", "", "§aKlicke, um Münzen abzuheben"));

        bankInventory.setItem(22, SkyPvP.getInstance().getItems().CLOSE);
        player.openInventory(bankInventory);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }


    /**
     * Create the Inventory for the rank info npc
     */
    public void getRankInfoInventory(Player player) {
        Inventory rankInfoInventory = Bukkit.createInventory(null, 9 * 6, SkyPvP.getInstance().getTitles().rankInfoInventoryTitle);
        for (int i = 0; i < rankInfoInventory.getSize(); i++) {
            rankInfoInventory.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        rankInfoInventory.setItem(13, SkyPvP.getInstance().getItems().SUPERIOR_RANK_INFO);
        rankInfoInventory.setItem(19, SkyPvP.getInstance().getItems().GOD_RANK_INFO);
        rankInfoInventory.setItem(25, SkyPvP.getInstance().getItems().KING_RANK_INFO);
        rankInfoInventory.setItem(30, SkyPvP.getInstance().getItems().KNIGHT_RANK_INFO);
        rankInfoInventory.setItem(32, SkyPvP.getInstance().getItems().PLAYER_RANK_INFO);

        rankInfoInventory.setItem(49, SkyPvP.getInstance().getItems().CLOSE);
        player.openInventory(rankInfoInventory);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }


    /**
     * Create the Inventory for the crate items
     */

    public void getCrateInventoryPageOne(Player player) {
        Inventory crateInventory = Bukkit.createInventory(null, 9 * 6, SkyPvP.getInstance().getTitles().crateInventoryTitlePageOne);
        for (int i = 0; i < crateInventory.getSize(); i++) {
            crateInventory.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        crateInventory.setItem(10, SkyPvP.getInstance().getItems().PLAYER_CRATE_INVENTORY);
        crateInventory.setItem(11, SkyPvP.getInstance().getItems().KNIGHT_CRATE_INVENTORY);
        crateInventory.setItem(12, SkyPvP.getInstance().getItems().KING_CRATE_INVENTORY);
        crateInventory.setItem(13, SkyPvP.getInstance().getItems().GOD_CRATE_INVENTORY);
        crateInventory.setItem(14, SkyPvP.getInstance().getItems().SUPERIOR_CRATE_INVENTORY);
        crateInventory.setItem(15, SkyPvP.getInstance().getItems().COIN_CRATE_INVENTORY);

        crateInventory.setItem(49, SkyPvP.getInstance().getItems().CLOSE);
        crateInventory.setItem(50, SkyPvP.getInstance().getItems().CRATE_INVENTORY_PAGE_FOR);
        player.openInventory(crateInventory);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }


    /**
     * Create the Settings Inventory
     */
    public void getSettingsInventory(Player player) {
        Inventory settingsInventory = Bukkit.createInventory(null, 9 * 5, SkyPvP.getInstance().getTitles().settingsInventoryTitle);
        for (int i = 0; i < settingsInventory.getSize(); i++) {
            settingsInventory.setItem(i, SkyPvP.getInstance().getItems().BLACK_GLASS_PANE);
        }
        settingsInventory.setItem(13, SkyPvP.getInstance().getItems().CRATE_ANIMATION_ON);
        settingsInventory.setItem(22, SkyPvP.getInstance().getItems().CRATE_ANIMATION);
        settingsInventory.setItem(31, SkyPvP.getInstance().getItems().CRATE_ANIMATION_OFF);

        settingsInventory.setItem(10, SkyPvP.getInstance().getItems().CRATE_CONFIRMATION_ON);
        settingsInventory.setItem(19, SkyPvP.getInstance().getItems().CRATE_CONFIRMATION);
        settingsInventory.setItem(28, SkyPvP.getInstance().getItems().CRATE_CONFIRMATION_OFF);

        settingsInventory.setItem(40, SkyPvP.getInstance().getItems().CLOSE);

        player.openInventory(settingsInventory);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }

    public void getTrashInventory(Player player) {
        Inventory trashInventory = Bukkit.createInventory(null, 9 * 3, SkyPvP.getInstance().getTitles().trashInventoryTitle);
        player.openInventory(trashInventory);
        player.updateInventory();
        player.playSound(player.getLocation(), Sound.BLOCK_AMETHYST_BLOCK_STEP, 1, 1);
    }

}
