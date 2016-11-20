package day5;

import java.util.Scanner;



public class User_SearchEngine {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Choose the Search Engine (Google or Bing)");
		String engine = scan.nextLine();
		System.out.println("Choose the browser (IE, chrome or firefox)");
		String browser = scan.nextLine();
		System.out.println("Enter the search text");
		String searchtext = scan.nextLine();
		scan.close();
		SearchEngine search = null;
		if(engine.equalsIgnoreCase("Google"))
		{
			search= new GoogleSearch();
			/*googleSearch.initializeBrowser();
			googleSearch.searchString();
			googleSearch.displayResult();
			googleSearch.tearDown();*/
		}
		else if(engine.equalsIgnoreCase("Bing"))
		{
			search = new Bing();
			/*bing.initializeBrowser();
			bing.searchString();
			bing.displayResult();
			bing.tearDown();*/
		}
		
		search.initializeBrowser(browser);
		search.searchString(searchtext);
		search.displayResult();
		search.tearDown();

	}

}
