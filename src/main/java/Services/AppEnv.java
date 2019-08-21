package Services;

import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * This class will use as a global class in our project
 */

public class AppEnv {

    private String Browser;
    private RemoteWebDriver Driver;
    private String Domain;
    private boolean IsTestPass;
    private boolean IsLogInReq;
    private ReportManager reportManager = null;

    /**
     * This mehtod is get domain name
     *
     * @return
     */
    public String getDomain() {
        return Domain;
    }

    /**
     * This method is to set domain name
     *
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

    public boolean isTestPass() {
        return IsTestPass;
    }

    public void setTestPass(boolean testPass) {
        IsTestPass = testPass;
    }

    public boolean isLogInReq() {
        return IsLogInReq;
    }

    public void setLogInReq(boolean logInReq) {
        IsLogInReq = logInReq;
    }

    public ReportManager getReportManager() {
        return reportManager;
    }

    public void setReportManager(ReportManager reportManager) {
        this.reportManager = reportManager;
    }
}

/*--------------------------------------------------------------------------------------------------------------------*/