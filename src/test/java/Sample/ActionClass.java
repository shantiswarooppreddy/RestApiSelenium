package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRepository.Repository1;
import TestBase.TestInitialization;

public class ActionClass extends TestInitialization{
	
static Logger logger = LogManager.getLogger(ActionClass.class.getName());
	
	@Test
	void slider()
	{
		       //Initializing the driver
				Repository1.Repository();
				logger.info("The user has open the required browser");
				
				//Getting the required Practice URL
				driver.get("https://demoqa.com/slider");
				logger.info("Opening the required practice page in toolsqa");
				
				//Getting the window to be maximized
				driver.manage().window().maximize();
				logger.info("The window has been maximized");
				
				//Getting the required Position
				int initial = Repository1.Slider.getLocation().x;
				logger.info("Got the initial width");
				
				System.out.println(initial);
				
				//Declaring the Actions class
				Actions actionDriver = new Actions(driver);
				logger.info("Initializing the driver class");
				
				//Sliding to the required offset 
				actionDriver.clickAndHold(Repository1.Slider).moveByOffset(233, 0).release()
				.build()
				.perform();
				logger.info("Slided to the required position");
				
				//Quit the driver after execution
				driver.quit();
				logger.info("The user chose quit the driver");
						
	}
}
