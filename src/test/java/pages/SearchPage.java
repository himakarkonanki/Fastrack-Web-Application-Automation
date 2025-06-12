package pages;

import org.testng.Assert;
import uistore.HomePageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class SearchPage {
    public WebDriverHelper helper;

    public SearchPage(){
        helper= new WebDriverHelper(Base.driver);
    }

    public void clickOnSearchIcon(){
        helper.waitForElementToBeVisible(HomePageLocators.searchIcon,10);
        helper.clickOnElement(HomePageLocators.searchIcon);
        LoggerHandler.info("Clicked on search icon");

    }

    public void sendKeys(){
        helper.waitForElementToBeVisible(HomePageLocators.searchBar,10);
        helper.sendText(HomePageLocators.searchBar,"Party");
        helper.sendEnter(HomePageLocators.searchBar);
        LoggerHandler.info("Entered Party");

    }

    public void verifyTitle(){
        String title=Base.driver.getTitle();
        String ActualTitle="Search Fastrack Watches | Find Your Perfect Timepiece";
        Assert.assertEquals(title,ActualTitle);
        LoggerHandler.info("Verified title");

    }

    public void testCase02(){
            clickOnSearchIcon();
            sendKeys();
            verifyTitle();
    }
}
