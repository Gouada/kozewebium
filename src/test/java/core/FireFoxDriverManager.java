package core;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

public class FireFoxDriverManager extends WebBrowserDriverManager{

	@Override
	public void createWebDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\MyWorkspace\\SeleniumFirefoxDriver\\2.6\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		//options.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		//return (FirefoxDriver) driver;
	}

}
