package Sample;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.Repository1;
import TestBase.TestInitialization;

public class Waits extends TestInitialization{
	
	static Logger logger = LogManager.getLogger(Waits.class.getName());
	
	@Test
	public void waitFunction()
	{
		//Initializing the driver
		Repository1.Repository();
		logger.info("The user has open the required browser");
		
		//Getting the required Practice URL
		driver.get("https://demoqa.com/dynamic-properties");
		logger.info("Opening the required practice page in toolsqa");
		
		//Getting the window to be maximized
		driver.manage().window().maximize();
		logger.info("The window has been maximized");
		
		//Waiting for six seconds
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(Repository1.enableAfter));
		logger.info("The explicit wait has been declared");
		
		//Verifying that the element is enabled
		Assert.assertTrue(Repository1.enableAfter.isEnabled());
		logger.info("The button is now enabled");
		
		//Refreshing the browser
		driver.navigate().refresh();
		logger.info("The user has refreshed the page");
		
		//Waiting until the color changes	
		wait.until(ExpectedConditions.visibilityOf(Repository1.visibleAfter));
		logger.info("The wait extends till there is visibility");
		
		//Verifying the color changes
		Assert.assertTrue(Repository1.visibleAfter.isDisplayed());
		logger.info("Verified that the element is visible");
	}

}
