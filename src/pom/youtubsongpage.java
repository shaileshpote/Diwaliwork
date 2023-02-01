package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class youtubsongpage 
{
	        @FindBy(xpath ="//yt-formatted-string[contains(text(),\"Patola Video Song\")] ")private WebElement click;
	        
	       

	        public  youtubsongpage (WebDriver driver)
	        {
	        	PageFactory.initElements(driver, this);
	        	
	        }
	        
	        public void clickonsongname()
	        {
	        	click.click();
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
}
