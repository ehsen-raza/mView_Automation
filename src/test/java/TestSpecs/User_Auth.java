package TestSpecs;

import PageObj.LoginObj;
import Services.AppEnv;
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

    /**
     * This is constructor class
     */

    public User_Auth() {
        appEnv = SuiteListener.appEnv;
        pgLogin = LoginObj.getInstance(appEnv);
    }

    /**
     * This test will make sure user login functionality is working correctly
     */

    @Test(enabled = true)
    public void User_Login() {
        pgLogin.Type_UserName("raiirfan@gmail.com");
        pgLogin.Type_Password("irfan");
        pgLogin.Click_LoginButton();
        pgLogin.Click_Proceed();
        pgLogin.Compare_Assert("Log Out");
    }
}
/*--------------------------------------------------------------------------------------------------------------------*/