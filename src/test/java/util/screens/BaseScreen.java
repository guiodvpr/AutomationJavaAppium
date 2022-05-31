package util.screens;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Base class for all screens Objects.
 *
 * @author Arley.Bolivar
 */
public abstract class BaseScreen {

    /**
     * The driver.
     */
    protected final AndroidDriver<AndroidElement> driver;

    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public BaseScreen(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(
                driver, Duration.ofSeconds(0)), this);
    }


    /**
     * Scroll down (From Top to Bottom).
     *
     * @param swipes the swipes
     * @author Hans.Marquez
     */
    public void scrollDown(int swipes) {
        String locator = "new UiScrollable(new UiSelector().resourceIdMatches(\".*ontainer.*\")).flingToEnd(1)";
        scroll(locator, swipes);
    }

    /**
     * Scroll.
     *
     * @param locator the locator
     * @param swipes  the swipes
     */
    public void scroll(String locator, int swipes) {
        int swipesAmount = 0;
        while (swipesAmount < swipes) {
            try {
                driver.findElementByAndroidUIAutomator(locator);
                swipesAmount++;
            } catch (Exception e) {
                swipesAmount++;
            }
        }
    }

    /**
     * Swipe vertical.
     *
     * @param percentage of swipe
     */
    @SuppressWarnings({"rawtypes", "unused"})
    public void swipeVertical(float percentage) {
        Dimension windowSize = driver.manage().window().getSize();
        TouchAction ta = new TouchAction(driver);
        ta.press(PointOption.point(207, 582)).moveTo(PointOption.point(8,
                -360)).release().perform();
    }

    /**
     * Wrapper for click event.
     *
     * @param element : AndroidElement
     * @author Hans.Marquez
     */
    public void click(AndroidElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    /**
     * Wrapper for Visibility event.
     *
     * @param element : AndroidElement
     * @author Hans.Marquez
     */
    public boolean isElementAvailable(AndroidElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }

    /**
     *
     * Wrapper for Select event.
     *
     * @param element : AndroidElement
     * @author David Guio
     */
    public boolean isElementSelected(AndroidElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        try {
            wait.until(ExpectedConditions.elementToBeSelected(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }


    public boolean isElementEnable(AndroidElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }
}
