package net.pixelplays.skypvp.apis;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;
import java.util.List;
import java.util.UUID;

public class TextureAPI {

    public static @NotNull ItemStack withTexture(String texture, int amount, String displayName, String... lores) {
        if (texture == null)
            texture = new String("");
        if (texture.isEmpty())
            texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmFkYzA0OGE3Y2U3OGY3ZGFkNzJhMDdkYTI3ZDg1YzA5MTY4ODFlNTUyMmVlZWQxZTNkYWYyMTdhMzhjMWEifX19=";
        ItemStack item = new ItemStack(Material.PLAYER_HEAD, amount, (short) 3);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(displayName));
        meta.setLore(List.of(lores));
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        profile.getProperties().put("textures", new Property("textures", texture));
        try {
            Field field = meta.getClass().getDeclaredField("profile");
            field.setAccessible(true);
            field.set(meta, profile);
        } catch (Exception ignored) {}
        item.setItemMeta(meta);
        return item;
        //https://minecraft-heads.com/player-heads/blocks
    }

}
