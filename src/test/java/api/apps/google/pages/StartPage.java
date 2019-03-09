package api.apps.google.pages;

import static org.junit.Assert.assertTrue;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import api.apps.interfaces.Page;
import core.TestDriver;
import core.constants.Pages;

public class StartPage extends Page{
	
	//private WebDriver driver = new ChromeDriver();
	private static WebDriver driver = TestDriver.driver;

	private static By MENU_ACEUIL = By.xpath("//a[contains(@data-label, 'Aceuil')])");
	private static By MENU_POLITIQUE = By.xpath("//a[contains(@data-label, 'Politique')]");
	private static By MENU_ECONOMIE = By.xpath("//a[contains(@data-label, 'Économie')]");
	private static By MENU_SOCIETE = By.xpath("//a[contains(@data-label, 'Société')]");
	private static By MENU_SPORT = By.xpath("//a[contains(@data-label, 'Sport')]");
	
	private static By COUNTRIES = By.xpath("/html/body/section/header/div/div/a[1]");
	
	private static By FRAME = By.xpath("//*[@id=\"cmp-ui-iframe\"]"); ///#document/html/body/");
	
	private static By MAINAGREE = By.id("mainAgree");
	public static By ELEMENT_AT_BOTTOM = By.xpath("//*[@id=\"bottom\"]/div/div/section[5]/div[2]/div/a");
	/*public StartPage()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\MyWorkspace\\SeleniumFirefoxDriver\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		//options.setLegacy(true);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Pages.Aceuil.getPageUrl());
	}*/
	
	public static void clickMenuItem(String menuItem)
	{
		
		try {
			if(menuItem.equalsIgnoreCase("aceuil"))
				driver.findElement(MENU_POLITIQUE).click();
				//waitForPageToLoad("aceuil", driver)

			if(menuItem.equalsIgnoreCase("Politique"))
				driver.findElement(MENU_POLITIQUE).click();
			
			if(menuItem.equalsIgnoreCase("Économie"))
				driver.findElement(MENU_ECONOMIE).click();
			
			if(menuItem.equalsIgnoreCase("societe"))
				driver.findElement(MENU_SOCIETE).click();
			
			if(menuItem.equalsIgnoreCase("Sport"))
				driver.findElement(MENU_SPORT).click();
			
			Page.waitForPageToLoad(menuItem, driver);
			//if(menuItem.equalsIgnoreCase("politique"))
				//driver.findElement(MENU_POLITIQUE).click();
		}
		catch (Exception e)
		{
			System.out.println("......." + e.getMessage() + ".........................");
		}
			}
	
	public static void clickAgreeButton() throws InterruptedException
	{
		int i =0; 
		i = driver.findElements(By.tagName("iframe")).size();
		if(i > 0)
		{
			TestDriver.wait(5);
		//	driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(FRAME));
			TestDriver.wait(5);
		}
		//driver.switchTo().frame(1);
		if(driver.findElement(MAINAGREE).isDisplayed())
			driver.findElement(MAINAGREE).click();
		driver.switchTo().defaultContent();
	}
	
	public static void clickCountriesButon()
	{
		driver.findElement(COUNTRIES).click();
	}
	public void waitForPageToLoad(String pageTitle) {
		(new WebDriverWait(driver, 15)).until(ExpectedConditions.titleContains(pageTitle));
	}
	
	public void waitForPageToclose(String page) {
		//assertTrue(driver.getTitle().equalsIgnoreCase(Pages.Economie.getPageTitle()));
	}
	
	public static void clickAgreeButton2() throws InterruptedException
	{
	driver = TestDriver.driver;
	Set<String> windows = driver.getWindowHandles();
	
	int i =0; 
	i = driver.findElements(By.tagName("iframe")).size();
	if(i > 0)
	{
		TestDriver.wait(5);
	//	driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(FRAME));
		TestDriver.wait(5);
	}
	
//
//        for (String window : windows) {
//            driver.switchTo().window(window);
//            System.out.println(":::::::::::::"+windows.size()+"::::::::::::::::::");
//            System.out.println(String.format("............................#switchToWindow() : title=%s ; url=%s",
//                    driver.getTitle(),
//                    driver.getCurrentUrl()));
//        }
		if(driver.findElement(MAINAGREE).isDisplayed())
			driver.findElement(MAINAGREE).click();
		driver.switchTo().defaultContent();
	}
}
