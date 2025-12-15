package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DriverManager {

    static WebDriver driver;
    public static void startDriver(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Incognito");
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    public static void main(String[] args) {
        DriverManager.startDriver();
    }
}
