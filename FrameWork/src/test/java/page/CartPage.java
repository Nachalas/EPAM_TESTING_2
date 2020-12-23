package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends AbstractPage {

    private static final By byProductNameOnCartPage = By.xpath("//span[@class='good-name']");
    private static final By byProductSizeOnCartPage = By.xpath("//span[@class='size-item']");
    private static final By byFirstDeliveryDestinationName = By.xpath("//ul[@id='pooList']/li/p");
    private static final By byConfirmChangeDeliveryDestinationButton = By.xpath("//button[@id='userPooSubmit']");
    private static final By byFirstDeliveryDestinationItem = By.xpath("//ul[@id='pooList']/li");
    private static final By byCurrentDeliveryAddressText = By.xpath("//p[@class='address']/b");

    @FindBy(xpath = "//button[@class='c-btn-base-sm btn-select-pickup']")
    WebElement changeDeliveryDestinationPlaceButton;

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

    public String getProductSizeOnCartPage() {
        return driverWait.until(ExpectedConditions
                .presenceOfElementLocated(byProductSizeOnCartPage)).getText().substring(8);
    }

    public CartPage clickOnChangeDeliveryDestinationButton() {
        changeDeliveryDestinationPlaceButton.click();
        return this;
    }

    public String getFirstDeliveryDestinationName() {
        return driverWait.until(ExpectedConditions.presenceOfElementLocated(byFirstDeliveryDestinationName)).getText();
}

    public CartPage clickOnFirstDeliveryDestinationOption() {
        driverWait.until(ExpectedConditions.presenceOfElementLocated(byFirstDeliveryDestinationItem)).click();
        return this;
    }

    public CartPage confirmChangingDeliveryDestination() {
        driverWait.until(ExpectedConditions.presenceOfElementLocated(byConfirmChangeDeliveryDestinationButton)).click();
        return this;
    }

    public String getCurrentDeliveryAddressText() {
        return driverWait.until(ExpectedConditions.presenceOfElementLocated(byCurrentDeliveryAddressText)).getText();
    }
}
