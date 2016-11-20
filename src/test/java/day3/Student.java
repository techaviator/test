package day3;

public class Student {

	String Name;
	double math;
	double phy;
	double che;
	static String project = "Selenium";
	
	public void avg()
	{
		double avg = (math+phy+che)/3;
		System.out.println("The average of " +Name +"who works in "+project+" project is "+avg);
	}

}
