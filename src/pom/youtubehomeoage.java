package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class youtubehomeoage
{
	       @FindBy(xpath ="//input[@id=\"search\"] ") private WebElement click1;
	
	        @FindBy(xpath ="//input[@id=\"search\"] ") private WebElement   ST ;
	
	        @FindBy(xpath = " (//button[@aria-label =\"Search\"])[1]") private WebElement click2;
	
	        
	        public youtubehomeoage(WebDriver driver)
	        {
	        	PageFactory.initElements(driver, this);
	        	
	        }
	
	  public void clickonscearchbutton1()
	  {
		  click1.click();
	  }
	
	public void entersongname()
	{
		
		ST.sendKeys("patola guru randhawa ");
		
	}
	
	public void clickonscerachbutton2()
	{
		
		click2.click();
	}
	
	
	
	
	

}
