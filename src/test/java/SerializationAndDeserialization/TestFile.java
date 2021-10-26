package SerializationAndDeserialization;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestFile {
	
	@DataProvider(name = "name")
	public Object[][] name() throws IOException
	
	{
		String[][] obj = new String[10][2];
		FileReader fr = new FileReader(System.getProperty("user.dir") + "\\Test.txt");
		BufferedReader bw = new BufferedReader(fr);
		String line;
		line = bw.readLine();
		int i = 0;
		while(line != null)
		{
			obj[i][0] = line.split(" ")[0];
			obj[i][1] = line.split(" ")[1];
			System.out.println(obj[i][0] + " " + obj[i][1]);
			i++;
			System.out.println(line.split(" ")[0] + " " + line.split(" ")[1]);
			line = bw.readLine();
		}
				
		return (obj);
	}
	
	@Test(dataProvider = "name")
	public void run(String text1, String text2)
	{
		if(text2.equals("Password"))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
	}
	

}
