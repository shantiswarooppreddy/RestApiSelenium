package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.Repository1;
import TestBase.TestInitialization;

public class DropDown extends TestInitialization {
	
	static Logger logger = LogManager.getLogger(DropDown.class.getName());
	
	@Test
	void dropDown()
	{
		       //Initializing the driver
				Repository1.Repository();
				logger.info("The user has open the required browser");
				
				//Getting the required Practice URL
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				logger.info("The user gets into the required practice page");
				
				//Initializing the required Dropdown
				Select dropDown = new Select(Repository1.dropdown);
				logger.info("The dropdown has been initialized");
				
				//Selecting a particular option
				dropDown.selectByVisibleText("Option1");
				logger.info("The required dropdown has been selected");
				
				//Verifying that the required option has been selected
				Assert.assertTrue(dropDown.getAllSelectedOptions().get(0).getText().equals("Option1"));
				logger.info("Selection of the required dropdown has been asserted");
				
				//Quit the driver after execution
				driver.quit();
				logger.info("The user chose quit the driver");
	}

}
