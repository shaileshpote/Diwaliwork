package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example2 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"] ")).click();
		
		
		          WebElement More = driver.findElement(By.xpath("//div[text()=\"More\"]"));
		
		    Actions act=new Actions(driver);
		    
		    act.moveToElement(More).perform();
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//svg[@class=\"zZ3yfL\"] ")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
