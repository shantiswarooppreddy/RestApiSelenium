package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import ObjectRepository.Repository1;
import TestBase.TestInitialization;

public class SuggestionClass extends TestInitialization{
	
	static Logger logger = LogManager.getLogger(SuggestionClass.class.getName());
	
	@Test
	void suggestionClass() throws InterruptedException
	{
		//Initializing the driver
		Repository1.Repository();
		logger.info("The user has open the required browser");
		
		//Getting the required Practice URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		logger.info("The user gets into the required practice page");
		
		//Entering the Required field
		Repository1.SuggestionClass.sendKeys("Indi");
		logger.info("Entering in the suggestion class");
		
		//Selecting the required country
		Thread.sleep(2000);
		Repository1.Select.click();
		logger.info("The required item has been selected");
		
		//Quitting the driver
		Thread.sleep(5000);
		driver.quit();
		logger.info("The driver has been quit");
	}

}
