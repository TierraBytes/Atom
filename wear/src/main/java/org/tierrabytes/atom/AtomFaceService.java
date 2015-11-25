package org.tierrabytes.atom;

import android.support.wearable.watchface.CanvasWatchFaceService;

/**
 * Created by Shadow on 11/25/2015.
 */
public class AtomFaceService extends CanvasWatchFaceService
{

    private class WatchFaceEngine extends Engine
    {

    }

    @Override
    public Engine onCreateEngine() {
        return new WatchFaceEngine();
    }
}
