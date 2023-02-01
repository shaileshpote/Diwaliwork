package pom;

import java.time.Duration;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbtestpage1 
{
	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/ ");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		fbhomepage1 login =new fbhomepage1(driver);
		
		login.clickcreateaccountbutton();
		
		fbcreateaccountpage login1=new fbcreateaccountpage(driver);
		
		login1.enterFN();
		login1.enterLN();
		login1.clickloginbutton();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
