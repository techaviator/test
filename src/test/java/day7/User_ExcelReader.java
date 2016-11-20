package day7;

import java.io.IOException;

public class User_ExcelReader {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String path= System.getProperty("user.dir")+"\\src\\test\\resources\\Age.xlsx";
		ExcelReader xl = new ExcelReader(path);
		int xlRowCount = xl.getXLRowCount("Sheet1");
		//short xlColCount = xl.getXLColCount("Sheet1");
		short xlColCount = xl.getXLColCount("Sheet1", 0);
		
		System.out.println(System.getProperty("user.dir"));
		
		System.out.println("The number of rows = "+xlRowCount+" and the number of column is = "+xlColCount);
		//Read the cell value
		/*String xlData = xl.getXLData("Sheet1", 1, 1);
		System.out.println("The age is "+ xlData.replace(".0", ""));
		*/
		for(int i = 1;i<=xlRowCount;i++)
		{
			
				//String Name = xl.getXLData("Sheet1", i,0);
				String Age = xl.getXLData("Sheet1", i,1);
				//System.out.println("The name is "+Name+" and the age is "+Age.replace(".0", ""));
				if (!Age.equals(""))
				{
					double age_double = Double.parseDouble(Age);
					if(age_double>=18)
					{
						//System.out.println("Major");
						xl.setXLCellValue("Sheet1", i, 2, "Major");
					}
					else
					{
						//System.out.println("Minor");
						xl.setXLCellValue("Sheet1", i, 2, "Minor");
					}
				}
			
		}
		xl.writeToXL(path);
	}

}
