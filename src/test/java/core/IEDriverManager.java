package core;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;

public class IEDriverManager extends WebBrowserDriverManager {

	@Override
	public void createWebDriver() {
		//Here path to driver
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		this.driver = new InternetExplorerDriver(options);
		this.driver.manage().window().maximize();
	}

}
