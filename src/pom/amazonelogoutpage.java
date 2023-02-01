package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonelogoutpage
{
	       @FindBy(xpath ="//span[text()=\"Sign Out\"] ")private WebElement summit;
	   
	   
	   public amazonelogoutpage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
		   
	   }
	   
	   public void clickonlogoutbutton()
	   {
		   summit.click();
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   

}
