package pages;

import org.openqa.selenium.By;

import java.util.List;

public class AccessoriesPage extends BasePage {
    private final By accessoriesName = By.xpath("//div[@class= 'catalog-navigation-list__aside-item " +
            "catalog-navigation-list__aside-item_active']//span[contains(@class,'dropdown-title')]");
    private final By accessoriesDescription = By.xpath("//div[@class= 'catalog-navigation-list__aside-item " +
            "catalog-navigation-list__aside-item_active']//span[contains(@class,'dropdown-description')]");

    public List<String> getAccessoriesName() {
        return CommonWebElementUtils.getTextFromWebElement(accessoriesName);
    }

    public List<String> getAccessoriesDescription() {
        return CommonWebElementUtils.getTextFromWebElement(accessoriesDescription);
    }

}


