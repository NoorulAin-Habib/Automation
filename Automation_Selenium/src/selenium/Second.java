package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Second {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\NoorulAin\\Documents\\File\\QA Softwares\\geckodriver-v0.30.0-win64.\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("btnLogin")).click();
		
		String Expectedmessage="Password cannot be empty";
		String Actualmessage=driver.findElement(By.id("spanMessage")).getText();
		System.out.println(Actualmessage);
		
		if(Expectedmessage.equals(Actualmessage)) {
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("Test Case failed");
		}

	}

}
