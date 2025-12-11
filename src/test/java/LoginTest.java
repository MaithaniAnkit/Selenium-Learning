import driver.DriverManager;
import login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class LoginTest extends DriverManager {

    @BeforeClass
    public void setUp() {
        startDriver();
    }


    @Test(priority = 1)
    public void testLoginfunctionality() {
        LoginPage login = new LoginPage(driver);
        login.doLogin("standard_user", "secret_sauce");
    }

    @Test(priority = 2)
    public void confrimLogin(){
        LoginPage login = new LoginPage(driver);
        Assert.assertTrue(login.loginIsConfirmed().isDisplayed(),"Login Unsuccessful");
    }

}
