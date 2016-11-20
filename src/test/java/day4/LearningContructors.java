package day4;



public class LearningContructors {
	int x,y;
	public  LearningContructors()
	{
		System.out.println("This is a default contructor");
	}
	
	public LearningContructors(int a, int b)
	{
		x=a;
		y=b;
		//System.out.println("x= "+x+" and y= "+ y);
	}
	
	public void print()
	{
		System.out.println("x= "+x+" and y= "+ y);
	}

}
