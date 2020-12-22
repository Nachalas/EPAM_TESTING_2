package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.reporters.jq.Main;

public class MainPage extends AbstractPage
{

	private static final String BASE_URL = "https://by.wildberries.ru/";

	@FindBy(xpath = "//input[@class='sq c-text-md-v1']")
	private WebElement inputTab;

	@FindBy(xpath = "//span[@id='btnSrch']")
	private WebElement searchButton;

	public MainPage()
	{
		super();
	}

	public MainPage enterSearchQuery(String query) {
		inputTab.sendKeys(query);
		return this;
	}

	public SearchResultsPage clickSearchButton() {
		searchButton.click();
		return new SearchResultsPage();
	}

	@Override
	public MainPage openPage()
	{
		driver.navigate().to(BASE_URL);
		logger.info("Opened page " + BASE_URL);
		return this;
	}

}
