package TestSpecs;

import PageObj.MediaCameraDashboard;
import PageObj.NavigateMenu;
import Services.AppEnv;
import Services.General;
import TestManager.SuiteListener;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * This class about verification of loaded pages
 */
@Listeners(SuiteListener.class)
public class PageVerification {
    private static AppEnv appEnv = new AppEnv();
    private static MediaCameraDashboard mediaCameraDashboard = null;
    private static General Utils = null;
    private static NavigateMenu navigateMenu = null;

    public PageVerification() {
        appEnv = SuiteListener.appEnv;
        mediaCameraDashboard = MediaCameraDashboard.getInstance(appEnv);
        navigateMenu = NavigateMenu.getInstance(appEnv);
        Utils = General.getInstance(appEnv);
    }

   @Test
    public void Verify_Media_Camera_Dashboard_Page(){
       navigateMenu.SelectMenu("Media", "Camera Dashboard");

       appEnv.setTestPass(mediaCameraDashboard.IsPageOK());
       Utils.VerifyResult("Media Camera Dashboard page not loaded ", appEnv.isTestPass());

   }



}
/**********************************************************************************************************************/