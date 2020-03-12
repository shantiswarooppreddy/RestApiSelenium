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
	
	@FindBy(xpath = "//div[@id='radio-btn-example']//label[2]//input[1]")
	public static WebElement radiobutton;
	
	@FindBy(xpath = "//input[@id='autocomplete']")
	public static WebElement SuggestionClass;
	
	@FindBy(xpath = "//li/div[text()='India']")
	public static WebElement Select;
	
	@FindBy(xpath = "//select[@id='dropdown-class-example']")
	public static WebElement dropdown;

}
