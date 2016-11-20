package day6;

public class ClassB extends ClassA{
	/*int Capitol = 100;
	int interest = 20;
	
	int Result;*/
	public void add2sub10()
	{
		//Result = Capitol+interest;
		super.add();
		Result = Result-10;
	}
	
	public void add()
	{
		Result = Capitol+interest+tax;
	}
	
	public void addfromA()
	{
		super.add();
	}

}
