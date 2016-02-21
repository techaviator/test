package day5;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
	WebDriver driver ;
	String browser = null;
	Scanner in = new Scanner(System.in);
	public void launch()
	{
		System.out.println("Enter the search engine");
		browser = in.next();
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		if(browser.equalsIgnoreCase("bing"))
		{
			driver.get("http://www.bing.com/");
		}
		else if (browser.equalsIgnoreCase("google"))
		{
			driver.get("http://www.google.com/");
		}			
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	public void tear_down()
	{
		driver.close();
	}
}
