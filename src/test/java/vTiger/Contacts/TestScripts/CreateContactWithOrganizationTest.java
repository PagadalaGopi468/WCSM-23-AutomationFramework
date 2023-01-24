package vTiger.Contacts.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import vTiger.GenericUtilities.BaseClass;
import vTiger.GenericUtilities.ExcelFileUtility;
import vTiger.GenericUtilities.JavaUtility;
import vTiger.GenericUtilities.PropertyFileUtility;
import vTiger.GenericUtilities.WebDriverUtility;
import vTiger.ObjectRepository.ContactsInfoPage;
import vTiger.ObjectRepository.ContactsPage;
import vTiger.ObjectRepository.CreateNewContactsPage;
import vTiger.ObjectRepository.CreateNewOrganizationPage;
import vTiger.ObjectRepository.HomePage;
import vTiger.ObjectRepository.LoginPage;
import vTiger.ObjectRepository.OrganizationInfoPage;
import vTiger.ObjectRepository.OrganizationsPage;

@Listeners(vTiger.GenericUtilities.ListenersImplementationClass.class)
public class CreateContactWithOrganizationTest extends BaseClass{

	@Test(groups = "SmokeSuite")
	public void createContactWithOrgTest() throws IOException
	{
        //read the data
		String LASTNAME = eUtil.readDataFromExcel("Contacts", 7, 2);
		String ORGNAME = eUtil.readDataFromExcel("Contacts", 7, 3)+jUtil.getRandomNumber();
		
		//Step 5: Navigate to Organizations Link
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganizationLink();
		Reporter.log("--Organization Link Clicked--",true);
		
		//Step 6: Click on Organizations look up image
		OrganizationsPage op = new OrganizationsPage(driver);
		op.clickOnCreateOrgLookUpImg();
		Reporter.log("--Click on Organization look Up Image--");
		
		//Step 7: Create new organization and save
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		cnop.createNewOrganization(ORGNAME);
		Reporter.log("--Organization created--"+ORGNAME);
		
		//Step 8: Validate for Organization
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		String OrgHeader = oip.getOrganizationHeader();
		Assert.assertTrue(OrgHeader.contains(ORGNAME));
		
		//Step 9: Navigate to contacts link
		hp.clickOnContactsLink();
		Reporter.log("--Click on Contacts link--");
	
		//Step 10: Click on create contact look up image
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateContactLookUpImg();
		String expTtitle = "Administrator - Contacts - vtiger CRM 5 - Commercial Open Source CRM";
	    String actTitle = driver.getTitle();
	    System.out.println(actTitle);
	    Assert.assertEquals(actTitle, expTtitle);
	    Assert.fail();
	    Reporter.log("--Click on Contacts look up image--");
		
		//Step 11: Create new Contact
		CreateNewContactsPage cncp = new CreateNewContactsPage(driver);
		cncp.createNewContact(driver, LASTNAME, ORGNAME);
		Reporter.log("--Contact created--"+LASTNAME);
	
		//Step 12: Validate
		ContactsInfoPage cip = new ContactsInfoPage(driver);
		String ContactHeader = cip.getContactHeader();
		Assert.assertTrue(ContactHeader.contains(LASTNAME));

	}

	@Test(groups = {"SmokeSuite","RegressionSuite"})
	public void demoTest1() throws InterruptedException
	{
		System.out.println("test 1");
		Thread.sleep(1000);
		
	}
	
	@Test
	public void demoTest2() throws InterruptedException
	{
		System.out.println("test 2");
		Thread.sleep(1000);
		
	}
	
	@Test
	public void demoTest3() throws InterruptedException
	{
		System.out.println("test 3");
		Thread.sleep(1000);
		
	}
	
	
	@Test
	public void demoTest4() throws InterruptedException
	{
		System.out.println("test 4");
		Thread.sleep(1000);
		
	}
	
	
	
	
}
