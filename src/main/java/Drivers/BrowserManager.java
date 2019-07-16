package Drivers;

import Services.AppEnv;

/**
 * This class will use to manage webdrivers routines
 */

public class BrowserManager {

    private static BrowserManager browserManager = new BrowserManager( );
    private static AppEnv appEnv = new AppEnv();
    private BrowserManager() { }

    /* Static 'instance' method */
    public static BrowserManager getInstance(AppEnv appEnv) {
        BrowserManager.appEnv = appEnv;
        return browserManager;
    }

    public void Launch_Browser(){

    }
}
/*--------------------------------------------------------------------------------------------------------------------*/