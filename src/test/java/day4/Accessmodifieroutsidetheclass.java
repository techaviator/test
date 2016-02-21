package day4;

public class Accessmodifieroutsidetheclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AccessModifier obj = new AccessModifier();
		//System.out.println(obj.x); cannot access private
		System.out.println(obj.y);
		obj.defaultmethod();
		
		System.out.println(obj.z);
		obj.protectedmethod();
		
		System.out.println(obj.a);
		obj.publicmethod();
	}

}
