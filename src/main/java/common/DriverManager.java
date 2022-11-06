package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {
    public static final String PLATFORM_AND_BROWSER = "win_chrome";
    public static final int IMPLICIT_WAIT = 10;
    public static final int EXPLICIT_WAIT = 20;
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            switch (PLATFORM_AND_BROWSER) {
                case "win_chrome":
                    WebDriverManager.chromedriver().setup();
                    driver.set(new ChromeDriver());
                    break;
                default:
                    System.out.println("Incorrect platform or browser name: " + PLATFORM_AND_BROWSER);
                    break;
            }
            driver.get().manage().window().maximize();
            driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        }
        return driver.get();
    }

    public static void closeDriver() {
        driver.get().quit();
        driver.remove();
    }
}
