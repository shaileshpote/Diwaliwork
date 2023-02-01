package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//div[@class=\"_2FYYw1 _2_OGP3 _2T1qz2\"]  ")).click();
		
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _1sbqEe _3dESVI\"] ")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
