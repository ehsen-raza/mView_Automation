package Services;

import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * This class will use as a global class in our project
 */

public class AppEnv {

    private String Browser;
    private RemoteWebDriver Driver;


    public RemoteWebDriver getDriver() {
        return Driver;
    }

    public void setDriver(RemoteWebDriver driver) {
        Driver = driver;
    }

    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser) {
        Browser = browser;
    }
}

/*--------------------------------------------------------------------------------------------------------------------*/