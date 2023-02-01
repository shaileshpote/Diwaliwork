package popup;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2] ")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@type=\"password\"] ")).sendKeys("asdfgjnkd");
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]  " )).click();
		
		Thread.sleep(3000);
		
       driver.findElement(By.xpath(" //button[@class=\"_2KpZ6l _2doB4z\"]")).click();
       
    
             String text = driver.switchTo().alert().getText();
		
		       System.out.println(text);
		       
		       
		     driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		
		
		               Alert alt = driver.switchTo().alert();
		
		                        alt.accept();
		                        alt.dismiss();
		
		
		
	}

}
