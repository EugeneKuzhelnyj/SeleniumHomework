package pages.accessories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.Arrays;
import java.util.List;

public class AccessoriesPage extends BasePage {
    private final By accessoriesName = By.xpath("//div[@class= 'catalog-navigation-list__aside-item " +
            "catalog-navigation-list__aside-item_active']//span[contains(@class,'dropdown-title')]");
    private final By accessoriesDescription = By.xpath("//div[@class= 'catalog-navigation-list__aside-item " +
            "catalog-navigation-list__aside-item_active']//span[contains(@class,'dropdown-description')]");

    public List<String> getAccessoriesName(){
        return waitElementsAreVisible(accessoriesName).stream().map(WebElement::getText).toList();
    }
    public List<String> getAccessoriesDescription(){
        return waitElementsAreVisible(accessoriesDescription).stream().map(WebElement::getText).toList();
    }
    public boolean isMinPriceAndCountOfGoodsExist(List<String> descriptions) {
        int count = 0;
        for (int i = 0; i < descriptions.size(); i++) {
            List<String> temp = Arrays.asList(descriptions.get(i).trim().split(" "));
            double countOfGoods = Double.parseDouble(temp.get(0).replace(',', '.'));
            double minPrice = Double.parseDouble(temp.get(2).replace(',', '.'));
            if (countOfGoods >= 0 && minPrice >= 0) {
                count++;
            }
        }
        return (count == descriptions.size());
    }


}


