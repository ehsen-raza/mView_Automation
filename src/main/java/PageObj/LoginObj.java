package PageObj;

import Services.AppEnv;

/**
 * This class will manage the page objects of login class
 */
public class LoginObj {
    private static LoginObj loginObj = new LoginObj( );
    private static AppEnv appEnv = new AppEnv();
    private LoginObj() { }

    /* Static 'instance' method */
    public static LoginObj getInstance(AppEnv appEnv) {
        LoginObj.appEnv = appEnv;
        return loginObj;
    }
}
/*--------------------------------------------------------------------------------------------------------------------*/