package PageObj;

import Services.AppEnv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MediaSearch {

    private static MediaSearch mediaSearch = new MediaSearch();
    private static AppEnv appEnv = new AppEnv();

    private MediaSearch() {
    }

    /* Static 'instance' method */
    public static MediaSearch getInstance(AppEnv appEnv) {
        MediaSearch.appEnv = appEnv;
        return mediaSearch;
    }

    public WebElement findMediaSearch(){
        return appEnv.getDriver().findElement(By.id("ctl00_ContentPlaceHolder_Master_ucsearch_btnFilter"));
    }


}
