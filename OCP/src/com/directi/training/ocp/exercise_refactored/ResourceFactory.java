package com.directi.training.ocp.exercise;

public class ResourceFactory
{
    public static Resource addResource(ResourceType type)
    {
        switch (type) {
            case TIME_SLOT:
                resourceId = TimeResource.findFreeSlot();
                return new TimeResource(resourceId);
            case SPACE_SLOT:
                resourceId = SpaceResource.findFreeSlot();
                return new SpaceResource(resourceId);
            default:
                throw new IllegalArgumentException("Unknown resource type: " + type);
        }

    }

}