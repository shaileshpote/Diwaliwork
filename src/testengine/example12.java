package testengine;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example12 
{
	
	@Test
	
	public void TC1()
	{
		Reporter.log(" running TC1",true);
		
		
		String actresult="hello";
		
		String acptresult="hello";
		
		Assert.assertEquals(acptresult, actresult, " faile-both result are diffrent");
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
