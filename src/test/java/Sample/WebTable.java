package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.Repository1;
import TestBase.TestInitialization;

public class WebTable extends TestInitialization{
	
static Logger logger = LogManager.getLogger(WebTable.class.getName());
	
	@Test
	void webtable()
	{
		     //Initializing the driver
			Repository1.Repository();
			logger.info("The user has open the required browser");
				
			//Getting the required Practice URL
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			logger.info("The user gets into the required practice page");
			
			//Getting all the WebElements of the WebTable
			int i = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/td[1]")).size();
			
			for(int j = 2 ; j <= i + 1 ; j++)
			{
				if(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + j + "]/td[2]")).getText().
				equals("Write effective QA Resume that will turn to interview call"))
				{
					Assert.assertEquals("0",driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + j + "]/td[3]")).getText());
			        break;
				}
			}	
			logger.info("The rate of the course is compared accordingly");
				
			//Quit the driver after execution
			driver.quit();
			logger.info("The user chose quit the driver");
		
	}

}
