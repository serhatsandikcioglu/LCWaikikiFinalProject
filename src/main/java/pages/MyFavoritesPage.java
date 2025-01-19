package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyFavoritesPage extends BasePage{
    public MyFavoritesPage(WebDriver driver) {
        super(driver);
    }
        By productCardTitleDiv = By.xpath("//*[@id=\"favoriteListContainer\"]/div/div/div[2]/div/div[1]/div[1]/a/div[2]/h5[2]");

    public MyFavoritesPage VerifyProductName(){

        String productNameText = getText(productCardTitleDiv);
        Assertions.assertEquals("Kapüşonlu Kız Çocuk Mont",productNameText);

        return this;
    }

}
