package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe  " );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst ");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath(" //button[contains(text(),\"Click me to\")]")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id=\"menuButton\"] ")).click();
		
		
		
		
		
		
		
	}

}
