package vTiger.Practice;

import java.io.IOException;

import vTiger.GenericUtilities.ExcelFileUtility;
import vTiger.GenericUtilities.JavaUtility;
import vTiger.GenericUtilities.PropertyFileUtility;

public class GenericUtilityPractice {
	
	public static void main(String[] args) throws IOException {
		
		JavaUtility jUtil = new JavaUtility();
		int data=jUtil.getRandomNumber();
		System.out.println(data);
		
		String date = jUtil.getSystemDate();
		System.out.println(date);
		
		String d = jUtil.getSystemDateInFormat();
		System.out.println(d);
		
		PropertyFileUtility pUtil = new PropertyFileUtility();
		String value = pUtil.readDataFromPropertyFile("browser");
		System.out.println(value);
		System.out.println(pUtil.readDataFromPropertyFile("url"));
		
		ExcelFileUtility eUtil = new ExcelFileUtility();
		String value1 = eUtil.readDataFromExcel("Contacts", 4, 3);
		System.out.println(value1);
		
		eUtil.writeDataIntoExcel("Contacts", 4, 6, "Batman");
		System.out.println("data added");
		
		System.out.println(eUtil.getRowCount("Contacts"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
