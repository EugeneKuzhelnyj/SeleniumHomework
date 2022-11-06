package pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {

    private final By catalog = By.xpath("//span[@class = 'b-main-navigation__text' and text() = 'Каталог']");

    public OnlinerCatalogPage clickOnCatalog() {
        waitElementIsVisible(catalog).click();
        return new OnlinerCatalogPage();
    }

}
