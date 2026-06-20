package dev.biomancy.events;

import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import com.hypixel.hytale.server.core.universe.world.npc.INonPlayerCharacter;
import com.hypixel.hytale.server.npc.NPCPlugin;
import com.hypixel.hytale.server.npc.entities.NPCEntity;
import com.hypixel.hytale.server.core.universe.world.World;

import org.joml.Vector3d;
import com.hypixel.hytale.math.vector.Rotation3fc;
import com.hypixel.hytale.math.vector.Rotation3f;

public class SagesEvent {

    public static void onPlayerReady(PlayerReadyEvent event) {
        Ref<EntityStore> ref = event.getPlayerRef();
    
        if (ref.isValid()) {
            Store<EntityStore> store = ref.getStore();
            PlayerRef playerRef = store.getComponent(ref, PlayerRef.getComponentType());
            if (playerRef != null) {
                playerRef.sendMessage(Message.raw("Welcome to the Sages Mod, " + playerRef.getUsername()));

                // TODO sample logic to spawn an entity here
                // Get the player's current position to spawn the NPC at the same location
                Vector3d position = playerRef.getTransform().getPosition();
                // Define the initial rotation (facing direction) for the NPC
                Rotation3f rotation = playerRef.getTransform().getRotation();

                // Use the NPCPlugin helper to spawn the NPC.
                NPCPlugin.get().spawnNPC(store, "Kweebec_Sapling", null, position, rotation);
            }
        }
    }
}
