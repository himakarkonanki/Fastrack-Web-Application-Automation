package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebDriverHelper {

    public WebDriver driver;

    public WebDriverHelper(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnElement(By path){
        try{
            driver.findElement(path).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void waitForElementToBeVisible(By path, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(path));
    }

    public void hoverOnElement(By path){
        try{
            WebElement element=driver.findElement(path);
            Actions actions= new Actions(driver);
            actions.moveToElement(element).build().perform();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void sendText(By path, String text){
        try{
            driver.findElement(path).sendKeys(text);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void sendEnter(By path){
        try{
            driver.findElement(path).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mouseClickOnElement(By path){
        try {
            WebElement element = driver.findElement(path);
            Actions actions= new Actions(driver);
            actions.click(element).build().perform();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    public void scrollDown(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")");
    }

    public List<WebElement> getAllElements(String path){
        return driver.findElements(By.xpath(path));
    }

    public String getText(By path){
        String text=driver.findElement(path).getText();
        return text;
    }


}
