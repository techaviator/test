package day5;

public class polymorphismmethodOverloading {
	
	public int add(int x, int y)
	{
		return x+y;
	}
	
	
	
	public double add(double x, int y)
	{
		return x+y;
	}
	
	public double add(int x, double y)
	{
		return x+y;
	}
	
	public double add(double x, double y)
	{
		return x+y;
	}
	
	public double add(double x, double y, double z)
	{
		return x+y+z;
	}

}
