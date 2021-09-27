package SamplePackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoListeners {
	
	@Test
	void TestA ()
	{
		System.out.println("We are inside TestA");
	}
	
	@Test
	void TestB ()
	{
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"TestB"})
	void TestC ()
	{
		Assert.assertTrue(true);
	}

}
