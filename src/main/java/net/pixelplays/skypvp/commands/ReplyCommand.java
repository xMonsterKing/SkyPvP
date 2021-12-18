package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ReplyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        String message = "";

        if (command.getName().equalsIgnoreCase("reply")) {
            if (args.length == 0) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/r <Message>"));
            }
            if (args.length >= 1) {
                MessageCommand messageCommand = new MessageCommand();
                if (!messageCommand.reply.containsKey(player)) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§cDu kannst niemandem antworten!"));
                } else {
                    Player target = messageCommand.reply.get(player);
                    if (target == null) {
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§cDieser Spieler ist nicht online."));
                    } else {
                        for (int i = 0; i < args.length; i++) {
                            message = message + args[i] + " ";
                        }
                        target.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§e" + player.getName() + " §7✉ » §a" + target.getName() + "§7: §e" + message));
                        player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§e" + player.getName() + " §7✉ » §a" + target.getName() + "§7: §e" + message));
                        messageCommand.reply.put(target, player);
                        message = "";
                    }
                }
            }
        }

        return false;
    }
}
