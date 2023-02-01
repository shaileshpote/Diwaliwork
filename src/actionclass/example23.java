package actionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example23 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/ ");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//input[@class=\"gLFyf\"] ")).sendKeys("Flipkart ");
	
	Thread.sleep(2000);
		
		          List<WebElement> allelements = driver.findElements(By.xpath("(//ul[@class=\"G43f7e\"])[1]/li "));
		         
		          String expttext ="flipkart offers";
		         
		         for(WebElement s1 :allelements)
		         {
		        	String acttext = s1.getText();
		        	
		        	if(acttext.equals(expttext))
		        	{
		        		
		        		s1.click();
		        		
		        		break ;
		        	}
		        	 
		       
		        	
		         }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
