package testengine;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example19 
{
	@Test (groups ="seeting")
	public void TC1()
	{
		Reporter.log("running TC1" ,true);
	}
	@Test (groups ="login")
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	
	@Test (groups ="login")
	public void TC3()
	{
		Reporter.log("running TC3", true);
	}
	
	
	

}
