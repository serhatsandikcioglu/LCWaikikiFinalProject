package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }


    public void waitForElementVisibilityAndClickable(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        waitForSeconds(1);
    }

    public void waitForElementVisibility(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        waitForSeconds(1);
    }


    public void clickElement(By locator) {
        waitForElementVisibilityAndClickable(locator);
        driver.findElement(locator).click();
        waitForSeconds(1);
    }


    public void moveToElement(By locator) {
        waitForElementVisibilityAndClickable(locator);
        actions.moveToElement(driver.findElement(locator)).perform();
        waitForSeconds(1);
    }


    public void sendKeys(By locator, String text) {
        waitForElementVisibilityAndClickable(locator);
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
        waitForSeconds(1);
    }

    public void waitForSeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollElementWindow(By elementLocator){
        waitForElementVisibilityAndClickable(elementLocator);
        WebElement element = driver.findElement(elementLocator);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({ block: 'center', behavior: 'smooth' });",element);
        waitForSeconds(1);
    }

    public void scrollElementDiv(By elementLocator){
        waitForElementVisibilityAndClickable(elementLocator);
        WebElement element = driver.findElement(elementLocator);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;",element);
        waitForSeconds(1);
    }

    public String getText(By locator) {
        waitForElementVisibility(locator);
        return driver.findElement(locator).getText().trim();
    }

    public String getAttribute(By locator, String attribute) {
        waitForElementVisibility(locator);
        return driver.findElement(locator).getAttribute(attribute).trim();
    }

}
