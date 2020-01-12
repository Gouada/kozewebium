package api.apps.jeuneafique.pages;

import api.apps.factories.MyDriverFactory;
import static core.Constants.FIREFOX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class PolitiquePage {
	private static WebDriver diver = MyDriverFactory.createDriver(FIREFOX).getWebDriver();
	
	private static By Element1 = By.xpath("xpathExpression");
	private static By element2 = By.id("id");

}
