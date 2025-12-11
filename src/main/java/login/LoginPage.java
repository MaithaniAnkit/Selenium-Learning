package login;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void doLogin(String uName, String pWord){

        WebElement userTextBox = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder='Username']"))));
        WebElement passwordTextBox = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder='Password']"))));
        WebElement loginBtnTextBox = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='login-button']"))));

        userTextBox.sendKeys(uName);
        passwordTextBox.sendKeys(pWord);
        loginBtnTextBox.click();

    }

    public WebElement loginIsConfirmed(){
        WebElement headerText = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='app_logo']"))));
        return headerText;
    }

}
