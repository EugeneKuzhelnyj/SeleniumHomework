package pages.base;

import common.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static common.DriverManager.getDriver;
import static common.Config.EXPLICIT_WAIT;

public abstract class BasePage {

    public BasePage() {
        DriverManager.getDriver();
    }

    public WebElement waitElementIsVisible(WebElement element) {
        Wait<WebDriver> wait = new WebDriverWait(getDriver(),Duration.ofSeconds(EXPLICIT_WAIT));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public List<WebElement> waitElementsAreVisible(By by){
        Wait<WebDriver> wait = new WebDriverWait(getDriver(),Duration.ofSeconds(EXPLICIT_WAIT));
        return  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));

    }

}
