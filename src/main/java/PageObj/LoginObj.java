package PageObj;

import Services.AppEnv;
import Services.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * This class will manage the page objects of login class
 */
public class LoginObj {
    private static LoginObj loginObj = new LoginObj();
    private static AppEnv appEnv = new AppEnv();
    private static General Utils = null;

    private LoginObj() {
    }

    /* Static 'instance' method */
    public static LoginObj getInstance(AppEnv appEnv) {
        LoginObj.appEnv = appEnv;
        Utils = General.getInstance(appEnv);
        return loginObj;
    }

    /**
     * This is method to get username object from login page
     *
     * @param UserName
     */
    public void Type_UserName(String UserName) {
        appEnv.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        appEnv.getDriver().findElement(By.id("txtUserName")).clear();
        appEnv.getDriver().findElement(By.id("txtUserName")).sendKeys(UserName);
    }

    /**
     * This is method to get password object from login page
     *
     * @param Password
     */
    public void Type_Password(String Password) {
        appEnv.getDriver().findElement(By.id("txtPassword")).clear();
        appEnv.getDriver().findElement(By.id("txtPassword")).sendKeys(Password);
    }

    /**
     * This is method to check Remember me checkbox on login page
     */
    public void Click_RememberMe() {
        appEnv.getDriver().findElement(By.id("RememberCheckBox")).click();
    }

    /**
     * This is a method to click Login button on the Login Page.
     */
    public void Click_LoginButton() {
        appEnv.getDriver().findElement(By.id("btnLogin")).click();
    }

    /**
     * This function is to do assert on welcome page.
     *
     * @param ExpectedTest
     */
    public void Compare_Assert(String ExpectedTest, String ActualTest) {
        Assert.assertEquals(ActualTest, ExpectedTest);
    }

    /**
     *This message will compare Incorrect Login message
     * @return
     */
    public boolean Get_Error_Message(){
        List<WebElement> elementList = appEnv.getDriver().findElements(By.tagName("td"));
        for(int i=0; i<elementList.size(); i++)
            if(elementList.get(i).getText().equalsIgnoreCase("Incorrect login details. Please try again."));
        return  true;
    }
    /**
     * This function is to click proceed button on Terms and Conditions page.
     */
    public void Click_Proceed() {

        WebElement btProceed = appEnv.getDriver().findElement(By.id("yes"));
        boolean GetStatus = Utils.ClickObj(btProceed);
        appEnv.getReportManager().LogStepInfo("Proceed button clicked: " + GetStatus);

        Utils.StaticWait(2000);
        GetStatus = Utils.Wait_For_Element(btProceed, 3);
        appEnv.getReportManager().LogStepInfo("Proceed Window Exist on UI: " + GetStatus);

    }

    /**
     * This method will verify either session is logged in or not
     * @return boolean
     */
    public boolean IsSession_Logged_In(){
        return appEnv.getDriver().findElement(By.id("ctl00_btnLogout")).getText().equalsIgnoreCase("Log Out");
    }

    public boolean Incorrect_Login(String ExpectedText){
        if(appEnv.getDriver().findElement(By.cssSelector("div[style='color: #F3F3F4; font-size: 16px;']")).getText().equalsIgnoreCase(ExpectedText))
        return true;
        else
            return false;
    }

    //----------------------------Behavior Methods ------------------------

    /**
     * This method will use to login the session
     * @param Email Provide email address
     * @param Password Provide password
     * @return boolean
     */
    public boolean LogIn(String Email, String Password){
        Type_UserName(Email);
        Type_Password(Password);
        Click_LoginButton();
        Click_Proceed();
        return IsSession_Logged_In();
    }



}
/*--------------------------------------------------------------------------------------------------------------------*/