package PageObj;

import Services.AppEnv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MediaReports {

    private static MediaReports mediaReports = new MediaReports();
    private static AppEnv appEnv = new AppEnv();

    private MediaReports() {
    }

    /* Static 'instance' method */
    public static MediaReports getInstance(AppEnv appEnv) {
        MediaReports.appEnv = appEnv;
        return mediaReports;
    }


    public WebElement findMediaReports(){
        return appEnv.getDriver().findElement(By.id("ID_NEEDS_BE_ADDED_ONCE_PAGE_OPENS"));
    }
}
