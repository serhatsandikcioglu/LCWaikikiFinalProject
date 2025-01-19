package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProductFilterPage extends BasePage {


    public ProductFilterPage(WebDriver driver) {
        super(driver);
    }

    By size5To6AgeCheckBox = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[6]/div/div[1]/div/div[4]/div/div[2]/div[3]/div[2]/div/span");
    By size6AgeCheckBox = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[6]/div/div[1]/div/div[5]/div/div[2]/div[3]/div[3]/div/span");
    By size6To7AgeCheckBox = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[6]/div/div[1]/div/div[5]/div/div[2]/div[3]/div[4]/div/span");
    By colorBeigeCheckBox = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[6]/div/div[1]/div/div[6]/div/div[2]/div[3]/div[2]/span[1]/img");
    By filterDiv = By.xpath("//*[@id='root']/div/div[2]/div[1]/div[6]/div/div[1]");



    public ProductFilterPage ProductFilter(){

        scrollElementWindow(size5To6AgeCheckBox);
        scrollElementDiv(filterDiv);
        clickElement(size5To6AgeCheckBox);

        clickElement(size6AgeCheckBox);

        clickElement(size6To7AgeCheckBox);

        clickElement(colorBeigeCheckBox);
        return this;
    }
}
