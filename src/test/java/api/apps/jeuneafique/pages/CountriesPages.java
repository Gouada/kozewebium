package api.apps.jeuneafique.pages;

import static core.Constants.FIREFOX;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import api.apps.factories.MyDriverFactory;
import api.apps.interfaces.Page;
import core.TestDriver;

public class CountriesPages extends Page{
	
	
	//private WebDriver driver = new ChromeDriver();
	//private static WebDriver driver = TestDriver.driver;
	private static WebDriver driver = MyDriverFactory.createDriver(FIREFOX).getWebDriver();

		//variable declarations
	//private static By COUNTRIES_LIST_MOST = By.cssSelector("div.country-list-most:nth-child(1) > ul:nth-child(2)");
	private static By COUNTRIES_LIST_MOST = By.xpath("/html/body/section/nav/div/div[3]/div/div[1]/ul");
	//private static By ARTICLES_A_LA_UNE_LIST = By.xpath("/html/body/div[3]/section/div/div/div/div[1]/section/div[1]");
	private static By COUNTRIES_LIST_LESS_VISTED = By.xpath("/html/body/section/nav/div/div[3]/div/div[2]/ul[1]");
	
	private static By MAIN_ARTICLE 		  = By.xpath("//*[@id=\"main-lead-art\"]");

	private static By ARTICLES_A_LA_UNE_LIST = By.className("main-articles");
	
	//*[@id="main-art-list"]
	
	public static void selectAMostVistedCountry()
	{
		Random rand = new Random();
		int countries_count = driver.findElements(COUNTRIES_LIST_MOST).size();
		int country_id = rand.nextInt(countries_count);
		driver.findElement(COUNTRIES_LIST_MOST).findElements(By.tagName("li")).get(country_id).click();	
	}
	
	public static void selectAcountryFromLessVisitedCountries()
	{
		Random rand = new Random();
		int less_visited_countries_count = driver.findElements(COUNTRIES_LIST_LESS_VISTED).size();
		int country_id = rand.nextInt(less_visited_countries_count);
		driver.findElement(COUNTRIES_LIST_LESS_VISTED).findElements(By.tagName("li")).get(country_id).click();
	}
	public static void clickCountryMainArticle()
	{
		driver.findElement(MAIN_ARTICLE).click();
	}
	
	public static void clickRandomArticleALaUne()
	{
	  int article_a_la_une_count = driver.findElement(ARTICLES_A_LA_UNE_LIST).findElements(By.tagName("article")).size();
	  Random rand = new Random();
	  int random_article_id = rand.nextInt(article_a_la_une_count);
	  WebElement rand_country = driver.findElement(ARTICLES_A_LA_UNE_LIST).findElements(By.tagName("article")).get(random_article_id);
	  rand_country.click();
	}

}
