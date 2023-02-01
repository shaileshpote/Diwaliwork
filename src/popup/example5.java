package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2] ")).sendKeys("9822570864 ");
		
		driver.findElement(By.xpath("//input[@type=\"password\"] ")).sendKeys("abcd ");
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"] ")).click(); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
