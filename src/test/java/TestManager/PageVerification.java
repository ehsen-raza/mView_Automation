package TestManager;

import Services.AppEnv;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

/**
 * This class about verification of loaded pages
 */
public class PageVerification {

    private static PageVerification pageVerification = new PageVerification();
    private static AppEnv appEnv = new AppEnv();
   // private static General Utils = null;
   // private static NavigateMenu navigateMenu = null;


    private PageVerification() {
    }

    /* Static 'instance' method */
    public static PageVerification getInstance(AppEnv appEnv) {
        PageVerification.appEnv = appEnv;
        return pageVerification;
    }

    /**
     * This method is about verification of elements on laded page.
     * @param by
     */
    public boolean IsPageOK(By by){
        try{
            appEnv.getDriver().findElement(by);
            return true;
        }
        catch (NoSuchElementException e){
            return false;
        }




    }



}
/**********************************************************************************************************************/