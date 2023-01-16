package ai.ds.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXLSdata 
{
//	public static void main(String[] args) throws EncryptedDocumentException, IOException 
//	{
//		ReadXLSdata r=new ReadXLSdata();
//		  r.getdata("Sheet1");
//		
//	}
	
	
	@DataProvider(name="stockname")
	public String[][] getdata(Method m) throws EncryptedDocumentException, IOException 
	{
		String excelsheetName=m.getName();
		File f=new File(System.getProperty("user.dir")+"\\testdata\\Testdata.xlsx");
		  FileInputStream fis=new FileInputStream(f);
		  Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheetname=wb.getSheet(excelsheetName);
		 int totolrow = sheetname.getLastRowNum();
		    System.out.println(totolrow);
		   int totalcols = sheetname.getRow(0).getLastCellNum();
		    System.out.println(totalcols);
		   
     // we need to format data which we take from excel sheet
		   DataFormatter format= new DataFormatter();
     // store all data in string 
		   String testdata[][]=new String [totolrow][totalcols];
		   
		   for(int i=1; i<=totolrow;i++)
		   {
			   for(int j=0;j<totalcols;j++)
			   {
				   testdata[i-1][j]=format.formatCellValue(sheetname.getRow(i).getCell(j));
				   
				   System.out.println(testdata[i-1][j]);
			   }
		   }
		   
		   return testdata;
		   
		
		
		
	}

}
