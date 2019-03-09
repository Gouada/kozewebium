package testSteps.jeuneAfriqueTestSteps;

import static core.Constants.FIREFOX;

import java.util.Set;

import static core.Constants.CHROME;

import api.apps.google.pages.StartPage;
import api.apps.jeuneafique.pages.CountriesPages;
import core.TestDriver;
import core.Utils;
import core.constants.Pages;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ReadCountryArticleSteps {
	
private static Utils utils;
	
	@Before
	public void init()
	{
		TestDriver.startTestWith(FIREFOX);
		utils = new Utils(TestDriver.driver);
	}
	
	@Given("^I start jeuneAfrique$")
	public void i_start_jeuneAfrique() throws Throwable {
		//TestDriver.startTestWith(FIREFOX);
		TestDriver.navigate_to(Pages.Aceuil.getPageUrl());
		
		Set<String> windows = TestDriver.driver.getWindowHandles();

        for (String window : windows) {
        	TestDriver.driver.switchTo().window(window);
//            System.out.println(":::::::::::::"+windows.size()+"::::::::::::::::::");
//            System.out.println(String.format("..........................."
//            		+ ".#switchToWindow() : title=%s ; url=%s",
//            		TestDriver.driver.getTitle(),
//            		TestDriver.driver.getCurrentUrl()));
        } 
		
		StartPage.clickAgreeButton2();
		//assertTrue(TestDriver.driver.getTitle().contains(Pages.Aceuil.getPageTitle()));
	    //throw new PendingException();
	}
	
	@Then("^I clcick les pays$")
	public void i_click_les_pays() throws Throwable
	{
		StartPage.clickCountriesButon();
	}
	
	@Then("^I select a country$")
	public void i_select_a_country() throws Throwable
	{
		CountriesPages.selectACountry();
	}
//	@Then("^Then I select a topic$")
//	public void i_select_a_topic() throws Throwable
//	{
//		
//	}
	@Then("^I select an article$")
	public void i_select_an_article()
	{
		CountriesPages.clickCountryMainArticle();
	}
	
//	@After
//	public void finish()
//	{
//		 TestDriver.finishTest();
//	}
}
