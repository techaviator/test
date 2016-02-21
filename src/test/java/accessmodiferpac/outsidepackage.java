package accessmodiferpac;

import day4.AccessModifier;

public class outsidepackage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AccessModifier obj = new AccessModifier();
		//System.out.println(obj.x);// cannot access private
		//System.out.println(obj.y);//cannot access default
		//System.out.println(obj.z); //cannot access protected
		//obj.protectedmethod();//cannot access protected
		System.out.println(obj.a);
		obj.publicmethod();
	}

}
