package testengine;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example9
{
	@Test
	public void TC1()
	{
		Reporter.log("running tc1" , true);
	}
	
	@Test (dependsOnMethods = "TC1")
	public void TC2(   )
	{
		Reporter.log("running tc2" ,true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
