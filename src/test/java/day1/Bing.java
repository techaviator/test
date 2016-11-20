package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing {

	public static void main(String[] args) {
		
//		Open the firefox browser
		 FirefoxDriver driver = new FirefoxDriver();
		// Launch the URL
		driver.get("http://www.bing.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//Enter the search string into Search textbox
		WebElement searchbox = driver.findElement(By.id("sb_form_q"));
		searchbox.sendKeys("Selenium");
		//Click on the Search button
		driver.findElement(By.className("b_searchboxSubmit")).click();
		//Get the number of result hits and display to the user
		String result = driver.findElement(By.className("sb_count")).getText();
		result = result.replace(" RESULTS", "");
		System.out.println("The number results is "+result);
		//Close browser
		driver.close();
		

	}

}
