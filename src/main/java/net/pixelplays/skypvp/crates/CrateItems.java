package net.pixelplays.skypvp.crates;

import net.pixelplays.skypvp.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class CrateItems {

    //☘

    public ArrayList<ItemStack> playerCrate = new ArrayList<>();
    public ArrayList<ItemStack> knightCrate = new ArrayList<>();
    public ArrayList<ItemStack> kingCrate = new ArrayList<>();
    public ArrayList<ItemStack> godCrate = new ArrayList<>();
    public ArrayList<ItemStack> superiorCrate = new ArrayList<>();
    public ArrayList<ItemStack> coinCrate = new ArrayList<>();


    /** Creation of the coin crate Items with {@link org.bukkit.inventory.ItemStack} and {@link java.util.List} */

    public void saveCrateItems() {

        // Player Crate
        ItemStack playerHelmet = new ItemBuilder(Material.DIAMOND_HELMET, 1).displayname("§7Spieler Helm").enchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).build();
        ItemStack playerChestPlate = new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1).displayname("§7Spieler Brustplatte").enchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).build();
        ItemStack playerPants = new ItemBuilder(Material.DIAMOND_LEGGINGS, 1).displayname("§7Spieler Hose").enchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).build();
        ItemStack playerShoes = new ItemBuilder(Material.DIAMOND_BOOTS, 1).displayname("§7Spieler Schuhe").enchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).build();
        ItemStack playerSword = new ItemBuilder(Material.DIAMOND_SWORD, 1).displayname("§7Spieler Schwert").enchant(Enchantment.DAMAGE_ALL, 1).build();
        HashMap<Enchantment, Integer> playerPickAxeEnchants = new HashMap<>();
        playerPickAxeEnchants.put(Enchantment.DIG_SPEED, 3);
        playerPickAxeEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack playerPickAxe = new ItemBuilder(Material.IRON_PICKAXE, 1).displayname("§7Spieler Spitzhacke").enchant(playerPickAxeEnchants).build();
        HashMap<Enchantment, Integer> playerAxeEnchants = new HashMap<>();
        playerAxeEnchants.put(Enchantment.DIG_SPEED, 3);
        playerAxeEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack playerAxe = new ItemBuilder(Material.IRON_AXE, 1).displayname("§7Spieler Axt").enchant(playerAxeEnchants).build();
        HashMap<Enchantment, Integer> playerShovelEnchants = new HashMap<>();
        playerShovelEnchants.put(Enchantment.DIG_SPEED, 3);
        playerShovelEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack playerShovel = new ItemBuilder(Material.IRON_SHOVEL, 1).displayname("§7Spieler Schaufel").enchant(playerShovelEnchants).build();
        HashMap<Enchantment, Integer> playerHoeEnchants = new HashMap<>();
        playerHoeEnchants.put(Enchantment.DIG_SPEED, 3);
        playerHoeEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack playerHoe = new ItemBuilder(Material.IRON_HOE, 1).displayname("§7Spieler Hacke").enchant(playerHoeEnchants).build();


        // Knight Crate
        HashMap<Enchantment, Integer> knightHelmetEnchants = new HashMap<>();
        knightHelmetEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        knightHelmetEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack knightHelmet = new ItemBuilder(Material.DIAMOND_HELMET, 1).displayname("§3Knight Helm").enchant(knightHelmetEnchants).build();

        HashMap<Enchantment, Integer> knightChestPlateEnchants = new HashMap<>();
        knightChestPlateEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        knightChestPlateEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack knightChestPlate = new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1).displayname("§3Knight Brustplatte").enchant(knightChestPlateEnchants).build();

        HashMap<Enchantment, Integer> knightPantsEnchants = new HashMap<>();
        knightPantsEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        knightPantsEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack knightPants = new ItemBuilder(Material.DIAMOND_LEGGINGS, 1).displayname("§3Knight Hose").enchant(knightPantsEnchants).build();

        HashMap<Enchantment, Integer> knightShoesEnchants = new HashMap<>();
        knightShoesEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        knightShoesEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack knightShoes = new ItemBuilder(Material.DIAMOND_BOOTS, 1).displayname("§3Knight Schuhe").enchant(knightShoesEnchants).build();

        HashMap<Enchantment, Integer> knightSwordEnchants = new HashMap<>();
        knightSwordEnchants.put(Enchantment.DAMAGE_ALL, 2);
        knightSwordEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack knightSword = new ItemBuilder(Material.DIAMOND_SWORD, 1).displayname("§3Knight Schwert").enchant(knightSwordEnchants).build();

        HashMap<Enchantment, Integer> knightPickAxeEnchants = new HashMap<>();
        knightPickAxeEnchants.put(Enchantment.DIG_SPEED, 5);
        knightPickAxeEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack knightPickAxe = new ItemBuilder(Material.IRON_PICKAXE, 1).displayname("§3Knight Spitzhacke").enchant(knightPickAxeEnchants).build();

        HashMap<Enchantment, Integer> knightAxeEnchants = new HashMap<>();
        knightAxeEnchants.put(Enchantment.DIG_SPEED, 5);
        knightAxeEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack knightAxe = new ItemBuilder(Material.IRON_AXE, 1).displayname("§3Knight Axt").enchant(knightAxeEnchants).build();

        HashMap<Enchantment, Integer> knightShovelEnchants = new HashMap<>();
        knightShovelEnchants.put(Enchantment.DIG_SPEED, 5);
        knightShovelEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack knightShovel = new ItemBuilder(Material.IRON_SHOVEL, 1).displayname("§3Knight Schaufel").enchant(knightShovelEnchants).build();

        HashMap<Enchantment, Integer> knightHoeEnchants = new HashMap<>();
        knightHoeEnchants.put(Enchantment.DIG_SPEED, 5);
        knightHoeEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack knightHoe = new ItemBuilder(Material.IRON_HOE, 1).displayname("§3Knight Hacke").enchant(knightHoeEnchants).build();


        // King Crate Items
        HashMap<Enchantment, Integer> kingHelmetEnchants = new HashMap<>();
        kingHelmetEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        kingHelmetEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack kingHelmet = new ItemBuilder(Material.DIAMOND_HELMET, 1).displayname("§eKing Helm").enchant(kingHelmetEnchants).build();

        HashMap<Enchantment, Integer> kingChestPlateEnchants = new HashMap<>();
        kingChestPlateEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        kingChestPlateEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack kingChestPlate = new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1).displayname("§eKing Brustplatte").enchant(kingChestPlateEnchants).build();

        HashMap<Enchantment, Integer> kingPantsEnchants = new HashMap<>();
        kingPantsEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        kingPantsEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack kingPants = new ItemBuilder(Material.DIAMOND_LEGGINGS, 1).displayname("§eKing Hose").enchant(kingPantsEnchants).build();

        HashMap<Enchantment, Integer> kingShoesEnchants = new HashMap<>();
        kingShoesEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        kingShoesEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack kingShoes = new ItemBuilder(Material.DIAMOND_BOOTS, 1).displayname("§eKing Schuhe").enchant(kingShoesEnchants).build();

        HashMap<Enchantment, Integer> kingSwordEnchants = new HashMap<>();
        kingSwordEnchants.put(Enchantment.DAMAGE_ALL, 3);
        kingSwordEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack kingSword = new ItemBuilder(Material.DIAMOND_SWORD, 1).displayname("§eKing† Schwert").enchant(kingSwordEnchants).build();

        HashMap<Enchantment, Integer> kingPickAxeEnchants = new HashMap<>();
        kingPickAxeEnchants.put(Enchantment.DIG_SPEED, 2);
        kingPickAxeEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack kingPickAxe = new ItemBuilder(Material.DIAMOND_PICKAXE, 1).displayname("§eKing Spitzhacke").enchant(kingPickAxeEnchants).build();

        HashMap<Enchantment, Integer> kingAxeEnchants = new HashMap<>();
        kingAxeEnchants.put(Enchantment.DIG_SPEED, 3);
        kingAxeEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack kingAxe = new ItemBuilder(Material.DIAMOND_AXE, 1).displayname("§eKing Axt").enchant(kingAxeEnchants).build();

        HashMap<Enchantment, Integer> kingShovelEnchants = new HashMap<>();
        kingShovelEnchants.put(Enchantment.DIG_SPEED, 3);
        kingShovelEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack kingShovel = new ItemBuilder(Material.DIAMOND_SHOVEL, 1).displayname("§eKing Schaufel").enchant(kingShovelEnchants).build();

        HashMap<Enchantment, Integer> kingHoeEnchants = new HashMap<>();
        kingHoeEnchants.put(Enchantment.DIG_SPEED, 3);
        kingHoeEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack kingHoe = new ItemBuilder(Material.DIAMOND_HOE, 1).displayname("§eKing Hacke").enchant(kingHoeEnchants).build();


        //God Crate Items
        HashMap<Enchantment, Integer> godHelmetEnchants = new HashMap<>();
        godHelmetEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        godHelmetEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack godHelmet = new ItemBuilder(Material.DIAMOND_HELMET, 1).displayname("§6God §7Helm").enchant(godHelmetEnchants).build();

        HashMap<Enchantment, Integer> godChestPlateEnchants = new HashMap<>();
        godChestPlateEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        godChestPlateEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack godChestPlate = new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1).displayname("§6God §7Brustplatte").enchant(godChestPlateEnchants).build();

        HashMap<Enchantment, Integer> godPantsEnchants = new HashMap<>();
        godPantsEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        godPantsEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack godPants = new ItemBuilder(Material.DIAMOND_LEGGINGS, 1).displayname("§6God §7Hose").enchant(godPantsEnchants).build();

        HashMap<Enchantment, Integer> godShoesEnchants = new HashMap<>();
        godShoesEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        godShoesEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack godShoes = new ItemBuilder(Material.DIAMOND_BOOTS, 1).displayname("§6God §7Schuhe").enchant(godShoesEnchants).build();

        HashMap<Enchantment, Integer> godSwordEnchants = new HashMap<>();
        godSwordEnchants.put(Enchantment.DAMAGE_ALL, 3);
        godSwordEnchants.put(Enchantment.LOOT_BONUS_MOBS, 2);
        godSwordEnchants.put(Enchantment.DURABILITY, 2);
        ItemStack godSword = new ItemBuilder(Material.DIAMOND_SWORD, 1).displayname("§6God §7Schwert").enchant(godSwordEnchants).build();

        HashMap<Enchantment, Integer> godPickAxeEnchants = new HashMap<>();
        godPickAxeEnchants.put(Enchantment.DIG_SPEED, 2);
        godPickAxeEnchants.put(Enchantment.LOOT_BONUS_BLOCKS, 2);
        godPickAxeEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack godPickAxe = new ItemBuilder(Material.DIAMOND_PICKAXE, 1).displayname("§6God §7Spitzhacke").enchant(godPickAxeEnchants).build();

        HashMap<Enchantment, Integer> godAxeEnchants = new HashMap<>();
        godAxeEnchants.put(Enchantment.DIG_SPEED, 3);
        godAxeEnchants.put(Enchantment.LOOT_BONUS_BLOCKS, 2);
        godAxeEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack godAxe = new ItemBuilder(Material.DIAMOND_AXE, 1).displayname("§6God §7Axt").enchant(godAxeEnchants).build();

        HashMap<Enchantment, Integer> godShovelEnchants = new HashMap<>();
        godShovelEnchants.put(Enchantment.DIG_SPEED, 3);
        godShovelEnchants.put(Enchantment.SILK_TOUCH, 1);
        godShovelEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack godShovel = new ItemBuilder(Material.DIAMOND_SHOVEL, 1).displayname("§6God §7Schaufel").enchant(godShovelEnchants).build();

        HashMap<Enchantment, Integer> godHoeEnchants = new HashMap<>();
        godHoeEnchants.put(Enchantment.DIG_SPEED, 3);
        godHoeEnchants.put(Enchantment.DURABILITY, 1);
        ItemStack godHoe = new ItemBuilder(Material.DIAMOND_HOE, 1).displayname("§6God §7Hacke").enchant(godHoeEnchants).build();


        //Superior Crate Items
        HashMap<Enchantment, Integer> superiorHelmetEnchants = new HashMap<>();
        superiorHelmetEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        superiorHelmetEnchants.put(Enchantment.WATER_WORKER, 2);
        superiorHelmetEnchants.put(Enchantment.MENDING, 1);
        superiorHelmetEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack superiorHelmet = new ItemBuilder(Material.DIAMOND_HELMET, 1).displayname("§cSuperior §7Helm").enchant(superiorHelmetEnchants).build();

        HashMap<Enchantment, Integer> superiorChestPlateEnchants = new HashMap<>();
        superiorChestPlateEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        superiorChestPlateEnchants.put(Enchantment.MENDING, 1);
        superiorChestPlateEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack superiorChestPlate = new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1).displayname("§cSuperior §7Brustplatte").enchant(superiorChestPlateEnchants).build();

        HashMap<Enchantment, Integer> superiorPantsEnchants = new HashMap<>();
        superiorPantsEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        superiorPantsEnchants.put(Enchantment.MENDING, 1);
        superiorPantsEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack superiorPants = new ItemBuilder(Material.DIAMOND_LEGGINGS, 1).displayname("§cSuperior §7Hose").enchant(superiorPantsEnchants).build();

        HashMap<Enchantment, Integer> superiorShoesEnchants = new HashMap<>();
        superiorShoesEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        superiorShoesEnchants.put(Enchantment.SOUL_SPEED, 3);
        superiorShoesEnchants.put(Enchantment.MENDING, 1);
        superiorShoesEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack superiorShoes = new ItemBuilder(Material.DIAMOND_BOOTS, 1).displayname("§cSuperior §7Schuhe").enchant(superiorShoesEnchants).build();

        HashMap<Enchantment, Integer> superiorSwordEnchants = new HashMap<>();
        superiorSwordEnchants.put(Enchantment.DAMAGE_ALL, 5);
        superiorSwordEnchants.put(Enchantment.MENDING, 1);
        superiorSwordEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack superiorSword = new ItemBuilder(Material.DIAMOND_SWORD, 1).displayname("§cSuperior §7Schwert").enchant(superiorSwordEnchants).build();

        HashMap<Enchantment, Integer> superiorPickAxeEnchants = new HashMap<>();
        superiorPickAxeEnchants.put(Enchantment.DIG_SPEED, 5);
        superiorPickAxeEnchants.put(Enchantment.MENDING, 1);
        superiorPickAxeEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack superiorPickAxe = new ItemBuilder(Material.DIAMOND_PICKAXE, 1).displayname("§cSuperior §7Spitzhacke").enchant(superiorPickAxeEnchants).build();

        HashMap<Enchantment, Integer> superiorAxeEnchants = new HashMap<>();
        superiorAxeEnchants.put(Enchantment.DIG_SPEED, 5);
        superiorAxeEnchants.put(Enchantment.MENDING, 1);
        superiorAxeEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack superiorAxe = new ItemBuilder(Material.DIAMOND_AXE, 1).displayname("§cSuperior §7Axt").enchant(superiorAxeEnchants).build();

        HashMap<Enchantment, Integer> superiorShovelEnchants = new HashMap<>();
        superiorShovelEnchants.put(Enchantment.DIG_SPEED, 5);
        superiorShovelEnchants.put(Enchantment.SILK_TOUCH, 1);
        superiorShovelEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack superiorShovel = new ItemBuilder(Material.DIAMOND_SHOVEL, 1).displayname("§cSuperior §7Schaufel").enchant(superiorShovelEnchants).build();

        HashMap<Enchantment, Integer> superiorHoeEnchants = new HashMap<>();
        superiorHoeEnchants.put(Enchantment.DIG_SPEED, 5);
        superiorHoeEnchants.put(Enchantment.DURABILITY, 3);
        ItemStack superiorHoe = new ItemBuilder(Material.DIAMOND_HOE, 1).displayname("§cSuperior §7Hacke").enchant(superiorHoeEnchants).build();


        /* Creation of the coin crate Items with an ItemStack and put it into an ArrayList with a Collection of items */
        ItemStack coins5 = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e5 Tokens").glow().build();
        ItemStack coins10 = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e10 Tokens").glow().build();
        ItemStack coins20 = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e20 Tokens").glow().build();
        ItemStack coins50 = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e50 Tokens").glow().build();
        ItemStack coins100 = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e100 Tokens").glow().build();
        ItemStack coins200 = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e200 Tokens").glow().build();
        ItemStack coins1000 = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e1.000 Tokens").glow().build();
        ItemStack coins2500 = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e2.500 Tokens").glow().build();
        ItemStack coins10000 = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e10.000 Tokens").glow().build();


        //Important Items
        ItemStack goldenApple = new ItemBuilder(Material.GOLDEN_APPLE, 2).displayname("§dGoldene Äpfel").build();
        ItemStack experienceBottle = new ItemBuilder(Material.EXPERIENCE_BOTTLE, 4).displayname("§eXP-Flaschen").build();


        playerCrate.addAll(List.of(coins5, coins5, coins5, coins5, coins5, coins20, coins20, coins20, coins100,
                playerHelmet, playerChestPlate, playerPants, playerShoes, playerSword, playerPickAxe,
                playerAxe, playerShovel, playerHoe, goldenApple, experienceBottle));

        knightCrate.addAll(List.of(coins10, coins10, coins10, coins10, coins10, coins50, coins50, coins50, coins200,
                knightHelmet, knightChestPlate, knightPants, knightShoes, knightSword, knightPickAxe,
                knightAxe, knightShovel, knightHoe, goldenApple, experienceBottle));

        kingCrate.addAll(List.of(coins20, coins20, coins20, coins20, coins20, coins100, coins100, coins100, coins1000,
                kingHelmet, kingChestPlate, kingPants, kingShoes, kingSword, kingPickAxe,
                kingAxe, kingShovel, kingHoe, goldenApple, experienceBottle));

        godCrate.addAll(List.of(coins50, coins50, coins50, coins50, coins50, coins200, coins200, coins200, coins2500,
                godHelmet, godChestPlate, godPants, godShoes, godSword, godPickAxe,
                godAxe, godShovel, godHoe, goldenApple, experienceBottle));

        superiorCrate.addAll(List.of(coins100, coins100, coins100, coins100, coins100, coins1000, coins1000, coins1000, coins10000,
                superiorHelmet, superiorChestPlate, superiorPants, superiorShoes, superiorSword, superiorPickAxe,
                superiorAxe, superiorShovel, superiorHoe, goldenApple, experienceBottle));

        coinCrate.addAll(List.of(coins5, coins5, coins5, coins5, coins5, coins5, coins5, coins5, coins5, coins5, coins5, coins5, coins5, coins5, coins5, coins5,
                coins10, coins10, coins10, coins10, coins10, coins10, coins10, coins10, coins10, coins10, coins10, coins10,
                coins20, coins20, coins20, coins20, coins20, coins20, coins20, coins20, coins20, coins20,
                coins50, coins50, coins50, coins50, coins50, coins50, coins50, coins50,
                coins100, coins100, coins100, coins100, coins100, coins100,
                coins200, coins200, coins200, coins200,
                coins1000, coins1000,
                coins2500,
                coins10000));
    }

}