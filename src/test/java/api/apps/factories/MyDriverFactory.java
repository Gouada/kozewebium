/*created by Gouada Dopavogui*/
package api.apps.factories;

import static core.Constants.CHROME;
import static core.Constants.FIREFOX;
import static core.Constants.IE;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

import core.ChromeDriverManager;
import core.FireFoxDriverManager;
import core.IEDriverManager;
import core.WebBrowserDriverManager;
import gherkin.deps.com.google.gson.JsonObject;

public class MyDriverFactory {
	
	public static WebBrowserDriverManager drivermanager;
	public static WebBrowserDriverManager createDriver(String browserType)
	{
		//WebDriver driver = null;
		if(browserType.equalsIgnoreCase(CHROME))
		{
		drivermanager = new ChromeDriverManager();
			//driver = drivermanager.getWebDriver();
		}
		if(browserType.equalsIgnoreCase(FIREFOX))
		{
			drivermanager = new FireFoxDriverManager();
			//driver = drivermanager.getWebDriver();
		}
		if(browserType.equalsIgnoreCase(IE))
		{
			drivermanager = new IEDriverManager();
			//driver = drivermanager.getWebDriver();
		}
		else 			
			drivermanager = new FireFoxDriverManager();

		return drivermanager;
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
