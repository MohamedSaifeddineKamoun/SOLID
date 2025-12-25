package com.directi.training.ocp.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:17:04 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class TimeResource extends Resource
{
 
    private void markSlotFree(int resourceId)
    {
        //logique free TimeResource
    }

    private void markSlotBusy(int resourceId)
    {
        //logique busy TimeResource
    }

    private int findFreeSlot()
    {
        //logique find free TimeResource
        return 0;
    }

}
