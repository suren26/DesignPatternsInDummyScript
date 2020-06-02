package objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageObjects {
    @FindBy(xpath="//mat-grid-tile[1]/figure/mat-card/div[2]/button/span/span")
    public WebElement JuiceAdd;
    @FindBy(xpath="//button[4]/span/span[1]")
    public WebElement HomePageCart;
    @FindBy(xpath="//mat-table/mat-row/mat-cell[1]/img")
    public WebElement AddedJuice;
    @FindBy(id = "checkoutButton")
    public WebElement CheckOut;
}
