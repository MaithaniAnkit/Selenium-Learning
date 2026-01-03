package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DriverManager {

     WebDriver driver;
    public WebDriver startDriver(){

        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--Incognito");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        return driver;
    }
}
