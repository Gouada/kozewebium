package core;

import org.openqa.selenium.WebDriver;

public abstract class WebBrowserDriverManager {
	
	protected static WebDriver driver;
	public abstract void createWebDriver();
	
	
	public WebDriver getWebDriver()
	{
		if(driver ==  null)
			createWebDriver();
		return driver;
	}
	
	public void quitWebDriver()
	{
		if(driver != null)
		{
			//driver.quit();
			driver.close();
		}
	}
}
