package day6;

public class Inheritance_driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*ClassA a = new ClassA();
		System.out.println(a.Capitol);
		System.out.println(a.interest);
		a.add();
		System.out.println(a.Result);
System.out.println("This is for class A *********************");
		ClassB b = new ClassB();
		System.out.println(b.Capitol);
		System.out.println(b.interest);
		b.add2sub10();
		System.out.println(b.Result);
		System.out.println("This is for class B *********************");		
		ClassC c = new ClassC();
		System.out.println(c.Capitol);
		System.out.println(c.interest);
		c.add2sub10div10();
		System.out.println(c.Result);
		System.out.println("This is for class C *********************");
	*/
		
		System.out.println("This is after inheritance");
		ClassC c = new ClassC();
		System.out.println("Capitol "+c.Capitol);
		System.out.println("interest "+ c.interest);
		System.out.println("tax "+ c.tax);
		c.add();
		System.out.println("using add() from A "+ c.Result);//when classB override ClassA add method , ClassC get to access only the ClassB addmethod
		c.add2sub10();
		System.out.println("add2sub10 using add () from A "+ c.Result);
		c.add2sub10div10();
		System.out.println("add2sub10div10 using add method from class A "+c.Result);
		c.addfromA();
		System.out.println(c.Result);
	
	}

}
