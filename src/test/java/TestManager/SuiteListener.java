package TestManager;

import Drivers.BrowserManager;
import Services.AppEnv;
import Services.SystemConfiguration;
import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * This is suite listener class to setup a suite before its execution
 */

public class SuiteListener implements ISuiteListener {
    public static AppEnv appEnv = new AppEnv();
    protected final SystemConfiguration SysConfig = SystemConfiguration.getInstance(appEnv);
    private BrowserManager browserManager = null;

    @Override
    public void onStart(ISuite iSuite) {
        appEnv = SysConfig.Read_Properties(appEnv);
        browserManager = BrowserManager.getInstance(appEnv);
        browserManager.Launch_Browser();
        browserManager.GetURL();


    }

    @Override
    public void onFinish(ISuite iSuite) {
        browserManager.Kill_Driver();
    }
}
