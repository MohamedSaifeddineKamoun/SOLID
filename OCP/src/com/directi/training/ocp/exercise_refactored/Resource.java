package com.directi.training.ocp.exercise;

public abstract class Resource {
    protected int resourceId; // protected so that subclasses can access it

    // Constructor that sets the resourceId
    public Resource(int resourceId) {
        this.resourceId = resourceId;
    }

    // Abstract methods that subclasses must implement
    public abstract void free();
    public abstract void markSlotBusy();
    public abstract void markSlotFree();

    // Note: We cannot have abstract static methods, so we remove the static findFreeSlot from here.
    // Instead, each subclass will have its own static findFreeSlot method.
}