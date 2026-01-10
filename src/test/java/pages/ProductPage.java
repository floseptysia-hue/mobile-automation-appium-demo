package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class ProductPage {
    private AppiumDriver driver;

    public ProductPage(AppiumDriver driver) {
        this.driver = driver;
    }

    By addToCartButton = AppiumBy.accessibilityId("test-ADD TO CART");
    private By successToast = AppiumBy.xpath("//android.widget.Toast");

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public boolean isProductAddedSuccessfully() {
        return driver.findElement(successToast).isDisplayed();
    }
}
