package tests;

import io.appium.java_client.AppiumBy;
import utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredential() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "standard_user",
                "secret_sauce"
        );

        boolean isLoggedIn = !driver.findElements(AppiumBy.accessibilityId("test-PRODUCTS")).isEmpty();

        Assert.assertTrue(isLoggedIn, "Login failed - Home page not displayed");
    }
}
