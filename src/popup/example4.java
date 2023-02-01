package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\java_workspace\\\\chromedriver_win32\\\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//input[@id=\"search\"] ")).click();
		
		driver.findElement(By.xpath("//input[@id=\"search\"] ")).sendKeys("bhau torsekar  ");
		
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"] ")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(" (// yt-formatted-string[@class=\"style-scope ytd-video-renderer\"])[48]")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
