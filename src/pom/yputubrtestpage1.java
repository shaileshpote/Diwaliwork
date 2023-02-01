package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yputubrtestpage1 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/ ");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		youtubehomeoage home = new youtubehomeoage(driver);
		
		home.clickonscearchbutton1();
		home.entersongname();
		home.clickonscerachbutton2();
		
	Thread.sleep(2000);
		
		 youtubsongpage s=new youtubsongpage(driver);
		 
		 s.clickonsongname();
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
