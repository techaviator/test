package day4;

public class AccessModifierSAmeClass {

	private  int x = 10;
	int y=20;
	protected int z= 30;
	public int a = 40;
	
	public void printpublic()
	{
		System.out.println("THis is a public method");
	}
	protected void printProtected()
	{
		System.out.println("This is a protected method");
	}
	
	void printdefault()
	{
		System.out.println("This is a default method");
	}
	private void printPrivate()
	{
		System.out.println("This is a private method");
	}
	public static void main(String[] args) {
		
		AccessModifierSAmeClass access = new AccessModifierSAmeClass();
		System.out.println(access.x);
		access.printPrivate();
		System.out.println(access.y);
		access.printdefault();
		System.out.println(access.z);
		access.printProtected();
		
		System.out.println(access.a);
		access.printpublic();
		
		
		
	}

}
