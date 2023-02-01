package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonesloginpage1 
{
	
	                         @FindBy(xpath ="//input[@name=\"email\"] ") private WebElement PN;

	                         @FindBy(xpath = "//input[@id=\"continue\"]") private WebElement login ;
	                         
	                         
	                         public amazonesloginpage1 (WebDriver driver)
	                         {
	                        	 PageFactory.initElements(driver, this);
	                        	 
	                         }
	                    
	                         public void enterphonenumer()
	                         {
	                        	 PN.sendKeys("9822570864");
	                         }
	                         
	                         public void clickonsummitbutton()
	                         {
	                        	 login.click();
	                         }
	                         
	                         
	                         
	                         
	                         
}
