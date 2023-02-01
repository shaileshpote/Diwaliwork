package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbcreateaccountpage
{
	                    
	       @FindBy(xpath ="//input[@name=\"firstname\"]") private WebElement FN;
	
	       @FindBy(xpath = "//input[@name=\"lastname\"] ") private WebElement LN ;
	
	       @FindBy(xpath =" (//button[@type=\"submit\"])[2] ") private WebElement login ;
	
	
	         public fbcreateaccountpage (WebDriver driver)
	         {
	        	 PageFactory.initElements(driver, this);
	        	 
	        	 
	         }
	
	public void enterFN()
	{
		FN.sendKeys("9822570864");
	}
	
	public void enterLN()
	{
		LN.sendKeys("pote");
	}
	
	public void clickloginbutton()
	{
		login.click();
	}
	
	
}
