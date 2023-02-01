package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonpomloginpage
{
	  
	   @FindBy(xpath =" ")private WebElement logo;
	
	public  amazonpomloginpage( WebDriver driver)
	{
		
		PageFactory.initElements(driver , this);
		
	}
	
	public void verifylogo()
	{
		 boolean result =logo. isDisplayed();
	      
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
