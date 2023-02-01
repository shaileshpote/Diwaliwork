package revesion_packages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example20
{
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver " , " C:\\java_workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"] ")).click();
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"] "));
		
		                Select s = new Select(month);
		                
		               // s.selectByIndex(0);
		                
		           boolean result = s.isMultiple();
		                
		                System.out.println("result");
		                
		                if(result==true)
		                {
		                	System.out.println("is multipel");
		                }
		                else
		                {
		                	System.out.println("is single");
		                }
		
		        List<WebElement> alloptions = s.getAllSelectedOptions();
		        System.out.println("alloprions.size()");
		        
		        for(WebElement s1: alloptions )
		        {
		        	System.out.println(s1.getText());
		        }
		                
		             
		}	
		
		
	}


