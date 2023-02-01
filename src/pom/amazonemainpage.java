package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonemainpage
{
	
	             @FindBy(xpath ="//a[@aria-label=\"Amazon.in\"] ") private WebElement logo ;
	
	          public amazonemainpage(WebDriver driver)
	          {
	        	  PageFactory.initElements(driver, this);
	          }
	
	
	          
	         public void verifylogo() 
	         {
	        	       boolean result = logo.isDisplayed();
	        	 
	        	 if(result==true)
	        	 {
	        		 System.out.println("logo not found : teatcase fail");
	        	 }
	        	 else
	        	 {
	        		 System.out.println(" logo found : test case pass ");
	        	 }
	        	 
	        	 
	         }
	
	
	
	
	
	
	
	
	
	

}
