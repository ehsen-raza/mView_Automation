package Services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * This is class for wrapping webdriver methods.
 */
public class General {

    private static General general = new General();
    private static AppEnv appEnv = new AppEnv();

    private General() {
    }

    /* Static 'instance' method */
    public static General getInstance(AppEnv appEnv) {
        General.appEnv = appEnv;
        return general;
    }

    /**
     * This method is for Clicking button.
     *
     * @param ButtonID
     */
    public boolean ClickObj(WebElement ButtonID) {
        boolean State;
        try {
            ButtonID.click();
            State = true;
        } catch (Exception e) {
            State = false;
            System.out.println("Unable to Click Button");
        }
        return State;
    }

    /**
     * This is general method to wait for a moment in MS
     * @param TimeInMS In milli second
     */

    public void StaticWait(long TimeInMS){

        try {
            Thread.sleep(TimeInMS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method will wait for an element until wait timeout
     * @param Obj: Input a Webelement
     * @param TimeInSec: Timeout
     * @return boolean
     */
    public boolean Wait_For_Element(WebElement Obj, long TimeInSec){
        boolean State = true;
        int Counter = 0;
        while (State){
            State = IsObjExist(Obj);
            StaticWait(1000);
            Counter++;
            if(Counter > TimeInSec){
                break;
            }
        }
        return State;
    }
    /**
     * This method will use to wait an element to display
     *
     * @param Obj: This parameter will use to verify object exist or not
     */
    public boolean IsObjExist(WebElement Obj){
        boolean State;
        try {
            State = Obj.isDisplayed();
        } catch (Exception e) {
            State = false;
        }
        return State;

    }
    /**
     * This method is for adding text to a field.
     *
     * @param SendText
     * @param Text
     */
    public void SendText(WebElement SendText, String Text) {
        try {
            SendText.sendKeys(Text);
        } catch (Exception e) {
            System.out.println("Unable to Input Text in Given field");
        }
    }

    /**
     * This method is to clear text in a field
     *
     * @param ClearField
     */
    public void ClearField(WebElement ClearField) {
        try {
            ClearField.clear();
        } catch (Exception e) {
            System.out.println("Unable to Clear field");
        }
    }

    /**
     * This method is to select objects from dropdown
     *
     * @param DrpDown
     * @param index
     */
    public void SelectDropdown(Select DrpDown, int index) {
        try {
            DrpDown.selectByIndex(index);
        } catch (Exception e) {
            System.out.println("Unable to Select Drop down field");
        }
    }

}

/*--------------------------------------------------------------------------------------------------------------------*/