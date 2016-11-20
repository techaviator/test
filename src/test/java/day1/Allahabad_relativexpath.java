package day1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Allahabad_relativexpath {

	public static void main(String[] args) {
		System.out.println("Enter the loanamount");
		Scanner scan = new Scanner(System.in);
		String loanamount = scan.nextLine();
		System.out.println("Enter the expected result");
		String expected = scan.nextLine();
		System.out.println("The expected result is "+expected);
		scan.close();
		// Open the firefox browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//Launch the URL
		driver.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		//Maximize
		driver.manage().window().maximize();
		//Enter the principle amount
		driver.findElement(By.xpath("//input[@id='one'][@type= 'text']")).sendKeys(loanamount);
		//Enter the interest
		driver.findElement(By.xpath("//input[@name='interest']")).sendKeys("12");
		//Enter the tenure
		driver.findElement(By.xpath(".//*[@name = 'instalment']")).sendKeys("60");
		
		//Click on the calculate button
		driver.findElement(By.xpath("//input[@name='B1'][@value='Calculate']")).click();
		// Get the emi
		String actual = driver.findElement(By.xpath("//input[@id='four']")).getAttribute("value");
	System.out.println("The EMI is "+ actual);
	
	// validation
	
	if(expected.equals(actual))
	{
		System.out.println(" The test case has passed "+ actual );
	}
	else
	{
		System.out.println(" The test case has failed "+ actual);
	}
		// Close the browser
		driver.close();
		


	}

}
