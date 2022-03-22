package TestScripts;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import CommonFunctionsGreenKart.ValidationFunctions;
import ObjectRepository.RepositoryGreenKart;
import TestBase.TestInitialization;

public class TestCase1 extends TestInitialization{
	
	static Logger logger = LogManager.getLogger(TestCase1.class.getName());
	
	@Test
	public void discountVerification()
	{
		//Initializing the Browser
		TestInitialization.TestInitialization1();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		logger.info("The required Browser has been launched");
		
		//Navigating to the offers page
		driver.findElement(By.xpath(RepositoryGreenKart.topDeals)).click();
		logger.info("The user has clicked on the top deals page");
		
		//Getting all the window handles
		Set<String> windowHandles = driver.getWindowHandles();
		logger.info("The user gets the required window handles");
		
		//Getting the current window Handle
		String currentWindowHandle = driver.getWindowHandle();
		logger.info("The user gets the current window handle");
		
		
		//Switching to the required window handle
		for(String windowHandle: windowHandles)
			if(!windowHandle.equals(currentWindowHandle))
				driver.switchTo().window(windowHandle);
		logger.info("The user switches to the required window handle");
		
		//Searching for a particular item
		new ValidationFunctions().discountValidation("Beans", "38", "36");
		logger.info("This particular validation of price has been performed");
		
		//Quitting the driver
		driver.quit();
		logger.info("The user closes the driver");
		
	}

}
