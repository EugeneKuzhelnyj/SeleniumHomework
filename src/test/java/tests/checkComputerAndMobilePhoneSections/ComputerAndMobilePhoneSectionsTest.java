package tests.checkComputerAndMobilePhoneSections;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import tests.base.BaseTest;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tests.testUtils.TestUtils.isSectionDisplayed;
import static tests.testUtils.TestUtils.isSectionExist;

public class ComputerAndMobilePhoneSectionsTest extends BaseTest {

    @Test
    public void isComputerAndNetworksSectionsExistAndDisplayed() {
        List<String> sections = Arrays.asList("Ноутбуки, компьютеры, мониторы", "Комплектующие", "Хранение данных", "Сетевое оборудование");
        mainPage.clickOnCatalog().
                clickOnComputerAndNetworks();
        List<WebElement> elements = computerAndNetworksPage.findComputerAndNetworksSections();
        List<String> elementsText = elements.stream().map(WebElement::getText).toList();
        assertTrue(isSectionExist(sections, elementsText) && isSectionDisplayed(elements));
    }

}
