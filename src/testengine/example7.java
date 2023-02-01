package testengine;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example7 
{
	@Test
	
	public void tc1()
	{
		Reporter.log("running test case tc1", true );
	}
	
	@Test(priority = 1)
	public void tc2()
	{
		Reporter.log("running test casetc2", true);
		
	}
	
	
	
	
	
	
	
	
	

}
