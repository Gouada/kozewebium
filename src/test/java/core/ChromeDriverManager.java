package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class ChromeDriverManager extends WebBrowserDriverManager{

	@Override
	public void createWebDriver() {
		System.setProperty("webdriver.chrome.driver", "C:/MyWorkspace/SeleniumChromeDriver/new/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		this.driver = new ChromeDriver(options);
		this.driver.manage().window().maximize();
		//return (ChromeDriver) driver;
	}

}
