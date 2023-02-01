package testengine;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class example3_Annotations 




{
	
	@Test
	
	
	@BeforeTest
	public void logintoapp()
	{
		Reporter.log(" login to aplication.." ,true );
		
	}
	
	
	
	@Test
	public void verifylogo1()
	
	{
		Reporter.log("running verifylogo1 test script ", true);
		
	}
	
	
	
	@Test
	public void verifylogo2()
	{
		Reporter.log("verify logo2 " ,true);
	}
	
	
	
	@AfterTest 
	 public void logoutfromapplication()
	{
		Reporter.log("logout from application ",true);
	}
	
	

	
	

	

	

}
