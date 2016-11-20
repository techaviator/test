package day4;

public class AccessModiferDiffClassSamPac {

	public static void main(String[] args) {
		AccessModifierSAmeClass access = new AccessModifierSAmeClass();
		/*System.out.println(access.x);
		access.printPrivate();*/ //private cannot be accessed outside class
		
		System.out.println(access.y);
		access.printdefault();
		
		System.out.println(access.z);
		access.printProtected();
		
		System.out.println(access.a);
		access.printpublic();

	}

}
