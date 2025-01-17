package com.cleanroommc.groovyscript.compat.vanilla;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.world.World;
import org.jetbrains.annotations.UnknownNullability;

public class CraftingInfo {

    private final InventoryCrafting inventory;
    private final World world;
    private final EntityPlayer player;

    public CraftingInfo(InventoryCrafting inventory, @UnknownNullability EntityPlayer player) {
        this.inventory = inventory;
        this.player = player;
        this.world = player.world;
    }

    public InventoryCrafting getInventory() {
        return this.inventory;
    }

    public EntityPlayer getPlayer() {
        return player;
    }

    public int getDimension() {
        return this.world.provider.getDimension();
    }

    public World getWorld() {
        return this.world;
    }
}
