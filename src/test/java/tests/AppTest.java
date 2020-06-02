package tests;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;
import utils.BaseClass;
import utils.NewUser;

public class AppTest extends BaseClass {

        @Test(priority = 1)
        public void openAppTest(){
            HomePage homePage = new HomePage(driver);
            homePage.HomePageOperations();
    }
        @Test(priority = 2)
        public void registrationTest(){
             RegistrationPage registrationPage = new RegistrationPage(driver);
                registrationPage.registrationPageOperations(new NewUser());
        }

        @Test(priority = 3)
        public void loginTest() throws InterruptedException {
             LoginPage loginPage = new LoginPage(driver);
             loginPage.loginPageOperations(new NewUser());
        }

        @Test(priority = 4)
        public void checkOutTest() throws InterruptedException {
             CartPage cartPage = new CartPage(driver);
             cartPage.cartPageOperations();
        }
}
