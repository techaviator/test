package day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandler {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		System.out.println("Establish connection with Excel ****************");
		String path= "D:\\Jim\\SetupFiles\\Age.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb =null;
		wb=	new XSSFWorkbook(fis);
		if(wb!=null)
			{
				System.out.println("Excel Connection Success");
			}
		fis.close();
		System.out.println("*************************************");
		
		System.out.println("Read excel cellvalues **************************");
		//Read a value from excel
		String celltext=null;
		XSSFCell cell = wb.getSheet("Sheet1").getRow(1).getCell(2);
		if(cell.getCellType()==Cell.CELL_TYPE_STRING)
		{
			/*System.out.println(Cell.CELL_TYPE_STRING);
			System.out.println(cell.getStringCellValue());*/
			celltext=cell.getStringCellValue();
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			/*System.out.println(cell.getCellType());
			System.out.println(cell.getNumericCellValue());*/
			double numericCellValue = cell.getNumericCellValue();
			celltext = String.valueOf(numericCellValue);
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN)
		{
			/*System.out.println(cell.getCellType());
			System.out.println(cell.getBooleanCellValue());*/
			boolean booleanCellValue = cell.getBooleanCellValue();
			celltext = String.valueOf(booleanCellValue);
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
		{
			/*System.out.println(cell.getCellType());
			System.out.println("The cell is empty");*/
			celltext = "";
		}
		System.out.println(celltext);
		
		System.out.println("***********************************");
		
		System.out.println("GET rowcount ********************");
		int lastRowNum = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println("THe number rows is "+lastRowNum );
		
		System.out.println("****************************");
		
		
		System.out.println("GET colcount ********************");
		short lastCellNum = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println("THe number of columns is " +lastCellNum );
		System.out.println("*******************************");
		
		
		XSSFRow row = wb.getSheet("Sheet1").getRow(2);
		if(row==null)
		{
			row=wb.getSheet("Sheet1").createRow(2);
		}
		
		XSSFCell cell2 = row.getCell(1);
		if(cell2==null)
		{
			cell2 =  row.createCell(1);
		}
		cell2.setCellValue("30");
		
		FileOutputStream fout = new FileOutputStream(path);
		wb.write(fout);
		fout.close();
		wb.close();
	}

}
