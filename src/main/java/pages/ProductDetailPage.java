package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductDetailPage extends BasePage{
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    By addToCartButton = By.xpath("//*[@id=\"product-detail-add-to-card-operation\"]/div/div[2]/button");
    By sizeButtonsDiv = By.cssSelector(".option-size-box");

    public ProductDetailPage ChooseSize(){

        waitForElementVisibilityAndClickable(sizeButtonsDiv);

        List<WebElement> sizeButtons = driver.findElements(sizeButtonsDiv);

        for (WebElement button : sizeButtons) {
            if (!button.getAttribute("class").contains("option-size-box__out-of-stock")) {
                button.click();
                break;
            }
        }

        return this;
    }

    public ProductDetailPage AddToCart(){

        clickElement(addToCartButton);

        return this;
    }
}
