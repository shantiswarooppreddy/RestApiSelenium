package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestInitialization;

public class Repository1 extends TestInitialization{
	
	public static void Repository()
	{
		TestInitialization.TestInitialization1();
		PageFactory.initElements(driver, new Repository1());
	}
	
	@FindBy(xpath = "//input[@name='q']")
	public static WebElement input;
	
	//Radio Buttons Checking 
	
	@FindBy(xpath = "//div[@id='radio-btn-example']//label[1]//input[1]")
	public static WebElement radiobutton;

}
