package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ProductPage {
    private AppiumDriver driver;

    public ProductPage(AppiumDriver driver) {
        this.driver = driver;
    }

    private By addToCartButton = MobileBy.id("com.demo.app:id/btnAddToCart");

    private By successToast = MobileBy.xpath("//android.widget.Toast");

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public boolean isProductAddedSuccessfully() {
        return driver.findElement(successToast).isDisplayed();
    }
}
