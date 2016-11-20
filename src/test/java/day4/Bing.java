package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing {
	public FirefoxDriver driver = null;
	public void launchBrowser(){
		
//		Open the firefox browser
		  driver = new FirefoxDriver();
		// Launch the URL
		driver.get("http://www.bing.com/");
		
		//maximize
		driver.manage().window().maximize();
		
	}
	
	public void searchtext()
	{
		//Enter the search string into Search textbox
		WebElement searchbox = driver.findElement(By.id("sb_form_q"));
		searchbox.sendKeys("Selenium");
		//Click on the Search button
		driver.findElement(By.className("b_searchboxSubmit")).click();
		//Get the number of result hits and display to the user
		String result = driver.findElement(By.className("sb_count")).getText();
		result = result.replace(" RESULTS", "");
		System.out.println("The number results is "+result);
	}
	
	public void tearDown()
	{
		//Close browser
				driver.close();
	}

	public static void main(String[] args) {
		
		Bing bing = new Bing();
		bing.launchBrowser();
		bing.searchtext();
		bing.tearDown();
		

	}

}
