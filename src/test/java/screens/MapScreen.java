package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Map screen.
 *
 * @author Hans.Marquez
 */
public class MapScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Hans.Marquez
     */
    public MapScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    // AndroidElements
    @AndroidFindBy(id = "categoryTitle")
    private AndroidElement categoryList;

    @AndroidFindBy(id = "filterTitle")
    private AndroidElement filterButton;

    @AndroidFindBy(id = "toggleTitle")
    private AndroidElement showListButton;

    @AndroidFindBy(accessibility = "Google Map")
    private AndroidElement mapContainer;

    /**
     * @author Hans.Marquez
     * return true if Category List element is displayed in screen, otherwise false.
     */
    public boolean categoryIsDisplayed() {
        return isElementAvailable(categoryList);
    }

    /**
     * @author Hans.Marquez
     * return true if Filter Button element is displayed in screen, otherwise false.
     */
    public boolean filterIsDisplayed() {
        return isElementAvailable(filterButton);
    }

    /**
     * @author Hans.Marquez
     * return true if Show List Button element is displayed in screen, otherwise false.
     */
    public boolean showListIsDisplayed() {
        return isElementAvailable(showListButton);
    }

    /**
     * @author David Guio
     * @return true if the Map Container is displayed in the screen, otherwise false.
     */
    public boolean mapDisplayed() {
        return isElementAvailable(mapContainer);
    }

    /**
     *
     * @author David Guio
     * Navigate to Category List Screen from Map Screen
     */
    public Category showCategory() {
        click(categoryList);
        return new Category(driver);
    }
}
