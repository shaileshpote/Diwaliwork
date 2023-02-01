package actionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example24 
{
	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(" //input[@class=\"gLFyf\"]")).sendKeys("flipkart ");
		
		Thread.sleep(2000);
		
		{
		             List<WebElement> allelement = driver.findElements(By.xpath("(//ul[@class=\"G43f7e\"])[1]/li"))  ;  
		             
		             
		             
		                   String exptext ="flipkart sale";
		                   
		
		               for(  WebElement s1: allelement )
		               {
		            	   
		            	     String acttext = s1.getText();
		            	     
		            	     if(acttext.equals(exptext))
		            	     {
		            	    	 s1.click();
		            	  	 
		            	     }
		               }
		                   
		             }
		                
		             Thread.sleep(2000);
		                
		          driver.findElement(By.xpath("//h3[text()=\"Flipkart Offers & Deals of the Day - Get Best Discounts on ...\"] ")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
