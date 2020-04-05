package Sample;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import ObjectRepository.Repository1;
import TestBase.TestInitialization;

public class SwitchTab extends TestInitialization {
	
	static Logger logger = LogManager.getLogger(DataProviderDemo.class.getName());
	
	@Test
	void switchTab()
	{
		        //Initializing the driver
				Repository1.Repository();
				logger.info("The user has open the required browser");
				
				//Getting the required Practice URL
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				logger.info("The user gets into the required practice page");
				driver.manage().window().maximize();
				
				//Clicking in the required Window button
				Repository1.newtab.click();
				logger.info("The user clicks on a new window");
				
				//Getting Window handles into a list
				Set<String> windowhandles = driver.getWindowHandles();
				logger.info("The user gets the required window handles");
				
				//Switching to the second window
				String newwindowhandle = null;
				String oldwindowhandle = driver.getWindowHandle();
				for(String windowhandle: windowhandles)
					if(!windowhandle.equals(driver.getWindowHandle()))
						newwindowhandle = windowhandle;
				driver.switchTo().window(newwindowhandle);
				driver.manage().window().maximize();
				logger.info("The user switches to the new window " + newwindowhandle);
				
				//Closing the window
				driver.close();
				logger.info("Closing the original window");
				
				//Switching back to the parent window
				driver.switchTo().window(oldwindowhandle);
				logger.info("Switching back to the original window " + oldwindowhandle);
				
				//Closing the driver
				driver.quit();
				logger.info("The driver has been quit");
				
	}

}
