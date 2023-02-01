package testengine;

import javax.swing.GroupLayout.Group;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example16
{
	@Test (groups = " login")
	
	public void TC1 ()
	{
		Reporter.log("running tc1", true);
	}
	
	@Test (groups = "login")
	
	public void TC2()
	{
		Reporter.log("running TC2" , true);
	}
	 @Test (groups = " profile")
	 
	 public void tc3()
	 {
		 Reporter.log("running tc3" , true);
	 }
	
	@Test(groups = "seeting")
	
	public void tc4()
	{
		Reporter.log("running tc4" ,true);
	}
}
