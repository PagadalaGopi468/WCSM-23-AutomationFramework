package vTiger.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsPractice {
	
	@Test
	public void assertTest1()
	{
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		//Assert.assertEquals(false, true); // failed
		Assert.assertTrue(false);
		System.out.println("Step 4");
		System.out.println("Step 5");
		System.out.println("Step 6");
	}

	@Test
	public void assertTest2()
	{
		SoftAssert sa = new SoftAssert();
		
		System.out.println("Step 1");
	
		System.out.println("Step 2");
		
		sa.assertEquals(true, true); //pass soft
		
		System.out.println("Step 3");
		System.out.println("Step 4");
		
		sa.assertTrue(false);//fail soft
		
		System.out.println("Step 5");
		
		sa.assertEquals("A", "B");//fail soft
		
		Assert.assertTrue(false);//hard
		
		System.out.println("Step 6");
		
		
		sa.assertAll();//not executed
	}
}
