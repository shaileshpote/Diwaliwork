package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example11
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe ");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://zeenews.india.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
driver.findElement(By.xpath(" //a[text()=\"Business\"]")).click();

                                  Set<String> allides = driver.getWindowHandles();
		
		                   ArrayList<String> al=new ArrayList<String>(allides);
		                   
		                                String childwoodid = al.get(1);
		
		
		                                driver.switchTo().window(childwoodid);
		
		driver.findElement(By.xpath("//a[@class=\"myMoney\"] ")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
