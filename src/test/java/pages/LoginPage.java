package pages;

import objects.LoginPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserFactory;
import utils.NewUser;

public class LoginPage extends BrowserFactory {
    private LoginPageObjects loginPageObjects;

    public LoginPage(WebDriver driver) {
        super(driver);
        loginPageObjects = new LoginPageObjects();
        PageFactory.initElements(driver, loginPageObjects);
    }
    public void  loginPageOperations(NewUser newUser){
        try {
            Thread.sleep(10000);
            //assert(driver.findElements(By.id("email")).size()!=0);
            loginPageObjects.UserName.sendKeys(newUser.userName);
            loginPageObjects.Password.sendKeys(newUser.password);
            Thread.sleep(2000);
            loginPageObjects.SignInButton.click();
            Thread.sleep(5000);
            assert (loginPageObjects.HomePageCart.isDisplayed());
            System.out.println("login Success");
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
