package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkarthomepage 

{
	           @FindBy(xpath = "//button[@class=\"_2KpZ6l _2doB4z\"]") private WebElement close;
	 
	             @FindBy(xpath =" ") private WebElement logo;
	            
	            
	            public  flipkarthomepage (WebDriver driver)
	            {
	            	PageFactory.initElements(driver, this);
	            	
	            }
	            
	            public void closethetab()
	            {
	            	close.click();
	            }
	            
	            
	            
	            
	             public void verifylogo ()
	             {
	            	       boolean result = logo.isDisplayed();
	            	       
	            	  if(result==true)  
	            	  {
	            		  System.out.println(" logo is true : test case pass");
	            	  }
	            	  else
	            	  {
	            		  System.out.println("logo is not true: test case fail ");
	            	  }
	            	       
	            	       
	            	       
	            	       
	            	 
	             }
	
	
	
	
	
	

}
