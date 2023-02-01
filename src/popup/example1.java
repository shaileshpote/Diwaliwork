package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
	public static void main(String[]args)
	
	{
	
	
	System.setProperty("webdriver.chrome.driver" , "C:\\\\java_workspace\\\\chromedriver_win32\\\\chromedriver.exe  ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.flipkart.com/" );
		
		
		driver.findElement(By.xpath("//input[@type=\"text\"] ")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@type=\"password\"] ")).sendKeys("123");
		
		driver.findElement(By.xpath(" (//button[@type=\"submit\"])[2]")).click();
		
		
		
		
		
		
		
		
		
	}

}
