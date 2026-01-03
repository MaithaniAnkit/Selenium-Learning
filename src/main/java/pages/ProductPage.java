package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public List<WebElement> clickOnAddToCartBtn() {

        List<WebElement> addToCartBtn = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']"))));
        for (int i = 0; i < addToCartBtn.size(); i++) {
            addToCartBtn.get(i).click();
        }

        return addToCartBtn;
    }

    public void checkCountOfAllAvailableItems(){

        Assert.assertTrue(clickOnAddToCartBtn().size()==6, "Count is Correct");

    }


}
