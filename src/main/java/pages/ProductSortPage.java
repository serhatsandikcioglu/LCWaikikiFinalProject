package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSortPage extends BasePage{
    public ProductSortPage(WebDriver driver) {
        super(driver);
    }

    By sortDropdownButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[5]/div[1]/div/div/button");
    By sort_BestSellerButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[5]/div[1]/div/div/div/a[5]");

    public ProductSortPage ProductSort(){

        scrollElementWindow(sortDropdownButton);
        clickElement(sortDropdownButton);

        clickElement(sort_BestSellerButton);

        return this;
    }
}
