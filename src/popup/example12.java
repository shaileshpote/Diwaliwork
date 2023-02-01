package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example12
{
	public static void main(String[]args)
	{
	     System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
	     
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://zeenews.india.com/ ");
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     driver.findElement(By.xpath("//a[text()=\"English\"] ")).click();
	     
	                 Set<String> allids = driver.getWindowHandles();
	     
			            ArrayList<String> al=new ArrayList<String>(allids);
			            
			                    String childwoodid = al.get(1);
			
			                         driver.switchTo().window(childwoodid);
			
			driver.findElement(By.xpath("//a[text()=\"Sports\"] ")).click();
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
