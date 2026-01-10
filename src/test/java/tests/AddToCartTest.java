package tests;

import utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {
    @Test
    public void userCanAddProductToCart() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        Assert.assertTrue(
                homePage.isHomePageDisplayed(),
                "Home page is not displayed after login"
        );

        homePage.clickFirstProduct();
        productPage.clickAddToCart();

        Assert.assertTrue(
                productPage.isProductAddedSuccessfully(),
                "Product was not added to cart"
        );
    }
}
