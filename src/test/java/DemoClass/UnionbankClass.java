package DemoClass;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnionbankClass {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the loanamount");
		String amount = input.next();
		System.out.println("Enter the Interest");
		String Interest = input.next();
		
		System.out.println("Enter the tenure");
		String months = input.next();
		
		System.out.println("Enter the expected");
		String expected = input.next();
		//Open browser firefox
		//String expected = "2224.44";
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Launch the URL
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		//Enter the loan amount
		WebElement loanamount = driver.findElement(By.id("loanamount"));
		loanamount.sendKeys(amount);
		//Enter the interest
		WebElement rate = driver.findElement(By.id("rate"));
		rate.sendKeys(Interest);
		//Enter the Tenure
		WebElement tenure = driver.findElement(By.id("pmonths"));
		tenure.sendKeys(months);
		//Click on the Calculate
		WebElement calc = driver.findElement(By.name("Button1"));
		calc.click();
		//Get EMI
		WebElement actual_result = driver.findElement(By.id("EMI"));
		String emi = actual_result.getAttribute("value");
		
		System.out.println("The value is "+ emi);
		System.out.println("The value is "+ expected);
		//Validate actual with expected
		
		if(emi.equals(expected))
		{
			System.out.println("Test Case has passed");		
		}
		else
		{
			System.out.println("Test Case has failed");	
		}
		
		driver.close();
	}

}
