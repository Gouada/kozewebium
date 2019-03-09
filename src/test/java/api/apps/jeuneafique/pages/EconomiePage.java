package api.apps.jeuneafique.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import api.apps.interfaces.Page;
import core.TestDriver;

public class EconomiePage extends Page{

	private static WebDriver driver = TestDriver.driver;

	// Page-Element identificators variable declarations
	private static By ELEMENT_1 = By.xpath("xpathExpression");
	private static By ELEMENT_2 = By.id("id");
	private static By ELEMENT_3 = By.cssSelector("cssSelector");
	private static By ELEMENT_4 = By.name("name");
	
	
	
	
	//Page-Elements click-Actions methodes implementations
	public void clickElement1()
	{
		//if
		driver.findElement(ELEMENT_1).click();
	}

}
