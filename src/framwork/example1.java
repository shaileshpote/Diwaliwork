package framwork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ ");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.xpath(" //span[text()=\"Hello, sign in\"]")).click();
		
		 Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //input[@name=\"email\"] " )).sendKeys("9822570864");
		
		driver.findElement(By.xpath(" //span[@id=\"continue\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //input[@name=\"password\"] ")).sendKeys("shailesh@1234");
		
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"] ")).click();
		
		Thread.sleep(3000);
		
		      boolean result = driver.findElement(By.xpath(" //a[@id=\"nav-logo-sprites\"]")).isDisplayed();
		      
	if(result==true)
	{
		System.out.println(" logo found ....test case pass ");
	}
	else
	{
		System.out.println(" logo not found....test case fail");
	}
		
		
	}

}
