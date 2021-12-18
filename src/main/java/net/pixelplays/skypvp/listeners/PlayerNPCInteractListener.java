package net.pixelplays.skypvp.listeners;

import com.github.juliarn.npc.NPC;
import com.github.juliarn.npc.event.PlayerNPCInteractEvent;
import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.apis.BankAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerNPCInteractListener implements Listener {

    @EventHandler
    public void onNPCInteract(PlayerNPCInteractEvent event) {
        final Player player = event.getPlayer();
        final NPC npc = event.getNPC();
        if (event.getUseAction().equals(PlayerNPCInteractEvent.EntityUseAction.ATTACK)) {
            if (npc.getProfile().getName().equalsIgnoreCase("§aRanginfo")) {
                SkyPvP.getInstance().getInventories().getRankInfoInventory(player);
            }
            if (npc.getProfile().getName().equalsIgnoreCase("§2Farmwelt")) {
                player.teleport(SkyPvP.getInstance().getLocationAPI().getLocation("Warp.Farmwelt"));
            }
            if (npc.getProfile().getName().equalsIgnoreCase("§cSkyPvP")) {
                player.teleport(SkyPvP.getInstance().getLocationAPI().getLocation("Spawn"));
            }
            if (npc.getProfile().getName().equalsIgnoreCase("§eCitybuild")) {
                player.teleport(SkyPvP.getInstance().getLocationAPI().getLocation("Warp.Citybuild"));
            }
            if (npc.getProfile().getName().equalsIgnoreCase("§6Bankarbeiter")) {
                if (!BankAPI.playerExists(player.getUniqueId())) {
                    SkyPvP.getInstance().getInventories().getBankUnlockInventory(player);
                } else {
                    SkyPvP.getInstance().getInventories().getBankInventory(player);
                }
            }

        }
    }

}
