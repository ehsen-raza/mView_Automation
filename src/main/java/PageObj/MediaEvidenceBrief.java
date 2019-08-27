package PageObj;

import Services.AppEnv;
import Services.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MediaEvidenceBrief {
    private static MediaEvidenceBrief mediaEvidenceBrief = new MediaEvidenceBrief();
    private static AppEnv appEnv = new AppEnv();
    private static General Utils = null;

    private MediaEvidenceBrief() {
    }

    /* Static 'instance' method */
    public static MediaEvidenceBrief getInstance(AppEnv appEnv) {
        MediaEvidenceBrief.appEnv = appEnv;
        Utils = General.getInstance(appEnv);
        return mediaEvidenceBrief;
    }


    public WebElement findMediaEvidenceBrief(){
        return appEnv.getDriver().findElement(By.id("ctl00_ContentPlaceHolder_Master_linkAddEVB"));
    }

    public boolean IsPageOK(){
        return Utils.IsObjExist(findMediaEvidenceBrief());
    }

}
