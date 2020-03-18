package TestBase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ExcelWrite {
	
	public static void excelWrite(String name, int i, int j) throws IOException
	{
		//Input FileStream Declaration
		FileInputStream Fin = new FileInputStream(System.getProperty("user.dir") + "//Test.xls");
		
		//Declaring a particular Excel Workbook
		HSSFWorkbook ExcelWbook = new HSSFWorkbook(Fin);
		
		//Declaring a particular Excel Sheet
		HSSFSheet Sheet = ExcelWbook.getSheet("Sample Sheet");
		
		//Declaring a particular row in an Excel Sheet
		HSSFRow Row = Sheet.getRow(i);
		
		//Declaring a particular cell in an Excel Sheet
		HSSFCell Cell = Row.getCell(j);
		
		//Setting the Cell Value to Something
		Cell.setCellValue(name);
		
		//Closing the input stream
		Fin.close();
		 
		//Writing back the value to the ExcelSheet
		FileOutputStream Fout = new FileOutputStream(System.getProperty("user.dir") + "//Test.xls");
		
		//Writing it back to the Excel Sheet
		ExcelWbook.write(Fout);
		
		Fout.close();
		
	}

}
