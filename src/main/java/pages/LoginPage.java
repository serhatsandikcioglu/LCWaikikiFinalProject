package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By usernameTextBox = By.xpath("//*[@id=\"login\"]/div/div[2]/div/div/div/form/div/div/input");
    By passwordTextBox = By.xpath("//*[@id=\"login\"]/div/div[2]/div/div/div/form/div[2]/div/input");
    By continueButton = By.xpath("//*[@id=\"login\"]/div/div[2]/div/div/div/form/div/button");
    By loginButton = By.xpath("//*[@id=\"login\"]/div/div[2]/div/div/div/form/button");



    public LoginPage loginToSystem(String username,String password){

    sendKeys(usernameTextBox,username);
    clickElement(continueButton);

    sendKeys(passwordTextBox,password);
    clickElement(loginButton);

    return this;
    }
}
