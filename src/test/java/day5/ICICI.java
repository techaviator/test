package day5;

public class ICICI implements RBI{

	@Override
	public void deposit() {
		System.out.println("ICICI provides 7 points on each deposit of 5lakhs");
		
	}

	@Override
	public void withdraw() {
		System.out.println("ICICI will cut 25rs per withdrawal");
		
	}

	@Override
	public void loan() {
		System.out.println("ICICI provide no part payment for PL");
		
	}
	
	public void depositbonanza() {
		System.out.println("ICICI deposit 10 , get interest 11%");
		
	}

}
