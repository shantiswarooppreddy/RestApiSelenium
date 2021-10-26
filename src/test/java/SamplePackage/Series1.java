package SamplePackage;

import org.testng.annotations.Test;

public class Series1 {
	
	@Test
	void testa()
	{
		System.out.println("In Test A " + Thread.currentThread().getId());	
	}
	
	@Test
	void testb()
	{
		System.out.println("In Test B " + Thread.currentThread().getId());
	} 
	
	@Test
	void testc()
	{
		System.out.println("In Test C " + Thread.currentThread().getId());
	}

}
