package revesion_packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example17
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"] ")).click();
		
		Thread.sleep(3000);
		
		
	WebElement month	= driver.findElement(By.xpath("//select[@id=\"month\"] "));
		
		Select s=new Select(month);
		
	//	s.selectByIndex(0);
	//	s.selectByValue(null);
		// s.deselectByValue(null);
		
	//	boolean result = s.isMultiple();
		
	//	System.out.println("result");
		
	//	if(result==true)
	//	{
	//		System.out.println("is multi");
	//	}
	//	else
		//{
	//		System.out.println("is single");
		//}
		
		        String text = s.getFirstSelectedOption().getText();
		
		System.out.println(text);
		
		
		
		
		
	}

}
