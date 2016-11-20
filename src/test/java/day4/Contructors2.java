package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Contructors2 {
	
	String Name= null;
	String Location = null;
	int age=0;
	WebDriver driver = null;
	String loanamount = null;
	String expected = "2224.44";
	
	Contructors2()
	{
		 Name = "Jim";
		 Location = "Bangalore";
		 age= 30;
		System.out.println("The name is "+ Name+" and the  Location is "+Location+" and age is "+age);
	}
	Contructors2(String n1, String l1, int a)
	{
		Name = n1;
		Location = l1;
		age = a;
		System.out.println("The name is "+ Name+" and the  Location is "+Location+" and age is "+age);
	}
	
	public Contructors2(String browser, String loan)
	{
		loanamount = loan;
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\JavaWorkspace_2016/September_2016/October2016\\src/test/resources/chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\JavaWorkspace_2016\\September_2016\\October2016\\src\\test\\resources\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		else
		{
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
	}
	public void setBankInfo()
	{
		
		//Enter the Loan amount
		driver.findElement(By.id("loanamount")).sendKeys(loanamount);
		//Enter the interest
		driver.findElement(By.id("rate")).sendKeys("12");
		//Enter the Tenure
		driver.findElement(By.name("pmonths")).sendKeys("60");
		//Click on the Calculate button
		driver.findElement(By.id("Button1")).click();
		//Get the emi
		String actual = driver.findElement(By.id("EMI")).getAttribute("value");
		System.out.println("The actual emi is "+actual);
		if(actual.equals(expected))
		{
			System.out.println("The testcase has passed "+actual);
		}
		else
		{
			System.out.println("The Test case has failed "+actual);
		}
	}
	
	public void tearDown()
	{
		driver.quit();
	}

}
