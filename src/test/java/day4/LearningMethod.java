package day4;

public class LearningMethod {
	int x = 0;
	int y= 0;
	int z = 0;
	public void getinfo()
	{
		x=10;
		y=20;
		System.out.println("x= "+x +" and y= "+y);
	}
	
	public void getinfo(int a, int b)
	{
		x=a;
		y=b;
		System.out.println("x= "+x +" and y= "+y);
	}
	
	public void getinfo(int a, int b, int c)
	{
		x=a;
		y=b;
		z=c;
		System.out.println("x= "+x +" and y= "+y+" and z= "+z);
	}
	
/*	public int getinfo(int a, int b, int c) return types are not considered in the signature
	{
		int sum = a+b+c;
		System.out.println("Sum = " + sum);
		return sum;
	}*/
	
	public void getinfo(int a, int b, String name)
	{
		x=a;
		y=b;
		
		System.out.println("x= "+x +" and y= "+y+" and name = " +name);
	}

}
