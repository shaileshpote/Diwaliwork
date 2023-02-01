package handlingofmulltimalelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		             int size = driver.findElements(By.xpath(" //a")).size();
		
		
		System.out.println(size);
		
		
		
		
		
		
		
		
		
		
	}

}
