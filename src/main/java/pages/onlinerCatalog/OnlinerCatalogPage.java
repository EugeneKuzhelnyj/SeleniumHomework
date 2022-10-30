package pages.onlinerCatalog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import pages.computerAndNetworks.ComputerAndNetworksPage;

import java.util.List;

import static common.DriverManager.getDriver;

public class OnlinerCatalogPage extends BasePage {
   private final By computerAndNetworks = By.xpath("//li[@class = 'catalog-navigation-classifier__item ' and @data-id ='2']");
   private final By CatalogSections = By.xpath("//span[@class = 'catalog-navigation-classifier__item-title-wrapper']");

    public ComputerAndNetworksPage clickOnComputerAndNetworks(){
        waitElementIsVisible(getDriver().findElement(computerAndNetworks)).click();
        return new ComputerAndNetworksPage();
    }

    public List<WebElement> findCatalogSections(){
       return waitElementsAreVisible(CatalogSections);
    }

}
