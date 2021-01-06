package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.Repository1;
import TestBase.TestInitialization;

public class HideShow extends TestInitialization{
	
	static Logger logger = LogManager.getLogger(WebTable.class.getName());
	
	@Test
	void hideshow()
	{
		//Initializing the driver
		Repository1.Repository();
		logger.info("The user has open the required browser");
			
		//Getting the required Practice URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		logger.info("The user gets into the required practice page");
		
		//Hiding the Button
		Repository1.HideButton.click();
		logger.info("The user hides the button");
		
		//Verify that the button is Hidden
		Assert.assertFalse(Repository1.displayBox.isDisplayed());
		logger.info("The user verifies that the button is Hidden");
		
		//Showing the Button
		Repository1.ShowButton.click();
		logger.info("The user shows the button");
		
		//Verify that the button is not Hidden
		Assert.assertTrue(Repository1.displayBox.isDisplayed());
		logger.info("The user verifies that the button is shown");
		
		//Quit the driver after execution
		driver.quit();
		logger.info("The user chose quit the driver");
		
	}

}
