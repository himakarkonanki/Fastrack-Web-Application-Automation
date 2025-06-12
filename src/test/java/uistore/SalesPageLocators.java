package uistore;

import org.openqa.selenium.By;

public class SalesPageLocators {
    public static By sales= By.id("offers");
    public static By displayType=By.id("refinement-heading-display-type");
    public static By amoled=By.xpath("(//span[contains(text(),'AMOLED')])[1]");
    public static By quickView= By.xpath("(//div[@data-pid='38149nm01'])[1]");
    public static By addToCart= By.xpath("(//div[@class='button-add'])[1]");
    public static By goToBag= By.xpath("(//button[contains(text(),'Go to Bag')])[1]");
    public static By overAllSavings=By.xpath("(//span[@class='text-right you-save'])[1]");
    public static By discount=By.xpath("(//span[@class='text-right discount'])[1]");
}
