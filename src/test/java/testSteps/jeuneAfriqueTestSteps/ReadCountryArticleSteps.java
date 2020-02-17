package testSteps.jeuneAfriqueTestSteps;

import static core.Constants.FIREFOX;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.DriverFactory;

import static core.Constants.CHROME;

import api.apps.factories.MyDriverFactory;
import api.apps.jeuneafique.pages.CountriesPages;
import api.apps.jeuneafique.pages.StartPage;
import core.TestDriver;
import core.Utils;
import core.constants.Pages;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ReadCountryArticleSteps {
	
private static Utils utils;
private static WebDriver driver;
	
	@Before
	public void init()
	{
		//TestDriver.startTestWith(FIREFOX);
		//utils = new Utils(TestDriver.driver);
		driver = MyDriverFactory.createDriver(FIREFOX).getWebDriver();
		utils = new Utils(driver);
	}
	
	@Given("^I start jeuneAfrique$")
	public void i_start_jeuneAfrique() throws Throwable {
		//TestDriver.startTestWith(FIREFOX);
		driver.navigate().to(Pages.Aceuil.getPageUrl());
		
		//Set<String> windows = TestDriver.driver.getWindowHandles();

       /* for (String window : windows) {
        	driver.switchTo().window(window);
        } 	
		StartPage.clickAgreeButton2();
		*/
		//assertTrue(TestDriver.driver.getTitle().contains(Pages.Aceuil.getPageTitle()));
	    //throw new PendingException();
		assertTrue(driver.getTitle().equalsIgnoreCase(Pages.Aceuil.getPageTitle()));
	}
	
	@Then("^I clcick les pays$")
	public void i_click_les_pays() throws Throwable
	{
		StartPage.clickCountriesButon();
		//assertTrue(driver.getTitle().equalsIgnoreCase(Pages..getPageTitle()));
	}
	
	@Then("^I select a from most visited countries$")
	public void i_select_a_from_most_visited_countries() throws Throwable
	{
		CountriesPages.selectAMostVistedCountry();
	}
//	@Then("^Then I select a topic$")
//	public void i_select_a_topic() throws Throwable
//	{
//	
	@Then ("^I click country main article$")
	public void i_click_country_main_article() throws Throwable
	{
		CountriesPages.clickCountryMainArticle();
	}
	
	@Then("^I go back to country page$")
	public void i_go_back_to_country_page() throws Throwable
	{
		driver.navigate().back();
		//utils.clickBackButton();
	}
//	}
	@Then("^I select an article a la une$") 
	public void i_select_an_article() throws Throwable
	{
		CountriesPages.clickRandomArticleALaUne();
	}
	
//	@After
//	public void finish()
//	{
//		 TestDriver.finishTest();
//	}
}
