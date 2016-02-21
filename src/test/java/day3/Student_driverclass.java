package day3;

public class Student_driverclass {
	
	public static void main(String[] args) {
		
		Student st = new Student();
		st.name= "Jim";
		st.chemistry = 50;
		st.physics = 60;
		st.math = 70;
		st.name = "Guru_modified";
		
		
		System.out.println("Print add + 10");
		st.addplus10();
		//st.add();
		Student.getschoolname();
		//System.out.println(Student.schoolname);
		//st.schoolname = "St.Joseph";
		
		Student st1 = new Student();
		st1.name= "Guru";
		st1.chemistry = 51;
		st1.physics = 61;
		st1.math = 71;
		st1.add();
		st.name = "guru_latest";
		st.add();
		System.out.println(Student.schoolname);
		Student.getschoolname();
	}

}
