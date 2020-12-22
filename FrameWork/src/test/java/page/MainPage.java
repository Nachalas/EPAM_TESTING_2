package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage
{

	private static final String BASE_URL = "";

	public MainPage()
	{
		super();
	}

	@Override
	public MainPage openPage()
	{
		driver.navigate().to(BASE_URL);
		logger.info("Opened page " + BASE_URL);
		return this;
	}

}
