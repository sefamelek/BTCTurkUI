package pro.btcturk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static pro.btcturk.Drivers.driver;

public class Methods {

    public WebDriverWait wait = new WebDriverWait(driver, 30);

    public  WebElement findElement(By by) {
        return driver.findElement(by);
    }


    public void goToUrl(String url){
        driver.get(url);
    Logger.info("Opened Website:" + url);
    }

    public   void waitClickableClick(By by) {
        WebElement action = wait.until(ExpectedConditions.elementToBeClickable(by));
        action.click();
        Logger.info(by + "Clicked");

    }

    public  void waitVisibilitySendKey(By by, String key) {
        WebElement action = wait.until(ExpectedConditions.elementToBeClickable(by));
        action.sendKeys(key);
        Logger.info(by + "Send Key : " + key);

    }

    public  String getValue(By by) {
        String elementString = findElement(by).getText();
        Logger.info(by + "get value : " + elementString);
        return elementString;
    }

}
