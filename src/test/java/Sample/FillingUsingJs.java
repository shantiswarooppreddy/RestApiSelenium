package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import Listeners.WebDriverEvents;
import ObjectRepository.Repository;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FillingUsingJs extends Repository{
	
	static Logger logger = LogManager.getLogger(FillingUsingJs.class.getName());
	
	@Test
	public void formFill() throws InterruptedException
	{
		//Setting up the Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger.info("Setting up the browser");
		
		//Setting up EventFiring web driver and listening to it
		EventFiringWebDriver eventRecoder = new EventFiringWebDriver(driver);
		WebDriverEvents listener = new WebDriverEvents();
		eventRecoder.register(listener);
		logger.info("Event webdriver browser has been setup");
	    
		//Initializing the Java script Executor
		eventRecoder.get("https://demoqa.com/automation-practice-form");
		logger.info("The required browser is launched");
		
		//Initializing Java Script Executor
		JavascriptExecutor js = (JavascriptExecutor) eventRecoder;
		logger.info("The Java Script executor has been initialized");
		
		//Enter the value using Java script Executor
		js.executeScript("arguments[0].value = 'FirstName'", driver.findElement(FirstName));
		logger.info("Entered the FirstName");
		
		//Enter the value using Java script Executor
		js.executeScript("arguments[0].value = 'LastName'", driver.findElement(LastName));
		logger.info("Entered the LastName");
		
		//Adding a Alert
		js.executeScript("alert('This is a sample Alert')");
		Thread.sleep(5000);
		logger.info("The Alert has been added");
		
		//Enter the value in the Email ID field
		js.executeScript("arguments[0].value = 'shanti.s.reddy@gmail.com'", driver.findElement(userEmail));
		logger.info("Entered the Email");
		
		//Quitting the Browser
		eventRecoder.quit();
		logger.info("The user quits the driver");
		
	}

}

