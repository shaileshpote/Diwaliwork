package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example7 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\java_workspace\\New Microsoft Office Excel Worksheet.xlsx " );
		
		double value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1).getNumericCellValue();
		
		
		System.out.println(value);
		
		
		
		
		
		
		
		
		
		
		
	}

}
