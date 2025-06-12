package pages;

import org.testng.Assert;
import uistore.HomePageLocators;
import uistore.SalesPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;


public class SalesPage {
    public WebDriverHelper helper;

    public SalesPage(){
        helper= new WebDriverHelper(Base.driver);
    }

    public void clickOnSales(){
        try{
            helper.waitForElementToBeVisible(SalesPageLocators.sales,10);
            helper.clickOnElement(SalesPageLocators.sales);
            LoggerHandler.info("Clicked on Sales");
        }catch(Exception e){
            System.out.println(e.getMessage());
            LoggerHandler.error("Clicked on sales Failed");
        }
    }

    public void clickOnDisplayType(){
        try{
            helper.waitForElementToBeVisible(SalesPageLocators.displayType,10);
            helper.clickOnElement(SalesPageLocators.displayType);
            LoggerHandler.info("Clicked on Display Type");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Clicked on Display Type Failed");
        }
    }

    public void clickOnAmoled(){
        try{
            helper.waitForElementToBeVisible(SalesPageLocators.amoled,5);
            helper.clickOnElement(SalesPageLocators.amoled);
            LoggerHandler.info("Clicked on Amoled Check Box");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Clicked on Amoled Check Box Failed");
        }
    }

    public void scrollDown(){
        helper.scrollDown(500);
    }


    public void clickOnQuickView(){
        try{
            helper.clickOnElement(SalesPageLocators.quickView);
            LoggerHandler.info("Clicked on Quick View");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Clicked on Quick View Failed");
        }
    }

    public void hoverOnAddToBag(){
        try{
            helper.waitForElementToBeVisible(SalesPageLocators.addToCart,10);
            helper.hoverOnElement(SalesPageLocators.addToCart);
            LoggerHandler.info("Hovered on Element");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Hover failed");
        }
    }

    public void clickOnAddToBag(){
        try{
            helper.waitForElementToBeVisible(SalesPageLocators.addToCart,10);
            helper.mouseClickOnElement(SalesPageLocators.addToCart);
            LoggerHandler.info("Clicked on Add to Bag");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Clicked on Add to Bag Failed");
        }
    }

    public void clickOnGoToBag(){
        try{
            helper.clickOnElement(SalesPageLocators.goToBag);
            LoggerHandler.info("Clicked on Go to Bag");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Go to Bag Functionality Failed");
        }
    }

    public void verifyDiscount(){
        try{
            String savings=helper.getText(SalesPageLocators.overAllSavings);
            String discount= helper.getText(SalesPageLocators.discount);
            System.out.println(savings);
            System.out.println(discount);
            Assert.assertTrue(discount.contains(savings));
            LoggerHandler.info("Savings Matches Discount");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            LoggerHandler.error("Savings and Discount did not match");
        }
    }

    public void testCase03(){
        clickOnSales();
        clickOnDisplayType();
        clickOnAmoled();
        scrollDown();
        clickOnQuickView();
        scrollDown();
        hoverOnAddToBag();
        clickOnAddToBag();
        clickOnGoToBag();
        verifyDiscount();
    }

}
