package day8;

public class LearnArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] x = new int[5];
		x[0] = 101;
		x[1] = 102;
		x[2] = 103;
		x[3] = 104;
		x[4] = 105;
System.out.println(x[4]);
	int[] y = {101,102,103,104,105};
	System.out.println( y[2]);
	System.out.println("***************************");
	
	//wrapper classess
	String[][] name = new String[3][2];
		name[0][0] = "Jim";
		name[0][1] = "Cherian";
		
		name[1][0] = "alex";
		name[1][1] = "jose";
		
		name[2][0] = "James";
		name[2][1] = "Bond";
		System.out.println(name.length);
		System.out.println(name[0].length);
		
		for(int i=0;i<name.length;i++)
		{
			for(int j = 0;j<name[1].length;j++)
			{
				System.out.print(name[i][j]+"\t\t");
				
			}
			System.out.println();
		}
		
		System.out.println("***************************");
		
		//object array
		Object[][] obj = new Object[3][2];
		obj[0][0] = "Jim";
		obj[0][1] = "Cherian";
		
		obj[1][0] = 101;
		obj[1][1] = 11.0;
		
		obj[2][0] = 'c';
		obj[2][1] = true;
		
		System.out.println(obj.length);
		System.out.println(obj[0].length);
		
		for(int i=0;i<obj.length;i++)
		{
			for(int j = 0;j<obj[1].length;j++)
			{
				System.out.print(obj[i][j]+"\t\t");
				
			}
			System.out.println();
		}
		
		System.out.println("*******************************");
		
		
		
		
	}

}
