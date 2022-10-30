package tests.checkAccessoriesSection;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static tests.testUtils.TestUtils.isElementContainsName;

public class CheckAccessoriesSectionsTest extends BaseTest {

    @Test
    public void AreAllItemsContainANameAndMinPriceAndCountOfGoodsTest() {
        mainPage.clickOnCatalog().
                clickOnComputerAndNetworks().
                clickOnAccessories();
        List<String> names = accessoriesPage.getAccessoriesName();
        List<String> descriptions = accessoriesPage.getAccessoriesDescription();
        assertTrue(isElementContainsName(names) && accessoriesPage.isMinPriceAndCountOfGoodsExist(descriptions));
    }

}
