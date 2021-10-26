package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInitialization {
	
	public static WebDriver driver;
	
	public static void TestInitialization1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

}
