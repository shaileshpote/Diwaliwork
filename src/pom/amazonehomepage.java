package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonehomepage 
{
	
	
	          @FindBy(xpath ="(//span[text()=\"Sign in\"])[1] ")  private WebElement login ;
	          
	          public amazonehomepage (WebDriver driver)
	          {
	        	  PageFactory.initElements(driver, this);
	        	  
	          }
	
	public void clickonsinginbutton()
	{
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	

}
