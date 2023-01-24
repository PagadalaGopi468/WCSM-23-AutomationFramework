package vTiger.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyserPractice {
	
	@Test(retryAnalyzer = vTiger.GenericUtilities.RetryAnalyserImplementation.class)
	public void retryATest()
	{
		
		System.out.println("Executed");
		Assert.fail();
	}
	
	@Test
	public void retryATest1()
	{
		System.out.println("Executed 1");
	}

}
