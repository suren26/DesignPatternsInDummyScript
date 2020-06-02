package pages;

import objects.HomePageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserFactory;

public class HomePage extends BrowserFactory {
    private HomePageObjects homePageObjects;

    public HomePage(WebDriver driver) {
        super(driver);
        homePageObjects = new HomePageObjects();
        PageFactory.initElements(driver, homePageObjects);
    }
    public void HomePageOperations(){
        try {
            assert (driver.findElements(By.id("navbarAccount")).size() != 0);
            System.out.println("OpenApp Success");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='mat-dialog-0']/app-welcome-banner/div/div[2]/button[2]/span")).click();
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
