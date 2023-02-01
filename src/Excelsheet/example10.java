package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example10 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\java_workspace\\New Microsoft Office Excel Worksheet.xlsx " );
		
	short clnumber = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
		
		System.out.println(clnumber);
		
		
		
		
		
		
		
		
		
		
		
	}

}
