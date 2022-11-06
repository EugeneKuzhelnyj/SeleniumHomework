package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComputerAndNetworksPage extends BasePage {
    private final By accessories = By.xpath("//div[@class = 'catalog-navigation-list__aside-title'" +
            " and text() = ' Комплектующие ']");
    private final By computerAndNetworksSections = By.xpath("//*[@data-id = '2']" +
            "//div[contains(@class,'aside-title')]");

    public AccessoriesPage clickOnAccessories() {
        waitElementIsVisible(accessories).click();
        return new AccessoriesPage();
    }

    public List<WebElement> findComputerAndNetworksSections() {
        return waitElementsAreVisible(computerAndNetworksSections);
    }

    public List<String> getComputerAndNetworksSectionText() {
        return CommonWebElementUtils.getTextFromWebElement(computerAndNetworksSections);
    }

}
