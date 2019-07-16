package TestSpecs;

import Services.AppEnv;
import Services.SystemConfiguration;
import org.testng.annotations.Test;

/**
 * This class will ensure the user authentication functionality of the application
 */
public class User_Auth {

    private static AppEnv appEnv = new AppEnv();
    private SystemConfiguration systemConfiguration = SystemConfiguration.getInstance(appEnv);

    /**
     * This is constructor class
     */

    public User_Auth(){
        appEnv = systemConfiguration.Read_Properties(appEnv);
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