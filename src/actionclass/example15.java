package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example15 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/ ");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.xpath("//a[text()='Create New Account'] ")).click();
		
		               Thread.sleep(2000);
		
		      WebElement month = driver.findElement(By.xpath("//select[@id=\\\"month\\\"] "));
		      
		                 Actions act=new Actions(driver);
		                 
		                 act.click(month).perform();
		                 
		                 Thread.sleep(2000);
		                 
		                 act.sendKeys(Keys.END).perform();
		                 
		                 Thread.sleep(2000);
		                 
		                   for(int i=1 ; i<=4 ; i++)
		                   {
		                	   act.sendKeys(Keys.UP).perform();
		                   }
		
		                   act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
