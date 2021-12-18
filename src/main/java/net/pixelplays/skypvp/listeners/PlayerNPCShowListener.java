package net.pixelplays.skypvp.listeners;

import com.github.juliarn.npc.NPC;
import com.github.juliarn.npc.event.PlayerNPCShowEvent;
import com.github.juliarn.npc.modifier.AnimationModifier;
import com.github.juliarn.npc.modifier.EquipmentModifier;
import com.github.juliarn.npc.modifier.LabyModModifier;
import com.github.juliarn.npc.modifier.MetadataModifier;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class PlayerNPCShowListener implements Listener {

    @EventHandler
    public void onPlayerNPCShow(PlayerNPCShowEvent event) {
        final Player player = event.getPlayer();
        final NPC npc = event.getNPC();

        if (npc.getProfile().getName().equalsIgnoreCase("§2Farmwelt")) {
            event.send(
                    //npc.animation().queue(AnimationModifier.EntityAnimation.SWING_MAIN_ARM),
                    npc.labymod().queue(LabyModModifier.LabyModAction.EMOTE, 55),
                    npc.metadata().queue(MetadataModifier.EntityMetadata.SKIN_LAYERS, true),
                    npc.equipment().queue(EquipmentModifier.MAINHAND, new ItemStack(Material.NETHERITE_PICKAXE))
            );
        }
        if (npc.getProfile().getName().equalsIgnoreCase("§cSkyPvP")) {
            event.send(
                    //npc.animation().queue(AnimationModifier.EntityAnimation.SWING_MAIN_ARM),
                    npc.labymod().queue(LabyModModifier.LabyModAction.EMOTE, 55),
                    npc.metadata().queue(MetadataModifier.EntityMetadata.SKIN_LAYERS, true),
                    npc.equipment().queue(EquipmentModifier.MAINHAND, new ItemStack(Material.IRON_SWORD))
            );
        }
        if (npc.getProfile().getName().equalsIgnoreCase("§eCitybuild")) {
            event.send(
                    //npc.animation().queue(AnimationModifier.EntityAnimation.SWING_MAIN_ARM),
                    npc.labymod().queue(LabyModModifier.LabyModAction.EMOTE, 55),
                    npc.metadata().queue(MetadataModifier.EntityMetadata.SKIN_LAYERS, true),
                    npc.equipment().queue(EquipmentModifier.MAINHAND, new ItemStack(Material.SPRUCE_LOG))
            );
        }
        if (npc.getProfile().getName().equalsIgnoreCase("§eSkyPvP Shop")) {
            event.send(
                    //npc.animation().queue(AnimationModifier.EntityAnimation.SWING_MAIN_ARM),
                    npc.labymod().queue(LabyModModifier.LabyModAction.EMOTE, 55),
                    npc.metadata().queue(MetadataModifier.EntityMetadata.SKIN_LAYERS, true)
            );
        }
        if (npc.getProfile().getName().equalsIgnoreCase("§aRanginfo")) {
            event.send(
                    //npc.animation().queue(AnimationModifier.EntityAnimation.SWING_MAIN_ARM),
                    npc.labymod().queue(LabyModModifier.LabyModAction.EMOTE, 55),
                    npc.metadata().queue(MetadataModifier.EntityMetadata.SKIN_LAYERS, true),
                    npc.equipment().queue(EquipmentModifier.MAINHAND, new ItemStack(Material.KNOWLEDGE_BOOK))
            );
        }
        if (npc.getProfile().getName().equalsIgnoreCase("§cKits")) {
            event.send(
                    //npc.animation().queue(AnimationModifier.EntityAnimation.SWING_MAIN_ARM),
                    npc.labymod().queue(LabyModModifier.LabyModAction.EMOTE, 55),
                    npc.metadata().queue(MetadataModifier.EntityMetadata.SKIN_LAYERS, true)
            );
        }
        if (npc.getProfile().getName().equalsIgnoreCase("§9Jobs")) {
            event.send(
                    //npc.animation().queue(AnimationModifier.EntityAnimation.SWING_MAIN_ARM),
                    npc.labymod().queue(LabyModModifier.LabyModAction.EMOTE, 55),
                    npc.metadata().queue(MetadataModifier.EntityMetadata.SKIN_LAYERS, true)
            );
        }
    }

}
