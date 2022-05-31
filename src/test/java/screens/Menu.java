package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;


public class Menu extends BaseScreen {

    public Menu(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    // Android Elements
    @AndroidFindBy(accessibility = "Tip Board, 1 of 16, button")
    private AndroidElement tipBoardButton;

    @AndroidFindBy(accessibility = "Mobile Food Orders, 6 of 16, button")
    private AndroidElement mobileFoodOrdersButton;

    @AndroidFindBy(accessibility = "Privacy & Legal, 16 of 16, button")
    private AndroidElement privacyAndLegalButton;

    @AndroidFindBy(accessibility = "My Profile, 12 of 16, button")
    private AndroidElement myProfileButton;

    @AndroidFindBy(accessibility = "Property Rules, 13 of 16, button")
    private AndroidElement propertyRulesButton;

    @AndroidFindBy(accessibility = "Link to Account, 14 of 16, button")
    private AndroidElement linkToAccountButton;

    @AndroidFindBy(accessibility = "Help, 15 of 16, button")
    private AndroidElement HelpButton;


    /**
     * @author David Guio
     * return true if Tip  in screen, otherwise false.
     */
    public Boolean BoardIsDisplayed() {
        return isElementAvailable(tipBoardButton);
    }

    public Privacy goToPrivacyAndLegalScreen() {
        click(privacyAndLegalButton);
        return new Privacy(driver);
    }

    public Boolean OrdersButtonIsDisplayed() {
        return isElementAvailable(mobileFoodOrdersButton);
    }


    public void swipe() {
        scrollDown(3);
    }


    public Boolean ListDisplay() {
        return isElementAvailable(privacyAndLegalButton)
                && isElementAvailable(myProfileButton)
                && isElementAvailable(propertyRulesButton)
                && isElementAvailable(linkToAccountButton)
                && isElementAvailable(HelpButton);
    }


}
