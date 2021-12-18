package net.pixelplays.skypvp.enchants;

import org.bukkit.enchantments.Enchantment;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomEnchants {

    public CustomEnchants() {}

    public final Enchantment GLOW = new EnchantmentWrapper("glow", "Glow", 1);

    public List<Enchantment> getEnchantments() {
        // return a list with all custom enchantments
        return new ArrayList<>() {{
            add(GLOW);
        }};
    }

    public void register() {
        boolean registered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(GLOW);

        if (!registered) {
            registerEnchantment(GLOW);
        }
    }

    public void registerEnchantment(Enchantment enchantment) {
        boolean registered = true;
        try {
            Field f = Enchantment.class.getDeclaredField("acceptingNew");
            f.setAccessible(true);
            f.set(null, true);
            Enchantment.registerEnchantment(enchantment);
        } catch (Exception e) {
            registered = false;
            e.printStackTrace();
        }
    }

}
