package day5;

public class HDFC implements RBI{

	@Override
	public void deposit() {
		System.out.println("HDFC provides 5 points on each deposit of 5lakhs");
			}

	@Override
	public void withdraw() {

		System.out.println("HDFC will cut 30rs per withdrawal");
		
	}

	@Override
	public void loan() {
		System.out.println("HDFC provide part payment for PL");
		
	}
	
	public void loanbonanza() {
		System.out.println("HDFC loan upto 10l , for interest 11%");
		
	}

}
