package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Jim\\SetupFiles\\Age.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFCell cell = wb.getSheet("Sheet1").getRow(1).getCell(1);
		if(cell.getCellType()==Cell.CELL_TYPE_STRING)
		{
			String stringCellValue = cell.getStringCellValue();
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			double numericCellValue = cell.getNumericCellValue();
			String celltext = String.valueOf(numericCellValue);
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN)
		{
			 boolean booleanCellValue = cell.getBooleanCellValue();
			 String celltext = String.valueOf(booleanCellValue);
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
		{
			String stringCellValue = "";
		}
		
		XSSFCell cell2 = wb.getSheet("Sheet1").getRow(1).getCell(3);
		if (cell2==null)
		{
			wb.getSheet("Sheet1").getRow(1).createCell(1);
		}
		cell2.setCellValue("test");
		
		FileOutputStream fout = new FileOutputStream("D:\\Jim\\SetupFiles\\Age.xlsx");
		wb.write(fout);
		fout.close();

	}

}
