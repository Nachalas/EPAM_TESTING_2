package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostClickNavBarPage extends AbstractPage {



    @FindBy(xpath = "//div[@class='item-img ']/img")
    private WebElement firstItemOnPage;

    public ProductPage clickOnFirstItemOnPage(){
        this.firstItemOnPage.click();
        return new ProductPage();
    }

    public PostClickNavBarPage() {
        super();
        logger.info("Opened search results page " + driver.getCurrentUrl());
    }

    @Override
    protected SearchResultsPage openPage() {
        logger.error("Cannot open SearchResultsPage by itself! Throwing exception");
        throw new RuntimeException("Cannot open SearchResultsPage by itself!");
    }

}
