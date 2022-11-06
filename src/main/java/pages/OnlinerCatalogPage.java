package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OnlinerCatalogPage extends BasePage {
    private final By computerAndNetworks = By.xpath("//li[@class = 'catalog-navigation-classifier__item ' and @data-id ='2']");
    private final By catalogSections = By.xpath("//span[@class = 'catalog-navigation-classifier__item-title-wrapper']");

    public ComputerAndNetworksPage clickOnComputerAndNetworks() {
        waitElementIsVisible(computerAndNetworks).click();
        return new ComputerAndNetworksPage();
    }

    public List<WebElement> findCatalogSections() {
        return waitElementsAreVisible(catalogSections);
    }

    public List<String> getCatalogSectionText() {
        return CommonWebElementUtils.getTextFromWebElement(catalogSections);
    }

}
