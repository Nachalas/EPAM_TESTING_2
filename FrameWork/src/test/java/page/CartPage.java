package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends AbstractPage {

    private static final By byProductNameOnCartPage = By.xpath("//span[@class='good-name']");

    public CartPage()
    {
        super();
    }

    @Override
    public CartPage openPage()
    {
        throw new RuntimeException();
    }

    public String getProductNameOnCartPage() {
        return driverWait.until(ExpectedConditions
                    .presenceOfElementLocated(byProductNameOnCartPage)).getText();
    }
}
