package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swaglabloginpage 
{
	
	@FindBy(xpath ="//input[@placeholder='Username']" ) private WebElement UN;
	                 
	@FindBy(xpath = "//input[@placeholder='Password']") private WebElement PWD;
	                 
	@FindBy (xpath = "  //input[@name='login-button']" ) private WebElement login;

	public Object inpSwagLabLoginPageUsername;
	
	
	public swaglabloginpage (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterUN()
	{
		UN.sendKeys("stander user");
	}
	
	public void enterpwd()
	{
		PWD.sendKeys("secret_sauce ");
	}
	
	public void clickloginbutton()
	{
		login.click();
	}

	public void inpSwagLabLoginPageUsername(String stringCellValue) {
		// TODO Auto-generated method stub
		
	}

	public void inpSwagLabLoginPagePassword(String stringCellValue) {
		// TODO Auto-generated method stub
		
	}

}
