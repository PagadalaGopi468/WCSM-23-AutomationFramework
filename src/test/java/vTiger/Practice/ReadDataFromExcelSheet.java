package vTiger.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet {
	
	public static void main(String[] args) throws IOException {
		
		//Step 1: Load the File Into file Input Stream - Java readable format
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		//Step 2: Create a WorkBook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step 3: Navigate to the required sheet
		Sheet sh = wb.getSheet("Organizations");
		
		//Step 4: Navigate to the required row
		Row rw = sh.getRow(4);
		
		//Step 5: Navigate to the required Cell
		Cell ce = rw.getCell(3);
		Cell ce1 = rw.getCell(2);
		
		//Step 6: Capture the data present inside the cell
		String value = ce.getStringCellValue();
		System.out.println(value);
		System.out.println(ce1.getStringCellValue());
		
		
	}

}
