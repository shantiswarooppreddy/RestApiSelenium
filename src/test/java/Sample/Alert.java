package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.Repository1;
import TestBase.TestInitialization;

public class Alert extends TestInitialization {
	
	static Logger logger = LogManager.getLogger(Alert.class.getName());
	
	@Test
	void alert()
	{
		//Initializing the driver
		Repository1.Repository();
		logger.info("The user has open the required browser");
		
		//Getting the required Practice URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		logger.info("The user gets into the required practice page");
		
		//Clicking on the Alert
		Repository1.Alert.click();
		logger.info("This user has generated the Alert");
		
		//Handling the Alert
		driver.switchTo().alert().accept();
		logger.info("The user has handled the required Alert");
		
		//Clicking on the Confirmation Alert
		Repository1.ConfirmAlert.click();
		logger.info("The user generated the confirmation Alert");
		
		//Accepting the Confirmation Alert
		driver.switchTo().alert().accept();
		logger.info("The Alert has been accpeted");
		
		//Clicking on the Confirmation Alert again
		Repository1.ConfirmAlert.click();
		logger.info("The user has generated the confirmation Alert again");
		
		//Getting the text of the confirmation Alert
		Assert.assertTrue(driver.switchTo().alert().getText().equals("Hello , Are you sure you want to confirm?"));
		logger.info("The given text has been compared");
		
		//Dismissing the Alert
		driver.switchTo().alert().dismiss();
		logger.info("The Alert has been dismissed");
		
		//Quit the driver after execution
		driver.quit();
		logger.info("The user chose quit the driver");
		
	}

}
