package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example19 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\java_workspace\\New Microsoft Office Excel Worksheet (2).xlsx ");
		
	   Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		         CellType s1 = sh.getRow(0).getCell(1).getCellType();
		
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
