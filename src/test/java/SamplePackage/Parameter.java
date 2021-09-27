package SamplePackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
		
	@Parameters("TestEnvironment")
	
	@Test
	void run(String TestEnvironment)
	{
		System.out.println("This is a sample " + TestEnvironment);
	}

}
