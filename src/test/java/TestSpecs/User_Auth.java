package TestSpecs;

import PageObj.LoginObj;
import PageObj.NavigateMenu;
import Services.AppEnv;
import TestManager.SuiteListener;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * This class will ensure the user authentication functionality of the application
 */
@Listeners(SuiteListener.class)
public class User_Auth {

    private static AppEnv appEnv = new AppEnv();
    private LoginObj pgLogin = null;
    private NavigateMenu navigateMenu = NavigateMenu.getInstance(appEnv);

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

    @Test(enabled = true, priority = 1)
    public void User_Login() {
        pgLogin.Type_UserName("raiirfan@gmail.com");
        pgLogin.Type_Password("irfan");
        pgLogin.Click_LoginButton();
        pgLogin.Click_Proceed();
        pgLogin.Compare_Assert(appEnv.getDriver().findElement(By.id("ctl00_btnLogout")).getText(), "Log Out");
    }
 /*   @Test(enabled = true, priority = 0)
    public void Incorrect_Credentials() {
        pgLogin.Type_UserName("incorrect_username@gmail.com");
        pgLogin.Type_Password("IncorectPassword");
        pgLogin.Click_LoginButton();
        if(pgLogin.Incorrect_Login("Incorrect login details. Please try again"))
        assert(true);
        else assert(false);

    }*/

    @Test(enabled = true, priority = 2)
    public void Navigate() {
        System.out.println("Navigate is started.");
        navigateMenu.SelectMenu("Media", "Sessions");

    }
}
/*--------------------------------------------------------------------------------------------------------------------*/