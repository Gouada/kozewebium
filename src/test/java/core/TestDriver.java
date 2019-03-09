package core;

import org.apache.log4j.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.CapabilityType;

import static core.Constants.CHROME;
import static core.Constants.FIREFOX;
import static core.Constants.IE;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.deps.com.google.gson.JsonObject;

public class TestDriver {
	public static WebDriver driver;
	public static String browserType;
	
	public static String getBrowserType() {
		return browserType;
	}

	public static void setBrowserType(String browserType) {
		TestDriver.browserType = browserType;
	}
	
	public static void startTestWith(String browser)
	{
		MyLogger.logger.setLevel(Level.DEBUG);
		if(browser.equalsIgnoreCase(CHROME))
		{
			startTestWithChromeDriver();
		}
		else if(browser.equalsIgnoreCase(FIREFOX))
		{
			startTestWithFirefox();
		}
	}
	
	public static void finishTest()
	{
		if(driver != null)
		{
			driver.close();
			driver.quit();
		}
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}
	
	public static void wait(int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
	
	public static ChromeDriver startTestWithChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:/MyWorkspace/SeleniumChromeDriver/1/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		return (ChromeDriver) driver;
	}
	
	public static FirefoxDriver startTestWithFirefox()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\MyWorkspace\\SeleniumFirefoxDriver\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		return (FirefoxDriver) driver;
	}
	
	public static void getPage(String pageUrl)
	{
		driver.get(pageUrl);
	}
	
	public static void navigate_to(String pageUrl)
	{
		driver.navigate().to(pageUrl);
	}
	public static void setProxy(String proxyServer, String port, String browser) throws IOException
	{
		if(browser.equalsIgnoreCase(CHROME))
		{
			Proxy proxy = new Proxy();
			//proxy.setProxyAutoconfigUrl("proxyAutoconfigUrl");
			proxy.setHttpProxy(proxyServer);
			//proxy.setSslProxy("sslProxy[proxyServer]");
			//proxy.setFtpProxy("ftpProxy[proxyServer]");
		}
		else if(browser.equalsIgnoreCase(FIREFOX))
		{
			JsonObject proxy = new JsonObject();
			proxy.addProperty("proxyType", "MANUAL");
			proxy.addProperty("httpProxy", proxyServer);
			proxy.addProperty("httpProxyPort", port);
			proxy.addProperty("sslProxy", proxyServer);
			proxy.addProperty("sslProxyPort", port);

			FirefoxOptions cap = new FirefoxOptions();
			cap.setCapability("proxy", proxy);

			GeckoDriverService service =new GeckoDriverService.Builder()
			  .usingDriverExecutable(new File("path to geckodriver"))
			  .usingAnyFreePort()
			  .usingAnyFreePort()
			  .build();
			service.start();
		}
	}
}
