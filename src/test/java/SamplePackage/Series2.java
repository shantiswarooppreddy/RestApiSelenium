package SamplePackage;

import org.testng.annotations.Test;

public class Series2 {
	
	@Test
	void testa()
	{
		System.out.println("In Test A 2 " + Thread.currentThread().getId());	
	}
	
	@Test
	void testb()
	{
		System.out.println("In Test B 2 " + Thread.currentThread().getId());
	} 
	
	@Test
	void testc()
	{
		System.out.println("In Test C 2 " + Thread.currentThread().getId());
	}

}
