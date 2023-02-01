package actionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example26 
{
	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/ ");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class=\"gLFyf\"] ")).sendKeys("flipkart.com ");
		
		            List<WebElement> allelements = driver.findElements(By.xpath("(//ul[@class=\"G43f7e\"])[1]/li "));
		            
		                     String exptext ="flipkart seller ";
		
		
		             for(    WebElement s1 : allelements)
		             {
		            	 
		            	   String acttext = s1.getText();
		            	   
		            	   if (acttext.equals(exptext));
		            	   {
		            		   s1.click();
		            		   
		            		   break;
		            		   
		            		   
		            	   }
		            	   
		             }
		            	 
		            	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
