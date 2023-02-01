package testengine;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example6_enable
{
	
	@Test
	 public void tc1()
	
	 {
		Reporter.log("running tc1" , true);
	 }
	
	@Test 
	
	public void tc2()
	{
		Reporter.log("running tc2" , true);
	}
	
	
	
	
	
	

}
