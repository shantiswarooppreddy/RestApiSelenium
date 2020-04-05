package Sample;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Testparallel {
 
    //protected ThreadLocal<RemoteWebDriver> threadDriver = null;

  
    	public static void main(String[] args) throws MalformedURLException {
    		
    		DesiredCapabilities dc= new DesiredCapabilities();
    		dc.setBrowserName("chrome");
    		dc.setPlatform(Platform.WINDOWS);
    		//dc.se

    		//Webdriver driver=new ChromeDriver();
    		WebDriver driver= new RemoteWebDriver(new URL("http://localhost:8081/wd/hub"),dc);
    		driver.get("http://rediff.com");
 
   
	     }
    }