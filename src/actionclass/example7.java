package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example7 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html ");
		
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),\"Double-Click \")] "));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(element).perform();
		
		Thread.sleep(3000);
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
