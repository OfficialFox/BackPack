package com.foxdev.backpack.Manager;

import java.util.UUID;

public class BackPackManager {

    private UUID playerUUID;
    private int slots;

    public BackPackManager(UUID playerUUID, int slots){
        this.playerUUID = playerUUID;
        this.slots = slots;
    }


    public void setPlayerUUID(UUID playerUUID){
        this.playerUUID = playerUUID;
    }

    public void setSlots(int slots){
        this.slots = slots;
    }
}
