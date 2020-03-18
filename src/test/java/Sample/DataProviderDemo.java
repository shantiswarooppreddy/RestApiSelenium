package Sample;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestBase.ExcelWrite;

public class DataProviderDemo {
	
	static Logger logger = LogManager.getLogger(DataProviderDemo.class.getName());
	
	//Function to setup some data
	
	@BeforeTest
	void EnterData() throws IOException
	{
		ExcelWrite.excelWrite("Sample11", 0, 0);
		ExcelWrite.excelWrite("Sample12", 0, 1);
		ExcelWrite.excelWrite("Sample21", 1, 0);
		ExcelWrite.excelWrite("Sample22", 1, 1); 
		logger.info("The data is entered into the excel sheet");
		
	}
	
	//Function to setup the required data
	
	@Test(dataProvider = "data")
	void run(String string1, String string2)
	{
		System.out.println(string1 + " " + string2);
		logger.info("Printing the set of Data");
	}
	
	@DataProvider(name = "data")
	public Object[][] data1() throws IOException
	{
		FileInputStream Fin = new FileInputStream(System.getProperty("user.dir") + "//Test.xls");
		HSSFWorkbook WorkBook = new HSSFWorkbook(Fin);
		String[][] Obj = new String[WorkBook.getSheet("Sample Sheet").getLastRowNum() + 1][];
		for(int i = 0; i <= WorkBook.getSheet("Sample Sheet").getLastRowNum(); i++)
		{	
			Obj[i] = new String[WorkBook.getSheet("Sample Sheet").getRow(i).getLastCellNum()];
			for(int j = 0; j < WorkBook.getSheet("Sample Sheet").getRow(i).getLastCellNum(); j++)
	            Obj[i][j] = WorkBook.getSheet("Sample Sheet").getRow(i).getCell(j).getStringCellValue();
		}
		
		return (Obj);
		
	}
		
	

}
