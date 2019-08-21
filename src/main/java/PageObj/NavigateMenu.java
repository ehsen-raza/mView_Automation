package PageObj;

import Services.AppEnv;
import org.openqa.selenium.By;

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
                appEnv.getDriver().findElement(By.xpath(".//*[@href='/Sessions.aspx']")).click();
                switch (SubMenu) {
                    case "Sessions":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/Sessions.aspx']")).click();
                        break;
                    case "Search":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/Search.aspx']")).click();
                        break;
                    case "Camera Dashboard":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/CameraAssetsDashboard.aspx']")).click();
                        break;
                    case "RTAC":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/RFA.aspx']")).click();
                        break;
                    case "Reports":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/Reports.aspx']")).click();
                        break;
                    case "Dip Sampling":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/DipSampling.aspx']")).click();
                        break;
                    case "Evidence Brief":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/ManageEvidenceBrief.aspx']")).click();
                        break;
                    default:
                        System.out.println(SubMenu + "SubMenu is not found under Media");

                }
                break;
            }
            case "Streaming": {

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
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/ManageEvidenceBrief.aspx']")).click();
                        break;
                    case "Organizations":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/managecomp.aspx']")).click();
                        break;
                    case "Devices":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/managedevices.aspx']")).click();
                        break;
                    case "ICV DashBoard":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/ManageDashBoard.aspx']")).click();
                        break;
                    case "Cameras":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/manageExternalCamera.aspx']")).click();
                        break;
                    case "Camera Settings":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/UserCameraSettings.aspx']")).click();
                        break;
                    case "Camera Log":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/DeviceEventCapture.aspx']")).click();
                        break;
                    case "Firmware":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/manageFirmware.aspx']")).click();
                        break;
                    case "Retention Policies":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/ManageRetPolicy.aspx']")).click();
                        break;
                    case "Categories":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/Category.aspx']")).click();
                        break;
                    case "Roles":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/ManageRoles.aspx']")).click();
                        break;
                    case "Kiosks":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/ManageDock.aspx']")).click();
                        break;
                    case "SAP":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/ManageSap.aspx']")).click();
                        break;
                    case "Device group":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/ManageDeviceGroups.aspx']")).click();
                        break;
                    case "Provisioning":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/ManageProvisioning.aspx']")).click();
                        break;
                    case "T&C":
                        appEnv.getDriver().findElement(By.xpath(".//*[@href='/Terms.aspx']")).click();
                        break;
                    default:
                        System.out.println(SubMenu + "SubMenu is not found under Administration");

                break;
            }
            case "Support":
                appEnv.getDriver().findElement(By.xpath(".//*[@href='/support.aspx']")).click();
                break;
                default:
                System.out.println(MainMenu + " MainMenu is not found");


        }

    }


}
