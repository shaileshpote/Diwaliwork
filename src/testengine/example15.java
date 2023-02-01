package testengine;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example15 
{
	@Test
	public void TC1()
	{   
		SoftAssert soft=new SoftAssert();
		
		String actresult="hi";
		
		String exptresult= " hello";
		
		soft.assertEquals(exptresult, actresult," failed1 : both results are diffrent");
	      
		boolean actresult1=false;
	
	  soft.assertTrue(actresult1, "failed2 :exp result is false");
	  
	  soft.assertAll();
	
	}
	

}
