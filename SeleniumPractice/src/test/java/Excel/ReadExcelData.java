package Excel;


import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadExcelData {

	@Test
	public void readExcel() throws IOException
	{
		//FIS to locate the path of the excel sheet
		FileInputStream fis = new FileInputStream("C:\\Html\\Automatic_testing.xlsx");
		
		//Identify the workbook in the excel
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Selenium");//Selenium sheet
//		//workbook.getSheetAt(0);//selenium sheet
		int rows=sheet.getPhysicalNumberOfRows();//identify the no of records having the data
		System.out.println("Total no of records/rows in Selenium sheet is: "+rows);
//		
//		//Logic to find the no of columns
		int columns = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println("Total no of columns in Selenium sheet is: "+columns);
//		
//		//print a particular cell value
		XSSFCell cellValue= sheet.getRow(1).getCell(0);
		System.out.println(cellValue);
	}
}

