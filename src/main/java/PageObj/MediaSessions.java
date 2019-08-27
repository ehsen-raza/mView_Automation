package PageObj;

import Services.AppEnv;
import Services.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MediaSessions {

    private static MediaSessions mediaSessions = new MediaSessions();
    private static AppEnv appEnv = new AppEnv();
    private static General Utils = null;


    private MediaSessions() {
    }

    /* Static 'instance' method */
    public static MediaSessions getInstance(AppEnv appEnv) {
        MediaSessions.appEnv = appEnv;
        Utils = General.getInstance(appEnv);
        return mediaSessions;
    }

    public WebElement findMediaSessions(){
        return appEnv.getDriver().findElement(By.id("ctl00_ContentPlaceHolder_Master_btnFilter"));
    }
    public boolean IsPageOK(){
        return Utils.IsObjExist(findMediaSessions());
    }
}
