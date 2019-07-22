package PageObj;

import Services.AppEnv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NavigateMenu {

    private static NavigateMenu navigateMenu = new NavigateMenu();
    private static AppEnv appEnv = new AppEnv();

    private NavigateMenu() {
    }

    /* Static 'instance' method */
    public static NavigateMenu getInstance(AppEnv appEnv) {
        NavigateMenu.appEnv = appEnv;
        return navigateMenu;
    }

    public void SelectMenu(String MainMenu, String SubMenu) {
        switch (MainMenu) {
            case "Media": {
                appEnv.getDriver().findElement(By.xpath("//*[@id='ctl00_navMenu']/div[@class='nav_menu']/ul/li[1]")).click();
                switch (SubMenu) {
                    case "Sessions":
                        System.out.println("Sessions Clicked.");
                        break;
                    case "Search":
                        break;
                    case "Camera Dashboard":
                        break;
                    case "RTAC":
                        break;
                    case "Reports":
                        break;
                    case "Dip Sampling":
                        break;
                    case "Evidence Brief":
                        break;
                    default:
                        System.out.println("SubMenu is not found under Media");

                }
                break;
            }
            case "Streaming": {
                System.out.println("Streaming menu clicked");
                //Click Streaming Menu
                switch (SubMenu) {
                    case "Live":
                        break;
                    default:
                        System.out.println("SubMenu is not found Under Streaming");
                }
                break;

            }
            case "Administration":
                appEnv.getDriver().findElement(By.xpath(".//*[@href='/manageacc.aspx']")).click();

                switch (SubMenu) {
                    case "Accounts":
                        System.out.println("Accounts was clicked");
                        break;
                    case "Organizations":
                        break;
                    case "Devices":
                        break;
                    case "ICV DashBoard":
                        break;
                    case "Cameras":
                        break;
                    case "Camera Settings":
                        break;
                    case "Camera Log":
                        break;
                    case "Firmware":
                        break;
                    case "Retention Policies":
                        break;
                    case "Categories":
                        break;
                    case "Roles":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/ManageRoles.aspx']")).click();
                        break;
                    case "Kiosks":
                        break;
                    case "SAP":
                        break;
                    case "Device group":
                        break;
                    default:
                        System.out.println(SubMenu + "SubMenu is not found under Administration");

                break;
            }
            case "Support": {
                //Click Support Menu
                System.out.println("Support is cliked");
                break;
            }
            default:
                System.out.println(MainMenu + " MainMenu is not found");
        }

    }


}
