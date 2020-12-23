package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ProductPage extends AbstractPage {

    private String productPageUrl;

    @FindBy(xpath = "//div[@class='j-size-list size-list j-smart-overflow-instance']/label")
    private WebElement productSizeLabel;

    @FindBy(xpath = "//span[@class='name']")
    private WebElement productName;

    @FindBy(xpath = "//button[@class='c-btn-main-lg-v1 j-add-to-card']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='c-btn-base-lg-v1 j-go-to-basket']")
    private WebElement goToCartButton;

    private static final By byGoToCartButton = By
            .xpath("//a[@class='c-btn-base-lg-v1 j-go-to-basket']");

    public ProductPage(String pageUrl) {
        super();
        this.productPageUrl = pageUrl;
    }

    public String getProductSizeLabelText() {
        return this.productSizeLabel.getText();
    }

    @Override
    public ProductPage openPage() {
        driver.navigate().to(productPageUrl);
        logger.info("Opened page " +  productPageUrl);
        return this;
    }

    public ProductPage clickOnProductSizeLabel(){
        this.productSizeLabel.click();
        return this;
    }

    public ProductPage clickOnAddToCartButton(){
        this.addToCartButton.click();
        return this;
    }

    public CartPage clickOnGoToCartButton(){
        driverWait.until(ExpectedConditions
                .presenceOfElementLocated(byGoToCartButton)).click();
        return new CartPage();
    }

    public String getProductName(){
        return this.productName.getText();
    }

}
