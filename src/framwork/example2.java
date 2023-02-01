package framwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 
{
public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException

{
	FileInputStream file=new FileInputStream("C:\\java_workspace\\New Microsoft Office Excel Worksheet (2).xlsx");
			 
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\java_workspace\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/ ");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.xpath("//span[text()=\"Hello, sign in\"]  ")).click();
	
	
	                   double number = sh.getRow(3).getCell(0).getNumericCellValue();
	
	 driver.findElement(By.xpath(" //input[@name=\"email\"]")).sendKeys(Keys.chord(number));
	                   
	              
	
	driver.findElement(By.xpath(" //span[@id=\"continue\"] ")).click();
	
	Thread.sleep(2000);
	
	          String passward = sh.getRow(3).getCell(1).getStringCellValue();
	
	driver.findElement(By.xpath(" //input[@name=\"password\"] ")).sendKeys(passward );
	
	driver.findElement(By.xpath("//input[@id=\"signInSubmit\"] ")).click();
	
	Thread.sleep(2000);
	
	           boolean result = driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"] ")).isDisplayed();
	
	if(result==true)
	{
		System.out.println(" logo is true....TS001 pass");
	}
	else
	{
		System.out.println("logo is not true...TS001 Fail");
	}
	
	
	
} 

}
