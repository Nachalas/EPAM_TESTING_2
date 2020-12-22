package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends AbstractPage {

    private String productPageUrl;

    public ProductPage(String pageUrl) {
        super();
        this.productPageUrl = pageUrl;
    }

    @Override
    public ProductPage openPage() {
        driver.navigate().to(productPageUrl);
        logger.info("Opened page " +  productPageUrl);
        return this;
    }

}
