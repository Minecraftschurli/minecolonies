package com.minecolonies.coremod.blocks.huts;

import com.minecolonies.api.blocks.AbstractBlockHut;
import com.minecolonies.api.colony.buildings.ModBuildings;
import com.minecolonies.api.colony.buildings.registry.BuildingEntry;
import org.jetbrains.annotations.NotNull;

/**
 * Block of the Druid hut.
 */
public class BlockHutDruid extends AbstractBlockHut<BlockHutDruid>
{
    @NotNull
    @Override
    public String getName()
    {
        return "blockhutdruid";
    }

    @Override
    public BuildingEntry getBuildingEntry()
    {
        return ModBuildings.druid;
    }
}
