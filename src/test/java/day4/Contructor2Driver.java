package day4;

import java.util.Scanner;

public class Contructor2Driver {

	public static void main(String[] args) {
		//Contructors2 con = new Contructors2();
		//Contructors2 con = new Contructors2("Arun","Delhi",31);
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose the your browser (ie, chrome or firefox)");
		String browser = scan.nextLine();
		System.out.println("Enter the loanamount and hit enter button");		
		
		String loanamount = scan.nextLine();
		scan.close();
		Contructors2 con = new Contructors2(browser,loanamount);
		con.setBankInfo();
		con.tearDown();

	}

}
