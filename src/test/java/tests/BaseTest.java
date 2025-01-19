package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTest {

     public static WebDriver driver;

     final public String baseURL= "https://www.lcw.com";

    @BeforeSuite
     public void setup(){
         ChromeOptions chromeOptions = new ChromeOptions();
         chromeOptions.addArguments("--remote-allow-origins=*");
         chromeOptions.addArguments("--disable-notifications");
         chromeOptions.addArguments("disable--popup-blocking");
         driver = new ChromeDriver(chromeOptions);

         driver.navigate().to(baseURL);
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
     }
    @AfterSuite
     public void quit(){
        if (driver != null){
         driver.quit();
        }
     }
}
