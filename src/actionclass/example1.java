package actionclass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
		
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"] ")).click();
		
		Thread.sleep(2000);
		
		WebElement moreEle = driver.findElement(By.xpath("//div[text()=\"More\"] "));
		
		Thread.sleep(3000);

		Actions act=new Actions(driver);
		
		act.moveToElement(moreEle).perform();
		
		
		
		
		
		driver.findElement(By.xpath("//div[text()='Advertise'] ")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
