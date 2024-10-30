package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String getExcelData(String path,String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue().toString();
		return value;
	}
	
	
	
	public void getDataProviders(String sheetName, String path) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int lastRow = sheet.getLastRowNum();
		int lastcell= sheet.getRow(0).getLastCellNum();
		
		
	    Object[][] data = new Object[lastRow][lastcell];
	    
	    for(int i=0; i<lastRow; i++)
	    {
	    	for(int j=0; j<lastcell; j++)
	    	{
	    		data[i][j]=
	    	}
	    }
	}

}
