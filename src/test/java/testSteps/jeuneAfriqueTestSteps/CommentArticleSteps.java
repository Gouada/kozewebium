package testSteps.jeuneAfriqueTestSteps;

import core.Constants;
import org.openqa.selenium.WebDriver;

import api.apps.factories.MyDriverFactory;
import core.TestDriver;
import core.Utils;
import core.constants.Pages;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class CommentArticleSteps {
	
private static Utils utils;
private static WebDriver driver;
	
	@Before
	public void init()
	{
		//TestDriver.startTestWith(FIREFOX);
		//utils = new Utils(TestDriver.driver);
		driver = MyDriverFactory.createDriver(Constants.CHROME).getWebDriver();
		utils = new Utils(driver);
	}
	
	@Then("^I go to politique page$")
	public void i_go_to_politique_page() throws Throwable
	{
		driver.get(Pages.Politique.getPageUrl());
	}
	
	@Then("^I select an article$")
	public void i_select_an_article () throws Throwable
	{
		
	}
}
