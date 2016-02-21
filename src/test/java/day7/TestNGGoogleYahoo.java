package day7;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGoogleYahoo {
	WebDriver driver =null;
	@BeforeMethod
	public void launchbrowser()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the url");
		String URL = in.next();
		in.close();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		
	}
	
	@Test(priority=1)
	public void searchgoogle()
	{
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		driver.findElement(By.className("lsb")).click();
	}
	
	@AfterMethod
	public void tear_down()
	{
		driver.close();
	}
	
	@Test (priority=2)
	public void searchyahoo()
	{
		driver.findElement(By.id("UHSearchBox")).sendKeys("QTP");
		driver.findElement(By.id("UHSearchWeb")).click();
	}

}
