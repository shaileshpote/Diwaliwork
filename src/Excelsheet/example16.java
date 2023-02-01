package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example16 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream(" C:\\java_workspace\\New Microsoft Office Excel Worksheet (2).xlsx ");
		
	          Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		                int lastcellindex = sh.getRow(0).getLastCellNum()-1;
		    
		                         for(int i=0 ; i<=lastcellindex ; i++)
		                         {
		                        	String value = sh.getRow(0).getCell(i).getStringCellValue();
		                        	 
		                        	System.out.print( value +" ");
		                         }
		
	}
}
