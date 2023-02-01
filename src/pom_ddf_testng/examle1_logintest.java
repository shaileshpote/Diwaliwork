package pom_ddf_testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.SwagLabHomePage;
import pom.SwagLabMenuPage;
import pom.swaglabloginpage;

public class examle1_logintest<swaglabmenupage> 
{
	public class swaglogintest
	{
		int a;
		 swaglabloginpage login;
		 SwagLabHomePage home ;
         SwagLabMenuPage menu;
     	Sheet sh ;
    	WebDriver driver;
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\java_workspace\\xl_sheet\\swag_login.xlsx");
		
		 sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("wedbdriver.chrome.driver","C:\\java_workspace\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		  login = new swaglabloginpage(driver);
		
	       home=new SwagLabHomePage(driver);
		
	        menu =new SwagLabMenuPage(driver);
		
		     a=10;
		
	}
	
	
	@BeforeMethod
	public void logintoapp() throws InterruptedException
	{
		System.out.println(a);
		
		login.inpSwagLabLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue() );
		
		login.inpSwagLabLoginPagePassword(sh.getRow(0).getCell(a).getStringCellValue() );
		
		login.clickloginbutton();
		
		Thread.sleep(2000);
		
	}
	
	
	@Test
	
	public void verifylogo()
	{
		
		
		Object actResult = home.getSwagLabHomePageLogo();
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void logoutfromapp()
	{
		
	}
	
	
	@AfterClass
	
	public void closebrowser()
	{
		
	}
	
	
	}

}
