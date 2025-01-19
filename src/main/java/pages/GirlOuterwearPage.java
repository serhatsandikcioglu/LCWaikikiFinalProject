package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GirlOuterwearPage extends BasePage{
    public GirlOuterwearPage(WebDriver driver) {
        super(driver);
    }

    By fourthProduct = By.xpath("//a[@data-product-order='3']");

    public void ClickFourthItem(){

        clickElement(fourthProduct);

        }
    }

