package tests.checkingCatalogSections;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import tests.base.BaseTest;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static tests.testUtils.TestUtils.*;

public class CheckingCatalogSectionsTest extends BaseTest {

    @Test
    public void isAllCatalogSectionsExistAndDisplayed() {
        List<String> sections = Arrays.asList("Электроника", "Компьютеры и сети","Бытовая техника","Стройка и ремонт",
                "Дом и сад","Авто и мото","Красота и спорт","Детям и мамам","Работа и офис");
        mainPage.clickOnCatalog();
        List<WebElement> elements = onlinerCatalogPage.findCatalogSections();
        List<String> elementsText = elements.stream().map(WebElement::getText).toList();
        assertTrue(isSectionExist(sections,elementsText) && isSectionDisplayed(elements));
    }

}
