package TestSpecs;

import PageObj.LoginObj;
import PageObj.NavigateMenu;
import Services.AppEnv;
import Services.General;
import TestManager.SuiteListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * This class will ensure the user authentication functionality of the application
 */
@Listeners(SuiteListener.class)

public class User_Auth {

    private static AppEnv appEnv = new AppEnv();
    private LoginObj pgLogin = null;
    private NavigateMenu navigateMenu = null;
    private static General Utils = null;

    /**
     * This is constructor class
     */

    public User_Auth() {
        appEnv = SuiteListener.appEnv;
        pgLogin = LoginObj.getInstance(appEnv);
        navigateMenu = NavigateMenu.getInstance(appEnv);
        Utils = General.getInstance(appEnv);
    }

    /**
     * This test will make sure user login functionality is working correctly
     */

    @Test(enabled = true, priority = 1)
    public void User_Login() {
        pgLogin.Type_UserName("raiirfan@gmail.com");
        pgLogin.Type_Password("irfan");
        pgLogin.Click_LoginButton();
        pgLogin.Click_Proceed();
        appEnv.setTestPass(pgLogin.IsSession_Logged_In());
        Utils.VerifyResult("User session is not logged in", appEnv.isTestPass());

    }

    @Test(enabled = true, priority = 0)
    public void Incorrect_Credentials() {
        pgLogin.Type_UserName("incorrect_username@gmail.com");
        pgLogin.Type_Password("IncorectPassword");
        pgLogin.Click_LoginButton();
        String ActualError = pgLogin.Get_Error_Message();
        appEnv.setTestPass(ActualError.equalsIgnoreCase("Incorrect login details. Please try again."));
        Utils.VerifyResult("Incorrect error message", appEnv.isTestPass());

    }
}
/*--------------------------------------------------------------------------------------------------------------------*/