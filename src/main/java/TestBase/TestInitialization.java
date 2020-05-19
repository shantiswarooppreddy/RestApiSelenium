package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInitialization {
	
	public static WebDriver driver;
	
	public static void TestInitialization1()
	{
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver (2).exe");
		driver = new ChromeDriver();
	}

}
