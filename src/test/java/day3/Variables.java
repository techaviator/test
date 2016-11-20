package day3;

public class Variables {
	int y = 20;
	static int z = 30;
	String nonstatic = "NonStaticvariable";
	
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		Variables var = new Variables();
		System.out.println(var.y);
		var.accessvariable();
		System.out.println(z);
		temp();
	}
	
	public static void temp()
	{
		System.out.println("THis a static method");
	}
	
	public void printnonstatic()
	{
		
		
		System.out.println("Nonstatic can access nonstatic directly");
	}
	
	public void accessvariable()
	{
		System.out.println(y);
		printnonstatic();
		temp();
		System.out.println(nonstatic);
	}
	

}
