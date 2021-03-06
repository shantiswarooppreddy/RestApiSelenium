package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import ObjectRepository.Repository1;
import TestBase.TestInitialization;

public class RadioButton extends TestInitialization{
	
	static Logger logger = LogManager.getLogger(RadioButton.class.getName());
	
	@Test
	void radioButton()
	{
		//Initializing the driver
		Repository1.Repository();
		logger.info("The user has open the required browser");
		
		//Getting the required Practice URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		logger.info("The user gets into the required practice page");
		
		//Clicking the required radio button
		Repository1.radiobutton.click();
		logger.info("The user has clicked the required radio button");
		
		//Verifying that the required radio button has been clicked
		Assert.assertTrue(Repository1.radiobutton.isSelected());
		logger.info("Verifying that the required radio button has been selected");
		
		//Quitting the driver
		driver.quit();
		logger.info("The driver has been quit");
	}

}
