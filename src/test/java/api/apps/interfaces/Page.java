package api.apps.interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	
	//private WebDriver driver; 
	public static void waitForPageToLoad(String pageTitle, WebDriver driver) {
		(new WebDriverWait(driver, 15)).until(ExpectedConditions.titleContains(pageTitle));
	}
	
	public void waitForPageToclose() {
	}

}
