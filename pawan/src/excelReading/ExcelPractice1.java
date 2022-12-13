package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelPractice1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 File myFile=new File("E:\\0911_selinium\\Book1.xlsx");
		 
		 
		String value = WorkbookFactory.create(myFile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	     System.out.println(value);
	     
	   double value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
	    System.out.println(value1);
	     
	   boolean value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
	   System.out.println(value2);
		 
	

	}

}
