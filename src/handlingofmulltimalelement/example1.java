package handlingofmulltimalelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");	
	
	              WebDriver driver=new ChromeDriver();
		
	              driver.get("https://facebook.com/ ");
	              
	              Thread.sleep(3000);
	              
	            List<WebElement> allelement = driver.findElements(By.xpath("//a"));
		
		
		for(WebElement link:allelement)
		{
			System.out.println(link.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
