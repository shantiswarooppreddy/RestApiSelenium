package Sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	

	@BeforeSuite
	void beforesuite()
	{
		System.out.println("This should be executed before any suite");
	}
	@BeforeTest
	void beforetest()
	{
		System.out.println("This should be executed before any test");
	}
	
	@BeforeClass
	void beforeclass()
	{
		System.out.println("This should be executed before any class");
	}
	
	@BeforeMethod
	void beforemethod()
	{
		System.out.println("This should be executed before any method");
	}
	
	@Test
	void testa()
	{
		System.out.println("In Test A");	
	}
	
	@Test
	void testb()
	{
		System.out.println("In Test B");
	} 
	
	@Test
	void testc()
	{
		System.out.println("In Test C");
	}
	
	@AfterMethod
	void aftermethod()
	{
		System.out.println("This should be executed after any method");
	}
	
	@AfterClass
	void afterclass()
	{
		System.out.println("This should be executed after any class");
	}
	
	@AfterTest
	void aftertest()
	{
		System.out.println("This should be executed after any test");
	}
	
	@AfterSuite
	void aftersuite()
	{
		System.out.println("This should be executed after any suite");
	}

}
