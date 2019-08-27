package PageObj;

import Services.AppEnv;
import Services.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MediaReports {

    private static MediaReports mediaReports = new MediaReports();
    private static AppEnv appEnv = new AppEnv();
    private static General Utils = null;

    private MediaReports() {
    }

    /* Static 'instance' method */
    public static MediaReports getInstance(AppEnv appEnv) {
        MediaReports.appEnv = appEnv;
        Utils = General.getInstance(appEnv);
        return mediaReports;
    }


    public WebElement findMediaReports(){
        return appEnv.getDriver().findElement(By.id("ID_NEEDS_BE_ADDED_ONCE_PAGE_OPENS"));
    }

    public boolean IsPageOK(){
        return Utils.IsObjExist(findMediaReports());
    }
}
