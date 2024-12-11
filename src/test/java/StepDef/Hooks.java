package StepDef;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    @Before
    public static void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--blink-settings=imagesEnabled=false");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager manager = WebDriverManager.getInstance(DriverManagerType.CHROME);
        manager.clearResolutionCache();
        manager.clearDriverCache();
        manager.setup();
        driver = new ChromeDriver(options);
        driver.get("https://comp.maknoon.com.sa/");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    public static void clearCache() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.localStorage.clear();");
        jsExecutor.executeScript("window.sessionStorage.clear();");
        driver.manage().deleteAllCookies(); // Clear cookies as well
        System.out.println("Cache cleared successfully.");
    }

    @After
    public static void closeBrowser(){

    }
}
