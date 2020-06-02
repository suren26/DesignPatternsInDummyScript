package pages;

import objects.RegistrationPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserFactory;
import utils.NewUser;

public class RegistrationPage extends BrowserFactory {
    private RegistrationPageObjects registrationPageObjects;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        registrationPageObjects = new RegistrationPageObjects();
        PageFactory.initElements(driver, registrationPageObjects);
    }
    public void registrationPageOperations(NewUser newUser){
        try {
            Thread.sleep(5000);
            assert (registrationPageObjects.AccountLink.isDisplayed());
            registrationPageObjects.AccountLink.click();
            Thread.sleep(2000);
            registrationPageObjects.LoginButton.click();
            Thread.sleep(5000);
            assert (registrationPageObjects.NewCustomer.isDisplayed());
            registrationPageObjects.NewCustomer.click();
            Thread.sleep(5000);
            registrationPageObjects.Email.sendKeys(newUser.userName);
            registrationPageObjects.Password.sendKeys(newUser.password);
            registrationPageObjects.RepeatPassword.sendKeys(newUser.repeatPassword);
            registrationPageObjects.SecurityQuestionDropdown.click();
            Thread.sleep(2000);
            registrationPageObjects.SecurityQuestionDropdownQuestion.click();
            Thread.sleep(2000);
            registrationPageObjects.SecurityAnswer.sendKeys(newUser.securityAnswer);
            Thread.sleep(2000);
            registrationPageObjects.RegisterButton.click();
            Thread.sleep(10000);
            System.out.println("registration Success");
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
