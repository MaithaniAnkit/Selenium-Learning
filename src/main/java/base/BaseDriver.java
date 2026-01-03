package base;

import driver.DriverManager;
import login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class BaseDriver {

   public  WebDriver driver;

   @BeforeSuite
    public void getDriver(){

        DriverManager manager = new DriverManager();
        driver = manager.startDriver();
        LoginPage login = new LoginPage(driver);
        login.loginDetails("standard_user", "secret_sauce");
    }

}
