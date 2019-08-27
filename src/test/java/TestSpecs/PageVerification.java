package TestSpecs;

import PageObj.*;
import Services.AppEnv;
import Services.General;
import TestManager.SuiteListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * This class about verification of loaded pages
 */
@Listeners(SuiteListener.class)
public class PageVerification {
    private static AppEnv appEnv = new AppEnv();
    private static MediaCameraDashboard mediaCameraDashboard = null;
    private static MediaReports mediaReports = null;
    private static MediaRTAC mediaRTAC = null;
    private static MediaSearch mediaSearch = null;
    private  static MediaSessions mediaSessions = null;
    private static MediaEvidenceBrief mediaEvidenceBrief = null;
    private static MediaDipSampling mediaDipSampling = null;
    private static General Utils = null;
    private static NavigateMenu navigateMenu = null;

    public PageVerification() {
        appEnv = SuiteListener.appEnv;
        mediaCameraDashboard = MediaCameraDashboard.getInstance(appEnv);
        mediaReports = MediaReports.getInstance(appEnv);
        mediaRTAC = MediaRTAC.getInstance(appEnv);
        mediaSearch = MediaSearch.getInstance(appEnv);
        mediaSessions = MediaSessions.getInstance(appEnv);
        mediaDipSampling = MediaDipSampling.getInstance(appEnv);
        mediaEvidenceBrief = MediaEvidenceBrief.getInstance(appEnv);

        navigateMenu = NavigateMenu.getInstance(appEnv);
        Utils = General.getInstance(appEnv);
    }

   @Test(enabled = true, priority = 2 )
    public void Verify_Media_Camera_Dashboard_Page(){
       navigateMenu.SelectMenu("Media", "Camera Dashboard");
       appEnv.setTestPass(mediaCameraDashboard.IsPageOK());
       Utils.VerifyResult("Media Camera Dashboard page not loaded ", appEnv.isTestPass());

   }

   @Test(enabled = true, priority = 3 )
    public void Verify_Media_RTAC_Page(){
        navigateMenu.SelectMenu("Media","RTAC");
        appEnv.setTestPass(mediaRTAC.IsPageOK());
        Utils.VerifyResult("Media RTAC Page Not Loaded", appEnv.isTestPass());
   }
   @Test(enabled = true, priority = 4 )
    public void Verify_Media_Search_Page(){
        navigateMenu.SelectMenu("Media","Search");
        appEnv.setTestPass(mediaSearch.IsPageOK());
        Utils.VerifyResult("Media Search Page Not Loaded", appEnv.isTestPass());
   }
   @Test(enabled = true, priority = 5 )
    public void Verify_Media_Sessions_Page(){
        navigateMenu.SelectMenu("Media","Sessions");
        appEnv.setTestPass(mediaSessions.IsPageOK());
        Utils.VerifyResult("Media Sessions Page Not Loaded", appEnv.isTestPass());

   }
   @Test(enabled = true, priority = 6 )
    public void Verify_Media_Dip_Sampling_Page(){
        navigateMenu.SelectMenu("Media","Dip Sampling");
        appEnv.setTestPass(mediaDipSampling.IsPageOK());
        Utils.VerifyResult("Media Dip Sampling Page Not Loaded", appEnv.isTestPass());
   }
    @Test(enabled = true, priority = 7 )
    public void Verify_Media_Evidence_Brief_Page(){
        navigateMenu.SelectMenu("Media","Evidence Brief");
        appEnv.setTestPass(mediaEvidenceBrief.IsPageOK());
        Utils.VerifyResult("Media Evidence Brief is Not Loaded", appEnv.isTestPass());
    }
    @Test(enabled = true, priority = 8 )
    public void Verify_Media_Reports_Page(){
        navigateMenu.SelectMenu("Media","Reports");
        appEnv.setTestPass(mediaReports.IsPageOK());
        Utils.VerifyResult("Media Reports Page Not Loaded", appEnv.isTestPass());
    }


}
/**********************************************************************************************************************/