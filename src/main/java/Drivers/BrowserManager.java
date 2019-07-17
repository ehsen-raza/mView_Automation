package Drivers;

import Services.AppEnv;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;

import java.util.logging.Level;

/**
 * This class will use to manage webdrivers routines
 */

public class BrowserManager {
    private ChromeDriver chromeDriver = null;
    private static BrowserManager browserManager = new BrowserManager( );
    private static AppEnv appEnv = new AppEnv();
    private BrowserManager() { }

    /* Static 'instance' method */
    public static BrowserManager getInstance(AppEnv appEnv) {
        BrowserManager.appEnv = appEnv;
        return browserManager;
    }

    /**
     * This method will launch a webdriver
     */
    public void Launch_Browser(){

        if(appEnv.getBrowser().equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions crOptions = new ChromeOptions();
            chromeDriver = new ChromeDriver(crOptions);
            chromeDriver.manage().window().maximize();
            appEnv.setDriver(chromeDriver);
        }
    }
    public void GetURL()
    {
        appEnv.getDriver().get(appEnv.getDomain());
    }


    /**
     * This method will kill a webdriver
     */

    public void Kill_Driver(){
        appEnv.getDriver().close();
        appEnv.getDriver().quit();
    }
}
/*--------------------------------------------------------------------------------------------------------------------*/