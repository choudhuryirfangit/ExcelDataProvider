package dataDriven.ExcelDataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	
	@Test
	public void getData() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Selenium_2024\\excelDriven\\ExcelDataProvider.xlsx\\");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(0);
		int rowCount=sheet.getPhysicalNumberOfRows();
		XSSFRow row= sheet.getRow(0);
		int columnCount=row.getLastCellNum();
		Object data[][]=new Object[rowCount-1][columnCount];
		for(int i=0;i<rowCount-1;i++) {
			
			row=sheet.getRow(i+1);
			for(int j=0;j<columnCount;j++) {
				System.out.println(row.getCell(j));
			}
		}
	}

}
