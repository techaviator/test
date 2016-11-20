package day5;

import java.util.Scanner;

public class BankUser {
	
	public static void main(String[] args) {
		/*
		ICICIBANK icici = new ICICIBANK();
		icici.loanInterest();
		icici.fixedDepositInterest();
		icici.DeepawaliBonanza();
		
		Axis axis = new Axis();
		axis.loanInterest();
		axis.fixedDepositInterest();
		axis.DiwaliBonanza();*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select your bank (Axis or ICICI");
		String selectBank = scan.nextLine();
		scan.close();
		RBI bank = null;
		/*ICICIBANK icici = null;
		Axis axis = null;*/
		if(selectBank.equalsIgnoreCase("ICICI"))
		{
			bank = new ICICIBANK();
			
		}
		else if(selectBank.equalsIgnoreCase("Axis"))
		{
			bank = new Axis();
			
		}
		/*icici.loanInterest();
		icici.fixedDepositInterest();
		axis.loanInterest();
		axis.fixedDepositInterest();*/
		bank.fixedDepositInterest();
		bank.loanInterest();
		System.out.println(RBI.x);
		
	}
	
	
	
	

}
