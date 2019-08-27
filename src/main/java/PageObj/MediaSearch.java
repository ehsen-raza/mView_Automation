package PageObj;

import Services.AppEnv;
import Services.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MediaSearch {

    private static MediaSearch mediaSearch = new MediaSearch();
    private static AppEnv appEnv = new AppEnv();
    private static General Utils = null;


    private MediaSearch() {
    }

    /* Static 'instance' method */
    public static MediaSearch getInstance(AppEnv appEnv) {
        MediaSearch.appEnv = appEnv;
        Utils = General.getInstance(appEnv);
        return mediaSearch;
    }

    public WebElement findMediaSearch(){
        return appEnv.getDriver().findElement(By.id("ctl00_ContentPlaceHolder_Master_ucsearch_btnFilter"));
    }
    public boolean IsPageOK(){
        return Utils.IsObjExist(findMediaSearch());
    }


}
