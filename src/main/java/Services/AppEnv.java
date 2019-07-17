package Services;

import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * This class will use as a global class in our project
 */

public class AppEnv {

    String Browser;
    RemoteWebDriver Driver;
    String Domain;


    /**
     * This mehtod is get domain name
     * @return
     */
    public String getDomain() {
        return Domain;
    }

    /**
     * This method is to set domain name
     * @param domain
     */
    public void setDomain(String domain) {
        Domain = domain;
    }




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