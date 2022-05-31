package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;


public class Plan extends BaseScreen {

    public Plan(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Check Dining Availability, 1 of 7, button")
    private AndroidElement checkDiningAvailabilityButton;

    @AndroidFindBy(accessibility = "Make a Park Reservation, 6 of 7, button")
    private AndroidElement makeParkReservationButton;

    @AndroidFindBy(id = "btnCloseActionSheet")
    private AndroidElement closeButton;

    /*** true if Make Park Reservations displayed in screen.*/
    public Boolean isReservationAvailable() {
        return isElementAvailable(makeParkReservationButton);
    }

    /*** true if  Availability is displayed in screen.*/
    public Boolean checkAvailable() {
        return isElementAvailable(checkDiningAvailabilityButton);
    }

    /*** true if Close  is displayed in screen.*/
    public Boolean closeButtonIsAvailable() {
        return isElementAvailable(closeButton);
    }

    /** true if Close Button is enabled.*/
    public Boolean diningOptionIsEnable() {
        return isElementEnable(checkDiningAvailabilityButton);
    }
}
