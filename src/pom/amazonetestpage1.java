package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonetestpage1 
{
	public static void main(String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ ");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		
		
		amazonehomepage summit=new amazonehomepage(driver);
		summit.clickonsinginbutton();
		
   Thread.sleep(2000);
		
		amazonesloginpage1 login=new amazonesloginpage1(driver);
				login.enterphonenumer();
		       login.clickonsummitbutton();
		       
		   
		       
		       amazoneloinpage2 login1 =new amazoneloinpage2(driver);
		       
		       login1.enterpassard();
		       login1.clickonsummitbutton();
		
		
		Thread.sleep(2000);
		
		amazonemainpage home=new amazonemainpage(driver);
				home.verifylogo();
		
		
		Thread.sleep(2000);
		
		amazonelogoutpage summit1=new amazonelogoutpage(driver);
		
		summit1.clickonlogoutbutton();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
