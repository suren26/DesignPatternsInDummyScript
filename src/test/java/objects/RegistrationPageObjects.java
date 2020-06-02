package objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageObjects {
    @FindBy(xpath="//*[@id='navbarAccount']/span/span")
    public WebElement AccountLink;
    @FindBy(xpath="//*[@id='newCustomerLink']/a")
    public WebElement NewCustomer;
    @FindBy(xpath="//*[@id='registration-form']/div[1]/mat-form-field[1]/div/div[1]/div[3]")
    public WebElement SecurityQuestionDropdown;
    @FindBy(xpath="//*[@id='mat-option-3']/span")
    public WebElement SecurityQuestionDropdownQuestion;
    @FindBy(xpath="//*[@id='registerButton']/span")
    public WebElement RegisterButton;

    @FindBy(id = "navbarLoginButton")
    public WebElement LoginButton;
    @FindBy(id = "emailControl")
    public WebElement Email;
    @FindBy(id = "passwordControl")
    public WebElement Password;
    @FindBy(id = "repeatPasswordControl")
    public WebElement RepeatPassword;
    @FindBy(id = "securityAnswerControl")
    public WebElement SecurityAnswer;
}

