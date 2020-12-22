package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends AbstractPage {

    private final By byProductNamesLocator = By.xpath("//span[@class='goods-name c-text-sm']");

    @FindBy (xpath = "//span[@class='goods-name c-text-sm']")
    List<WebElement> productNamesList;

    public List<String> getListOfProductNames() {
        driverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(byProductNamesLocator));
        List<String> productNameList = new ArrayList<>();
        for(WebElement textElement : productNamesList) {
            productNameList.add(textElement.getText());
        }
        return productNameList;
    }

    public SearchResultsPage() {
        super();
        logger.info("Opened search results page " + driver.getCurrentUrl());
    }

    @Override
    protected SearchResultsPage openPage() {
        logger.error("Cannot open SearchResultsPage by itself! Throwing exception");
        throw new RuntimeException("Cannot open SearchResultsPage by itself!");
    }


}
