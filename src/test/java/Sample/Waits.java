package Sample;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
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
		
		//Refreshing the browser
		driver.navigate().refresh();
	    logger.info("The user has refreshed the page");
		
	    
	    //Adding Fluent Wait
		@SuppressWarnings("deprecation")
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
				                           .pollingEvery((long)250, TimeUnit.MILLISECONDS)
				                           .withTimeout(6, TimeUnit.SECONDS);
		Function<WebDriver, WebElement> predicate = new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = null;
				if(Repository1.colorChange.getCssValue("color").equals("rgba(220, 53, 69, 1)"))
					element = Repository1.colorChange;
				System.out.println(Repository1.colorChange.getCssValue("color"));
				return element;
			}
		};
		fluentwait.until(predicate);
		logger.info("Adding Fluent Wait");
		
		//Quitting the Browser
		driver.quit();
		logger.info("The user has quit the browser");
	}

}
