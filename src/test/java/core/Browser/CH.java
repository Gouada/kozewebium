package core.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CH extends Browser{

	private WebDriver driver = new ChromeDriver();
	
	public CH(WebDriver driver) {
		super(driver);
	}

}
