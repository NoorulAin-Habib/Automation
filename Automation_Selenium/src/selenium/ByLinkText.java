package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByLinkText {

	public static void main(String[] args) {
       System.setProperty("webdriver.gecko.driver","E:\\NoorulAin\\Documents\\File\\QA Softwares\\geckodriver-v0.30.0-win64.\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		WebElement linktext= driver.findElement(By.linkText("Forgot your password?"));
		
		System.out.println(linktext.getText());
		
		linktext.click();
		
	}

}
