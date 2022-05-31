package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.*;
import util.tests.BaseMobileTest;

public class NavigationTest extends BaseMobileTest {

    /**
     * Validate Map Screen Navigation.
     */
    @Description(value = "Map screen Navigation test")
    @Test
    public void navigateToMapScreen() {
        log.info("Start Navigation to Map Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        MapScreen map = dashBoard.MapScreen();

        log.info("Validate Show List Button");
        Assert.assertTrue(map.showListIsDisplayed(), "Show List not displayed");

        log.info("Validate Category Button");
        Assert.assertTrue(map.categoryIsDisplayed(), "Category not displayed");

        log.info("Validate Filter Button");
        Assert.assertTrue(map.filterIsDisplayed(), "Filter not displayed");
    }

    /**
     * Validate List  Navigation.
     */
    @Description(value = "List Navigation")
    @Test
    public void navigateToCategoryList() {
        log.info("Navigation to Map Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        MapScreen map = dashBoard.MapScreen();

        log.info("Validate Map");
        Assert.assertTrue(map.mapDisplayed(), "not Map ");

        log.info("Validate list");
        Category categoryList = map.showCategory();
        Assert.assertTrue(categoryList.IsDisplayed(), " not Title");
        Assert.assertTrue(categoryList.ListIsDisplayed(), "not display");
        Assert.assertTrue(categoryList.OptionIsSelected(), " not selected");

        log.info("Validate hotels option");
        Assert.assertTrue(categoryList.OptionIsAvailable(), "Not Hotel option");
    }

    /**
     * Validate Privacy
     */
    @Description(value = "Privacy  Testing")
    @Test
    public void navigateToPrivacyAndLegal() {
        log.info("Start Navigation");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        Menu menuScreen = dashBoard.MenuScreen();

        log.info(" Menu");
        Assert.assertTrue(menuScreen.OrdersButtonIsDisplayed(), "NOT Order button");
        Assert.assertTrue(menuScreen.BoardIsDisplayed(), "Not Tip Button");

        log.info("categories");
        menuScreen.swipe();
        Assert.assertTrue(menuScreen.ListDisplay(), "Theres not categories");

        log.info("Privacy");
        Privacy privacyAndLegal = menuScreen.goToPrivacyAndLegalScreen();
        Assert.assertTrue(privacyAndLegal.titleIsAvailable(), " title is not displayed");

        log.info("Privacy Options");
        Assert.assertTrue(privacyAndLegal.options(), "Theres not Options ");
    }


    @Description(value = "Plan Test")
    @Test
    public void navigateToAddPlans() {
        log.info("Start Navigation ");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        Plan addPlansScreen = dashBoard.AddPlan();

        log.info("Plans view");
        Assert.assertTrue(addPlansScreen.closeButtonIsAvailable(), "Close button not showing");
        Assert.assertTrue(addPlansScreen.isReservationAvailable(), "Reservation button not showing");
        Assert.assertTrue(addPlansScreen.checkAvailable(), "Availability button not displayed");

        log.info(" Dining Option");
        Assert.assertTrue(addPlansScreen.diningOptionIsEnable(), "Availability not enabled");
    }
}
