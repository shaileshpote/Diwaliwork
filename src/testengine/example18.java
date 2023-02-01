package testengine;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example18 
{
	@Test (groups ="login")
	public void TC1()
	{
		Reporter.log("running test case TC1 " , true);
	}
	
	@Test (groups ="login")
	public void TC2()
	{
		Reporter.log("running test case TC2" , true);
	}
	
	@Test (groups ="seeting")
	public void TC3()
	{
		Reporter.log("running test case TC3" , true);
	}

	@Test (groups ="seeting")
	public void TC4()
	{
		Reporter.log("running test case TC4" , true);
	}
	
}
