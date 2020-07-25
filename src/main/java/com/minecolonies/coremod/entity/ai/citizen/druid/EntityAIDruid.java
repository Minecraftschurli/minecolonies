package com.minecolonies.coremod.entity.ai.citizen.druid;

import com.minecolonies.coremod.colony.buildings.workerbuildings.BuildingDruid;
import com.minecolonies.coremod.colony.jobs.JobDruid;
import com.minecolonies.coremod.entity.ai.basic.AbstractEntityAIInteract;
import org.jetbrains.annotations.NotNull;

//TODO
public class EntityAIDruid extends AbstractEntityAIInteract<JobDruid, BuildingDruid>
{
    /**
     * Creates the abstract part of the AI. Always use this constructor!
     *
     * @param job the job to fulfill
     */
    public EntityAIDruid(@NotNull final JobDruid job)
    {
        super(job);
    }

    /**
     * Can be overridden in implementations to return the exact building type the worker expects.
     *
     * @return the building type associated with this AI's worker.
     */
    @Override
    public Class<BuildingDruid> getExpectedBuildingClass()
    {
        return BuildingDruid.class;
    }
}
