package actionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Durations;

public class example17 
{
	public static void main(String[]args) throws InterruptedException
	{
 System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/ ");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
          driver.findElement(By.xpath("//input[@title=\"Search\"] ")).sendKeys("flipkart.com");
         
          Thread.sleep(3000);
          
          List<WebElement> listbox = driver.findElements(By.xpath("(//ul[@role=\"listbox\"])[2] "));
           
		   for(   WebElement s1: listbox )
		   {
			  s1.click() ;
			  Thread.sleep(500);
			   
		   }
			  for(int i=listbox.size() ; i<=0; i++)
			  
			  {
				  listbox.get(i).click();
				  
				  Thread.sleep(500);
			  }
		
	}

}
