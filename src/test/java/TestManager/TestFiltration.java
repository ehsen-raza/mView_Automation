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

        switch (methodName.getMethodName()) {
            case "User_Login":
                appEnv.setLogInReq(false);
                break;

            case "Navigate_To_Roles":
                appEnv.setLogInReq(true);
                break;

        default:
            appEnv.setLogInReq(true);
            break;
        }

    }
}
