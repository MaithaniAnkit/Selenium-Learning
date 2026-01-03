import base.BaseDriver;
import login.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageTest extends BaseDriver {

    @Test
    public void confirmLoginTest(){

        LoginPage login = new LoginPage(driver);
        login.confirmLogin();
        Assert.assertTrue(login.confirmLogin().size()==6);
    }
}
