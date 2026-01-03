package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void loginDetails(String name, String pass){

        WebElement uName = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='user-name']"))));
        WebElement pWord = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='password']"))));
        WebElement loginBtn = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='login-button']"))));

        uName.sendKeys(name);
        pWord.sendKeys(pass);
        loginBtn.click();

    }

    public List<WebElement> confirmLogin(){

        List<WebElement> allItems = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        return allItems;

    }

}
