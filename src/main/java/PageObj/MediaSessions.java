package PageObj;

import Services.AppEnv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MediaSessions {

    private static MediaSessions mediaSessions = new MediaSessions();
    private static AppEnv appEnv = new AppEnv();

    private MediaSessions() {
    }

    /* Static 'instance' method */
    public static MediaSessions getInstance(AppEnv appEnv) {
        MediaSessions.appEnv = appEnv;
        return mediaSessions;
    }

    public WebElement findMediaSessions(){
        return appEnv.getDriver().findElement(By.id("ctl00_ContentPlaceHolder_Master_btnFilter"));
    }
}
