package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class StackCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("stack")) {
            if (!player.hasPermission(SkyPvP.getInstance().getPerms().godPerms)) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + SkyPvP.getInstance().getPerms().noPerms));
            } else {
                if (args.length > 1) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/stack"));
                }
                if (args.length == 0) {
                    stackItems(player);
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7All deine Items wurden zusammengefügt."));
                }
            }
        }

        return true;
    }

    private void stackItems(Player player) {
        Inventory inventory = player.getInventory();
        for (int i = 0; i < inventory.getSize(); i++) {
            ItemStack current = inventory.getItem(i);
            if (current == null) continue;
            Material material = current.getType();
            ItemMeta im = current.getItemMeta();
            if (current.getAmount() >= 64) continue;
            for (int j = i + 1; j < inventory.getSize(); j++) {
                ItemStack toAdd = inventory.getItem(j);
                ItemMeta toAddMeta = toAdd.getItemMeta();
                if (toAddMeta == null) continue;
                if (material == toAdd.getType()) {
                    if (im == toAddMeta) {
                        int maxToAdd = current.getMaxStackSize() - current.getAmount();
                        if (toAdd.getAmount() <= maxToAdd) {
                            current.setAmount(current.getAmount() + toAdd.getAmount());
                            inventory.setItem(j, new ItemStack(Material.AIR));
                        } else {
                            current.setAmount(current.getMaxStackSize());
                            toAdd.setAmount(toAdd.getAmount() - maxToAdd);
                        }
                    }
                }
            }
        }
    }
}
