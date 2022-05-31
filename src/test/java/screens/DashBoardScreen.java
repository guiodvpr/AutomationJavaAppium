package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * DashBoard screen.
 *
 * @author Hans.Marquez
 */
public class DashBoardScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver : AndroidDriver
     * @author Hans.Marquez
     */
    public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "android:id/button2")
    private AndroidElement closePreferenceUpdateButton;

    @AndroidFindBy(accessibility = "Map, Tab, 2of5")
    private AndroidElement mapButton;

    @AndroidFindBy(accessibility = "More Options, Tab, 5of5")
    private AndroidElement menuButton;

    @AndroidFindBy(accessibility = "Buy tickets, Reserve Dining, Tab, 3of5")
    private AndroidElement addPlansButton;

    /**
     *
     * @author David Guio
     *
     */
    public Plan AddPlan() {
        click(closePreferenceUpdateButton);
        click(addPlansButton);
        return new Plan(driver);
    }

    /**
     * @author Hans.Marquez
     *
     */
    public MapScreen MapScreen() {
        click(closePreferenceUpdateButton);
        click(mapButton);
        return new MapScreen(driver);
    }

    /**
     *
     * @author David Guio
     *
     */
    public Menu MenuScreen() {
        click(closePreferenceUpdateButton);
        click(menuButton);
        return new Menu(driver);
    }


}
