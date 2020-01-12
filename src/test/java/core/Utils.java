package core;

import static core.Constants.SCREEN_SHOT_FILE_TYPE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utils {
	
	private String filename; 
	private WebDriver driver;
	private Calendar calendar = Calendar.getInstance();
	private Actions actions;
	public Utils(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void scrollToElement(By locator)
	{
		//Actions action;
		 if(driver != null)
		 {
			 actions = new Actions(driver);
			 actions.moveToElement(driver.findElement(locator)).perform();
			  //MyLogger.logger.info(driver.get);
		 }
	}
	
	public void scrollToBottom()
	{
		//Actions action;
		 if(driver != null)
		 {
			 //MyLogger.logger.info("WindowHeight" + driver.manage().window().getSize().getHeight());
			 actions = new Actions(driver);
			 //action.moveByOffset(driver.manage().window().getSize().getWidth(), driver.manage().window().getSize().getHeight()).build().perform();
			 //action.moveByOffset(50, 400).perform();
			 actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		 }
		 else 	MyLogger.logger.info("Ups!!! driver was null");
	}
	
	public void scrollToTop()
	{
		//Actions actions;
		if(driver != null)
		{
			actions = new Actions(driver);
			actions.sendKeys(Keys.UP).perform();
			
		}
	}
	public void scrollRight()
	{
		//Actions action;
		 if(driver != null)
		 {
			 actions = new Actions(driver);
			 //action.moveByOffset(driver.manage().window().getSize().getWidth(), 0).perform();
			 actions.sendKeys(Keys.ARROW_RIGHT).perform();
		 }
	}
	
	public void scrollLeft()
	{
		//Actions action;
		 if(driver != null)
		 {
			 actions = new Actions(driver);
			 //action.moveByOffset(driver.manage().window().getSize().getWidth(), 0).perform();
			 actions.sendKeys(Keys.ARROW_LEFT).perform();
		 }
	}
	
	public void takeScreenhot(WebDriver driver, String testStep)
	{
		//filename = "ERROR_SCREENSHOT_"+Calendar.DAY_OF_MONTH+"_"+Calendar.MONTH+"-"+Calendar.HOUR+"_"+Calendar.MINUTE+"_"+Calendar.SECOND+ ".jpg";
		filename = "ERROR_SCREENSHOT_"+testStep+"_"+calendar.getTimeInMillis()+".jpg";
		MyLogger.logger.info("this is the filename"+ filename);
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		copyFile(screenShot, filename);
		filename="";
	}
	
	public void copyFile(File screenShot, String filename)
	{
		String destinationPath = "screenShots/"+filename;
		File destinationFile = new File (destinationPath);
		
		try {
			FileUtils.copyFile(screenShot, destinationFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickBackButton() throws IOException
	{
		actions = new Actions(driver);
		actions.keyDown(Keys.ALT).sendKeys(Keys.ARROW_LEFT).keyUp(Keys.ALT).perform();
	}
}
