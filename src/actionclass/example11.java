package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example11
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
		driver.findElement(By.xpath(" //button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		Thread.sleep(3000);
		
		               WebElement element = driver.findElement(By.xpath("//span[text()=\"Become a Seller\"]"));
		
		                   Actions act=new Actions(driver);
		                   
		                   act.click(element).perform();
		                   
		                   Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Enter 10 digit phone number here\"]")).sendKeys("9822570864");
		
		Thread.sleep(3000);
		
		         WebElement element1 = driver.findElement(By.xpath("//div[text()=\"Start Selling\"]"));
		
		Actions act1=new Actions(driver);
		
		act1.click(element1).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
