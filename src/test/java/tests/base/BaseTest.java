package tests.base;

import common.DriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import pages.accessories.AccessoriesPage;
import pages.computerAndNetworks.ComputerAndNetworksPage;
import pages.main.MainPage;
import pages.onlinerCatalog.OnlinerCatalogPage;
import static common.DriverManager.getDriver;

public class BaseTest {
    protected  MainPage mainPage = new MainPage();
    protected ComputerAndNetworksPage computerAndNetworksPage = new ComputerAndNetworksPage();
    protected  OnlinerCatalogPage onlinerCatalogPage = new OnlinerCatalogPage();
    protected AccessoriesPage accessoriesPage = new AccessoriesPage();
    protected static final String ONLINER_URL = "https://www.onliner.by/";

    @BeforeAll
    public static void WebDriverInitAndGoToOnliner(){
        getDriver();
        getDriver().get(ONLINER_URL);
    }

    @AfterAll
    public static void WebDriverClose(){
        DriverManager.closeDriver();
        getDriver().quit();
    }

}
