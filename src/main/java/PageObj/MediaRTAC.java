package PageObj;

import Services.AppEnv;
import Services.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MediaRTAC {

    private static MediaRTAC mediaRTAC = new MediaRTAC();
    private static AppEnv appEnv = new AppEnv();
    private static General Utils = null;


    private MediaRTAC() {
    }

    /* Static 'instance' method */
    public static MediaRTAC getInstance(AppEnv appEnv) {
        MediaRTAC.appEnv = appEnv;
        Utils = General.getInstance(appEnv);
        return mediaRTAC;
    }


    public WebElement findMediaRTAC(){
        return appEnv.getDriver().findElement(By.id("ctl00_ContentPlaceHolder_Master_ddlRFAStatusFilter"));
    }
    public boolean IsPageOK(){
        return Utils.IsObjExist(findMediaRTAC());
    }
}
