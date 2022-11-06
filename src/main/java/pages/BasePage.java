package pages;

import common.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static common.DriverManager.EXPLICIT_WAIT;
import static common.DriverManager.getDriver;

public abstract class BasePage {

    public BasePage() {
        DriverManager.getDriver();
    }

    public static WebElement waitElementIsVisible(By by) {
        Wait<WebDriver> wait = new WebDriverWait(getDriver(), Duration.ofSeconds(EXPLICIT_WAIT));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static List<WebElement> waitElementsAreVisible(By by) {
        Wait<WebDriver> wait = new WebDriverWait(getDriver(), Duration.ofSeconds(EXPLICIT_WAIT));
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));

    }

}
