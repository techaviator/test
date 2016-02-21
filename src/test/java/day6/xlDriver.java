package day6;

public class xlDriver {


	public static void main(String[] args) throws Exception {
		String path ="D:\\JavaWorkspace_2016\\Jan_2016_batch\\January_2016_batch\\src\\test\\resources\\Age.xlsx";
		ExcelReader xl = new ExcelReader(path);
		xl.setsheet("Sheet1");
		/*String text = xl.readcellvalue("Sheet1",1,1);
		System.out.println(text);*/
		
		/*xl.writecellvalue("Sheet1",1,2, "Major");
		xl.saveexcel(path);*/
		String text =null;
		int rowcount = xl.getrowcount("Sheet1");
		System.out.println(rowcount);
		int colcount = xl.getcolumncount("Sheet1", 0);
		System.out.println(colcount);
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
			 text = xl.readcellvalue("Sheet1",i,j);
			 System.out.print(text+" ");
			}
			System.out.println();
		}

	}

}
