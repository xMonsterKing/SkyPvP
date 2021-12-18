package net.pixelplays.skypvp.utils;

import com.google.common.base.Preconditions;
import net.md_5.bungee.api.ChatColor;
import net.pixelplays.skypvp.SkyPvP;
import net.pixelplays.skypvp.utils.npc.NPCUtil;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.libs.org.codehaus.plexus.interpolation.Interpolator;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Utils {

    public String Prefix;

    public String Welcome;

    public String onlyPlayerCommand;

    public boolean SETUP_DONE = false;

    public ArrayList<Player> crateOpened = new ArrayList<>();

    public List<Player> vanished = new ArrayList<>();

    public void setupNPC() {
        if (!SETUP_DONE) {
            if (SkyPvP.getInstance().getLocationAPI().getLocation("NPC.Shop") != null) {
                NPCUtil npcUtil = SkyPvP.getInstance().getNpcUtil();
                npcUtil.appendNPC(SkyPvP.getInstance().getLocationAPI().getLocation("NPC.Shop"),
                        UUID.fromString("e7d88804-8f49-4270-93ba-13124f57c9a5"), "§eSkyPvP Shop",
                        false, true, true, null);
                npcUtil.appendNPC(SkyPvP.getInstance().getLocationAPI().getLocation("NPC.Ranginfo"),
                        UUID.fromString("1e001e65-c775-46ee-abd6-be8f70f1218a"), "§aRanginfo",
                        false, true, true, null);
                npcUtil.appendNPC(SkyPvP.getInstance().getLocationAPI().getLocation("NPC.Kits"),
                        UUID.fromString("f5162219-3bf0-47f3-a79a-ff67d9f27630"), "§cKits",
                        false, true, true, null);
                npcUtil.appendNPC(SkyPvP.getInstance().getLocationAPI().getLocation("NPC.Job"),
                        UUID.fromString("d94c9f7a-e1e9-4db3-9268-608f873b0681"), "§9Jobs",
                        false, true, true, null);
                npcUtil.appendNPC(SkyPvP.getInstance().getLocationAPI().getLocation("NPC.Farmwelt"),
                        UUID.fromString("09450dd1-30a8-4541-85f9-1fc2e7bf1901"), "§2Farmwelt",
                        true, true, true, null);
                npcUtil.appendNPC(SkyPvP.getInstance().getLocationAPI().getLocation("NPC.SkyPvP"),
                        UUID.fromString("532ecdd9-1f4c-42de-b2d3-613fb93ab817"), "§cSkyPvP",
                        true, true, true, null);
                npcUtil.appendNPC(SkyPvP.getInstance().getLocationAPI().getLocation("NPC.Citybuild"),
                        UUID.fromString("47752b42-213c-4d5e-a130-601bca0df525"), "§eCitybuild",
                        true, true, true, null);
                npcUtil.appendNPC(SkyPvP.getInstance().getLocationAPI().getLocation("NPC.Bank"),
                        UUID.fromString("47752b42-213c-4d5e-a130-601bca0df525"), "§6Bankarbeiter",
                        false, true, true, null);
                SETUP_DONE = true;
            }
        }
    }

    public void checkSetup(final Player player) {
        if (player.hasPermission(SkyPvP.getInstance().getPerms().apprenticePerms)) {
            StringBuilder stringBuilder = new StringBuilder();
            Location location = SkyPvP.getInstance().getLocationAPI().getLocation("Spawn");
            if (location == null) {
                stringBuilder.append(Prefix + "§7Es scheint, als wäre der Spawn nicht gesetzt worden zu sein. Bitte melde dich bei einem Admin");
            }
            if (!SETUP_DONE) {
                stringBuilder.append("§7Außerdem fehlen die Spawns für die NPC's");
            }
            player.sendMessage(stringBuilder.toString());
        }
    }


    //§7•

}
