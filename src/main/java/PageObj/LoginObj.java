package PageObj;

import Services.AppEnv;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * This class will manage the page objects of login class
 */
public class LoginObj {
    private static LoginObj loginObj = new LoginObj( );
    private static AppEnv appEnv = new AppEnv();
    private LoginObj() { }

    /* Static 'instance' method */
    public static LoginObj getInstance(AppEnv appEnv)
    {
        LoginObj.appEnv = appEnv;
        return loginObj;
    }

    /**
     * This is method to get username object from login page
     * @param UserName
     */
    public void Type_UserName(String UserName)
    {
        appEnv.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        appEnv.getDriver().findElement(By.id("txtUserName")).sendKeys(UserName);
    }

    /**
     * This is method to get password object from login page
     * @param Password
     */
    public void Type_Password(String Password)
    {
        appEnv.getDriver().findElement(By.id("txtPassword")).sendKeys(Password);
    }

    /**
     * This is method to check Remember me checkbox on login page
     */
    public void Click_RememberMe()
    {
        appEnv.getDriver().findElement(By.id("RememberCheckBox")).click();
    }

    /**
     * This is a method to click Login button on the Login Page.
     */
    public void Click_LoginButton()
    {
        appEnv.getDriver().findElement(By.id("btnLogin")).click();
    }

    /**
     * This function is to do assert on welcome page.
     * @param ExpectedTest
     */
    public void Compare_Assert(String ExpectedTest)
    {
         Assert.assertEquals(appEnv.getDriver().findElement(By.id("ctl00_btnLogout")).getText(),ExpectedTest);
    }

    /**
     * This function is to click proceed button on Terms and Conditions page.
     */
    public void Click_Proceed()
    {
        appEnv.getDriver().findElement(By.id("yes")).click();
    }



}
/*--------------------------------------------------------------------------------------------------------------------*/