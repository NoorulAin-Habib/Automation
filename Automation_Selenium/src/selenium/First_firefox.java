package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class First_firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\NoorulAin\\Documents\\File\\QA Softwares\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Maximize screen 
		driver.manage().window().maximize();
		
		//Enter User name 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//Enter Password
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		
		//Click on Login Button
		driver.findElement(By.id("btnLogin")).click();
		
		// test case verification 
		
		String ExpectedResult="OrangeHRM";
		String ActualResult=driver.getTitle();
		
		if(ExpectedResult.equals(ActualResult))
				{
			          System.out.println("Test Case Passed");
				}
		else {
			System.out.println("Test case failed");
		}
		
	}

}
