package net.pixelplays.skypvp.utils;

import net.kyori.adventure.text.Component;
import net.md_5.bungee.api.chat.ItemTag;
import net.pixelplays.skypvp.apis.TextureAPI;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class Items {

    /**
     * Standard Items
     */

    public final ItemStack BLACK_GLASS_PANE = new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE, 1).displayname("").build();
    public final ItemStack CLOSE = new ItemBuilder(Material.RED_DYE, 1).displayname("§cSchließen").glow().build();
    public final ItemStack BACK = new ItemBuilder(Material.SPECTRAL_ARROW, 1).displayname("§eZurück").glow().build();


    /**
     * Crystal Items
     */

    // Topaz Crystal
    public ItemStack TOPAZ_CRYSTAL = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDQ5YTZkMzMwNDY1YmM5NGQ1NzM3MTY0MjhkYzY2MmNjMTZhY2QzYjgwNTM1YjUyMDI4YzY2NWY0ZGFmNjgyZSJ9fX0="
            , 1, "§eTopaz Crystal", "", "§7Ein funkelnd leuchtender Stein");
    // Sapphire Crystal
    public ItemStack SAPPHIRE_CRYSTAL = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTUwNjQ5NjI2YzQxMDEzNTJjNTk5NWM1M2I0OGJmZjYwYTkzODIxMmI3Y2U5MDI0MTVmZWI3NmVhMjczYjM1ZiJ9fX0="
            , 1,  "§9Sapphire Crystal", "");
    //Ruby Crystal
    public ItemStack RUBY_CRYSTAL = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjFkYmUzMGIwMjdhY2JjZWI2MTI1NjNiZDg3N2NkN2ViYjcxOWVhNmVkMTM5OTAyN2RjZWU1OGJiOTA0OWQ0YSJ9fX0="
            , 1, "§cRuby Crystal", "");
    // Jasper Crystal
    public ItemStack JASPER_CRYSTAL = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTJiNWZlOWVhNTIzOTVhNDFhYzY4YzBjYjU3NTg2NGZlYjVmZGQ4ZWExNTgyNjJlOGY4MjkxMjVlYzMzZDQ4NyJ9fX0="
            , 1, "§dJasper Crystal", "");
    // Jade Crystal
    public ItemStack JADE_CRYSTAL = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGIxZWFjNDI5MDAwZWIyYzQxOGJlNDZlYTA2YWNkZWZlZDRiNzA1M2EwMGUzZTdmMTEyNzI4MzAwNjhmMjEifX19"
            , 1, "§aJade Crystal", "");
    // Amethyst Crystal
    public ItemStack AMETHYST_CRYSTAL = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzRmYzYyY2Y0Nzc3YWJmMzU2NWE3MDk4NTI3NzhlMjQ4YWFhZTkzNmZkNTE1N2MzMWRiMmEzYzI0NzBhNjY1YyJ9fX0="
            , 1, "§5Amethyst Crystal", "");
    // Amber Crystal
    public ItemStack AMBER_CRYSTAL = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWY3ODM1ZmM5ZTZkYWY2MzIxNjBlOWI3ZmYzNzg3ODhhNDA4MDY0Y2M3NWViZjlmNTE1OGU2MTViZGQ1OTYwMyJ9fX0="
            , 1, "§6Amber Crystal", "");


    /**
     * Blocks Inventory Items
     */

    public ItemStack BLOCKS_PAGE_ONE = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGUwM2IwYzI0NjMzYThkNTRiNWQwNDYzYTlmNWNjZjdlZDg1MGU2Y2U4MTY3YWMwNjVlZTg5ODg5MDE2MjkwOSJ9fX0="
            , 1, "§aBlöcke §7(Seite 1)", "", "§7Klicke um die 1. Seite der Blöcke zu öffnen");
    public ItemStack BLOCKS_PAGE_TWO = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmUwYWVkMTljOWMxMDk2MjJlYzBhMDczMWEwYzY5MGQyZDRhNTgzYzE2M2NiZTFhMTFiOWY0NWYwN2RlZDRkMyJ9fX0="
            ,1, "§aBlöcke §7(Seite 2)", "", "§7Klicke um die 2. Seite der Blöcke zu öffnen");
    public ItemStack BLOCKS_PAGE_THREE = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmVkMmQ0YTQzZDU1NTZkNjc2YTUzYTUzODUxYTYzZWExOWFiNTk3NjY4YjE4ZDA4MDBmYTBmYmVhY2VjNThmMyJ9fX0="
            , 1, "§aBlöcke §7(Seite 3)", "", "§7Klicke um die 3. Seite der Blöcke zu öffnen");


    /**
    * Warp Inventory Items
     */

    public ItemStack CITYBUILD_WARP = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2Y3Y2RlZWZjNmQzN2ZlY2FiNjc2YzU4NGJmNjIwODMyYWFhYzg1Mzc1ZTlmY2JmZjI3MzcyNDkyZDY5ZiJ9fX0="
            , 1, "§6Citybuild §7(Klicke)", "§cKlicke", "§7um", "§7dich", "§7zu", "§7teleportieren");
    public ItemStack FARMWELT_WARP = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDM4Y2YzZjhlNTRhZmMzYjNmOTFkMjBhNDlmMzI0ZGNhMTQ4NjAwN2ZlNTQ1Mzk5MDU1NTI0YzE3OTQxZjRkYyJ9fX0="
            , 1, "§2Farmwelt §7(Klicke)", "");


    /**
     * Reward Inventory Items
     */

    public ItemStack PLAYER_REWARD = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWU4YTdhZGMyNWU5YmFlNDE0NTA3Zjk2ZWQ0ZTZmOWU0NmI4NGNiNDM5YTQ4YjBjZjIzYmFlMWI2ZTFmNjg1OSJ9fX0="
            , 1, "§7Spieler §8◈ §7Reward", ""
            , "§b+ §e100 Tokens", "§b+ §7Player §8◈ §7Crate", "", "§aKlicke um diese Belohnung abzuholen.");

    public ItemStack KNIGHT_REWARD = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTIzMTJlNzJkMDMwMTJiZTEwNmI0OGFjY2QzMzgyY2VjN2NiY2VjZWIxNDJlYzc2MjM3OTM0NjM5YTZhMmU5In19fQ=="
            , 1, "§3Knight §8◈ §7Reward", ""
            , "§b+ §e200 Tokens", "§b+ §3Knight §8◈ §7Crate", "", "§aKlicke um diese Belohnung abzuholen.");

    public ItemStack KING_REWARD = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQxNWFhY2I3MjEzYzgzMTFlZWQ3YmFmMzdlYmI1OGE1ZjRiOTI1NjMxN2Q4NDU4ZDE1ZDMzN2E3NGU0YmU2In19fQ=="
            , 1, "§eKing §8◈ §7Reward", ""
            , "§b+ §e300 Tokens", "§b+ §eKing §8◈ §7Crate", "", "§aKlicke um diese Belohnung abzuholen.");

    public ItemStack GOD_REWARD = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmM4YjFmNmJiYjBlMmExYTllMDhiNDM0NmRmYWE2MWEzOTQ5NDM2Yzc5MmY1NDMwOGE0OGE4MGU1ZjlkODI5YSJ9fX0="
            , 1, "§6God §8◈ §7Reward", ""
            , "§b+ §e400 Tokens", "§b+ §6God §8◈ §7Crate", "", "§aKlicke um diese Belohnung abzuholen.");

    public ItemStack SUPERIOR_REWARD = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDlmY2MyOGE5OGQxY2ZjYzk1MDEzMGJhMTUzYWE5OTYwNGNjYTUxZGRiOTRiZmJhNWZhNGUzMWMzNjNhMWM4MSJ9fX0="
            , 1, "§dSuperior §8◈ §7Reward", ""
            , "§b+ §e500 Tokens", "§b+ §dSuperior §8◈ §7Crate", "", "§aKlicke um diese Belohnung abzuholen.");


    /**
     * Reward Inventory Items
     */
    public ItemStack PLAYER_RANK_INFO = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWU4YTdhZGMyNWU5YmFlNDE0NTA3Zjk2ZWQ0ZTZmOWU0NmI4NGNiNDM5YTQ4YjBjZjIzYmFlMWI2ZTFmNjg1OSJ9fX0="
            , 1, "§7Spieler §8◈ §7Rang", "", "§7- §f");

    public ItemStack KNIGHT_RANK_INFO = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTIzMTJlNzJkMDMwMTJiZTEwNmI0OGFjY2QzMzgyY2VjN2NiY2VjZWIxNDJlYzc2MjM3OTM0NjM5YTZhMmU5In19fQ=="
            , 1, "§3Knight §8◈ §7Rang", "");

    public ItemStack KING_RANK_INFO = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQxNWFhY2I3MjEzYzgzMTFlZWQ3YmFmMzdlYmI1OGE1ZjRiOTI1NjMxN2Q4NDU4ZDE1ZDMzN2E3NGU0YmU2In19fQ=="
            , 1, "§eKing §8◈ §7Rang", "");

    public ItemStack GOD_RANK_INFO = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmM4YjFmNmJiYjBlMmExYTllMDhiNDM0NmRmYWE2MWEzOTQ5NDM2Yzc5MmY1NDMwOGE0OGE4MGU1ZjlkODI5YSJ9fX0="
            , 1, "§6God §8◈ §7Rang", "");

    public ItemStack SUPERIOR_RANK_INFO = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDlmY2MyOGE5OGQxY2ZjYzk1MDEzMGJhMTUzYWE5OTYwNGNjYTUxZGRiOTRiZmJhNWZhNGUzMWMzNjNhMWM4MSJ9fX0="
            , 1, "§dSuperior §8◈ §7Rang", "");


    // Settings Inventory Items
    public ItemStack CRATE_ANIMATION = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTg4MTQ5ZTU2Y2RlMDJlZWU2MjA5ODI4ODRiODkzNjM0NzU2YmU5MTQxZjJlMjc3N2I1MWNiMGE2NmMzMWRjZSJ9fX0=",
            1, "§dCrate Animation", "", "§7Klicke oben an um die Crateanimation", "§7zu §aaktivieren §7oder unten, um", "§7die Animation zu §cdeaktivieren§7.");
    public ItemStack CRATE_ANIMATION_ON = new ItemBuilder(Material.LIME_STAINED_GLASS_PANE, 1).displayname("§7Crateanimation §aeinschalten").build();
    public ItemStack CRATE_ANIMATION_OFF = new ItemBuilder(Material.RED_STAINED_GLASS_PANE, 1).displayname("§7Crateanimation §causschalten").build();

    public ItemStack CRATE_CONFIRMATION = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzdmMWZhNjFjNDQ5ZDFhNDFhM2IyZDAyMDUyMDQ1NWRhMWU1MDU2MDRjMTJhOGNlZTdjNDY4NmNhMWNhOWI5NSJ9fX0=",
            1, "§cCrate Bestätigung", "", "§7Klicke oben an um die Cratebestätigung", "§7zu §aaktivieren §7oder unten, um", "§7die Bestätigung zu §cdeaktivieren§7.");
    public ItemStack CRATE_CONFIRMATION_ON = new ItemBuilder(Material.LIME_STAINED_GLASS_PANE, 1).displayname("§7Cratebestätigung §aeinschalten").build();
    public ItemStack CRATE_CONFIRMATION_OFF = new ItemBuilder(Material.RED_STAINED_GLASS_PANE, 1).displayname("§7Cratebestätigung §causschalten").build();

    /**
     * Crate Inventory Items
     */
    public ItemStack PLAYER_CRATE_INVENTORY = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWU4YTdhZGMyNWU5YmFlNDE0NTA3Zjk2ZWQ0ZTZmOWU0NmI4NGNiNDM5YTQ4YjBjZjIzYmFlMWI2ZTFmNjg1OSJ9fX0=",
            1, "§7Player §8◈ §7Crate");
    public ItemStack KNIGHT_CRATE_INVENTORY = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTIzMTJlNzJkMDMwMTJiZTEwNmI0OGFjY2QzMzgyY2VjN2NiY2VjZWIxNDJlYzc2MjM3OTM0NjM5YTZhMmU5In19fQ==",
            1, "§3Knight §8◈ §7Crate");
    public ItemStack KING_CRATE_INVENTORY = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQxNWFhY2I3MjEzYzgzMTFlZWQ3YmFmMzdlYmI1OGE1ZjRiOTI1NjMxN2Q4NDU4ZDE1ZDMzN2E3NGU0YmU2In19fQ==",
            1, "§eKing §8◈ §7Crate");
    public ItemStack GOD_CRATE_INVENTORY = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmM4YjFmNmJiYjBlMmExYTllMDhiNDM0NmRmYWE2MWEzOTQ5NDM2Yzc5MmY1NDMwOGE0OGE4MGU1ZjlkODI5YSJ9fX0=",
            1, "§6God §8◈ §7Crate");
    public ItemStack SUPERIOR_CRATE_INVENTORY = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDlmY2MyOGE5OGQxY2ZjYzk1MDEzMGJhMTUzYWE5OTYwNGNjYTUxZGRiOTRiZmJhNWZhNGUzMWMzNjNhMWM4MSJ9fX0=",
            1, "§dSuperior §8◈ §7Crate");
    public ItemStack COIN_CRATE_INVENTORY = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTM3ZGNmYjY2YTYxYzUyOWYyYTEyOGFlZWY5M2MyNWY5ZDBiMDQzOWI1OWZiMTk5ZDJiMDRhY2ZlMGI4NWFhYyJ9fX0=",
            1, "§eCoin §8◈ §7Crate");

    public ItemStack PLAYER_CRATE = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWU4YTdhZGMyNWU5YmFlNDE0NTA3Zjk2ZWQ0ZTZmOWU0NmI4NGNiNDM5YTQ4YjBjZjIzYmFlMWI2ZTFmNjg1OSJ9fX0=",
            1, "§7Player §8◈ §7Crate", "", "§cLinksclick§7, um die Cratevorschau anzuzeigen.", "§cRechtsklick§7, um die Crate zu öffnen");
    public ItemStack KNIGHT_CRATE = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTIzMTJlNzJkMDMwMTJiZTEwNmI0OGFjY2QzMzgyY2VjN2NiY2VjZWIxNDJlYzc2MjM3OTM0NjM5YTZhMmU5In19fQ==",
            1, "§3Knight §8◈ §7Crate", "", "§cLinksclick§7, um die Cratevorschau anzuzeigen.", "§cRechtsklick§7, um die Crate zu öffnen");
    public ItemStack KING_CRATE = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTQxNWFhY2I3MjEzYzgzMTFlZWQ3YmFmMzdlYmI1OGE1ZjRiOTI1NjMxN2Q4NDU4ZDE1ZDMzN2E3NGU0YmU2In19fQ==",
            1, "§eKing §8◈ §7Crate", "", "§cLinksclick§7, um die Cratevorschau anzuzeigen.", "§cRechtsklick§7, um die Crate zu öffnen");
    public ItemStack GOD_CRATE = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmM4YjFmNmJiYjBlMmExYTllMDhiNDM0NmRmYWE2MWEzOTQ5NDM2Yzc5MmY1NDMwOGE0OGE4MGU1ZjlkODI5YSJ9fX0=",
            1, "§6God §8◈ §7Crate", "", "§cLinksclick§7, um die Cratevorschau anzuzeigen.", "§cRechtsklick§7, um die Crate zu öffnen");
    public ItemStack SUPERIOR_CRATE = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDlmY2MyOGE5OGQxY2ZjYzk1MDEzMGJhMTUzYWE5OTYwNGNjYTUxZGRiOTRiZmJhNWZhNGUzMWMzNjNhMWM4MSJ9fX0=",
            1, "§dSuperior §8◈ §7Crate", "", "§cLinksclick§7, um die Cratevorschau anzuzeigen.", "§cRechtsklick§7, um die Crate zu öffnen");
    public ItemStack COIN_CRATE = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTM3ZGNmYjY2YTYxYzUyOWYyYTEyOGFlZWY5M2MyNWY5ZDBiMDQzOWI1OWZiMTk5ZDJiMDRhY2ZlMGI4NWFhYyJ9fX0=",
            1, "§eCoin §8◈ §7Crate", "", "§cLinksclick§7, um die Cratevorschau anzuzeigen.", "§cRechtsklick§7, um die Crate zu öffnen");

    public ItemStack CRATE_INVENTORY_PAGE_BACK = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWM1YThhYThhNGMwMzYwMGEyYjVhNGViNmJlYjUxZDU5MDI2MGIwOTVlZTFjZGFhOTc2YjA5YmRmZTU2NjFjNiJ9fX0=",
            1, "§aSeite zurück", "");
    public ItemStack CRATE_INVENTORY_PAGE_FOR = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWFiOTVhODc1MWFlYWEzYzY3MWE4ZTkwYjgzZGU3NmEwMjA0ZjFiZTY1NzUyYWMzMWJlMmY5OGZlYjY0YmY3ZiJ9fX0=",
            1, "§aSeite vor", "");


    // Crates
    public ItemStack CRATE_CONFIRM = new ItemBuilder(Material.LIME_CONCRETE, 1).displayname("§aBestätigen").build();
    public ItemStack CRATE_CONFIRMATION_INFO = new ItemBuilder(Material.PAPER, 1).displayname("§dCratebestätigung").lore("", "§7Klicke auf §aBestätigen§7, um die Crate zu öffnen.", "§7Klicke auf §cAbbrechen§7, um die Crateöffnung abzubrechen").build();
    public ItemStack CRATE_CANCEL = new ItemBuilder(Material.RED_CONCRETE, 1).displayname("§cAbbrechen").build();

    public ItemStack CRATE_WIN = new ItemBuilder(Material.HOPPER, 1).displayname("§aDein Gewinn").build();


    /**
     * Crate Preview Inventory Items
     */
    // Player
    public ItemStack PLAYER_HELMET_PREVIEW = new ItemBuilder(Material.DIAMOND_HELMET, 1).displayname("§7Spieler Helm").enchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).lore("", "§7Wahrscheinlichkeit: §e5%").build();
    public ItemStack PLAYER_CHESTPLATE_PREVIEW = new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1).displayname("§7Spieler Brustplatte").enchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).lore("", "§7Wahrscheinlichkeit: §e5%").build();
    public ItemStack PLAYER_PANTS_PREVIEW = new ItemBuilder(Material.DIAMOND_LEGGINGS, 1).displayname("§7Spieler Hose").enchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).lore("", "§7Wahrscheinlichkeit: §e5%").build();
    public ItemStack PLAYER_SHOES_PREVIEW = new ItemBuilder(Material.DIAMOND_BOOTS, 1).displayname("§7Spieler Schuhe").enchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1).lore("", "§7Wahrscheinlichkeit: §e5%").build();
    public ItemStack PLAYER_SWORD_PREVIEW = new ItemBuilder(Material.DIAMOND_SWORD, 1).displayname("§7Spieler Schwert").enchant(Enchantment.DAMAGE_ALL, 1).lore("", "§7Wahrscheinlichkeit: §e5%").build();
    public ItemStack playerPickAxePreview() {
        HashMap<Enchantment, Integer> playerPickAxeEnchants = new HashMap<>();
        playerPickAxeEnchants.put(Enchantment.DIG_SPEED, 3);
        playerPickAxeEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.IRON_PICKAXE, 1).displayname("§7Spieler Spitzhacke").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(playerPickAxeEnchants).build();
    }
    public ItemStack playerAxePreview() {
        HashMap<Enchantment, Integer> playerAxeEnchants = new HashMap<>();
        playerAxeEnchants.put(Enchantment.DIG_SPEED, 3);
        playerAxeEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.IRON_AXE, 1).displayname("§7Spieler Axt").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(playerAxeEnchants).build();
    }

    public ItemStack playerShovelPreview() {
        HashMap<Enchantment, Integer> playerShovelEnchants = new HashMap<>();
        playerShovelEnchants.put(Enchantment.DIG_SPEED, 3);
        playerShovelEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.IRON_SHOVEL, 1).displayname("§7Spieler Schaufel").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(playerShovelEnchants).build();
    }

    public ItemStack playerHoePreview() {
        HashMap<Enchantment, Integer> playerShovelEnchants = new HashMap<>();
        playerShovelEnchants.put(Enchantment.DIG_SPEED, 3);
        playerShovelEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.IRON_SHOVEL, 1).displayname("§7Spieler Schaufel").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(playerShovelEnchants).build();
    }
    public ItemStack PLAYER_COINS5_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e5 Tokens").lore("", "§7Wahrscheinlichkeit: §e25%").glow().build();
    public ItemStack PLAYER_COINS20_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e20 Tokens").lore("", "§7Wahrscheinlichkeit: §e15%").glow().build();
    public ItemStack PLAYER_COINS100_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e100 Tokens").lore("", "§7Wahrscheinlichkeit: §e5%").glow().build();

    // Knight

    public ItemStack knightHelmetPreview() {
        HashMap<Enchantment, Integer> knightHelmetEnchants = new HashMap<>();
        knightHelmetEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        knightHelmetEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_HELMET, 1).displayname("§3Knight Helm").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(knightHelmetEnchants).build();
    }

    public ItemStack knightChestPlatePreview() {
        HashMap<Enchantment, Integer> knightChestPlateEnchants = new HashMap<>();
        knightChestPlateEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        knightChestPlateEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1).displayname("§3Knight Brustplatte").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(knightChestPlateEnchants).build();
    }

    public ItemStack knightPantsPreview() {
        HashMap<Enchantment, Integer> knightPantsEnchants = new HashMap<>();
        knightPantsEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        knightPantsEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_LEGGINGS, 1).displayname("§3Knight Hose").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(knightPantsEnchants).build();
    }

    public ItemStack knightShoesPreview() {
        HashMap<Enchantment, Integer> knightShoesEnchants = new HashMap<>();
        knightShoesEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        knightShoesEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_BOOTS, 1).displayname("§3Knight Schuhe").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(knightShoesEnchants).build();
    }

    public ItemStack knightSwordPreview() {
        HashMap<Enchantment, Integer> knightSwordEnchants = new HashMap<>();
        knightSwordEnchants.put(Enchantment.DAMAGE_ALL, 2);
        knightSwordEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_SWORD, 1).displayname("§3Knight Schwert").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(knightSwordEnchants).build();
    }

    public ItemStack knightPickAxePreview() {
        HashMap<Enchantment, Integer> knightPickAxeEnchants = new HashMap<>();
        knightPickAxeEnchants.put(Enchantment.DIG_SPEED, 5);
        knightPickAxeEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.IRON_PICKAXE, 1).displayname("§3Knight Spitzhacke").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(knightPickAxeEnchants).build();
    }

    public ItemStack knightAxePreview() {
        HashMap<Enchantment, Integer> knightAxeEnchants = new HashMap<>();
        knightAxeEnchants.put(Enchantment.DIG_SPEED, 5);
        knightAxeEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.IRON_AXE, 1).displayname("§3Knight Axt").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(knightAxeEnchants).build();
    }

    public ItemStack knightShovelPreview() {
        HashMap<Enchantment, Integer> knightShovelEnchants = new HashMap<>();
        knightShovelEnchants.put(Enchantment.DIG_SPEED, 5);
        knightShovelEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.IRON_SHOVEL, 1).displayname("§3Knight Schaufel").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(knightShovelEnchants).build();
    }

    public ItemStack knightHoePreview() {
        HashMap<Enchantment, Integer> knightHoeEnchants = new HashMap<>();
        knightHoeEnchants.put(Enchantment.DIG_SPEED, 5);
        knightHoeEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.IRON_HOE, 1).displayname("§3Knight Hacke").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(knightHoeEnchants).build();
    }
    public ItemStack KNIGHT_COINS10_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e10 Tokens").lore("", "§7Wahrscheinlichkeit: §e25%").glow().build();
    public ItemStack KNIGHT_COINS50_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e50 Tokens").lore("", "§7Wahrscheinlichkeit: §e15%").glow().build();
    public ItemStack KNIGHT_COINS200_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e200 Tokens").lore("", "§7Wahrscheinlichkeit: §e5%").glow().build();

    // King Crate Preview
    public ItemStack kingHelmetPreview() {
        HashMap<Enchantment, Integer> kingHelmetEnchants = new HashMap<>();
        kingHelmetEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        kingHelmetEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.DIAMOND_HELMET, 1).displayname("§eKing Helm").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(kingHelmetEnchants).build();
    }

    public ItemStack kingChestPlatePreview() {
        HashMap<Enchantment, Integer> kingChestPlateEnchants = new HashMap<>();
        kingChestPlateEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        kingChestPlateEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1).displayname("§eKing Brustplatte").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(kingChestPlateEnchants).build();
    }

    public ItemStack kingPantsPreview() {
        HashMap<Enchantment, Integer> kingPantsEnchants = new HashMap<>();
        kingPantsEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        kingPantsEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.DIAMOND_LEGGINGS, 1).displayname("§eKing Hose").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(kingPantsEnchants).build();
    }

    public ItemStack kingShoesPreview() {
        HashMap<Enchantment, Integer> kingShoesEnchants = new HashMap<>();
        kingShoesEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        kingShoesEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.DIAMOND_BOOTS, 1).displayname("§eKing Schuhe").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(kingShoesEnchants).build();
    }

    public ItemStack kingSwordPreview() {
        HashMap<Enchantment, Integer> kingSwordEnchants = new HashMap<>();
        kingSwordEnchants.put(Enchantment.DAMAGE_ALL, 3);
        kingSwordEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.DIAMOND_SWORD, 1).displayname("§eKing† Schwert").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(kingSwordEnchants).build();
    }

    public ItemStack kingPickAxePreview() {
        HashMap<Enchantment, Integer> kingPickAxeEnchants = new HashMap<>();
        kingPickAxeEnchants.put(Enchantment.DIG_SPEED, 2);
        kingPickAxeEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_PICKAXE, 1).displayname("§eKing Spitzhacke").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(kingPickAxeEnchants).build();
    }

    public ItemStack kingAxePreview() {
        HashMap<Enchantment, Integer> kingAxeEnchants = new HashMap<>();
        kingAxeEnchants.put(Enchantment.DIG_SPEED, 3);
        kingAxeEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_AXE, 1).displayname("§eKing Axt").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(kingAxeEnchants).build();
    }

    public ItemStack kingShovelPreview() {
        HashMap<Enchantment, Integer> kingShovelEnchants = new HashMap<>();
        kingShovelEnchants.put(Enchantment.DIG_SPEED, 3);
        kingShovelEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_SHOVEL, 1).displayname("§eKing Schaufel").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(kingShovelEnchants).build();
    }

    public ItemStack kingHoePreview() {
        HashMap<Enchantment, Integer> kingHoeEnchants = new HashMap<>();
        kingHoeEnchants.put(Enchantment.DIG_SPEED, 3);
        kingHoeEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_HOE, 1).displayname("§eKing Hacke").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(kingHoeEnchants).build();
    }
    public ItemStack KING_COINS20_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e20 Tokens").lore("", "§7Wahrscheinlichkeit: §e25%").glow().build();
    public ItemStack KING_COINS100_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e100 Tokens").lore("", "§7Wahrscheinlichkeit: §e15%").glow().build();
    public ItemStack KING_COINS1000_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e1.000 Tokens").lore("", "§7Wahrscheinlichkeit: §e5%").glow().build();

    // God Items Preview
    public ItemStack godHelmetPreview() {
        HashMap<Enchantment, Integer> godHelmetEnchants = new HashMap<>();
        godHelmetEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        godHelmetEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.DIAMOND_HELMET, 1).displayname("§6God §7Helm").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(godHelmetEnchants).build();
    }

    public ItemStack godChestPlatePreview() {
        HashMap<Enchantment, Integer> godChestPlateEnchants = new HashMap<>();
        godChestPlateEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        godChestPlateEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1).displayname("§6God §7Brustplatte").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(godChestPlateEnchants).build();
    }

    public ItemStack godPantsPreview() {
        HashMap<Enchantment, Integer> godPantsEnchants = new HashMap<>();
        godPantsEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        godPantsEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.DIAMOND_LEGGINGS, 1).displayname("§6God §7Hose").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(godPantsEnchants).build();
    }

    public ItemStack godShoesPreview() {
        HashMap<Enchantment, Integer> godShoesEnchants = new HashMap<>();
        godShoesEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        godShoesEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.DIAMOND_BOOTS, 1).displayname("§6God §7Schuhe").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(godShoesEnchants).build();
    }

    public ItemStack godSwordPreview() {
        HashMap<Enchantment, Integer> godSwordEnchants = new HashMap<>();
        godSwordEnchants.put(Enchantment.DAMAGE_ALL, 3);
        godSwordEnchants.put(Enchantment.LOOT_BONUS_MOBS, 2);
        godSwordEnchants.put(Enchantment.DURABILITY, 2);
        return new ItemBuilder(Material.DIAMOND_SWORD, 1).displayname("§6God §7Schwert").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(godSwordEnchants).build();
    }

    public ItemStack godPickAxePreview() {
        HashMap<Enchantment, Integer> godPickAxeEnchants = new HashMap<>();
        godPickAxeEnchants.put(Enchantment.DIG_SPEED, 2);
        godPickAxeEnchants.put(Enchantment.LOOT_BONUS_BLOCKS, 2);
        godPickAxeEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_PICKAXE, 1).displayname("§6God §7Spitzhacke").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(godPickAxeEnchants).build();
    }

    public ItemStack godAxePreview() {
        HashMap<Enchantment, Integer> godAxeEnchants = new HashMap<>();
        godAxeEnchants.put(Enchantment.DIG_SPEED, 3);
        godAxeEnchants.put(Enchantment.LOOT_BONUS_BLOCKS, 2);
        godAxeEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_AXE, 1).displayname("§6God §7Axt").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(godAxeEnchants).build();
    }

    public ItemStack godShovelPreview() {
        Map<Enchantment, Integer> godShovelEnchants = new HashMap<>();
        godShovelEnchants.put(Enchantment.DIG_SPEED, 3);
        godShovelEnchants.put(Enchantment.SILK_TOUCH, 1);
        godShovelEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_SHOVEL, 1).displayname("§6God §7Schaufel").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(godShovelEnchants).build();
    }

    public ItemStack godHoePreview() {
        HashMap<Enchantment, Integer> godHoeEnchants = new HashMap<>();
        godHoeEnchants.put(Enchantment.DIG_SPEED, 3);
        godHoeEnchants.put(Enchantment.DURABILITY, 1);
        return new ItemBuilder(Material.DIAMOND_HOE, 1).displayname("§6God §7Hacke").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(godHoeEnchants).build();
    }
    public ItemStack GOD_COINS50_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e50 Tokens").lore("", "§7Wahrscheinlichkeit: §e25%").glow().build();
    public ItemStack GOD_COINS200_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e200 Tokens").lore("", "§7Wahrscheinlichkeit: §e15%").glow().build();
    public ItemStack GOD_COINS2500_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e2.500 Tokens").lore("", "§7Wahrscheinlichkeit: §e5%").glow().build();


    //Superior Crate Items
    public ItemStack superiorHelmetPreview() {
        HashMap<Enchantment, Integer> superiorHelmetEnchants = new HashMap<>();
        superiorHelmetEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        superiorHelmetEnchants.put(Enchantment.WATER_WORKER, 2);
        superiorHelmetEnchants.put(Enchantment.MENDING, 1);
        superiorHelmetEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.DIAMOND_HELMET, 1).displayname("§cSuperior §7Helm").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(superiorHelmetEnchants).build();
    }

    public ItemStack superiorChestPlatePreview() {
        HashMap<Enchantment, Integer> superiorChestPlateEnchants = new HashMap<>();
        superiorChestPlateEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        superiorChestPlateEnchants.put(Enchantment.MENDING, 1);
        superiorChestPlateEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1).displayname("§cSuperior §7Brustplatte").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(superiorChestPlateEnchants).build();
    }

    public ItemStack superiorPantsPreview() {
        HashMap<Enchantment, Integer> superiorPantsEnchants = new HashMap<>();
        superiorPantsEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        superiorPantsEnchants.put(Enchantment.MENDING, 1);
        superiorPantsEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.DIAMOND_LEGGINGS, 1).displayname("§cSuperior §7Hose").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(superiorPantsEnchants).build();
    }

    public ItemStack superiorShoesPreview() {
        HashMap<Enchantment, Integer> superiorShoesEnchants = new HashMap<>();
        superiorShoesEnchants.put(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        superiorShoesEnchants.put(Enchantment.SOUL_SPEED, 3);
        superiorShoesEnchants.put(Enchantment.MENDING, 1);
        superiorShoesEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.DIAMOND_BOOTS, 1).displayname("§cSuperior §7Schuhe").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(superiorShoesEnchants).build();
    }

    public ItemStack superiorSwordPreview() {
        HashMap<Enchantment, Integer> superiorSwordEnchants = new HashMap<>();
        superiorSwordEnchants.put(Enchantment.DAMAGE_ALL, 5);
        superiorSwordEnchants.put(Enchantment.MENDING, 1);
        superiorSwordEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.DIAMOND_SWORD, 1).displayname("§cSuperior §7Schwert").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(superiorSwordEnchants).build();
    }

    public ItemStack superiorPickAxePreview() {
        HashMap<Enchantment, Integer> superiorPickAxeEnchants = new HashMap<>();
        superiorPickAxeEnchants.put(Enchantment.DIG_SPEED, 5);
        superiorPickAxeEnchants.put(Enchantment.MENDING, 1);
        superiorPickAxeEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.DIAMOND_PICKAXE, 1).displayname("§cSuperior §7Spitzhacke").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(superiorPickAxeEnchants).build();
    }

    public ItemStack superiorAxePreview() {
        HashMap<Enchantment, Integer> superiorAxeEnchants = new HashMap<>();
        superiorAxeEnchants.put(Enchantment.DIG_SPEED, 5);
        superiorAxeEnchants.put(Enchantment.MENDING, 1);
        superiorAxeEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.DIAMOND_AXE, 1).displayname("§cSuperior §7Axt").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(superiorAxeEnchants).build();
    }

    public ItemStack superiorShovelPreview() {
        HashMap<Enchantment, Integer> superiorShovelEnchants = new HashMap<>();
        superiorShovelEnchants.put(Enchantment.DIG_SPEED, 5);
        superiorShovelEnchants.put(Enchantment.SILK_TOUCH, 1);
        superiorShovelEnchants.put(Enchantment.MENDING, 1);
        superiorShovelEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.DIAMOND_SHOVEL, 1).displayname("§cSuperior §7Schaufel").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(superiorShovelEnchants).build();
    }

    public ItemStack superiorHoePreview() {
        HashMap<Enchantment, Integer> superiorHoeEnchants = new HashMap<>();
        superiorHoeEnchants.put(Enchantment.DIG_SPEED, 5);
        superiorHoeEnchants.put(Enchantment.MENDING, 1);
        superiorHoeEnchants.put(Enchantment.DURABILITY, 3);
        return new ItemBuilder(Material.DIAMOND_HOE, 1).displayname("§cSuperior §7Hacke").lore("", "§7Wahrscheinlichkeit: §e5%").enchant(superiorHoeEnchants).build();
    }
    public ItemStack SUPERIOR_COINS100_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e100 Tokens").lore("", "§7Wahrscheinlichkeit: §e25%").glow().build();
    public ItemStack SUPERIOR_COINS1000_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e1.000 Tokens").lore("", "§7Wahrscheinlichkeit: §e15%").glow().build();
    public ItemStack SUPERIOR_COINS10000_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e10.000 Tokens").lore("", "§7Wahrscheinlichkeit: §e5%").glow().build();


    // Coins Preview
    public ItemStack COINS5_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e5 Tokens").lore("", "§7Wahrscheinlichkeit: §e26,67%").glow().build();
    public ItemStack COINS10_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e10 Tokens").lore("", "§7Wahrscheinlichkeit: §e20%").glow().build();
    public ItemStack COINS20_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e20 Tokens").lore("", "§7Wahrscheinlichkeit: §e16,67%").glow().build();
    public ItemStack COINS50_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e50 Tokens").lore("", "§7Wahrscheinlichkeit: §e13,33%").glow().build();
    public ItemStack COINS100_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e100 Tokens").lore("", "§7Wahrscheinlichkeit: §e10%").glow().build();
    public ItemStack COINS200_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e200 Tokens").lore("", "§7Wahrscheinlichkeit: §e6,66%").glow().build();
    public ItemStack COINS1000_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e1.000 Tokens").lore("", "§7Wahrscheinlichkeit: §e3,33%").glow().build();
    public ItemStack COINS2500_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e2.500 Tokens").lore("", "§7Wahrscheinlichkeit: §e1,67%").glow().build();
    public ItemStack COINS10000_PREVIEW = new ItemBuilder(Material.GOLD_NUGGET, 1).displayname("§e10.000 Tokens").lore("", "§7Wahrscheinlichkeit: §e1,66%").glow().build();


    // Normal Item Stuff Preview
    public ItemStack GOLDEN_APPLE_PREVIEW = new ItemBuilder(Material.GOLDEN_APPLE, 2).displayname("§dGoldene Äpfel").lore("", "§7Wahrscheinlichkeit: §e5%").build();
    public ItemStack EXPERIENCE_PREVIEW = new ItemBuilder(Material.EXPERIENCE_BOTTLE, 4).displayname("§eXP-Flaschen").lore("", "§7Wahrscheinlichkeit: §e5%").build();


    /**
     * Bank Unlock Inventory Items
     */
    public ItemStack BANK_UNLOCK = new ItemBuilder(Material.GOLD_INGOT, 1).displayname("§6Bankaccount freischalten")
            .lore("", "§7Freischaltung:", "§620.000 Tokens", "", "§aKlicke§7, um den Bankaccount freizuschalten.").build();


    // Deposit Coins
    public ItemStack BANK_DEPOSIT_HALF = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2RiY2E0YjY5ZWFmOGRjYjdhYzM3MjgyMjhkZThhNjQ0NDA3ODcwMTMzNDJkZGFhYmMxYjAwZWViOGVlYzFlMiJ9fX0="
            , 1, "");

    // Withdraw Coins



    /**
     * Draw Inventory Items
     */
    public ItemStack CRATES = TextureAPI.withTexture("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDYyN2NkMzFjYjc2ZTc2OGM5MmI2ZjQ3YjdmZDJiZDljNzg3ZTk1MDdjZDk0NjlhNjhjZGQyMzdiNWI0Y2FlYSJ9fX0=",
            1, "§6Crates");
    public ItemStack RANKS = new ItemBuilder(Material.ENCHANTED_BOOK, 1).displayname("§bRänge").build();
    public ItemStack COINS = new ItemBuilder(Material.GOLD_INGOT, 1).displayname("§6Tokens").build();
    public ItemStack ITEMS = new ItemBuilder(Material.TURTLE_EGG,1).displayname("§dItems").build();
}
