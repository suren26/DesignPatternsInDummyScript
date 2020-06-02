package objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
    @FindBy(id = "email")
    public WebElement UserName;
    @FindBy(id = "password")
    public WebElement Password;
    @FindBy(id = "loginButton")
    public WebElement SignInButton;
    @FindBy(xpath="//button[4]/span/span[1]")
    public WebElement HomePageCart;
}
