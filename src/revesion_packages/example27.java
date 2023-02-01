package revesion_packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example27 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		 Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"] ")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"] " )).sendKeys("shailesh");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"] ")).sendKeys("pote");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("( //input[@type=\"text\"])[4 ] ")).sendKeys("123456789");
		
		
		 driver.findElement(By.xpath("(//input[@ type=\"password\"])[2] ")).sendKeys("shailesh");
		
	
		 
		driver.findElement(By.xpath("//select[@id=\"day\"] ")).sendKeys("4");
		
		driver.findElement(By.xpath(" //select[@id=\"month\"]")).sendKeys("june");
		
		driver.findElement(By.xpath("//select[@title=\"Year\"] ")).sendKeys("1989");
		
		
		
		driver.findElement(By.xpath("//label[text()=\"Male\"] ")).click();
		
		driver.findElement(By.xpath("//button[text()=\"Sign Up\"] ")).click();
		
		
		
	}

}
