package api.apps.factories;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import api.apps.interfaces.Page;
import core.TestDriver;

public class MyPageFactory<P> {
	

	//private static ;
	public void getPage(String pageURL)
	{
		//WebDriver driver = null;
		try
		{
			TestDriver.driver.get(pageURL);
		}
		catch(Exception e)
		{
			System.out.println("ERROR: While starting the page  " + e.getMessage());
		}
	}

}
