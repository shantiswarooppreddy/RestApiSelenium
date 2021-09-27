package SamplePackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider = "data")
	void run(String string1, String string2)
	{
		System.out.println("The first set of data is" + string1 +", " + string2);
	}
    
	@DataProvider(name = "data")
	public Object[][] data()
	{
		return new Object[][]{{"Group1","Test1"},{"Group2","Test2"}};
	}
	
	@Test (dependsOnMethods = {"run"})
	void next()
	{
		System.out.println("This is a sample run");
	}
}
