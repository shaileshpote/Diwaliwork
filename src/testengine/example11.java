package testengine;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example11
{
	@Test
	
	public void TC()
	{
		Reporter.log("running TC" , true );
		
		
		String expresult=" Hello";
		
		String actresult=" Hi";
		
		Assert.assertNotSame(actresult, expresult,"failed-both result are same");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
