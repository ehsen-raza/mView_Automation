package PageObj;

import Services.AppEnv;
import Services.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MediaDipSampling {

    private static MediaDipSampling mediaDipSampling = new MediaDipSampling();
    private static AppEnv appEnv = new AppEnv();
    private static General Utils = null;

    private MediaDipSampling() {
    }

    /* Static 'instance' method */
    public static MediaDipSampling getInstance(AppEnv appEnv) {
        MediaDipSampling.appEnv = appEnv;
        Utils = General.getInstance(appEnv);
        return mediaDipSampling;
    }


    public WebElement findMediaDipSampling(){
        return appEnv.getDriver().findElement(By.id("ctl00_ContentPlaceHolder_Master_btn_Apply"));
    }

    public boolean IsPageOK(){
        return Utils.IsObjExist(findMediaDipSampling());
    }

}
