package tests.testUtils;

import org.openqa.selenium.WebElement;

import java.util.List;
public class TestUtils {

    public static boolean isSectionExist(List<String> sections, List<String> elementsText) {
        int temp = 0;
        for (int i = 0; i < sections.size(); i++) {
            for (int j = 0; j < elementsText.size(); j++) {
                if (sections.get(i).equalsIgnoreCase(elementsText.get(j))) {
                    temp++;
                }
            }
        }
        return temp == sections.size();
    }

    public static boolean isSectionDisplayed(List<WebElement> elements) {
        int count = 0;
        for (WebElement element : elements) {
            if (element.isDisplayed()) {
                count++;
            }
        }
        return count == elements.size();
    }

    public static boolean isElementContainsName(List<String> names) {
        String regular = "[a-zA-ZА-Яа-я]+.+";
        int count = 0;
        for (String name : names) {
            if (name.matches(regular)) {
                count++;
            }
        }
        return (count == names.size());
    }
}
