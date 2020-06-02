package objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {
    @FindBy(id = "navbarAccount")
    public WebElement Account;
    @FindBy(xpath="//*[@id='mat-dialog-0']/app-welcome-banner/div/div[2]/button[2]/span")
    public WebElement AdditionalPopup;
}

