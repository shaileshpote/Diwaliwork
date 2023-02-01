package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example5 
{
	public static void main(String[]args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html ");
		
		   WebElement element = driver.findElement(By.xpath("\"//span[text()='right click me']"));
		
		
		 Actions act=new Actions(driver);
		 
		 act.contextClick(element).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
