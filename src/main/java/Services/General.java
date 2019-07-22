package Services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * This is class for wrapping webdriver methods.
 */
public class General {

    private static General general = new General( );
    private static AppEnv appEnv = new AppEnv();
    private General() { }

    /* Static 'instance' method */
    public static General getInstance(AppEnv appEnv) {
        General.appEnv = appEnv;
        return general;
    }

    /**
     * This method is for Clicking button.
     * @param ButtonID
     */
    public void ClickButton(WebElement ButtonID)
    {
        try
        {
            ButtonID.click();
        }catch (Exception e)
        {
            System.out.println("Unable to Click Button");
        }
    }

    /**
     * This method is for adding text to a field.
     * @param SendText
     * @param Text
     */
    public void SendText(WebElement SendText, String Text)
    {
        try
        {
            SendText.sendKeys(Text);
        }catch (Exception e)
        {
            System.out.println("Unable to Input Text in Given field");
        }
    }

    /**
     * This method is to clear text in a field
     * @param ClearField
     */
    public void ClearField(WebElement ClearField)
    {
        try
        {
            ClearField.clear();
        }catch (Exception e)
        {
            System.out.println("Unable to Clear field");
        }
    }

    /**
     * This method is to select objects from dropdown
      * @param DrpDown
     * @param index
     */
    public void SelectDropdown(Select DrpDown, int index)
    {
        try
        {
            DrpDown.selectByIndex(index);
        }catch (Exception e)
        {
            System.out.println("Unable to Select Drop down field");
        }
    }

}

/*--------------------------------------------------------------------------------------------------------------------*/