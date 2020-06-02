package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public WebDriver driver;
    public BrowserFactory(WebDriver driver){
        this.driver=driver;
    }
    public WebDriver getBrowser(){
        //String browserName = System.getenv("BROWSER_NAME");
        String browserName = "chrome";
        System.out.println(":::Inside Before class:::");
        //        this.driver = browserFactory.getBrowser("chrome");
        if ("chrome".equals(browserName)) {
            System.out.println("Setting up Chrome Browser");
            WebDriverManager.chromedriver().setup();
            this.driver = new ChromeDriver();
        } else if ("firefox".equals(browserName)) {
            System.out.println("Setting up FireFox Browser For Desktop");
            WebDriverManager.firefoxdriver().setup();
            this.driver = new FirefoxDriver();
        } else {
            System.out.println("Invalid browser Name");
        }
        return driver;
    }

}
