package TestManager;

import Services.AppEnv;
import Services.General;
import org.testng.IInvokedMethod;
import org.testng.ITestNGMethod;

/**
 * This class will assign parameters to test cases
 */
public class TestFiltration {
    private static TestFiltration testFiltrationObj = new TestFiltration();
    private static AppEnv appEnv = new AppEnv();
    private static General Utils = null;

    private TestFiltration() {
    }

    /* Static 'instance' method */
    public static TestFiltration getInstance(AppEnv appEnv) {
        TestFiltration.appEnv = appEnv;
        Utils = General.getInstance(appEnv);
        return testFiltrationObj;
    }

    public void Test_Assignment(IInvokedMethod iInvokedMethod){
        ITestNGMethod methodName = iInvokedMethod.getTestMethod();
        String TestDescription = "";
        switch (methodName.getMethodName()) {
            case "User_Login":
                appEnv.setLogInReq(false);
                TestDescription = "This test will log in the user";
                break;
            case "Incorrect_Credentials":
                appEnv.setLogInReq(false);
                TestDescription = "This test will log in the user with incorrect credentials";
                break;
            case "Empty_Credentials":
                appEnv.setLogInReq(false);
                TestDescription = "This test will log in the user with empty credentials";
                break;

            case "Verify_Media_Camera_Dashboard_Page":
                appEnv.setLogInReq(false);
                TestDescription = "This will verify Media Camera Dashboard page Loading";
                break;
            case "Verify_Media_Reports_Page":
                appEnv.setLogInReq(false);
                TestDescription = "This will Verify_Media_Reports_Page page Loading";
                break;
            case "Verify_Media_RTAC_Page":
                appEnv.setLogInReq(false);
                TestDescription = "This will  Verify_Media_RTAC_Page Loading";
                break;
            case "Verify_Media_Search_Page":
                appEnv.setLogInReq(false);
                TestDescription = "This will Verify_Media_RTAC_Page  Loading";
                break;
            case "Verify_Media_Sessions_Page":
                appEnv.setLogInReq(false);
                TestDescription = "This will Verify_Media_Search_Page  Loading";
                break;
            case "Verify_Media_Dip_Sampling_Page":
                appEnv.setLogInReq(false);
                TestDescription = "This will Verify_Media_Dip_Sampling_Page  Loading";
                break;
            case "Verify_Media_Evidence_Brief_Page":
                appEnv.setLogInReq(false);
                TestDescription = "This will Verify_Media_Evidence_Brief_Page  Loading";
                break;

        default:
            appEnv.setLogInReq(true);
            break;
        }
        appEnv.getReportManager().InitReport(methodName.getMethodName() , TestDescription);
    }
}
