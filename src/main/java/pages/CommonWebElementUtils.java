package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CommonWebElementUtils extends BasePage {
    public static List<String> getTextFromWebElement(By by) {
        return waitElementsAreVisible(by).stream().map(WebElement::getText).toList();
    }

}
