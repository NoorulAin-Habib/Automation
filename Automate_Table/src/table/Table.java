package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Table {

	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","E:\\NoorulAin\\Documents\\File\\QA Softwares\\geckodriver-v0.30.0-win64.\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Main handling
		//Create object on action class
		//Action building action(driver);
		
		WebElement admin = driver.findElement(By.xpath("//b[normalize-space()='Admin']"));
		new Actions(driver).moveToElement(admin).perform();
		
		WebElement userManagment = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.id("menu_admin_UserManagement")));
		
		new Actions(driver).moveToElement(userManagment).perform();
		
		WebElement users = new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.id("menu_admin_viewSystemUsers")));
		users.click();
		
		//Sorting
		
		//Rows Count 
		//columns count 
		//Cell count 
		//Get Cell values
		
		
		//Step 1 -------------> Find table 	
		WebElement table =driver.findElement(By.id("resultTable"));
		
		//Step 2 -------------> Locate Rows in table
		List<WebElement> table_Rows=table.findElements(By.tagName("tr"));
		
		//Step 3 -------------> count total number of rows
		int rows_Count=table_Rows.size();
		
		
		//Step 4 -------------> Looping rows
		for(int row=1;row<rows_Count;row++)
		{
			System.out.println("Total Numbers of rows are: "+ rows_Count);
			
			//Step 5 -------------> Count of column in row
			List<WebElement> row_columns=table_Rows.get(row).findElements(By.tagName("td"));
			
			//Step 6 -------------> Count column
			int column_Count=row_columns.size();
			
			for (int column=1;column<column_Count;column++)
			{
				//Step 7 -------------> Getting values of columns
				String columnText=row_columns.get(column).getText();
				System.out.println("Cell Value of the row number "+row+" and column number "+column + " "+columnText);
			}
		}
		
	
		
}
}
