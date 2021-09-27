package Sample;

import org.testng.annotations.Test;

public class TestCase1 {
	
	
	@Test(invocationCount = 10)
	public void function1()
	{
		System.out.println("We are inside Test Case 1");
	}
	
	@Test(timeOut = 1000)
	public void function2() throws InterruptedException
	{
		System.out.println("Inside the second test");
		Thread.sleep(2000);
		System.out.println("Inside the second test still");
	}	
	
	@Test
	public void function3()
	{
		System.out.println("We are inside the third test");
	}

}