package revesion_packages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example24 
{
	public static void main(String[]args) throws IOException
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/ ");
	
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(src);
		
		String RS = RandomString.make(3);
		
		File dest=new File("C:\\screenshoots\\abc.jpg ");
		
		FileHandler.copy(src, dest);
		
		
		
		
		
		
		
	}

}
