package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\java_workspace\\New Microsoft Office Excel Worksheet.xlsx ");
		
	
		
	//Workbook book = WorkbookFactory.create(file);
	
	//Sheet sh = book.getSheet("sheet1");
		
	//Row rw = sh.getRow(0);
	
	//Cell cl = rw.getCell(0);
		
		//String value = cl.getStringCellValue();
		
		//System.out.println(value);
		
		 String value = WorkbookFactory.create(file).getSheet("sheetl").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(value);
		
		
		
		
	}

}
