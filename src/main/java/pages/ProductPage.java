package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver){
        this.driver =driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addItemsToCart(){
        List<WebElement> addToCartBtn = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']"))));
        for(int i=0; i<=addToCartBtn.size();i++){


        }
    }


}
