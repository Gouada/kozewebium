package api.apps.jeuneafique.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import api.apps.interfaces.Page;
import core.TestDriver;

public class CountriesPages extends Page{
	
	
	//private WebDriver driver = new ChromeDriver();
		private static WebDriver driver = TestDriver.driver;
		
		//variable declarations
	//private static By COUNTRIES_LIST_MOST = By.cssSelector("div.country-list-most:nth-child(1) > ul:nth-child(2)");
	private static By COUNTRIES_LIST_MOST = By.xpath("/html/body/section/nav/div/div[3]/div/div[1]/ul");
	
	private static By MAIN_ARTICLE 		  = By.cssSelector("//*[@id=\"main-lead-art\"]");
	
	public static void selectACountry()
	{
		driver.findElement(COUNTRIES_LIST_MOST).findElements(By.tagName("li")).get(2).click();
		
	}
	
	public static void clickCountryMainArticle()
	{
		driver.findElement(MAIN_ARTICLE).click();
	}

}
