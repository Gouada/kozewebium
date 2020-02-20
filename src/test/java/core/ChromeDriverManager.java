package core;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import core.helpers.PropertiesFilesLoader;

public class ChromeDriverManager extends WebBrowserDriverManager{

	@Override
	public void createWebDriver() {
		PropertiesFilesLoader.getInstance().loadPropertiesFile("environment.properties");
		String CHROME_DRIVER_LOCATION = PropertiesFilesLoader.getInstance().getPropertyByKey("CHROME_DRIVER_LOCATION");
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		this.driver = new ChromeDriver(options);
		this.driver.manage().window().maximize();
		//return (ChromeDriver) driver;
	}

}
