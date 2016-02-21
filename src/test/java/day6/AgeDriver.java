package day6;

public class AgeDriver {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String path = "D:\\JavaWorkspace_2016\\Jan_2016_batch\\January_2016_batch\\src\\test\\resources\\Age.xlsx";
	
		ExcelReader xl = new ExcelReader(path);//Calling the excelreader class  and intializing the excel using the contructors in the excel reader class
		int rowcount = xl.getrowcount("Sheet1"); // Getting the row count to read/write all the rows
		System.out.println(rowcount);
		
		for(int i=1;i<=rowcount;i++)
		{//getting each value from all the rows of column Age, hence not getting the column count and just hardcoding the colindex 
			String age = xl.readcellvalue("Sheet1", i, 1);//getting value from each cell
			System.out.println(age);
			Double actual_age = Double.valueOf(age);//implementing wrapper class: used to convert String to double for validation purpose
			if(actual_age<18.0)
			{
				xl.writecellvalue("Sheet1", i, 2, "Minor");//writing back to the excel
			}
			else
			{
				xl.writecellvalue("Sheet1", i, 2, "Major");//writing back to the excel
			}
		}
		xl.saveexcel(path);//write back to excel from the java workbook object wb.
		

	}

}
