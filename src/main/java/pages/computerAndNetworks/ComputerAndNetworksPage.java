package pages.computerAndNetworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.accessories.AccessoriesPage;
import pages.base.BasePage;

import java.util.List;

import static common.DriverManager.getDriver;

public class ComputerAndNetworksPage extends BasePage {
    private final By accessories = By.xpath("//div[@class = 'catalog-navigation-list__wrapper']/div[3]" +
            "//div[@class='catalog-navigation-list__aside-list']/div[2]/div[1]");
    private final By computerAndNetworksSections = By.xpath("//*[@data-id = '2']" +
            "//div[contains(@class,'aside-title')]");

    public AccessoriesPage clickOnAccessories() {
        waitElementIsVisible(getDriver().findElement(accessories)).click();
        return new AccessoriesPage();
    }

    public List<WebElement> findComputerAndNetworksSections(){
        return waitElementsAreVisible(computerAndNetworksSections);
    }

}
