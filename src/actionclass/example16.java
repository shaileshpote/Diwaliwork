package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example16
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"] ")).click();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		      WebElement fashion = driver.findElement(By.xpath("//div[text()=\"Fashion\"] "));
		
		                Actions act=new Actions(driver);
		                
		                act.moveToElement(fashion).perform();
		                
		
		               
		                WebElement footwear = driver.findElement(By.xpath("//a[@title=\"Women's Footwear\"]"));
		                
		             Actions act1 =new Actions(driver);
		                
		             act1.moveToElement(footwear).perform();
		                
		              Thread.sleep(2000);
		              
		            act1.sendKeys(Keys.HOME).perform();
		              
		              for(int i=0 ;i<=6 ; i++)
		              {
		            	  act1.sendKeys(Keys.DOWN).perform();
		              }
		                
		              Thread.sleep(3000);
		              
		              act1.sendKeys(Keys.ENTER).perform();
		                
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
