package day5;

import java.util.Scanner;

public class Interfacedriver {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*ICICI obj = new ICICI();
		obj.deposit();
		obj.withdraw();
		obj.loan();
		obj.depositbonanza();
		
		HDFC obj1 = new HDFC();
		obj1.deposit();
		obj1.withdraw();
		obj1.loan();
		obj1.loanbonanza();*/
		String bank=null;
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter a bank");
		bank = in.next();
		RBI obj = null;
		if (bank.equalsIgnoreCase("HDFC"))
		{
			obj = new HDFC();
		}
		else if (bank.equalsIgnoreCase("ICICI"))
		{
			obj = new ICICI();
			
		}
		
		obj.deposit();
		obj.loan();
		obj.withdraw();
		System.out.println(RBI.x);
		System.out.println(ICICI.x);
		System.out.println(HDFC.x);
		
		

	}

}
