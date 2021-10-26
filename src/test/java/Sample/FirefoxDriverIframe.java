package Sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import ObjectRepository.Repository;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverIframe  extends Repository {
	
	static Logger logger = LogManager.getLogger(FirefoxDriverIframe.class.getName());
	
	@Test 
	public void iframe() throws InterruptedException
	{
		    //Setting up fire fox driver
		    WebDriverManager.firefoxdriver().setup();
		    FirefoxDriver driver = new FirefoxDriver();
		    driver.get("https://demoqa.com/frames");
		    logger.info("The driver has been launched");
		    
		    
		    //Switching to the first iframe
		    driver.switchTo().frame(driver.findElement(Frame1));
		    logger.info("The text inside is " + driver.findElement(Text).getText());
		    
		    //Switching back to default Content
		    driver.switchTo().defaultContent();
		    logger.info("The user has switched to default content");
		    
		    
		    //Switching to the second frame
		    driver.switchTo().frame(driver.findElement(Frame2));
		    logger.info("The user switches to a Frame2");
		    
		    //Scrolling to the bottom extreme
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(document.body.scrollWidth,document.body.scrollHeight)");
		    logger.info("Scrolled to the bottom right");
		    logger.info("The text inside is " + driver.findElement(Text).getText());
		    
		    //Quit the Browser
		    Thread.sleep(5000);
		    driver.quit();
		    logger.info("The user should quit the browser");		    
		    
	}

}
