package testengine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class example20_multi_browsingtesting 
{
	
	@Parameters("browsername")
	@Test
	
	public void multibrowingtesting( String browsername) throws InterruptedException
	{
		WebDriver driver=null ;
				
		if (browsername.equals("chrome"))
		{
			

			System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		 else if ( browsername.equals("firefox"))
		 {
			 driver=new FirefoxDriver();
		 }
		
		 else if(browsername.equals("edge"))
		 {
			 driver=new EdgeDriver();
		 }
		
		
	
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
