package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyCartPage extends BasePage{
    public MyCartPage(WebDriver driver) {
        super(driver);
    }

    By productColor = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/span[2]/strong");
    By productQuantity = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div/input");
    By productName = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/span[2]");
    By productPrice = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/span");
    By totalCartPrice = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[3]/div[2]/div[5]/div/div[2]/div/span[2]");
    By addToFavoritesButton = By.xpath("//i[@class='fa fa-heart-o']");


    public MyCartPage VerifyName(){

        String productNameText = getText(productName);
        Assertions.assertEquals("Mont",productNameText);

        return this;
    }

    public MyCartPage VerifyColor(){

        String productColorText = getText(productColor);
        Assertions.assertEquals("Koyu Bej",productColorText);

        return this;
    }
    public MyCartPage VerifyQuantity(){

        String productQuantityValue = getAttribute(productQuantity,"value");
        Assertions.assertEquals("1",productQuantityValue);

        return this;
    }
    public MyCartPage VerifyPrice(){

        String productPriceText = getText(productPrice);
        String totalCartPriceText = getText(totalCartPrice);
        Assertions.assertEquals(totalCartPriceText,productPriceText);

        return this;
    }

    public MyCartPage AddToFavorites(){

        clickElement(addToFavoritesButton);

        return this;
    }

}
