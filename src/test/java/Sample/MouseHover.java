package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRepository.Repository1;
import TestBase.TestInitialization;

public class MouseHover extends TestInitialization{
	
static Logger logger = LogManager.getLogger(SuggestionClass.class.getName());
	
	@Test
	void frameSwitch() throws InterruptedException
	{
		
		        //Initializing the driver
				Repository1.Repository();
				logger.debug("The user has open the required browser");
				
				//Getting the required Practice URL
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				logger.debug("The user gets into the required practice page");
				
				//Maximizing the window
				driver.manage().window().maximize();
				logger.debug("The size of the window has been maximized");
				
				//Declaring Actions class
				Actions hoverAction = new Actions(driver);
				logger.debug("The actions class has been initialized");
				
				//Hover on the mouse
				hoverAction.moveToElement(Repository1.mouseHover).moveToElement(Repository1.Top).click().build().perform();
				logger.debug("The user has decided to go back to the top");
				
				//Quitting the Browser
				driver.quit();
				logger.debug("Quit the browser");
	}
	
}
