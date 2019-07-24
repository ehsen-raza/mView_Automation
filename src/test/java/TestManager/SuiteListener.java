package TestManager;

import Drivers.BrowserManager;
import PageObj.LoginObj;
import Services.AppEnv;
import Services.ReportManager;
import Services.SystemConfiguration;
import org.testng.*;

/**
 * This is suite listener class to setup a suite before its execution
 */

public class SuiteListener implements ITestListener, ISuiteListener, IInvokedMethodListener {
    private final SystemConfiguration SysConfig = SystemConfiguration.getInstance(appEnv);
    private BrowserManager browserManager = null;
    public static AppEnv appEnv = new AppEnv();

    public static ReportManager reportManager = null;
    public static ReportManager getReportManager(){
        return reportManager;
    }


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
 //       ReportManager reportManager = new ReportManager();

        /* Log In the session if required */
        if(appEnv.isLogInReq()){
            pgLogin.LogIn("raiirfan@gmail.com","irfan");
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Test Started  " +  iTestResult.getName());
        reportManager.InitReport(iTestResult.getName() , "  Execution Started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
       reportManager.LogTestStep(true,iTestResult.getName()+ " Passed ");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        reportManager.LogTestStep(false,iTestResult.getName()+ " Failed ");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        reportManager = new ReportManager();
        reportManager.TestEnvironment();
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        reportManager.EndReport();

    }
}
