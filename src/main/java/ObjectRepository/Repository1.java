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
	
	//Suggestion Class
	
	@FindBy(xpath = "//input[@id='autocomplete']")
	public static WebElement SuggestionClass;
	
	//Select from the Suggestion Class
	
	@FindBy(xpath = "//li/div[text()='India']")
	public static WebElement Select;
	
	//Select from the drop down
	
	@FindBy(xpath = "//select[@id='dropdown-class-example']")
	public static WebElement dropdown;
	
	//Select the Check box
	
    @FindBy(xpath = "//input[@id='checkBoxOption1']")
    public static WebElement checkbox;
    
    //Clicking to open a new Window
   
    @FindBy(xpath = "//button[@id='openwindow']")
    public static WebElement newWindow;
    
    //Clicking to open a new tab
    
    @FindBy(xpath = "//a[@id='opentab']")
    public static WebElement newtab;
    
    //Clicking on the Alert Button
    @FindBy(xpath = "//input[@id='alertbtn']")
    public static WebElement Alert;
    
    //Clicking on the COnfirm Button
    @FindBy(xpath = "//input[@id='confirmbtn']")
    public static WebElement ConfirmAlert;

}
