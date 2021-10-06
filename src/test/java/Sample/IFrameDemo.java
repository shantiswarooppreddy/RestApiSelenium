package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ObjectRepository.Repository1;
import TestBase.TestInitialization;

public class IFrameDemo extends TestInitialization {
	
static Logger logger = LogManager.getLogger(SuggestionClass.class.getName());
	
	@Test
	void frameSwitch() throws InterruptedException
	{
		
		        //Initializing the driver
				Repository1.Repository();
				logger.info("The user has open the required browser");
				
				//Getting the required Practice URL
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				logger.info("The user gets into the required practice page");
				
				//Maximizing the window
				driver.manage().window().maximize();
				logger.info("The size of the window has been maximized");
				
				//Scrolling the element into view
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Repository1.iFrame);
				
				//Switching to the iframe
				driver.switchTo().frame(Repository1.iFrame);
				logger.info("The user has switched to the iFrame");
				
				//Clicking on Home inside the iframe
				Repository1.HomeElement.click();
				logger.info("Clicking the element inside the iFrame");
				
				//Switching back to the default iframe
				driver.switchTo().defaultContent();
				logger.info("The user switches back to the default content");
				
				//Quitting the driver
				driver.quit();
				logger.info("The driver has been quit");
										
	}

}
