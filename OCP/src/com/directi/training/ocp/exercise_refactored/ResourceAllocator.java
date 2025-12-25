package com.directi.training.ocp.exercise;

import java.util.ArrayList;
import java.util.ArrayList;

public class ResourceAllocator
{
    private static List<Resource> resourcelist = new ArrayList<>;

    public int allocate(ResourceType type)
    {
        return ResourceFactory.addResource(ResourceType type);
    }

    public void free(int resourceId)
    {
        ResourceFactory.free(resourceId);
    }
}