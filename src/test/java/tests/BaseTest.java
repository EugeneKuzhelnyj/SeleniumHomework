package tests;

import common.DriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static common.DriverManager.getDriver;

public class BaseTest {
    protected static final String ONLINER_URL = "https://www.onliner.by/";

    @BeforeAll
    public static void webDriverInitAndGoToOnliner(){
        getDriver();
        getDriver().get(ONLINER_URL);
    }

    @AfterAll
    public static void webDriverClose(){
        getDriver().quit();
        DriverManager.closeDriver();
    }

}
