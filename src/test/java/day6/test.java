package day6;

public class test {
	/*
	 * example to show you how to call nonstatic method inside another nonstatic method of the same class
	 */
	public int setsheet()
	{
		int x=10;
		return x;
	}
	
	public void getrowcoount()
	{
		int x = setsheet();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		test obj = new test();
		obj.getrowcoount();
	}

}
