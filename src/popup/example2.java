package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.flipkart.com/ ");
	
		
	 
	driver.findElement(By.xpath(" //input[@type=\"text\"]")).sendKeys( "9822570864" );
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@type=\"password\"] ")).sendKeys(" 1234");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//button[@type=\"submit\"] )[2] ")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
