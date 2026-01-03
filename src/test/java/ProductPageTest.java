import base.BaseDriver;
import org.testng.annotations.Test;
import pages.ProductPage;

public class ProductPageTest extends BaseDriver {

    @Test
    public void testAddToCartBtn(){

        ProductPage page = new ProductPage(driver);
        page.clickOnAddToCartBtn();

    }

    @Test(priority = 0)
    public void checkCount(){

        ProductPage page = new ProductPage(driver);
        page.checkCountOfAllAvailableItems();

    }

}
