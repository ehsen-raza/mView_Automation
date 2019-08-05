package Services;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportManager {

    private static ReportManager reportManager = new ReportManager();
    private static AppEnv appEnv = new AppEnv();
    private static ExtentReports extentReports = null;
    private static ExtentTest extentTest = null;
    private static General Utils = null;

    private ReportManager() {
    }

    /* Static 'instance' method */
    public static ReportManager getInstance(AppEnv appEnv) {
        ReportManager.appEnv = appEnv;
        Utils = General.getInstance(appEnv);
        extentReports = new ExtentReports();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./src/main/resources/Reports/" + Utils.Get_TimeStamp());
        htmlReporter.setAppendExisting(true);
        htmlReporter.config().setChartVisibilityOnOpen(false);
        extentReports.attachReporter(htmlReporter);
        return reportManager;
    }

    /**
     *
     */
    public void TestEnvironment()
    {
        extentReports.setSystemInfo("User : ", System.getProperty("user.name"));
        extentReports.setSystemInfo("OS : ", System.getProperty("os.name"));
        extentReports.setSystemInfo("JDK : ", System.getProperty("java.version"));
    }
    public void InitReport(String strTestName, String strTestDescription)
    {
        extentTest = extentReports.createTest(strTestName, strTestDescription);
    }
    public void LogTestStep(boolean bStatus, String strTestStep)
    {
        if(bStatus)
        {
            extentTest.log(Status.PASS, strTestStep);
            System.out.println("Pass : " + strTestStep);
        }else
        {
            extentTest.log(Status.FAIL, strTestStep);
            System.out.println("Fail : " + strTestStep);
        }
    }
    public void LogStepInfo(String strTestStep)
    {
        if( extentTest !=null)
        {
            extentTest.log(Status.INFO, strTestStep);
            System.out.println(strTestStep);
        }
    }
    public void EndReport()
    {
        if(extentTest!=null)
            extentReports.flush();
    }
}
