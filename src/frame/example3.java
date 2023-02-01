package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 
{
	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
		
		Thread.sleep(3000);
		
		

		
		
		
		
		driver.findElement(By.xpath(" //a[text()=\"New to Flipkart? Create an account\"] ")).click();
		
		
		
		
		
		
		
	}

}
