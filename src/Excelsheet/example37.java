package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example37 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\java_workspace\\New Microsoft Office Excel Worksheet (2).xlsx  ");
		
		             Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
		
		             int lastrowindex = sh.getLastRowNum();
		             
		             for(int i=0 ; i<=lastrowindex ; i++   )
		             {
		            	int lastcellindex = sh.getLastRowNum()-1;
		            	
		            	for (int j=0 ; j<=lastcellindex ; j++)
		            	{
		            	Cell cellinfo = sh.getRow(i).getCell(j);
		            		
		            		   CellType s1 = cellinfo.getCellType();
		            		   
		            		   if(s1==CellType.STRING)
		            		   {
		            			  String value = cellinfo.getStringCellValue();
		            			  System.out.print(value+" ");
		            		   }
		            		   
		            		   if(s1==CellType.NUMERIC)
		            		   {
		            			double value = cellinfo.getNumericCellValue();
		            			
		            			System.out.print(value+" ");
		            			   
		            		   }
		            		   
		            		   if(s1==CellType.BOOLEAN);
		            		   
		            		   {
		            			      boolean value = cellinfo.getBooleanCellValue();
		            			      
		            			      System.out.println(value+" ");
		            		   }
		            		   
		            		   
		            	}
		            	
		            	System.out.println();
		            	
		            	
		            	
		            	
		            	 
		             }
		             
		             
		             
		             
		             
		             
		             
		             
		             
		             
		             
		             
		
	}

}
