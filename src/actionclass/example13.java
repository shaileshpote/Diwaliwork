package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example13 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		                      WebElement search = driver.findElement(By.xpath("//input[@title=\"Search\"] "));
		
		                           Actions act=new Actions(driver);
		                           
		                           act.click(search).perform();
		                           
		                           
		                           
		                        String text = driver.switchTo().alert().getText();
		                        
		                        System.out.println(text);
		                           
		                       driver.switchTo().alert().accept();
		                       
		                           
		                          driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
