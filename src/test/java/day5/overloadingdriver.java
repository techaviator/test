package day5;

public class overloadingdriver {

	
	public static void main(String[] args) {
		
		polymorphismmethodOverloading obj = new polymorphismmethodOverloading();
		
		System.out.println(obj.add(10,20.5));
		System.out.println(obj.add(10.5,12.5,33.3));
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10.6,20.5));
		System.out.println(obj.add(10,20));

	}

}
