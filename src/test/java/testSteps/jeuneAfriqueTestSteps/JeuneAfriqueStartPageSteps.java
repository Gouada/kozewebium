package testSteps.jeuneAfriqueTestSteps;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.openqa.selenium.WebDriver;

import static core.Constants.CHROME;
import static core.Constants.FIREFOX;
import static core.Constants.IE;


//import javax.

import api.apps.factories.MyDriverFactory;
import api.apps.google.pages.PolitiquePage;
import api.apps.jeuneafique.pages.StartPage;
import core.MyLogger;
import core.TestDriver;
import core.Utils;
import core.constants.Pages;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JeuneAfriqueStartPageSteps {
	
	//private StartPage startPage;
	//private PolitiquePage politiquePage = new PolitiquePage();
	
	private static Utils utils;
	private static WebDriver driver;
	@Before
	public void init()
	{
		//TestDriver.startTestWith(FIREFOX);
		driver = MyDriverFactory.createDriver(CHROME).getWebDriver();
		//utils = new Utils(TestDriver.driver);
		utils = new Utils(driver);
	}
	
	
	@Given("^I am on the startpage$")
	public void i_am_on_the_startpage() throws Throwable {
		//init();
		//MyPageFactory.getPage("https://www.jeuneafrique.com/");
		//startPage = new StartPage();
		driver.get(Pages.Aceuil.getPageUrl());
		StartPage.clickAgreeButton();
		assertTrue(TestDriver.driver.getTitle().contains(Pages.Aceuil.getPageTitle()));
	    //throw new PendingException();
	}
	
	@When("^I click Menu Item Politque$")
	public void i_click_menu_item_politique () throws Throwable{
		StartPage.clickMenuItem("Politique");
		assertTrue(driver.getTitle().contains(Pages.Politique.getPageTitle()));
	}
	
	@Then("^I click Sport$")
	public void i_click_Sport() throws Throwable {
		StartPage.clickMenuItem("Sport");
		assertTrue(driver.getTitle().contains(Pages.Sport.getPageTitle()));
	}
	
	@Then("^I click Economie$")
	public void i_click_economie() throws Throwable
	{
		StartPage.clickMenuItem("Économie");
		assertTrue(driver.getTitle().contains(Pages.Economie.getPageTitle()));
	}
	@Then("^I scroll down to bottom$")
	public void i_scroll_down_to_bottom() throws Throwable{
		utils.scrollToBottom();
		//utils.scrollToElement(StartPage.ELEMENT_AT_BOTTOM);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//utils.takeScreenhot(TestDriver.driver, "i_scroll_down_to_bottom");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		utils.scrollToTop();
		//utils.takeScreenhot(TestDriver.driver, "i_scroll_down_to_bottom");	
	}
	@After
	public void finish()
	{
		 driver.quit();
	}
}