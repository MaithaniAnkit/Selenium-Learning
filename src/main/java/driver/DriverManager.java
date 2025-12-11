package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverManager {

    WebDriver driver;
    public void startDriver(){

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
}
