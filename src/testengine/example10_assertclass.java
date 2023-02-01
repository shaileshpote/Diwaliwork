package testengine;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example10_assertclass
{
	
	@Test
	
	public void TC1()
	{
		Reporter.log("running TC1 ", true );
	
	
	String actresult="hi";
	
	String expresult="hi";
	
Assert.assertEquals(actresult ,expresult," failed:both result are diff");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
