package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazoneloinpage2
{
	 
	                  @FindBy(xpath ="//input[@name=\"password\"] ")  private WebElement pass;
	
	                  @FindBy(xpath ="//input[@id=\"signInSubmit\"] ") private WebElement  summit ;
	                  
	                  
	                  public amazoneloinpage2 (WebDriver driver)
	                  {
	                	  
	                	  PageFactory.initElements(driver, this);
	                  }
	    
	         public void enterpassard()
	         {
	        	 pass.sendKeys("shailesh@1234");
	         }
	
	           public void clickonsummitbutton()
	           {
	        	  summit.click(); 
	           }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
