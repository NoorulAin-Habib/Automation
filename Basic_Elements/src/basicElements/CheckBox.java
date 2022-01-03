package basicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","E:\\NoorulAin\\Documents\\File\\QA Softwares\\geckodriver-v0.30.0-win64\\geckodriver.exe" );
				
		//ctrl+shift+o
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
				
		WebElement checkbox=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[1]"));
				
		//WebElement chkb=driver.findElement(By.id("hobbies-checkbox-1"));
		System.out.println(checkbox.isDisplayed()); //ture
		System.out.println(checkbox.isEnabled());   //true
		System.out.println(checkbox.isSelected());  //false
		checkbox.click(); 
	    //System.out.println(chkb.getAttribute("1"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());
			}

		}
