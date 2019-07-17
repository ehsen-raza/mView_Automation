package Services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class will read the external configuration from sources
 */
public class SystemConfiguration {
    private static SystemConfiguration systemConfiguration = new SystemConfiguration( );
    private static AppEnv appEnv = new AppEnv();
    private SystemConfiguration() { }

    /* Static 'instance' method */
    public static SystemConfiguration getInstance(AppEnv appEnv) {
        SystemConfiguration.appEnv = appEnv;
        return systemConfiguration;
    }

    /**
     *
     */
    public AppEnv Read_Properties(AppEnv appEnv){
        Properties prop = new Properties();
        File file = new File( "./src/main/resources/SysConfig/SysConfig.properties");

        FileInputStream fileInput;

        /*------------------------------------------- Read Logger Config -----------------------------------------------------*/
        try {
            fileInput = new FileInputStream(file);
            prop.load(fileInput);
        } catch (IOException exh) {
            System.out.println("IO Exception");
        }
        appEnv.setBrowser(prop.getProperty("Browser"));
        appEnv.setDomain(prop.getProperty("Domain"));

        return appEnv;
    }
}
