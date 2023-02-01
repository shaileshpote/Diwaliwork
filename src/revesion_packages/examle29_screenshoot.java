package revesion_packages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class examle29_screenshoot 
{
	public static void main(String[]args) throws IOException
	{
	 
		System.setProperty("webdriver.chrome.driver ", "C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" https://www.facebook.com/");
		
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
  File dest = new File("C:\\\\screenshoots " );
		
		FileHandler.copy(src, dest) ;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
