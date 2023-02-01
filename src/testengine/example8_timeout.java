package testengine;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example8_timeout
{
	
	@Test (timeOut = 6000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(7000);
		Reporter.log("running TC1" , true);
	}
	
	
	
	
	
	
	
	
	
	

}
