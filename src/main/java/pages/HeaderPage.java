package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HeaderPage extends BasePage {

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    By loginButton = By.xpath("//*[@id=\"user_1_\"]");
    By loginPopupButton = By.xpath("//*[@id=\"header__container\"]/header/div[2]/div[3]/div/span/div/div/div/div[3]/a");
    By kidAndBabyOption = By.xpath("//*[@id=\"header__container\"]/header/div[3]/nav/ul/li[4]/a");
    By girl6To14Option = By.xpath("//*[@id=\"header__container\"]/header/div[3]/nav/ul/li[4]/div/nav/ul/button[4]");
    By girl6To14_JacketAndCoatOption = By.xpath("//*[@id=\"header__container\"]/header/div[3]/nav/ul/li[4]/div/nav/section/div[1]/div[2]/ul/li[5]/a");
    By myCartButton = By.xpath("//*[@id=\"header__container\"]/header/div[1]/div[3]/div/div[2]/a");
    By myFavoritesButton = By.xpath("//*[@id=\"header__container\"]/header/div[1]/div[3]/div/div[1]/a");

    public HeaderPage GoToLoginPage(){

        moveToElement(loginButton);

        clickElement(loginPopupButton);

        return this;
    }

    public HeaderPage SelectCategory(){

        moveToElement(kidAndBabyOption);

        moveToElement(girl6To14Option);

        clickElement(girl6To14_JacketAndCoatOption);

        return this;
    }
    public HeaderPage GoToMyCartPage(){

        clickElement(myCartButton);

        return this;
    }

    public HeaderPage GoToMyFavoritesPage(){

        clickElement(myFavoritesButton);

        return this;
    }


}
