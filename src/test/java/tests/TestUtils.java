package tests;

import org.openqa.selenium.WebElement;
import java.util.Arrays;
import java.util.List;

public class TestUtils {

    public static boolean isSectionDisplayed(List<WebElement> elements) {
        long count = elements.stream().filter(el -> el.isDisplayed()).count();
        return count == elements.size();
    }

    public static boolean isElementContainsName(List<String> names) {
        String regular = "[a-zA-ZА-Яа-я]+.+";
        long count = names.stream().filter(name -> name.matches(regular)).count();
        return (count == names.size());
    }

    public static boolean isMinPriceAndCountOfGoodsExist(List<String> descriptions) {
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
