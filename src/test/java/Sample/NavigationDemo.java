package Sample;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import ObjectRepository.Repository1;
import TestBase.TestInitialization;
public class NavigationDemo extends TestInitialization{
	
	static Logger logger = LogManager.getLogger(NavigationDemo.class.getName());
	
	
	@Test 
	void Navigation()
	{
		//Initialization of driver
		Repository1.Repository();

		//Launching Google
		driver.get("https://www.google.com");
		logger.info("Chrome driver is launched");
		
		//Entering the Search word in a particular field
		Repository1.input.sendKeys("Abacus");
		logger.info("Searching with the word Abacus");
		
		//Refreshing the particular page
		driver.navigate().refresh();
		logger.info("Refreshed the page");
		
		//Navigating to a particular URL
		driver.navigate().to("https://wikipedia.com");
		logger.info("Navigated to wikipedia");
		
		//Navigate back 
		driver.navigate().back();
		logger.info("Naviagted back");
		
		//Navigate forward
		driver.navigate().forward();
		logger.info("Navigated forward");
		
		//Quitting the Browser
		driver.quit();
		logger.info("Quit the browser");
	}

}
