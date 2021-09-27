package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReadWriteClass {
	
	//Function to return Complete Row Data
	public static String[] RowData(HSSFWorkbook WorkBook, String sheetName, int rowNumber)
	{
		HSSFSheet sheet = WorkBook.getSheet(sheetName);
		String rowData[] = new String[sheet.getRow(rowNumber - 1).getLastCellNum()];
		for(int i = 0; i < rowData.length; i++)
			rowData[i] = sheet.getRow(rowNumber - 1).getCell(i).getStringCellValue();	
		
		return rowData;
	}
	
	//Function to return Complete Cell Data
	public static String CellData(HSSFWorkbook WorkBook, String sheetName, int rowNumber, int columnNumber)
	{
		return WorkBook.getSheet(sheetName).getRow(rowNumber -1).getCell(columnNumber - 1).getStringCellValue();
	}
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream Fin = new FileInputStream(System.getProperty("user.dir") + "//Test.xls");
		HSSFWorkbook WorkBook = new HSSFWorkbook(Fin);
		
		System.out.println(RowData(WorkBook, "Sample Sheet", 1)[0]);
		
		System.out.println(CellData(WorkBook, "Sample Sheet", 1, 1));
	}

}
