package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecentPage extends AbstractPage {

    private static final String BASE_URL = "https://by.wildberries.ru/catalog/recent";

    @FindBy(xpath = "//span[@class='goods-name c-text-sm']")
    WebElement lastVisitedItemName;

    public RecentPage()
    {
        super();
    }

    @Override
    public RecentPage openPage()
    {
        driver.navigate().to(BASE_URL);
        logger.info("Opened page " + BASE_URL);
        return this;
    }

    public String getLastVisitedItemName() {
        return lastVisitedItemName.getText();
    }
}
