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
    private NavigateMenu navigateMenu = null;

    /**
     * This is constructor class
     */

    public User_Auth() {
        appEnv = SuiteListener.appEnv;
        pgLogin = LoginObj.getInstance(appEnv);
        navigateMenu = NavigateMenu.getInstance(appEnv);
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
    @Test(enabled = true, priority = 0)
    public void Incorrect_Credentials() {
        pgLogin.Type_UserName("incorrect_username@gmail.com");
        pgLogin.Type_Password("IncorectPassword");
        pgLogin.Click_LoginButton();
        pgLogin.Compare_Assert(appEnv.getDriver().findElement(By.xpath("//td[contains(text(),'Incorrect login details. Please try again.')]")).getText(),"Incorrect login details. Please try again.");


    }


}
/*--------------------------------------------------------------------------------------------------------------------*/