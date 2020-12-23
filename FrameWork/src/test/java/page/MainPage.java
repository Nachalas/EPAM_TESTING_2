package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.reporters.jq.Main;

public class MainPage extends AbstractPage
{

	private static final String BASE_URL = "https://by.wildberries.ru/";

	@FindBy(xpath = "//input[@class='sq c-text-md-v1']")
	private WebElement inputTab;

	@FindBy(xpath = "//span[@id='btnSrch']")
	private WebElement searchButton;

	@FindBy(xpath = "//button[@class='c-btn-burger header-btn-inner j-menu-burger']")
	private WebElement navBarButton;

	@FindBy(xpath = "//li[@class='item item-delivery']")
	private WebElement freeDeliveryButton;

	private static final By byNavBarMenuBookButton = By.xpath("//li[@data-menu-id='519']/a");

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

	public MainPage clickOnNavBarButton(){
		this.navBarButton.click();
		return this;
	}

	public FreeDeliveryPage clickOnFreeDeliveryButton(){
		this.freeDeliveryButton.click();
		return new FreeDeliveryPage();
	}

	public String getNavBarMenuBookButton(){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return driverWait.until(ExpectedConditions
				.presenceOfElementLocated(byNavBarMenuBookButton)).getText();
	}

	public PostClickNavBarPage clickOnNavBarMenuBookButton(){
		driverWait.until(ExpectedConditions
				.presenceOfElementLocated(byNavBarMenuBookButton)).click();
		return new PostClickNavBarPage();
	}



	@Override
	public MainPage openPage()
	{
		driver.navigate().to(BASE_URL);
		logger.info("Opened page " + BASE_URL);
		return this;
	}

}
