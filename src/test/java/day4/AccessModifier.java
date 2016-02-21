package day4;

public class AccessModifier {

	private int x = 10;
	int y = 20;
	protected int z = 30;
	
	public int a = 100;
	
	private void privatemethod()
	{
		System.out.println("This is a private method");
	}
	
	void defaultmethod()
	{
		System.out.println("This is a default method");
	}
	
	protected void protectedmethod()
	{
		System.out.println("This is a protected method");
	}
	
	public void publicmethod()
	{
		System.out.println("This is a public method");
	}
	
	public static void main(String[] args) {
		
		AccessModifier obj = new AccessModifier();
		
		System.out.println(obj.x);//private
		obj.privatemethod();//private
		
		System.out.println(obj.y);
		obj.defaultmethod();
		
		System.out.println(obj.z);
		obj.protectedmethod();
		
		System.out.println(obj.a);
		obj.publicmethod();
	}

}
