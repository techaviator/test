package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingRediffPage {

	public static void main(String[] args) {
		
		//Open the browser
		FirefoxDriver driver = new FirefoxDriver();
		//launch URL
		driver.get("http://in.rediff.com/");
		//maximize
		driver.manage().window().maximize();
		//get the Title of the page
		String title = driver.getTitle();
		//display the Title
		System.out.println(" The title of the page is "+ title);
		//Close the browser
	//	driver.close();// closes only the main window
		driver.quit();//used close all the browser opened by the code
		
	}

}
