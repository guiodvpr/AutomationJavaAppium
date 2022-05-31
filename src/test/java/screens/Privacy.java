package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

public class Privacy extends BaseScreen {

    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author David Guio
     */
    public Privacy(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    // AndroidElements
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Privacy & Legal\")")
    private AndroidElement privacyAndLegalTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Privacy Policy\")")
    private AndroidElement privacyPolicyOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Terms of Use\")")
    private AndroidElement termsOfUseOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Supplemental Terms and Conditions\")")
    private AndroidElement supplementalTermsAndConditionsOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Legal Notices\")")
    private AndroidElement legalNoticesOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Property Rules\")")
    private AndroidElement propertyRulesOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Electronic Communications Disclosure\")")
    private AndroidElement electronicCommunicationsDisclosureOption;


    public Boolean titleIsAvailable() {
        return isElementAvailable(privacyAndLegalTitle);
    }

    public Boolean options() {
        return isElementAvailable(privacyPolicyOption)
                && isElementAvailable(termsOfUseOption)
                && isElementAvailable(supplementalTermsAndConditionsOption)
                && isElementAvailable(legalNoticesOption)
                && isElementAvailable(propertyRulesOption)
                && isElementAvailable(electronicCommunicationsDisclosureOption);
    }
}
