package net.pixelplays.skypvp.commands;

import net.kyori.adventure.text.Component;
import net.pixelplays.skypvp.SkyPvP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class MessageCommand implements CommandExecutor {

    public HashMap<Player, Player> reply = new HashMap<>();

    public MessageCommand() {}

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        StringBuilder message = new StringBuilder();

        if (!(sender instanceof Player)) {
            sender.sendMessage(SkyPvP.getInstance().getUtils().onlyPlayerCommand);
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("message")) {
            if (args.length < 2) {
                player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§7Nutze: §e/msg <Playername> <Message>"));
            }
            if (args.length >= 2) {
                try {
                    Player target = player.getServer().getPlayerExact(args[0]);
                    for (int i = 1; i < args.length; i++) {
                        message.append(args[i]).append(" ");
                    }
                    target.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§e" + player.getName() + " §7✉ » §a" + target.getName() + "§7: §e" + message));
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§e" + player.getName() + " §7✉ » §a" + target.getName() + "§7: §e" + message));
                    reply.put(target, player);
                    message = new StringBuilder();
                } catch (NullPointerException exception) {
                    player.sendMessage(Component.text(SkyPvP.getInstance().getUtils().Prefix + "§cDieser Spieler ist nicht online."));
                }
            }
        }

        return true;
    }
}
