package testengine;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example14 
{
	@Test
	
	public void TC1()
	{
		
		boolean actresult= true;
		
		Assert.assertFalse(actresult, "failed-act result is true   ");
		
		
		
	}
	
	

}
