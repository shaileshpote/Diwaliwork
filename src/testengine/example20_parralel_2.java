package testengine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example20_parralel_2 
{
	
@Test

public void facebookligin() throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/ ");
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	driver.close();
	
	
	
	
	
}

}
