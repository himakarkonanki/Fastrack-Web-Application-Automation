package pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import uistore.HomePageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

import java.util.List;

public class HomePage {
    public WebDriverHelper helper;

    public HomePage(){
       helper= new WebDriverHelper(Base.driver);
    }

    public void hoverOnWatches(){
        try{
            helper.waitForElementToBeVisible(HomePageLocators.watches,10);
            helper.hoverOnElement(HomePageLocators.watches);
            LoggerHandler.info("Hovered on watches");
        } catch (Exception e) {
            LoggerHandler.error("Hovered on watches failed");
        }
    }

    public void ClickOnBoysWatches(){
        try{
            helper.waitForElementToBeVisible(HomePageLocators.boysWatches,10);
            helper.clickOnElement(HomePageLocators.boysWatches);
            LoggerHandler.info("Clicked on Boys Watches");
        } catch (Exception e) {
            LoggerHandler.error("Clicked on Boys watches failed");

        }
    }

//    public void closeBanner(){
//        try {
//            Thread.sleep(7000);
//            helper.clickOnElement(HomePageLocators.closeIcon);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    public void scroll(){
        try {
            Thread.sleep(3000);
            helper.scrollDown(500);
            LoggerHandler.info("Scrolled by 500 pixels");
        } catch (InterruptedException e) {
            LoggerHandler.error("Scrolling failed");
        }
    }

    public void clickOnPrice(){
        helper.waitForElementToBeVisible(HomePageLocators.price,10);
        helper.clickOnElement(HomePageLocators.price);
        LoggerHandler.info("Clicked on price");
    }

    public void clickOnMinPrice(){
        helper.waitForElementToBeVisible(HomePageLocators.minPrice,5);
        helper.clickOnElement(HomePageLocators.minPrice);
        Base.driver.findElement(HomePageLocators.minPrice).clear();
        LoggerHandler.info("Clicked on minimum price");
    }

    public void sendMinPriceRange(){
        helper.sendText(HomePageLocators.minPrice,"1000");
        LoggerHandler.info("Entered Minimum price");
    }

    public void clickOnMaxPrice(){
        helper.waitForElementToBeVisible(HomePageLocators.maxPrice,5);
        helper.clickOnElement(HomePageLocators.maxPrice);
        Base.driver.findElement(HomePageLocators.maxPrice).clear();
        LoggerHandler.info("Clicked on Maximum price");
    }

    public void sendMaxPriceRange(){
        helper.sendText(HomePageLocators.maxPrice,"10000");
        LoggerHandler.info("Entered Maximum price");

    }

    public void EnterAction(){
        helper.waitForElementToBeVisible(HomePageLocators.maxPrice,10);
        helper.sendEnter(HomePageLocators.maxPrice);
        LoggerHandler.info("Clicked on enter");
    }

    public void ListOfWatches(){
//        try {
//            helper.scrollDown(1000);
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
        List<WebElement>list=helper.getAllElements(HomePageLocators.listOfWatches);
        for(WebElement l:list){
            if(l.getText().contains("3,995")){
                l.click();
                break;
            }
        }
    }

    public void clickOnBuyNow(){
        helper.scrollDown(350);
        helper.waitForElementToBeVisible(HomePageLocators.buyNow,10);
        helper.clickOnElement(HomePageLocators.buyNow);
        LoggerHandler.info("Clicked on Buy now");
    }



    public void testCase01(){
        hoverOnWatches();
        ClickOnBoysWatches();
        scroll();
        clickOnPrice();
        clickOnMinPrice();
        sendMinPriceRange();
        clickOnMaxPrice();
        sendMaxPriceRange();
        EnterAction();
        ListOfWatches();
        clickOnBuyNow();
    }
}
