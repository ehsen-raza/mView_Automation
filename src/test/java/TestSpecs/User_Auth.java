package TestSpecs;

import Services.AppEnv;
import Services.SystemConfiguration;
import TestManager.SuiteListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * This class will ensure the user authentication functionality of the application
 */
@Listeners(SuiteListener.class)
public class User_Auth {

    private static AppEnv appEnv = new AppEnv();

    /**
     * This is constructor class
     */

    public User_Auth(){
        appEnv = SuiteListener.appEnv;
    }

    /**
     * This test will make sure user login functionality is working correctly
     */

    @Test (enabled = true)
    public void User_Login(){

        System.out.println(appEnv.getBrowser());
    }
}
/*--------------------------------------------------------------------------------------------------------------------*/