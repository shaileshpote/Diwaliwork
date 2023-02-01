package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example12 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		Thread.sleep(2000);
		
		         WebElement element = driver.findElement(By.xpath("(//div[@class=\"_10pg75\"])[1] "));
		
		                 Actions act=new Actions(driver);
		                 
		                 act.click(element).perform();
		                 
		               Thread.sleep(3000);
		
		     WebElement element1 = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]"));
		
		                Actions act1=new Actions(driver);
		                
		                act1.click(element1).perform();
		
		
		
		
		
		
		
		
		
		
	}

}
