package PageObj;

import Services.AppEnv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MediaCameraDashboard {

    private static MediaCameraDashboard mediaCameraDashboard = new MediaCameraDashboard();
    private static AppEnv appEnv = new AppEnv();

    private MediaCameraDashboard() {
    }

    /* Static 'instance' method */
    public static MediaCameraDashboard getInstance(AppEnv appEnv) {
        MediaCameraDashboard.appEnv = appEnv;
        return mediaCameraDashboard;
    }


    public WebElement findMediaCameraDashbaord(){
        return appEnv.getDriver().findElement(By.id("ctl00_ContentPlaceHolder_Master_btn_Apply"));
    }
}
