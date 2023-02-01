package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbhomepage1
{
	                     
	     @FindBy(xpath ="//a[text()=\"Create New Account\"]") private  WebElement login ;
	
	
	
	public fbhomepage1 (WebDriver  driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickcreateaccountbutton()
	{
	 login.click();	
	}
	
	
	
	
	
	
	
	

}
