package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    private String baseUrl = "https://juice-shop.herokuapp.com/#/";
    public BrowserFactory browserFactory = new BrowserFactory(driver);

    @BeforeClass
    public void setUp() {
        this.driver= browserFactory.getBrowser();
        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
        this.driver.get(baseUrl);
    }
    @AfterClass
    public void teardown() {
        if (this.driver != null)
            this.driver.quit();
    }
}
