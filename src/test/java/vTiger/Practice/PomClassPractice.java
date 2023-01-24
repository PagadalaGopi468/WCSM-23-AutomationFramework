package vTiger.Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import vTiger.ObjectRepository.LoginPage;

public class PomClassPractice {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    driver.get("http://localhost:8888");
	    
	    LoginPage lp = new LoginPage(driver);
//	    lp.getUserNameEdt().sendKeys("admin");
//	    lp.getPasswordEdt().sendKeys("manager");
//	    lp.getSubmitBtn().click();
	    
	    lp.loginToApp("admin", "manager"); // optimsed code
		
	}

}
