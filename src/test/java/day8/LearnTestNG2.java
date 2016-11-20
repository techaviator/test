package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnTestNG2 {
	
	//Google Search
		//initialize browser
		
		//Enter and search keyword
		
		//TearDown
	
	//Bing Search
		//initialize browser
	
		//Enter and search keyword
		
		//TearDown
	WebDriver driver =null;
	@BeforeMethod
	public void IntializeBrowser()
	{
		System.out.println("Initialize browser");
		 driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("  browser tear down");
		driver.close();
	}	
	
	@Test
	public void googleSearch()
	{//lst-ib
		System.out.println("Google Search");
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.id("lst-i")).sendKeys("Selenium");
		driver.findElement(By.name("btnG")).click();
		//driver.close();
	}
	
	//@Test
	public void bingSearch()
	{
		System.out.println("Bing Search");
	}
	
	

}
