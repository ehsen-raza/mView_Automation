package TestManager;

import Drivers.BrowserManager;
import PageObj.LoginObj;
import Services.AppEnv;
import Services.SystemConfiguration;
import org.testng.*;

/**
 * This is suite listener class to setup a suite before its execution
 */

public class SuiteListener implements ISuiteListener, IInvokedMethodListener {
    private final SystemConfiguration SysConfig = SystemConfiguration.getInstance(appEnv);
    private BrowserManager browserManager = null;
    public static AppEnv appEnv = new AppEnv();


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


    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        TestFiltration testFiltration = TestFiltration.getInstance(appEnv);
        testFiltration.Test_Assignment(iInvokedMethod);
        LoginObj pgLogin = LoginObj.getInstance(appEnv);
        appEnv.setTestPass(false);
        /* Log In the session if required */
        if(appEnv.isLogInReq()){
            pgLogin.LogIn("raiirfan@gmail.com","irfan");
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }
}
