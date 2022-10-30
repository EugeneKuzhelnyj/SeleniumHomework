package pages.main;

import org.openqa.selenium.By;
import pages.base.BasePage;
import pages.onlinerCatalog.OnlinerCatalogPage;

import static common.DriverManager.getDriver;

public class MainPage extends BasePage {

    private final By catalog = By.cssSelector("nav.b-top-navigation a[href='https://catalog.onliner.by']");

    public OnlinerCatalogPage clickOnCatalog(){
        waitElementIsVisible(getDriver().findElement(catalog)).click();
        return new OnlinerCatalogPage();
    }

}
