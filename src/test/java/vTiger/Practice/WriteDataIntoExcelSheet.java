package vTiger.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelSheet {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Step 1: Load the File Into file Input Stream - Java readable format
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");

		// Step 2: Create a WorkBook
		Workbook wb = WorkbookFactory.create(fis);

		// Step 3: Navigate to the required sheet
		Sheet sh = wb.getSheet("Contacts");

		// Step 4: Navigate to the required row
		Row rw = sh.getRow(4);

		// Step 5: Navigate to the required Cell
		Cell ce = rw.createCell(6);

		// Step 6: Capture the data present inside the cell
		ce.setCellValue("Qspiders");
		
		//Step 7: Write into the file using File OutPut stream
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		wb.write(fos);
		
		System.out.println("data is added");

		
	}

}
