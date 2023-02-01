package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkarttest1 
{
	
	public static void main(String[]args) throws InterruptedException
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/");
		
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
		  
		  flipkarthomepage home=new flipkarthomepage(driver);
		  home.closethetab();
		  home.verifylogo();
		  
		  Thread.sleep(2000);
		  
		
		
		  flipkartmobilepage home1=new flipkartmobilepage(driver);
		  home1.clickonmobile();
		  
		  driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
