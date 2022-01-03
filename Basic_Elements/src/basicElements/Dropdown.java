package basicElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","E:\\NoorulAin\\Documents\\File\\QA Softwares\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		Select obj =new Select(driver.findElement(By.id("dropdown")));
		
		obj.selectByVisibleText("Option 1");
		Thread.sleep(5000);
		
		obj.selectByIndex(2);
		Thread.sleep(5000);
		//obj.selectByValue(1);
		
		List <WebElement> dropdown=obj.getOptions();
		
		System.out.println("Total options are: "+dropdown.size());	
		
		//Print all option of dropdown
		
		for (int i=0;i<dropdown.size();i++)
		{
			System.out.println(dropdown.get(i).getAttribute("value"));
			System.out.println(dropdown.get(i).getText());
			
		}

	}

}
