package core.Browser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;

public class Browser {
	
	private WebDriver driver;
	
	public Browser(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void reSize(Dimension size)
	{
		driver.manage().window().setSize(size);
	}

	public void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public void close()
	{
		driver.close();
	}
	
	public void initializeBrowser()
	{
		maximize();
	}
	
}
