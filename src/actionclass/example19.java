package actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example19
{
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" C:\\New folder\\listbox.html");
		
		       List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		for(  WebElement s1:checkbox)
		{
			s1.click();
			
			Thread.sleep(500);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
