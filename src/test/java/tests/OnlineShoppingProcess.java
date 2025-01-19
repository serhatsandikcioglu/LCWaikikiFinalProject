package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class OnlineShoppingProcess extends BaseTest {

    HeaderPage headerPage;
    LoginPage loginPage;
    GirlOuterwearPage girlOuterwearPage;
    ProductFilterPage productFilterPage;
    ProductSortPage productSortPage;
    ProductDetailPage productDetailPage;
    MyCartPage myCartPage;
    MyFavoritesPage myFavoritesPage;

    String userName = "serhat16_@hotmail.com";
    String password ="123";

    @BeforeClass
    public void SetupTest(){
        headerPage = new HeaderPage(driver);
        loginPage = new LoginPage(driver);
        girlOuterwearPage = new GirlOuterwearPage(driver);
        productFilterPage = new ProductFilterPage(driver);
        productSortPage = new ProductSortPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        myCartPage = new MyCartPage(driver);
        myFavoritesPage = new MyFavoritesPage(driver);
    }

    @Test(priority = 1)
    @Step("Navigate to the login page")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test navigates to the login page.")
    public void GoToLoginPage() {
        headerPage.GoToLoginPage();
    }
    @Test(priority = 2)
    @Step("Log in to the system with valid credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test logs in to the system using provided username and password.")
    public void LoginToSystem() {
        loginPage.loginToSystem(userName, password);

        driver.get("https://www.lcw.com");
    }

    @Test(priority = 3)
    @Step("Select a product category")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test selects a specific product category from the header.")
    public void SelectProductCategory() {
        headerPage.SelectCategory();
    }
    @Test(priority = 4)
    @Step("Apply filters to the product list")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test applies filters to narrow down the product list.")
    public void FilterProducts() {
        productFilterPage.ProductFilter();
    }

    @Test(priority = 5)
    @Step("Sort products by a selected criterion")
    @Severity(SeverityLevel.MINOR)
    @Description("This test sorts the products based on a specified criterion.")
    public void SortProducts() {
        productSortPage.ProductSort();
    }

    @Test(priority = 6)
    @Step("Select a product from the list")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test selects the fourth product from the Girl Outerwear category.")
    public void SelectProduct() {
        girlOuterwearPage.ClickFourthItem();
    }

    @Test(priority = 7)
    @Step("Add the selected product to the cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test selects a size and adds the product to the cart.")
    public void AddProductToCart() {
        productDetailPage.ChooseSize().AddToCart();
    }

    @Test(priority = 8)
    @Step("Verify the product details in the cart")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test verifies the product name, color, quantity, and price in the cart.")
    public void VerifyCart() {
        headerPage.GoToMyCartPage();
        myCartPage.VerifyName().VerifyColor().VerifyQuantity().VerifyPrice();
    }

    @Test(priority = 9)
    @Step("Add the product in the cart to favorites")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test adds the product from the cart to the favorites.")
    public void AddToFavorites() {
        myCartPage.AddToFavorites();
    }
    @Test(priority = 10)
    @Step("Verify the product in the favorites")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test verifies that the product is successfully added to the favorites list.")
    public void VerifyFavorites() {
        headerPage.GoToMyFavoritesPage();
        myFavoritesPage.VerifyProductName();
    }

}
