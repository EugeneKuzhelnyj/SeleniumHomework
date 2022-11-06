package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.AccessoriesPage;
import pages.MainPage;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static tests.TestUtils.isElementContainsName;
import static tests.TestUtils.isMinPriceAndCountOfGoodsExist;

public class CheckAccessoriesSectionsTest extends BaseTest {
    private static MainPage mainPage;
    private static AccessoriesPage accessoriesPage;

    @BeforeAll
    public static void classInit(){
        mainPage = new MainPage();
        accessoriesPage = new AccessoriesPage();
    }

    @Test
    public void areAllItemsContainANameAndMinPriceAndCountOfGoodsTest() {
        mainPage.clickOnCatalog().
                clickOnComputerAndNetworks().
                clickOnAccessories();
        List<String> names = accessoriesPage.getAccessoriesName();
        List<String> descriptions = accessoriesPage.getAccessoriesDescription();
        assertAll(
        () -> assertTrue(isElementContainsName(names),"Some item don't have a name"),
        () -> assertTrue(isMinPriceAndCountOfGoodsExist(descriptions),"Some item don't have a min price or count of goods")
        );
    }

}
