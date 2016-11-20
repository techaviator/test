package day6;

import java.util.Scanner;



public class User_SearchEngine_Inheritance {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Choose the Search Engine (Google or Bing)");
		String engine = scan.nextLine();
		System.out.println("Choose the browser (IE, chrome or firefox)");
		String browser = scan.nextLine();
		System.out.println("Enter the search text");
		String searchtext = scan.nextLine();
		System.out.println("Enter the URL");
		String URL = scan.nextLine();
		scan.close();
		if(engine.equals("google"))
		{
			GoogleSearch_Inheritance google = new GoogleSearch_Inheritance();
			google.initializeBrowser(browser, URL);
			google.searchString(searchtext);
			google.displayResult();
			google.tearDown();
		}
		else
		{
			Bing_Inheritance bing = new Bing_Inheritance();
			bing.initializeBrowser(browser, URL);
			bing.searchString(searchtext);
			bing.displayResult();
			bing.tearDown();
		}
	
		
		
	}

}
