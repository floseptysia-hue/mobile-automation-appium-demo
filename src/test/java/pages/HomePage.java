package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomePage {
    private AppiumDriver driver;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
    }

    private By firstProduct =
            MobileBy.xpath("(//android.widget.TextView[@resource-id='com.demo.app:id/productName'])[1]");

    public void clickFirstProduct() {
        driver.findElement(firstProduct).click();
    }

    public boolean isHomePageDisplayed() {
        return driver.findElement(firstProduct).isDisplayed();
    }
}
