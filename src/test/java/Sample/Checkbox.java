package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.Repository1;
import TestBase.TestInitialization;

public class Checkbox extends TestInitialization {
	
	static Logger logger = LogManager.getLogger(Checkbox.class.getName());
	
	@Test
	void checkBox()
	{
		//Initializing the driver
		Repository1.Repository();
		logger.info("The user has open the required browser");
		
		//Getting the required Practice URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		logger.info("The user gets into the required practice page");
		
		//Selecting a particular check box
		Repository1.checkbox.click();
		logger.info("The user has clicked on the checkbox");
		
		//Verifying that a particular check box is checked or not
		Assert.assertTrue(Repository1.checkbox.isSelected());
		logger.info("The user has been selected");
		
		//Quit the driver after execution
		driver.quit();
		logger.info("The user chose quit the driver");
}
	}


