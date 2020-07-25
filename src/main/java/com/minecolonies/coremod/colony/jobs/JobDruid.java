package com.minecolonies.coremod.colony.jobs;

import com.minecolonies.api.client.render.modeltype.BipedModelType;
import com.minecolonies.api.client.render.modeltype.IModelType;
import com.minecolonies.api.colony.ICitizenData;
import com.minecolonies.api.colony.jobs.ModJobs;
import com.minecolonies.api.colony.jobs.registry.JobEntry;
import com.minecolonies.coremod.entity.ai.citizen.druid.EntityAIDruid;

/**
 * The druid job class.
 */
public class JobDruid extends AbstractJob<EntityAIDruid, JobDruid>
{
    public JobDruid(final ICitizenData citizen)
    {
        super(citizen);
    }

    /**
     * The {@link JobEntry} for this job.
     *
     * @return The {@link JobEntry}.
     */
    @Override
    public JobEntry getJobRegistryEntry()
    {
        return ModJobs.druid;
    }

    /**
     * Return a Localization textContent for the Job.
     *
     * @return localization textContent String.
     */
    @Override
    public String getName()
    {
        return "com.minecolonies.coremod.job.druid";
    }

    /**
     * Generate your AI class to register.
     * <p>
     * Suppressing Sonar Rule squid:S1452 This rule does "Generic wildcard types should not be used in return parameters" But in this case the rule does not apply because We are
     * fine with all AbstractJob implementations and need generics only for java
     *
     * @return your personal AI instance.
     */
    @Override
    public EntityAIDruid generateAI()
    {
        return new EntityAIDruid(this);
    }

    @Override
    public IModelType getModel()
    {
        return BipedModelType.DRUID;
    }
}
