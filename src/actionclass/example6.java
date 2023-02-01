package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example6 
{
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/ ");
		
	Thread.sleep(3000);
	
	 driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"] ")).click();
	 
	 Thread.sleep(3000);
	
	               WebElement element = driver.findElement(By.xpath("//span[text()=\"Become a Seller\"] "));
	
	                       Actions act=new Actions(driver);
	                       
	                       act.click(element).perform();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
