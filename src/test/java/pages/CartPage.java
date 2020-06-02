package pages;

import objects.CartPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserFactory;

public class CartPage extends BrowserFactory {
    private CartPageObjects cartPageObjects;

    public CartPage(WebDriver driver) {
        super(driver);
        cartPageObjects = new CartPageObjects();
        PageFactory.initElements(driver, cartPageObjects);
    }
    public void cartPageOperations(){
        try {
            Thread.sleep(5000);

            assert (cartPageObjects.JuiceAdd.isDisplayed());
            System.out.println("Adding juices");
            cartPageObjects.JuiceAdd.click();
            Thread.sleep(5000);
            //assert(driver.findElements(By.xpath("//span[@contains('Added')]")).size()!=0);
            cartPageObjects.HomePageCart.click();
            Thread.sleep(10000);
            assert (cartPageObjects.AddedJuice.isDisplayed());
            System.out.println("In Checkout Page");
            cartPageObjects.CheckOut.click();
            System.out.println("checkOut Success");
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
