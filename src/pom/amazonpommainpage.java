package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonpommainpage 
{

	
	@FindBy(xpath="//input[@name=\\\"email\\\"]") private WebElement UN;
	
	   @FindBy(xpath ="//input[@name=\\\"password\\\"]" )  private WebElement PWD;
	 
	      @FindBy(xpath ="//input[@id=\\\"signInSubmit\\\"]")      private WebElement login;
	 
	
	
	public amazonpommainpage (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
		}
	
	public void enterUN()
	{
		
		UN.sendKeys("9822570864");
	}
	
	public void enterPWD()
	{
		PWD.sendKeys("shailesh@1234");
	}
	
	public void clickonloginbutton()
	{
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
