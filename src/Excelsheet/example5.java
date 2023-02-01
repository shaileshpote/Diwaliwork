package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\java_workspace\\New Microsoft Office Excel Worksheet.xlsx ");
		
		boolean value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getBooleanCellValue();
		
		System.out.println(value);
		
		
		
		
		
		FileInputStream file1=new FileInputStream("C:\\\\java_workspace\\\\New Microsoft Office Excel Worksheet.xlsx");
		
		
		double value1 = WorkbookFactory.create(file1).getSheet(null).getRow(0).getCell(0).getNumericCellValue();
		
		System.out.println("..");
		
		
		
		
	}

}
