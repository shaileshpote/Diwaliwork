package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example10
{
public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/drag_drop.html ");
	
	driver.manage().window().maximize();
	
	        WebElement selement = driver.findElement(By.xpath("//li[@class=\"block13 ui-draggable\"] "));
	
	         WebElement delement = driver.findElement(By.xpath("//div[@id=\"shoppingCart4\"] "));
	
	          Actions act=new Actions(driver);
	          
	          act.dragAndDrop(selement, delement).perform();
	        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
