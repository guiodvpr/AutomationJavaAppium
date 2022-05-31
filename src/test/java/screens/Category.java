package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;


public class Category extends BaseScreen {


    public Category(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "categorySelectHeader")
    private AndroidElement selectCategoryTitle;

    @AndroidFindBy(id = "listSelectorContainer")
    private AndroidElement categoriesListContainer;

    @AndroidFindBy(accessibility = "Attractions, Category, 1of10, button")
    private AndroidElement attractionsOption;

    @AndroidFindBy(accessibility = "Hotels, Category, 9of10, button")
    private AndroidElement hotelsOption;

    /** true if Category Title is displayed  */
    public Boolean IsDisplayed() {
        return isElementAvailable(selectCategoryTitle);
    }

    public Boolean OptionIsSelected() {
        return isElementSelected(attractionsOption);
    }

    public Boolean OptionIsAvailable() {
        return !isElementSelected(hotelsOption);
    }

    public Boolean ListIsDisplayed(){
        return isElementAvailable(categoriesListContainer);
    }



}
