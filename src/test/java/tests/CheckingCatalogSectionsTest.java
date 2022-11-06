package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import pages.OnlinerCatalogPage;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static tests.TestUtils.*;

public class CheckingCatalogSectionsTest extends BaseTest {
    private static MainPage mainPage;
    private static OnlinerCatalogPage onlinerCatalogPage;

    @BeforeAll
    public static void classInit(){
        mainPage = new MainPage();
        onlinerCatalogPage = new OnlinerCatalogPage();
    }

    @Test
    public void isAllCatalogSectionsExistAndDisplayed() {
        List<String> sections = Arrays.asList("Электроника", "Компьютеры и сети","Бытовая техника","Стройка и ремонт",
                "Дом и сад","Авто и мото","Красота и спорт","Детям и мамам","Работа и офис");
        mainPage.clickOnCatalog();
        List<WebElement> elements = onlinerCatalogPage.findCatalogSections();
        List<String> elementsText = onlinerCatalogPage.getCatalogSectionText();
        assertAll(
                () -> assertTrue(isSectionDisplayed(elements),"Some 'catalog' sections doesn't displayed"),
                () -> assertThat(elementsText).containsAll(sections)
        );
    }

}
