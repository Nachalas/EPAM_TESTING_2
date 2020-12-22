package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class ProductPage extends AbstractPage {

    private String productPageUrl;

    public ProductPage(WebDriver driver, String pageUrl) {
        super(driver);
        this.productPageUrl = pageUrl;

        PageFactory.initElements(this.driver, this);
    }

    public ProductPage goToNewPage(String pageUrl){
        driver.navigate().to(pageUrl);
        logger.info("Opened page " +  pageUrl);
        return new ProductPage(driver,pageUrl);
    }

    @Override
    public ProductPage openPage() {
        driver.navigate().to(productPageUrl);
        logger.info("Opened page " +  productPageUrl);
        return this;
    }

}
