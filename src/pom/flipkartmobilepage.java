package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartmobilepage
{
	
	           @FindBy(xpath = " ")  private WebElement mobile;     
	
	
	                 public flipkartmobilepage( WebDriver driver)
	                 {
	                	 PageFactory.initElements(driver, this);
	                	 
	                 }
	
	
	               public void clickonmobile() 
	               {
	            	   mobile.click();
	               }
	
	
	
	
	
	
	
	
	
	
	
	

}
