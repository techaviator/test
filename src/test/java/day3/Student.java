package day3;

public class Student {
	
	String name;
	int sum ;
	int math;
	int physics;
	int chemistry;
	static String schoolname = "Mount Carmel";
	
	void add()
	{
	
		System.out.println(schoolname);
		 sum = math+physics+chemistry;
		System.out.println("The student detail is : "+name+" Total :"+ sum);
	}
	void addplus10()
	{
		add();
		int y =sum+10;
		System.out.println(y);
	}
	
	static void getschoolname()
	{
		System.out.println(schoolname);
		
		/*Student instance = new Student();
		instance.chemistry = 51;
		instance.physics = 61;
		instance.math = 71;
		int total=instance.math+instance.physics+instance.chemistry;
		System.out.println(total);*/
	}

}
