package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {
    public static By watches= By.xpath("//a[@id='watches']");
    public static By smartWatches=By.xpath("//a[@id='reflex-smart-watches']");
    public static By vybByFastrack=By.xpath("//a[@id='vyb-by-fastrack']");
    public static By accessories=By.id("accessories");
    public static By searchIcon=By.xpath("//a[@class='m-search-icon text-decoration-none']");
    public static By searchBar=By.xpath("//input[@placeholder='What are you looking for?']");
    public static By boysWatches=By.xpath("//span[text()='Boys Watches']");
    public static By price=By.xpath("//div[@id='refinement-heading-price']");
    public static By minPrice=By.xpath("//input[@class='price-input price-input-min w-100']");
    public static By maxPrice=By.xpath("//input[@class='price-input price-input-max w-100']");
    public static String listOfWatches="//span[@class='value price-text ']";
    public static By buyNow=By.xpath("//div[@class='cart-and-ipay ']//div[@class='button-buy']");
}
