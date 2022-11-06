package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.ComputerAndNetworksPage;
import pages.MainPage;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tests.TestUtils.isSectionDisplayed;


public class ComputerAndMobilePhoneSectionsTest extends BaseTest {
    private static MainPage mainPage;
    private static ComputerAndNetworksPage computerAndNetworksPage;

    @BeforeAll
    public static void classInit(){
        mainPage = new MainPage();
        computerAndNetworksPage = new ComputerAndNetworksPage();

    }

    @Test
    public void isComputerAndNetworksSectionsExistAndDisplayed() {
        List<String> sections = Arrays.asList("Ноутбуки, компьютеры, мониторы", "Комплектующие", "Хранение данных", "Сетевое оборудование");
        mainPage.clickOnCatalog().
                clickOnComputerAndNetworks();
        List<WebElement> elements = computerAndNetworksPage.findComputerAndNetworksSections();
        List<String> elementsText = computerAndNetworksPage.getComputerAndNetworksSectionText();
        assertAll(
                () -> assertTrue(isSectionDisplayed(elements),"Some 'computer and networks' sections doesn't displayed"),
                () -> assertThat(elementsText).containsAll(sections)
        );
    }

}
