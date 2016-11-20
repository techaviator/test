package day9;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LearnTestNG2 {
	
	
	WebDriver driver =null;
	String URL = "google";
	String link=null;
	@BeforeSuite
	public void setURL()
	{
		Scanner scan  = new Scanner(System.in);
		System.out.println("Set the search link (google or bing)");
		URL=scan.nextLine();
		scan.close();
	}
	@BeforeClass
	public void getURL()
	{
		System.out.println("Before class starts");
		if(URL.equals("google"))
		{
			link = "http://google.com";
		}
		else if(URL.equals("bing"))
		{
			link = "http://google.com";
		}
	}
	
	@AfterClass
	public void getReport()
	{
		System.out.println("AfterClass");
		System.out.println("Get report");
	}
	@BeforeMethod
	public void IntializeBrowser()
	{
		System.out.println("Before Method");
		System.out.println("Initialize browser");
		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("After Method");
		System.out.println("  browser tear down");
		driver.close();
	}	
	
	@Test
	public void googleSearch()
	{//lst-ib
		System.out.println("Google Search");
		//WebDriver driver = new FirefoxDriver();
		driver.get(link);
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		driver.findElement(By.name("btnG")).click();
		//driver.close();
	}
	
	@Test
	public void bingSearch()
	{
		System.out.println("Bing Search");
		driver.get(link);
	}
	
	

}
