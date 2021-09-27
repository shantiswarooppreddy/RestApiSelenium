package SamplePackage;

import org.testng.annotations.Test;

public class GroupDemo {
	
	@Test(groups = {"Testgroup1"})
	void TestA()
	{
		System.out.println("Inside test A");
	}
	
	@Test(groups = {"Testgroup2"})
	void TestB()
	{
		System.out.println("Inside test B");
	}
	
	@Test(groups = {"Testgroup1","Testgroup2"})
	void TestC()
	{
		System.out.println("Inside test C");
	}

}
