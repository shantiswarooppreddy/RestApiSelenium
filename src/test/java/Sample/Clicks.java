package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRepository.Repository;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Clicks extends Repository{
	
	static Logger logger = LogManager.getLogger(Clicks.class.getName());
	
	@Test
	public void clicks() throws InterruptedException
	{
		        //Setting up the Browser
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				logger.info("Setting up the browser");
				
				//Setting up the Browser
				driver.get("https://demoqa.com/buttons");
				logger.info("The website is lauched");
				
				//Right Clicking the button
				Actions actionDriver = new Actions(driver);
				actionDriver.contextClick(driver.findElement(RightClick)).build().perform();
				logger.info("The user clicks right clicks");
				
				//Double Clicking the button
				actionDriver.doubleClick(driver.findElement(DoubleClick)).build().perform();
				logger.info("The user double clicks");
				
				//Quitting the driver
				Thread.sleep(5000);
				driver.quit();
				logger.info("The user quits the driver");
				
	}

}
