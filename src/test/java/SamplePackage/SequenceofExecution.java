package SamplePackage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SequenceofExecution {
	
	@Test(priority = 0)
	void One()
	{
		System.out.println("We are inside one");
		Assert.assertFalse(false);
	}
	
	@Test(priority = 1)
	void Two()
	{
		System.out.println("We are inside two");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2, enabled = false)
	void Three()
	{
		System.out.println("We are inside three");
	}
	
	@Test(priority = 3)
	void Four()
	{
		System.out.println("We are inside Four");
		Assert.assertEquals("Four", "Four","This test fails");
		Reporter.log("This test passes");
	}

}
