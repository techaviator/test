package day3;

public class Arun_Student {
	public static void main(String[] args) {
		Student arun = new Student();
		arun.Name ="Arun";
		arun.math= 50;
		arun.phy=60;
		arun.che=70;
		Student.project = "QTP";
		System.out.println(Student.project);		
		arun.avg();
		
		Student mukesh = new Student();
		mukesh.Name= "Mukesh";
		mukesh.math = 100;
		mukesh.phy= 80;
		mukesh.che = 70;
		System.out.println(Student.project);
		mukesh.avg();
	}

}
