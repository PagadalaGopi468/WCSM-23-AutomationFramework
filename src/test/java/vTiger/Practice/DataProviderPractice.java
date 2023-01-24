package vTiger.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@Test(dataProvider = "Accessories")
	public void addProductToCartTest(String phone, int price, String model)
	{
		System.out.println(phone+" "+price+" "+model);
	}

	@DataProvider(name = "Phone")
	public Object[][] getData()
	{                                //row  columns
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Samsung";
		data[0][1] = 1200;
		data[0][2] = "A80";
		
		data[1][0] = "Iphone";
		data[1][1] = 1500;
		data[1][2] = "S13";
		
		return data;
	}
	
	@DataProvider(name = "Accessories")
	public Object[][] getData1()
	{                                //row  columns
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Samsung";
		data[0][1] = 1200;
		data[0][2] = "A80";
		
		data[1][0] = "Iphone";
		data[1][1] = 1500;
		data[1][2] = "S13";
		
		return data;
	}
	
}
